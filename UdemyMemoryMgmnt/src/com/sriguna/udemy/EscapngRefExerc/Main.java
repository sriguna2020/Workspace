package com.sriguna.udemy.EscapngRefExerc;

public class Main {

	public static void main(String args[]) {

		CustomerRecords customerRecords = new CustomerRecords();

		customerRecords.addCustomer(new Customer("Kutyma"));
		customerRecords.addCustomer(new Customer("Sriguna"));
		
		customerRecords.getCustomers().clear();
		
		for(CustomerReadOnly next : customerRecords.getCustomers().values()){
			System.out.println("Element "+next);
		}

		CustomerReadOnly kutyma = customerRecords.getCustomerByName("Kutyma");
		System.out.println("Get Kutyma object "+kutyma.getName());
	
	
		//kutyma.setName("My wife");
		
		System.out.println("Get Kutyma object "+kutyma.getName());
		
		for(CustomerReadOnly next : customerRecords.getCustomers().values()){
			System.out.println("Element "+next);
		}
	}

}
