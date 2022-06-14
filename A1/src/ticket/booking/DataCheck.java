package ticket.booking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataCheck {
	DataCheck(String name,String password){
		String url = "jdbc:Mysql://localhost:3306/new_schema"; 
		String user = "root";
		String pass = "Aspire@123";
		String sqlName="",sqlPassword="";
		String sql = "select password from logindetails where username ='"+name+"';";



		try {

		Connection connection = DriverManager.getConnection(url,user,pass);
		Statement statement = connection.createStatement();
		//PreparedStatement p = connection.prepareStatement(sql);

		sqlName=name;
		ResultSet result =statement.executeQuery(sql);
		while (result.next()) {
		sqlPassword=result.getString(1);
		}

		if(name.equals(sqlName)&&password.equals(sqlPassword)) {
		System.out.println("Logged In"); //create object and call your function
		 Operation operation=new Operation();
	     operation.SwitchStatement(sqlName);

		
		}

		statement.close();
		connection.close();
		}
		catch(SQLException exception) {
		System.out.println(exception);
		}
		

		}


		

}
