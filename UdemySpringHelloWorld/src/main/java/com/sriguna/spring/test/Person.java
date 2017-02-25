package com.sriguna.spring.test;

public class Person {
	
	private int id;
	
	private String name;

	private int taxId;
	
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public void speak(){
		
		System.out.println("Hello this is a Person");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	
	
	
}
