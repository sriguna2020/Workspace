package com.sriguna.order.bo;

import java.sql.SQLException;

import com.sriguna.order.boException.BOException;
import com.sriguna.order.dao.OrderDao;
import com.sriguna.order.dto.Order;

public class OrderBoImpl implements OrderBo {

	private OrderDao orderDao;
	
	@Override
	public boolean placeOrder(Order order) throws BOException {
		
		try {
			int create = orderDao.create(order);
			if(create ==0)
				return false;
			
		} catch (SQLException e) {

			throw new BOException(e);
		
		}
		
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {

		try {
			Order order = orderDao.read(id);
			order.setStatus("cancelled");
			int update = orderDao.update(order);
			if(update == 0){
				
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		
		
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		
		 try {
			int delete = orderDao.delete(id);
			if(delete==0)
				return false;
			
		} catch (SQLException e) {
			throw new BOException(e);
		}
		
		
		return true;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

}
