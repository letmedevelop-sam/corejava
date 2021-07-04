package p01ArithmeticOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //Task 1

        int pies = 10, people = 4;
        double piesPerson;
        piesPerson=pies/people;

        System.out.println(pies + " pies disseminated to " + people + " people without casting : " + piesPerson +  " pies per person\n " );

        //Task 2

        int pies2 = 10, people2 = 4;
        double piesPerson2;
        piesPerson2 = (double) pies2/people2;

        System.out.println(pies2 + " pies disseminated to " + people2 + " people with casting number of pies : " + piesPerson2 +  " pies per person\n " );

        //Task 3

        int pies3 = 10, people3 = 4;
        double piesPerson3;
        piesPerson3 =  pies3 / (double) people3;

        System.out.println(pies3 + " pies disseminated to " + people3 + " people with casting number of people : " + piesPerson3 +  " pies per person\n " );

        //Task 4

        int pies4 = 10, people4 = 4;
        double piesPerson4;
        piesPerson4 = (double) (pies4 /  people4);

        System.out.println(pies4 + " pies disseminated to " + people4 + " people with casting operation in parenthesis : " + piesPerson4 +  " pies per person " );

    }

}
