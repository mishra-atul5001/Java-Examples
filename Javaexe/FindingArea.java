class Figure{
	double dim1;
	double dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double Area(){
		System.out.println("Area is Undefined..!!");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double Area(){
		System.out.println("Inside area for Rectangle");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double Area(){
		System.out.println("Inside area for Triangle");
		return dim1*dim2/2;
	}

}
class FindingArea{
	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r  =new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		Figure figref;
		figref = r;
		System.out.println("Area is : " + figref.Area());
		figref = t;
		System.out.println("Area is : " + figref.Area());
		figref = f;
		System.out.println("Area is : " + figref.Area());	



	}
}