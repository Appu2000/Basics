import java.util.Scanner;

public class complexNos {
	int a,b,c,d,r,i;
	complexNos(int a,int b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	void add() {
		r=a+c;
		i=b+d;
		System.out.println("sum is :"+r+"+"+i+"i");
	}
	
	void sub() {
		r=a-c;
		i=b-d;
		System.out.println("difference is :"+r+i+"i");
	}
	
	void mul() {
		r=(a*c)-(b*d);
		i=(a*d)-(b*c);
		System.out.println("product is :"+r+i+"i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter real part num 1: ");
		a=s.nextInt();
		System.out.println("enter imag part num 1: ");
		b=s.nextInt();
		
		System.out.println("enter real part num 2: ");
		c=s.nextInt();
		System.out.println("enter imag part num 2: ");
		d=s.nextInt();
		
		complexNos com=new complexNos(a,b,c,d);
		
		com.add();
		com.sub();
		com.mul();

	}

}
