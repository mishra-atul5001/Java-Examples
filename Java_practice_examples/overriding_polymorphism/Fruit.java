package overriding_polymorphism;

public class Fruit {
	String name,taste;
	int size;
	public Fruit(String n,String t) {
		name=n;
		taste=t;
	}
    public void eat(){
        System.out.println(name+" "+taste);
    }
    
    public static void main(String[] args) {
    	Fruit fruit = new Fruit("Banana","Sweet");
    	fruit.eat();
    	Orange org = new Orange("Orange", "Sweet and Sour");
    	org.eat();
    	Apple app = new Apple("Apple","Sweet");
    	app.eat();
    	
    }
}

class Orange extends Fruit {
	String fruit_name,fruit_taste;
    public Orange(String name, String taste) {
		super(name, taste);
		// TODO Auto-generated constructor stub
		fruit_name=name;
		fruit_taste=taste;
	}

	@Override
    public void eat(){
        System.out.println(fruit_name);
        System.out.println(fruit_taste);
    }
}

class Apple extends Fruit {
	String fruit_name1,fruit_taste1;
    public Apple(String n, String t) {
		super(n, t);
		// TODO Auto-generated constructor stub
		fruit_name1=n;
		fruit_taste1=t;
	}

    @Override
    public void eat(){
        System.out.println(fruit_name1);
        System.out.println(fruit_taste1);
    }
}
