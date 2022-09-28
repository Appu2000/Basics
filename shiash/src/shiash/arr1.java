package shiash;
import java.util.Scanner;

public class arr1 {
	public static void main(String arg[]) {
		
		int[] a= {7,6,5,4,3};
		System.out.println("array elements are:");
		for(int i=0;i<5;i++) 
		{
			System.out.println(a[i]);
		}
		
		//get and print array
		int[] b= new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements are:");
		for(int j=0;j<5;j++)
		{
			b[j]=s.nextInt();
		}
		for(int k=0;k<5;k++)
		{
				System.out.println(b[k]);	
		}
		
	}
	
}
