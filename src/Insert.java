import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter name of student: ");
		String str=obj.nextLine();
		
		System.out.println("Enter rollno of student: ");
		int n=obj.nextInt();
		
		System.out.println("Enter class name of student: ");
		String str1=obj.next();
		
		
		String oracleXE_url= "jdbc:oracle:thin:@localhost:1521:XE";

		String username ="system";
		String password="surendra";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection  con= DriverManager.getConnection(oracleXE_url,username,password);
		
		Statement pst= con.createStatement();
		
		 String sql="insert into student values('"+str+"','"+n+"','"+str1+"')";
		 
		 pst.executeUpdate(sql);
		 
		 pst.close();
		con.close();
		
		System.out.println("Updated successfully!!");

	}

}