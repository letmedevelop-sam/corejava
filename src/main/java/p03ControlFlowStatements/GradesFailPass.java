package p03ControlFlowStatements;

public class GradesFailPass {
    public static void main(String[] args) {
        /*Write a Java Program for the following logic:
         * § If marks < 60, then print “Fail”
         * § If marks >= 60, but less than 90, then print “Pass”
         * § If marks >= 90, then print “Passed with Distinction” */

        int average, a=90, b=90, c=90;
        average = (a+b+c)/3;

        if (average < 60 ) {
            System.out.println("Your average is :" + average+"  Result : Fail");

        }else if ((average >= 60) && (average < 90)) {
            System.out.println("Your average is :" + average+"  Result : Pass");

        }else if ((average >= 90)){
            System.out.println("Your average is :" + average+ "  Result : Passed with Distinction");
        }
    }

}
