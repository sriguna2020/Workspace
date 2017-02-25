package com.sriguna.order.bo;

import com.sriguna.order.boException.BOException;
import com.sriguna.order.dto.Order;

public interface OrderBo {

	
	boolean placeOrder(Order order) throws BOException;
	
	boolean cancelOrder(int id) throws BOException;
	
	boolean deleteOrder(int id) throws BOException;
	
	
}
