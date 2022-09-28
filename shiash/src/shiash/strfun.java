package shiash;
/*concat()    length()
substring()   replace()
equals()      equalIgnoreCase()
indexOf()	  lastIndexOf()
toUpperCase() toLowerCase()
trim()        split()
isEmpty()     charAt() */

public class strfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String();
		String str1=new String();
		str="HELLO";
		str1=" WORLD";
		String str2="Hello World i am sriram";
		String str3="";
	
		
//concat()
		System.out.println("concatination "+str.concat(str1));
		
//length()		
		System.out.println("length "+str.length());
		
//substring()
		System.out.println("substring "+str1.substring(0,3));
		
//replace()
		System.out.println("replace "+str.replace('H','M'));
		
//equals()	
		System.out.println(" equals "+str.equals("HELLO"));
		
//equalIgnorecase()
		System.out.println(" equalsignorecase "+str.equalsIgnoreCase("hello"));
		
//indexof()
		System.out.println(" indexof "+str1.indexOf("R"));
		
//lastIndexOf()	last occurence	
		System.out.println(" lastindexof "+str.lastIndexOf("L"));
		
//touppercase and tolowercase
		System.out.println(" tolowercase "+str.toLowerCase()+" touppercase "+str.toUpperCase());
		
//trim()
		System.out.println("before trim"+str1);
		System.out.println("After trim"+str1.trim());
		
//split
		System.out.println(" split "+str2.split(" "));
		System.out.println(str2);
		
//isempty
		System.out.println("isempty "+str3.isEmpty());
		
//charat
		System.out.println("charat "+str.charAt(1));
		
		
		
		
		
	}

}
