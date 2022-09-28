package shiash;
//Single inheritance
class bird{
	 void drink() {
		System.out.println("drinking");
	}
}
class Eagle extends bird{
	void eat() {
	    System.out.println("eating");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle e=new Eagle();
		e.eat();
        e.drink();
	}

}
