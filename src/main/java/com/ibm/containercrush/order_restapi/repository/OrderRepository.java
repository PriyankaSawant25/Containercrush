package com.ibm.containercrush.order_restapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.containercrush.order_restapi.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

	List<Order> findByOrderId(int order_Id);

	
}
