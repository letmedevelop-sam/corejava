package p11StringManipulation;

public class Emoji {

	public static void main(String[] args) {
		/*Create a emoji program:
			1- Check if emoji has 2 characters. If it is not, print "invalid emoji"
			2-Valid emojis:
	Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful,Otherwise invalid
	Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
		 */

		String emoji = ";0";
		
		if(emoji.length()!=2 ) {
			
			System.out.println("invalid emoji");
			return; //stop execution
		}
		
		char first  = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first == ':') {
			
			if(second == ')') {
				System.out.println("Smile");
			}
			else if(second == '(') {
				System.out.println("Sad");
			}
			else if(second == '/') {
				System.out.println("Upset");
			}
			else {
				System.out.println("Unknown emoji");
			}
			
		}else if (first == ';') {
			
			if(second == ')') {
				System.out.println("Wink");
			}
			else if(second == '0') {
				System.out.println("Surprised");
			}
			else {
				System.out.println("Unknown emoji");
			}
		}
	}
}
