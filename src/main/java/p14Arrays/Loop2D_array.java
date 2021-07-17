package p14Arrays;

public class Loop2D_array {

	public static void main(String[] args) {


		int [][] numbers = {{1,2,3},{4,5},{7,8,9}};
		System.out.println(numbers);
		
		for (int i = 0; i<numbers.length;i++) {
			for(int j =0; j<numbers[i].length;j++) {
				if (j==numbers.length-1) {
				System.out.println(numbers[i][j]+ " ");
				}else {
					System.out.print(numbers[i][j]+ " ");
				}
				
			}
		}
		

	}

}
