import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.sun.jdi.connect.spi.Connection;

public class DemoJDBC {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		String oracleXE_url= "jdbc:oracle:thin:@localhost:1521:XE";

		String username ="system";
		String password="surendra";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
		Connection  con= DriverManager.getConnection(oracleXE_url,username,password);
			
		 String sql="select * from student";
		 
		PreparedStatement pst=con.prepareStatement(sql);

		
		ResultSet rs=pst.executeQuery();

		while(rs.next())
		{
				System.out.print("Name "+rs.getString(1)+"\n");
		       
		            System.out.println("rollno "+rs.getString(2));
		           
		            System.out.println("class. "+rs.getString(3)+"\n");
		}
		
		
		rs.close();
		pst.close();
		con.close();
	}

}
