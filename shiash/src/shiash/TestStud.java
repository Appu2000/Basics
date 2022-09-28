package shiash;

class Stud{
	 
	int sid;
	String sname;
	//1.direct
	//2.using methods
	//3.using constructor
	//note:name is same as classname
	Stud(int sid,String sname)
	{
		//using same name cause confusion to sys 
		//so use 'this' keyword 
		this.sid=sid;
		this.sname=sname;
	}
	
	void insert(int id,String name)
	{
		sid=id;
		sname=name;
	}
	void display()
	{
		System.out.println(sid+"\n"+sname);
	}
}

public class TestStud {
	public static void main(String args[])
	{
		//3rd method using constructor
		System.out.println("3rd method");
		Stud s= new Stud(103,"sri");
		System.out.println(s.sid);
		System.out.println(s.sname);
		
		//1st method direct 
		System.out.println("1st method");
		s.sid=101;
		s.sname="abi";
		System.out.println(s.sid);
		System.out.println(s.sname);
		
		//2nd method using methods
		System.out.println("2nd method");
		s.insert(102,"anitha");
		s.display();
	}

}

