package p09ClassObject;

public class FishType {

	String groupType;
	String subType;
	String name;
	int numberOfEggs;
		
	public void fishBoard(){
		System.out.print(groupType + "\t\t");
		System.out.print(subType + "\t\t");
		System.out.print(name + "\t \t");
		System.out.print(numberOfEggs + "\t \n");
	}
}
