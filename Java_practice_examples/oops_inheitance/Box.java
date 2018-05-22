package oops_inheitance;

public class Box {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1 box = new Box1(10,20,30);
		box.volume();
		box.display();
		
	}
	
}

class Box1{

	double widht,lenght,depth;
	double volume;
	Box1(double w,double l,double d)
	{
		lenght=l;
		widht=w;
		depth=d;
	}
	void volume() {
		
		volume=lenght*widht*depth;
		
	}
	void display() {
		System.out.println(volume);
	}

}
