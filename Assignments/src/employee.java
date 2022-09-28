
public class employee {
	 String name;
	int YOJ;
	String Address;
	void setData(String n ,int yoj,String ad){
		name=n;
		YOJ=yoj;
		Address=ad;
	}
	void display(){
		System.out.println(name+"\t\t"+YOJ+"\t\t"+Address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of object
		employee arr[]= new employee[3];
		arr[0]=new employee();
		arr[1]=new employee();
		arr[2]=new employee();

		arr[1].setData("Robert",1994,"64C-WallsStreet");
		arr[2].setData("Sam",2000,"68C-wallzSt");
		arr[0].setData("Jhon",1999,"56B-mountSt");

		
		System.out.println("NAME\t   YEAR OF JOINING\tADDRESS");
		
	    for(int i=0;i<3;i++) {
	    	arr[i].display();
	    }

	}

}
