package ticket.booking;
import java.sql.*;
import java.util.*;

public class ExampleClass {
	public static void main(String[] args) {

		String url = "jdbc:Mysql://localhost:3306/new_schema"; 
		String user = "root";
		String pass = "Aspire@123";
		String sql = "insert into seatdetails values(?,?);";
		

		try {

			Connection connection = DriverManager.getConnection(url,user,pass);
			Statement statement = connection.createStatement();
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			int count=1;
				for(int i=0;i<=600;i++)
				{	
					System.out.println("shhshshs");
					prepareStatement.setInt(1,count);
					prepareStatement.setInt(2,0);
					
					int result =prepareStatement.executeUpdate(sql);
			     	count++;
				}
				//   	
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		}

	}
