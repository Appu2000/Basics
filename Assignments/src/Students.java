
public class Students {
	String name;
	int roll_no;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1= new Students();
		Students s2= new Students();
		
		s1.name="John";
		s1.roll_no=2;
		
		s2.name="Sam";
		s2.roll_no=3;
		
		System.out.println(s1.roll_no+" "+s1.name);
		System.out.print(s2.roll_no+" "+s2.name);
	}

}
