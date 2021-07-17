package p09ClassObject;

public class TaxCalculation {

	//This is main method to test all our methods
	public static void main(String[] args) {
		TaxCalculation.m1(100);
	}

	//This is method1 having 1 parameter-will come from main, 1 variable-assigned 18 and calling method2
	public static void m1(int x) {
		double y =  x * 0.18;
		TaxCalculation.m2  (x,y);
	}

	//This is method2 having 2 parameters, one boolean variable  and calling method3
	public static void m2 (int b, double c) {
		boolean d = true;
		if(b >= 100){
			d = false;
		}
		System.out.println("Is the amount less than 100 : " + d);
		TaxCalculation.m3(b,c);
	}

	//This is method3 having an object from Account class
	public static void m3 (int e, double f) {
		Account ref = new Account();
		ref.income = e;
		ref.tax = f;
		Account.m4(ref.income, ref.tax);

	}
}

//this is a separately created class
class Account {
	int income;
	double tax;

	public static void m4(int g, double h) {
		System.out.println("income = " + g);
		System.out.println("tax = " + h);
	}

}
