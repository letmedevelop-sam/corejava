package p05NestedForAndWhileLoops;

public class Steps {
    public static void main(String[] args) {
		/* Write a Java program to create a stair step pattern
#
	#
		#
			#
			*/
        int n = 6;
        for (int i =1; i<n; i++) {

            for (int j=1; j<i; j++) {
                System.out.print("  ");
            }

            System.out.println("#");
        }
    }
}
