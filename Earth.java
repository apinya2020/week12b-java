package week12b;

public class Earth {
	public static void main(String[]args) {
		Human luca;
		luca = new Human();
		Human ton = new Human();
		ton.name = "Mr.ton";
		ton.age = 25;
		ton.height = 168;
		ton.eyeColor="Brown";
		
		luca.name = "Mr.Luca";
		luca.age = 24;
		luca.height = 180;
		luca.eyeColor = "blue";
		
		ton.display();
		luca.display();
	}
}
