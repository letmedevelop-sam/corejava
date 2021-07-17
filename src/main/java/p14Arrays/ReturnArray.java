package p14Arrays;

public class ReturnArray {

	public static void main(String[] args) {

		double [] values;
		values = getArray();

	for (double num : values) {
		System.out.print (num + "    ");
		}

	}

	public static double[] getArray() {
		
		double[] dizi = {1.2,  2.3,  4.4,  5.6};
		
		return dizi;
	}
}
