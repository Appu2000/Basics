// 	   
class members{
	String name;
	int age;
	double PH;
	String Address;
	int Salary;
	
	void printSalary() {
		System.out.println(Salary);
	}
}

class Manager extends members{
	
	String Specizattion;
	String Department;
	
}



public class employe extends members{

	String Specizattion;
	String Department;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employe e= new employe();
		e.name="Bose";
		e.age=22;
		e.Address="Ashok nagar";
		e.PH=1234567895;
		e.Salary=24000;
		
		Manager a=new Manager();
		a.name="subash";
		a.age=32;
		a.Address="kk nagar";
		a.PH=1234567895;
		a.Salary=360000;
		
		e.printSalary();
		a.printSalary();
		

	}

}
