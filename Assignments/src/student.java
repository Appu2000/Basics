
public class student {
	String stud="UNKNOWN";
	student(){
		System.out.println(stud);
	}
	student(String str){
		stud=str;
		System.out.println(stud);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		student s2= new student("Sri");

	}

}
