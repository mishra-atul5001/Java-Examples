package overriding_polymorphism;

public class Shape {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Circle c = new Circle();
		Triangle t = new Triangle();
		Square s = new Square();
		c.draw();
		t.draw();
		s.draw();
		
	}
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
	
static class Circle{
	
	 public void draw() {
		System.out.println("Drawing Circle");
	}
	 public void erase() {
		System.out.println("Erasing Circle");
	}
	
}
static class Triangle{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
	
}
static class Square{
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
	
}

}
