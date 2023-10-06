package com.mycompany.csc325_oop_designreview_lab;

/**
 * Abstract class representing a human with name, age, and address.
 * Subclasses should implement getAddress().
 * This class serves as a base class for more specific human-related classes.
 * It provides a common structure for attributes like name, age, and address.
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
	private String name;       // Name of the human
	protected String address;  // Address of the human
	private short age;         // Age of the human

	/**
	 * Constructor to initialize a Human object with a name, age, and address.
	 *
	 * @param name    The name of the human.
	 * @param age     The age of the human.
	 * @param address The address of the human.
	 */
	public Human(String name, short age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * Constructor to initialize a Human object with a name and age.
	 *
	 * @param name The name of the human.
	 * @param age  The age of the human.
	 */
	public Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Get the name of the human.
	 *
	 * @return The name of the human.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the human.
	 *
	 * @param name The name to set for the human.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Abstract method to get the address of the human.
	 * Subclasses must implement this method to provide specific address information.
	 *
	 * @return The address of the human.
	 */
	public abstract String getAddress();

	/**
	 * Abstract method to set the address of the human.
	 * Subclasses must implement this method to set specific address information.
	 *
	 * @param address The address to set for the human.
	 */
	public abstract void setAddress(String address);

	/**
	 * Get the age of the human.
	 *
	 * @return The age of the human.
	 */
	public short getAge() {
		return age;
	}

	/**
	 * Set the age of the human.
	 *
	 * @param age The age to set for the human.
	 */
	public void setAge(short age) {
		this.age = age;
	}
}