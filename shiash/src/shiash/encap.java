package shiash;
//encapsulation
class en{
	private int sid;
	private String sname,result;
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getResult() {
		return result;
	}

	public void setResult() {
		this.result = sid+"  "+sname;
	}

	public void setid(int id) {
		sid=id;	
	}
	
	public int getid() {
		return sid;
	}
}

public class encap {
	public static void main(String args[]) {
		en a=new en();
		a.setid(100);
		a.setSname("Sriram");
		a.setResult();
		System.out.println(a.getid());
		System.out.println(a.getSname());
		System.out.println(a.getResult());
		
		
	}

}
