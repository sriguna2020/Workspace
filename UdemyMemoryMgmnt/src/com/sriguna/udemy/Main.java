package com.sriguna.udemy;

public class Main {

	public static void main(String[] args) {

		Main newMain = new Main();
		int localVar = 5;
		//const String var ="hello";
		Person person = new Person();
		person.setName("Sriguna");
		calculate(localVar);
		System.out.println("value from calculate is " + localVar);
		System.out.println("before calling "+person.getName());
		newMain.setPersonName(person);
		System.out.println("after calling "+person.getName());
	}

	public static void calculate(int val) {
		val = val * 100;
	}

	public void setPersonName(Person person){
		person.setName("Kutyma with Sriguna");
	}
}



/*Output:
	
	value from calculate is 5
	before calling Sriguna
	after calling Kutyma with Sriguna
*/