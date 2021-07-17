package p14Arrays;

import java.util.Arrays;

public class Task93_NumerOfTheWords {

	public static void main(String[] args) {
		/*
		 * �As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a
burst of light that had ricocheted from his temple, and saw, with that quick smile with which we
greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van�a
dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of
boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of
those who were carrying this sky, these boughs, this gliding fa�ade.�

	How many wordsare there?
		 */

		String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head"
				+" because of burst of light that had ricocheted from his temple, and saw, with that"
				+" quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram"
				+" of sky being unloaded from the van a dresser with mirrors across which, as across a"
				+" cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying"
				+" not arboreally, but with a human vacillation, produced by the nature of those who"
				+" were carrying this sky, these boughs, this gliding fa�ade.";
		
		String[] array = str.split(" ");
		
		System.out.println(array.length);
		
		System.out.println(Arrays.toString(array));
		System.out.println("-------------\n");
		
		//print every word but only ten of them in each line.
		
		int i = 1; //number of words
		int j = 1; // number of lines with ten words
		
		for(String value : array) {
			System.out.print(value+ " ");
			
			if(i%10==0) {
				System.out.print("\n");
				j++;
			}
			
			i++;
		}
		System.out.println("\n\n \tTotal " +i + " words");
		System.out.println("\n\t" +(j-1) + " lines with ten words +  " + (i%10) + " words in the last line");
	}

}
