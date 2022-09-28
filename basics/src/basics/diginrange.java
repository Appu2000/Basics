package basics;
import java.util.Scanner;

public class diginrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n,a,d;
		System.out.print(2%10);
		Scanner s=new Scanner(System.in);
		System.out.print("enter limit:");
		r=s.nextInt();
		System.out.print("enter the dig:");
		n=s.nextInt();
		
		for(int i=0;i<=r;i++) {
			a=i;
			
			while(a != 0){
				d=a%10;
				if(d==n) {
					System.out.print(i+"\t");
				}
			    a=a/10;   
			}
		}
		

	}

}
