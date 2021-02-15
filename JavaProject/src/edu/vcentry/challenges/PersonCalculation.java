package edu.vcentry.challenges;

public class PersonCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.setName("Arun");
		System.out.println(person1.getName());

		person1.setAge(20);
		System.out.println(person1.getAge());

		Person person2 = new Person("kumar", 23);
		System.out.println(person2.getAge());
		System.out.println(person2.getName());

		Person person3 = new Person("ARUNKUMAR");
		System.out.println(person3.getName());
		person3.setAge(34);
		System.out.println(person3.getAge());

	}

}
