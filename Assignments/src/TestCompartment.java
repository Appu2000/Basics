
import java.util.Random;

abstract class A{
	String str;
	public abstract String notice();
}

class FirstClass extends A{
	
	public String notice() {
		str="Firstclass";
		return str;
	}
}

class LadiesClass extends A{
      public String notice() {
		str="Ladies Class";
		return str;
	}
	
	
}

class GeneralClass extends A{
	
        public String notice() {
		str="Second Class";
		return str;
	}
	
}

class Luggage extends A{
	
      public String notice() {
		str="Luggage";
		return str;
	}
	
}

public class TestCompartment {
	public static void main() {
		
		int com[]=new int[10];
		int ch=0,i=1,x;
		Random random=new Random();
		
		Luggage d=new Luggage();
		GeneralClass c=new GeneralClass();
		LadiesClass b=new LadiesClass();
		FirstClass a=new FirstClass();
		
		while(i<=4) {
			x=random.nextInt(5);
		
			switch(ch) {
			case 1:{
				System.out.print("Compartment no."+i+"is"+a.notice());
				i++;
			}
			break;
		
			case 2:{
				System.out.print("Compartment no."+i+"is"+b.notice());
				i++;
			}
			break;
		
			case 3:{
				System.out.print("Compartment no."+i+"is"+a.notice());
				i++;
			}
			break;
		
			case 4:{
				System.out.print("Compartment no."+i+"is"+d.notice());
				i++;
			}
			break;
		
			default:System.out.println("invaid compartment");
			}
		
		}
		
	}

}
