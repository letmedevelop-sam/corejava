package p14Arrays;

import java.util.Arrays;

public class Pizza2D_array {

	public static void main(String[] args) {


		String [][] pizzas = {
				{"pineapple", "pepperoni"},
				{"anchovies", "mushrooms","onions"},
				{"4cheese"},
				{"chicken", "tomatoes","olives"},
				{"green pepers", "zuchhini", "brocoli", "spinachi", "shrimp"}
		};
		System.out.println(Arrays.toString(pizzas[0]));
		
		for (String[] pizza : pizzas){
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println(pizzas[4].length);
		
		for (String value : pizzas[3]) {
			System.out.println(value);
		}

	}

}
