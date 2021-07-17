package p09ClassObject;

public class DogTest {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
			dog1.age = 5;
			dog1.color="Red";
			dog1.breed = "1";
			dog1.name = "Jack";

		Dog dog2 = new Dog();
			dog2.age = 10;
			dog2.color="Grey";
			dog2.breed = "2";
			dog2.name = "Joe";

		Dog dog3 = new Dog();
			dog3.age = 15;
			dog3.color="Black";
			dog3.breed = "3";
			dog3.name = "Jim";

		dog1.hungry();
		dog2.barking();
		dog3.sleeping();
	}
}
