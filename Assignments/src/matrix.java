import java.util.Scanner;
public class matrix {
	int a[][]=new int[3][3];
	int r[][]=new int[3][3];
	
	matrix(int a[][]){
		this.a=a;		
	}
	
	void getRow() {
		System.out.println(a.length);
	}
	
	void getCol() {
		System.out.println(a[0].length);
	}
	
	void setEle(int i,int j,int e) {
		a[i][j]=e;
		display(a,"setEle");
		
	}
	
	void add(int a[][],int b[][] ) {
		
		if(a.length!=b.length || a[0].length!=b[0].length)
		{
			System.out.println("addition is not posible");
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					r[i][j]=a[i][j]+b[i][j];
				}
			}
			display (r,"add");
		}
	}
	
	void mul(int a[][],int b[][]) {

		if(a[0].length!=b.length)
		{
			System.out.println("multiplication is not posible");
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					r[i][j]=0;
					for(int k=0;k<3;k++) {
					r[i][j]+=a[i][j]*b[i][j];
				  }	
				}
			  }
			 display(r,"mul");
			}
		}
		
	void display(int a[][],String str){
		
		System.out.println(str);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("________________________");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int c[][]= {{3,6},{9,12},{6,7}};
		
		matrix m1=new matrix(a);
        matrix m2=new matrix(b);
		matrix m3=new matrix(c);
		
		m1.display(a,"A matrix");
		m2.display(b,"B matrix");
		m3.display(c,"C matrix");
		
		m1.getRow();
		m3.getCol();
		
		m1.setEle(0, 0, 9);
		m2.setEle(2, 2, 1);
		m1.add(a, b);
		m3.add(a,c);
	  
		m2.mul(a, b);
		m3.mul(c, b);
		
	}

}
