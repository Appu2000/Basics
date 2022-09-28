package basics;
import java.util.Scanner;


public class assdec {
	void ass(int []a,int n) {
		int temp;
		for (int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a[i]>a[j]) {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	void dec(int []a,int n) {
		int temp;
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for (int j=0;j<n;j++) {
	    		System.out.print(a[j]+" ");
		}
		assdec ad=new assdec();
		System.out.println("\nenter your choice:\n1.asscending\n2.decending");
		ch=s.nextInt();
		if (ch==1) {
			ad.ass(a, n);
		}
		else {
			ad.dec(a, n);
		}
		
		
	}

}
