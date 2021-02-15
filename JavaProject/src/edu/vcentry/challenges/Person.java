package edu.vcentry.challenges;

public class Person {

	private String name;
	private int age;

	//default constructor
	public Person() {
		System.out.println("I am a default constructor");
	}

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public Person(String name){
		this.name = name;
//		int age = 30;
	}

	// Using getter and setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
