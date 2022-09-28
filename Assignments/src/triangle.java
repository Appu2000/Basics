
public class triangle {
	int s1;
	int s2;
	int s3;
	
	triangle(int s, int b,int h){
		s1=s;
		s2=b;
		s3=h;
	}
	
	void display(){
	  System.out.println("perimeter is"+(s1+s2+s3));
	  System.out.println("area is :"+(0.5*s2*s3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t1=new triangle(3,4,5);
		t1.display();

	}

}
