package com.ibm.containercrush.order_restapi.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.containercrush.order_restapi.model.Order;
import com.ibm.containercrush.order_restapi.repository.OrderRepository;
import com.mongodb.BasicDBObject;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	  OrderRepository orderRepository;
	 @PostMapping("/createOrder")
	  public ResponseEntity<Order> createOrder(@RequestBody Order order) {
	    try {
	      Order _order = orderRepository.save(new Order(order.getOrderId(), order.getBrand(), order.getModel(),
					order.getPrice(), order.getCustomerName(), order.getCustomerContactNum(),
					order.getCusotmerEmail(), order.getCustomerAddress(), order.getCity(), order.getShowroom(),
					order.getDealerContactNum(), order.getDealerEmail()));
	      return new ResponseEntity<>(_order, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
	    }
	  }
	 
	 @GetMapping("/getAllOrders")
	  public ResponseEntity<List<Order>> getAllOrders() {
	    try {
	      List<Order> orders = new ArrayList<Order>();

	     // if (brand == null)
	        orderRepository.findAll().forEach(orders::add);
	    

	      if (orders.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(orders, HttpStatus.OK);
	      
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 @GetMapping("/getOrderById/{order_Id}")
	  public ResponseEntity<List<Order>> findByOrderId(@PathVariable("order_Id") int order_Id) {
		 try {
		      List<Order> orders = orderRepository.findByOrderId(order_Id);

		      if (orders.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }
		      return new ResponseEntity<>(orders, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		    }
	  }
	 
	
	
}
