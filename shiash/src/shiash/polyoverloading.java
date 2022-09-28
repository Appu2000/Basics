package shiash;
//polymorphism 1.method overloading
class addit{

	int add(int x,int y) {
		return x+y;
	}

	int add(int x,int y,int z) {
		return x+y+z;
	}
	
	float add(float x,float y) {
		return x+y;
	}

}

public class polyoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  addit a=new addit();
          System.out.println(a.add(10,20));
          System.out.println(a.add(10,20,30));
          System.out.println(a.add(10.5f,20.8f));
	}

}
