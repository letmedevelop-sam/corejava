package p09ClassObject;

public class Dog {

	/*
	 Class is a blue print and has common properties and method
	 Object is an instance of the class
	 */
	
	String breed;
	String color;
	String name;
	int age;
	
	public void barking () {
		System.out.println(name + " is barking");
	}
	
	public void hungry () {
		System.out.println(name + " is hungry");
	}
	public void sleeping () {
		System.out.println(name + " is sleeping");
	}
}
