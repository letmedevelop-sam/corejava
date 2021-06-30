package p06BranchingStatements;

public class DoNotAddEvenNumbersToSum {
    public static void main(String[] args) {


        int start = 1;
        System.out.println("start = " + start);
        int sum = 0;

        System.out.println("if the value of start is even, do not add to sum");
        do {
            if (start % 2 == 0) { // if the value of start is even, do not add to sum
                continue;
            }
            sum+=start;   // 1 + 3 + 5 + 7 + 9 rest is greater than 10

            //System.out.println(sum);
        }

        while( ++start <= 10);   // after 9 is greater than 10, so finish the loop
        System.out.println("while( ++start <= 10); ");
        System.out.println("1 + 3 + 5 + 7 + 9 rest is greater than 10");
        System.out.println("sum = " + sum);

    }

}
