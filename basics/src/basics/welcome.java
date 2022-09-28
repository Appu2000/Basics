package basics;
import java.util.Scanner;
public class welcome {
	public static void main(String args[]) 
	{
		
		int m,n,k=1,l=0,a=0,b=0,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length:");
		n=s.nextInt();
		System.out.println("enter breath:");
		m=s.nextInt();
		a=n/2;
		b=m/2;
		outer:for(int i=0;i<=m;i++) {
			inner:for(int j=0;j<=n;j++) {
				if(i<m/2) {
			    	if(j==a){
				    	for(c=0;c<k;c++) {
				    		System.out.print("|");	
					    	j++;
				    	}
				    	a--;
				    	k=k+2;
			           }
			    	else {
				      System.out.print("_");
				     }
		          }
			    if(i==b){
			    	  if(j>=1)break;
			    	  for(c=0;c<(n/2)-3;c++) {
			    		  System.out.print("_");
			    		  l++;
			    	  }
			    		  
				        System.out.print("WELCOME");
				        for(c=0;c<l;c++) {
				    		  System.out.print("_");
				    	  }
				        	
			      }
			    
			    if(i>b) {
			    	if(j==a) {
			    		for(c=0;c<k;c++) {
			    			System.out.print("|");
			    			j++;
			    		}
			    		a++;
			    		k=k-2;
			    	}
			    	else {
			    		System.out.print("_");
			    	}
			    }
			}
			  
		 System.out.println();
					
		}
	}
		
		

}
