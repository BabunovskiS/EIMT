package com.eimt.store.service;

import java.util.List;

import com.eimt.store.model.Order;
import com.eimt.store.model.Payment;
import com.eimt.store.model.Shipping;
import com.eimt.store.model.ShoppingCart;
import com.eimt.store.model.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
