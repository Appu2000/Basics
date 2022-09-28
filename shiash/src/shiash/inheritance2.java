package shiash;
//multilevel inhertitance
class shape{
	void display() {
		System.out.println("inside parent class");
	}
}

class square extends shape{
	void area() {
		System.out.println("a*a");
	}
}
class rom extends square{
	void volume() {
		System.out.println("a*a*a");
	}
}

class rect extends rom{
	void perimeter() {
		System.out.println("4*a");
	}
	
}


public class inheritance2 {
	public static void main(String arg[]) {
		rect s=new rect();
		s.perimeter();
		s.area();
		s.volume();
		s.display();	
		
	}

}
