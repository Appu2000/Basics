package database;
import java.sql.*;
import java.util.Scanner;
public class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
			Statement stmt=con.createStatement();
			PreparedStatement ps=con.prepareStatement(  
					"insert into result values(?,?,?,?)");  
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for (int i=2;i<=n+2;i++) {
				System.out.print("name");
				String name=sc.next();
				System.out.print("result");
				String result=sc.next();
				System.out.print("grade");
				String grade=sc.next();
				
				ps.setInt(1, i);
				ps.setString(2, name);
				ps.setString(3, result);
				ps.setString(4, grade);
				ps.executeUpdate();
		
			}
			con.close();
			
//			ResultSet rs=stmt.executeQuery("select * from emp");
//			while(rs.next())
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//			    con.close();
			    
				
		}catch(Exception e) {System.out.println(e);}	
	}

}
