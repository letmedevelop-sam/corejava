package p09ClassObject;

public class EmployeeTest {

	public static void main(String[] args) {

		
		Employee employee1 = new Employee();
			employee1.name  = 	"Sami";
			employee1.jobTitle = "Engineer";
			employee1.salary = 10000;
		
		System.out.println("\n*****Employee information ******");
		System.out.println("Name		Job Title		Salary");
		System.out.println("----		---------		-------");
		System.out.print(employee1.name + "\t\t");
		System.out.print(employee1.jobTitle + "\t\t");
		System.out.print(employee1.salary + "\t\t \n");
		
		Employee employee2 = new Employee();
			employee2.name  = 	"Ali";
			employee2.jobTitle = "Driver";
			employee2.salary = 8000;
		
		
		System.out.print(employee2.name + "\t\t");
		System.out.print(employee2.jobTitle + "\t\t\t");
		System.out.print(employee2.salary + "\t \t \n");
		
		
		System.out.println("\n*****calling methods ******\n");
		
		employee1.work();
		employee1.attendMeeting();
		employee1.introduce();
		
		System.out.println();
		
		employee2.work();
		employee2.attendMeeting();
		employee2.introduce();
	}
}
