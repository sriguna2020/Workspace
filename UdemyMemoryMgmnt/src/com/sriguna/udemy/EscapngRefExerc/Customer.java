package com.sriguna.udemy.EscapngRefExerc;

public class Customer implements CustomerReadOnly {

	private String name;

	/* (non-Javadoc)
	 * @see com.sriguna.udemy.EscapingRef.CustomerReadOnly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(Customer old){
		this.name=old.name;
	}
	
	/* (non-Javadoc)
	 * @see com.sriguna.udemy.EscapingRef.CustomerReadOnly#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

}
