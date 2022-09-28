class parent{
	void display() {
		System.out.println("I am Parent");
	}
}
public class child extends parent{
	
	void show(){
		System.out.println("I am child");
		
	}
	public static void main(String args[]) {
		
		parent p=new parent();
		child c=new child();
		p.display();
		c.show();
		c.display();
	}

}
