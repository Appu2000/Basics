package shiash;
interface int1
{
	public void display1();
	//static void display1()
	
	/*
	{
		System.out.println("static meth");
	}*/
}

public class abst1 implements int1 {
	
	public void display1() {
		System.out.println("abst meth");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            abst1 a=new abst1();
            a.display1();
            //int1.display1;
	}

}
