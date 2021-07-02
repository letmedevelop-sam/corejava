package p07Methods;

public class LetterGradesFor3Classes {
    public static void main(String[] args) {
		/*
		 Write a method that accepts
		 3 grades from
		 3 different lessons and
		 prints the letter grade according to the below table

		90-100	A
		80-89	B
		70-79	C
		60-69	D
		0-59	F

		Sample Output:
	calculateGrade(100,100, 100)   - >  A
	calculateGrade(50,  50, 50)    - >  F
		 */
        lessonsA_B_C(65,85,75);
    }
    public static void lessonsA_B_C(int a, int b, int c) {

        System.out.println(  "Letter Grade of Lesson 1:" + "\n-------------------------");
        gradeConverter(a);

        System.out.println("\nLetter Grade of Lesson 2:" + "\n-------------------------");
        gradeConverter(b);

        System.out.println("\nLetter Grade of Lesson 3:" + "\n-------------------------");
        gradeConverter(c);
    }
    public static void gradeConverter(int x) {
        if((x<=100)&&(x>=90)) {
            char grade = 'A';
            System.out.println(grade);

        }
        else if((x<=89)&&(x>=80)) {
            char grade = 'B';
            System.out.println(grade);

        }
        else if((x<=79)&&(x>=70)) {
            char grade = 'C';
            System.out.println(grade);

        }
        else if((x<=69)&&(x>=60)) {
            char grade = 'D';
            System.out.println(grade);

        }
        else if((x<=59)&&(x>=0)) {
            char grade = 'F';
            System.out.println(grade);

        }
        else {
            System.out.println("invalid grade");
        }
    }
}
