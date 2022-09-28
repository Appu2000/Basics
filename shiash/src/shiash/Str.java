package shiash;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String-immutable
         String s=new String("java");
         System.out.println(s.concat("program"));
         System.out.println(s);
         
         //StringBuffer-mutable
         StringBuffer str=new StringBuffer("python");
         System.out.println(str.append("program"));
         System.out.println(str); 
	}

}
