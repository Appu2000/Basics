package shiash;
import acc.*;
/*access specifier
 * 1.private - private=>(within the same class)
 * 2.default -  nil=>outside the class,within same package)
 * 3.protected-protected=>(outside the pkg,=>inheritance}
   4.public-public=>everywhere */

//1.PRIVATE
class Access{
	private void msg() {
		System.out.println("private class");
	}
//2.DEFAULT
	 void msg1(){
		System.out.println("its the default class");
		msg();
	}
}
public class accessspecifier extends pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access a=new Access();
		a.msg1();
		//3.PROTECTED
		accessspecifier b=new accessspecifier();
		b.msg3();
	}

}
