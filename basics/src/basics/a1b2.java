package basics;
import java.util.Scanner;

public class a1b2 {
	public static void main(String[] args) {
		String str="";
		char ch,alp='a';
		int n=0;
		Scanner c=new Scanner(System.in);
		char a[]=c.next().toCharArray();
		try {
		for(int i=0;i<a.length;i++) {
			if(Character.isLetter(a[i])) {
				  alp=a[i];
			}
			if(Character.isDigit(a[i])) {
				int d=Character.getNumericValue(a[i]);
				
				if(Character.isDigit(a[i+1])&& i<a.length) {
					n=Character.getNumericValue(a[i+1]);
					d=d*10+n;
//					i++;
				}
				
				for(int j=0;j<d;j++) {
					if(i>a.length) {
						break;
					}
			          System.out.print(alp);
				}
				
			}
		}
	}catch(Exception  e) {
		System.out.println(e);
	}
	}
}
//				n=Integer.parseInt(a[i]);
//				System.out.println(n+" "+a[i]);
//				if(Character.isLetter(a[i+1])){
//					for(int j=0;j<=n;j++) {
//						System.out.print(alp);		
//					}
//					System.out.println();
//					
//				 }
//				}
//			
//			  System.out.println(n);
//			  for(int j=0;j<n;j++) {
//		    	System.out.print(alp);	
//				}
//				n=0;
//			    alp=a[i];
//			}
//			}
//		}
//			
		
		
		
	


