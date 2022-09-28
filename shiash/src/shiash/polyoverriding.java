package shiash;
class bank{
	int interest() {
		return 0;
	}
}
class sbi extends bank{
	int interest() {
		return 5;
	}
}
class axis extends bank{
	int interest() {
		return 7;
	}
}
class kvb extends bank{
	int interest() {
		return 10;
	}
}
class a extends bank{
	
}
public class polyoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank();
		System.out.println(b.interest());
		sbi a=new sbi();
		System.out.println(a.interest());
		axis c=new axis();
		System.out.println(c.interest());
		kvb d=new kvb();
		System.out.println(d.interest());
		a e=new a();
		System.out.println(e.interest());

	}

}
