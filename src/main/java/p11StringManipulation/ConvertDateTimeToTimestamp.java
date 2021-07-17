package p11StringManipulation;

public class ConvertDateTimeToTimestamp {

	public static void main(String[] args) {
		/* Task81 from Java classes
		  Write a method that accepts the date with time
		  and creates a timeStamp for your automation report.
		 */
		
		String date1 = "10/10/2019 14:59:00";
		System.out.println("Date 1              : " + date1);
		System.out.println("Time Stamp of date1 : " + timeStamp(date1));

		System.out.println("******");
		String date2 = "05/20/2019 12:01:55";
		System.out.println("Date 2              : " + date2);
		System.out.println("Time Stamp of date2 : " + timeStamp(date2));
	}
	public static String timeStamp(String date) {
		
		String dateReplaced = date
								.replace ("/","")
								.replace (":","")
								.replace (" ","");
	
		return dateReplaced;
	}
}
