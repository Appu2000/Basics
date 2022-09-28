package shiash;
/**hiding of data
*Keyword is "Abstract" 
*abstract class contains
*    -abstract class(contains abstract keyword)
*    -non abstract class
*implementation is done in child class only
*object cannot be created for abstract class
**/    
abstract class mydemo{
	public void display1() {
		System.out.println("non-abst method");
	}
	
	abstract public void display2();
}

public class abst extends mydemo{
	
		public void display2() {
			System.out.println("abstract method");
		}
	

	public static void main(String[] args) {
		abst a=new abst(); //or mydemo d=new abst();
		a.display1();
		a.display2();

	}

}
