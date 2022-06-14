package ticket.booking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsertion {
	
		DataInsertion(String username,String password){

		String url = "jdbc:Mysql://localhost:3306/new_schema";
		String SQLname = "root";
		String SQLpassword = "Aspire@123";

		String sql = "insert into logindetails(username,password)"+" values (?,?);";
         String name=username;
		try {
		Connection connection = DriverManager.getConnection(url,SQLname,SQLpassword);
		Statement statement = connection.createStatement();
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1,username);
		prepareStatement.setString(2,password);
		

		Validation validate=new Validation();
		boolean resultValidation=validate.checkCredential(username,password);

		if(resultValidation==true)
		{
		int result = prepareStatement.executeUpdate();
	     Operation operation=new Operation();
	     operation.SwitchStatement(name);
		}
		else
		{
		System.out.println("Enter Valid Details");

		}
		statement.close();
		connection.close();
		}
		catch(SQLException exception) {
		System.out.println(exception);
		}
		finally {
		   System.out.println("You're Added");
		}
	}
}

		


