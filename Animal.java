package week12b;
//super/parent class
public class Animal {
	//state
	int age;
	String gender;
	int weight;
	//Constructor
	public Animal(int age,String gender,int weight) {
		//setState
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		System.out.println(age+" "+gender+" "+weight);
	}
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
}
