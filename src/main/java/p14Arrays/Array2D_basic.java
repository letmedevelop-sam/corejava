package p14Arrays;

public class Array2D_basic {

	public static void main(String[] args) {


		int[][] scores = new int [3][4];
		
		System.out.println(scores);

		System.out.println(scores[0]);
		System.out.println(scores[1]);
		
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		scores[0][3] = 40;
		
		scores[1][0] = 50;
		scores[1][1] = 60;
		scores[1][2] = 70;
		scores[1][3] = 80;
		
		scores[2][0] = 90;
		scores[2][1] = 92;
		scores[2][2] = 94;
		scores[2][3] = 96;
		System.out.println("------------------");
		//Print First row
		System.out.print  (scores[0][0] + "   ");
		System.out.print  (scores[0][1] + "   ");
		System.out.print  (scores[0][2] + "   ");
		System.out.println(scores[0][3] + "   \n");
		
		//Print Second row
		System.out.print  (scores[1][0] + "   ");
		System.out.print  (scores[1][1] + "   ");
		System.out.print  (scores[1][2] + "   ");
		System.out.println(scores[1][3] + "   \n");
		
		//Print First row
		System.out.print  (scores[2][0] + "   ");
		System.out.print  (scores[2][1] + "   ");
		System.out.print  (scores[2][2] + "   ");
		System.out.println(scores[2][3] + "   ");
		
		System.out.println("------------------");
		
		
		
		
		
		
	}

}
