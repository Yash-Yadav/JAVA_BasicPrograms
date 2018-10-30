import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.*;

public class jType_One 
{
	public static void main(String[] args) 
	{
		try
               {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Load Driver
			Connection con = DriverManager.getConnection("jdbc:odbc:HOD_DATA"); //Create Connection with Data Source Name : HOD_DATA
			Statement s = con.createStatement(); // Create Statement
			String query = "select * from Data"; // Create Query
			s.execute(query); // Execute Query 
			ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
			while(rs.next()) // Retrieve data from ResultSet
			{
				System.out.print("Serial number : "+rs.getString(1)); //1st column of Table from database
				System.out.print(" , Name : "+rs.getString(2)); //2nd column of Table 
				System.out.print(" , City : "+rs.getString(3)); //3rd column of Table 
				System.out.println(" and Age : "+rs.getString(4)); //4th column of Table 
			}
			s.close();
			con.close();
		}
		catch (Exception e) 
                {
			System.out.println("Exception : "+e);
		}
	}
}
