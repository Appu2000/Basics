package shiash;
import java.util.Arrays;
import java.util.Scanner;
public class arr2 {
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of rows:");
		int row=s.nextInt();
		System.out.println("Enter the length of col:");
		int col=s.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("a["+i+"]["+j+"]=");
				a[i][j]=s.nextInt();
			}
			
		}
		System.out.println("Entered Array");
		System.out.println(Arrays.deepToString(a));

		
	}

}
