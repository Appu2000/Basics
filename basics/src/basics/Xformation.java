/**
 * 
 */
package basics;
import java.util.Scanner;

/**
 * @author SRIRAM
 *
 */
public class Xformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q;
		Scanner s=new Scanner(System.in);
		char x[]= s.next().toCharArray();
		int a,b,n=0,c=0,l=0;
		a=x.length;
		n=a-2;
		b=a/2;
	    	for(int i=0;i<x.length;i++)
		    {
	    	 if(i<b) {	
	    	  System.out.print(x[i]);
			  for(int j=0;j<=n;j++)  
			   {
				  System.out.print(" ");
				 
			   }
			   n=n-2;
			   
			   System.out.println(x[a-1]);
			   a--;
			  for(int k=0;k<=c;k++) {
				   System.out.print(" ");
			   }
			   c++;
			   
		    }
	    	if(i==b) {
	    		System.out.println(x[i]);
	    		a--;
	    		i++;
	    		c--;
	    		n=n+2;
	    	}
	    	
	    		
	    	
	    	
	    	if(i>b) {
	    		c--;
	    		
	    		 for(int m=0;m<=c;m++) {
	    			System.out.print(" ");
	    		}
	    		
	    		
				   System.out.print(x[a-1]);
				   a--;
				for(int o=0;o<=n;o++) {
					System.out.print(" ");	
				}
				n=n+2;
				System.out.println(x[i]);
	   
	    	}
		   }
	    	
		}
	     
	}
		


