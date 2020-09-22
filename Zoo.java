package week12b;

public class Zoo {
	public static void main(String[]args) {
		Animal zoo1;
		Bird bird1;
		Fish fish1;
		
		fish1 = new Fish(11,"M",2);
		bird1 = new Bird(3,"M",2);
		//Active
		zoo1 = new Animal(12,"M",23);
		zoo1.eat();
		bird1.fly();
		//fish1.swim();
	}
}
