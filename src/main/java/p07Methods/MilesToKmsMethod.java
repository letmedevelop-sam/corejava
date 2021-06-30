package p07Methods;

public class MilesToKmsMethod {
    public static void main(String[] args) {

		/*
		 Write a method that will convert Miles into Kms:
			convertKM();
		 */
        convertKM();

    }

    public static void convertKM() {
        int mile=81;

        double km = mile *1.60934;

        System.out.println(mile+ " miles = " + km + " Km.s");
    }
}
