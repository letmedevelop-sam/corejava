package p09ClassObject;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " is working as a " + jobTitle);
	}

	public void attendMeeting() {
		System.out.println(name+ " will attend a meeting.");
	}

	public void introduce() {
		System.out.println("This is " + name + " working as a " + jobTitle + 
				" with a salary of " + salary + "$");
	}
}
