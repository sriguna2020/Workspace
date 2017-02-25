package com.sriguna.order.bo;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.sriguna.order.dao.OrderDao;

public class OrderBoImplTest {

	@Mock
	OrderDao dao;
	
	@Test
	public void place_Order_Should_Create() {
		
		OrderBoImpl bo = new OrderBoImpl();
		bo.setOrderDao(dao);
		
		fail("Not yet implemented");
	}

}
