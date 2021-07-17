package p14Arrays;

public class initializing2D_array {

	public static void main(String[] args) {


		int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(numbers);
		
		for (int i = 0; i<3;i++) {
			for(int j =0; j<3;j++) {
				if (j==2) {
				System.out.println(numbers[i][j]+ " ");
				}else {
					System.out.print(numbers[i][j]+ " ");
				}
				
			}
		}
		

	}

}
