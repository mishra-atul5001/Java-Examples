package oops_inheitance;

public class Animal {
	
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
		an.eat();
		an.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	} 
static	class Bird {
		void eat() {
			System.out.println("Bird is eating");
		}
		void sleep() {
			System.out.println("Bird is sleeping");
		}
		void fly() {
			System.out.println("Fly Away");
		}
	}

}

