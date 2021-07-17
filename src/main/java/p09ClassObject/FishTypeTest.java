package p09ClassObject;

public class FishTypeTest {

	public static void main(String[] args) {
		
		System.out.println("Group		Sub-Type	Name		Number Of Eggs	");
		System.out.println("------		---------	---------	--------------  ");
		
		FishType fish1 = new FishType();
			fish1.groupType 	= "CatFish";
			fish1.subType		= "L 144";
			fish1.name 			= "Blu Eye";
			fish1.numberOfEggs 	= 30;

		FishType fish2 = new FishType();
			fish2.groupType 	= "Chiclid";
			fish2.subType		= "Tngnica";
			fish2.name 			= "Leleupi";
			fish2.numberOfEggs 	= 120;

		FishType fish3 = new FishType();
			fish3.groupType 	= "Chiclid";
			fish3.subType		= "Malawi";
			fish3.name 			= "Iceman";
			fish3.numberOfEggs 	= 40;

		fish1.fishBoard();
		fish2.fishBoard();
		fish3.fishBoard();
	}
}
