package basics;
import java.util.Scanner;
public class Planidrome {
	void number() {
		int num,rev=0,n,d,r;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the num : ");
		num=s.nextInt();
		n=num;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		System.out.println("the given num is "+num);
		System.out.println("the reversed num is "+rev);
		if(num==rev) {
		  System.out.print("the given num "+rev+"is palindrome");
		  
		}
		else {
			 System.out.print("the given num "+num+" is not palindrome");
		}
		}
	void String() {
		String str="",str1="";
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char ch;
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			 ch=str.charAt(i);
			 str1=str1+ch;	
		}
		System.out.println("the given String is "+str);
		System.out.println("the reversed String is "+str1);
		if(str.equals(str1)) {
			System.out.print("The given string "+str+" is palindrome");
		}
		else {
			System.out.print("The given string "+str+" is not palindrome");
		}
	  

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\tPALINDROME\n\t\t1.NUMBER\t\t2.STRING");
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter your choice: ");
		ch=s.nextInt();
		Planidrome pl= new Planidrome();
		if(ch==1) {
			System.out.print("ENTER THE NUM: ");
			pl.number();
		}
		if(ch==2) {
			System.out.print("ENTER THE STRING: ");
			pl.String();
		}
		if(ch<=0 || ch>=3) {
			System.out.println("undefined");
		}
		
	}

}
