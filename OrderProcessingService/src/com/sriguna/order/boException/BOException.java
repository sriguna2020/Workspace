package com.sriguna.order.boException;

import java.sql.SQLException;

public class BOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BOException(SQLException e) {
		super(e);
	
	}

}
