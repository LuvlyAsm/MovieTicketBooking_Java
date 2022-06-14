package movieticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
//This class check the datas in the database
public class DataCheck {
	DataCheck(String name,String password){
		String url = "jdbc:Mysql://localhost:3306/new_schema"; 
		String user_name = "root";
		String user_password = "Aspire@123";
		String sqlName="",sqlPassword="";
		String sql = "select password from logindetails where username ='"+name+"';";

		try {

		Connection connection = DriverManager.getConnection(url,user_name,user_password);
		Statement statement = connection.createStatement();

		sqlName=name;
		ResultSet result =statement.executeQuery(sql);
		while (result.next()) {
		sqlPassword=result.getString(1);
		}

		if(name.equals(sqlName)&&password.equals(sqlPassword)) {
		System.out.println("Logged In"); //create object and call your function
		 Operation operation=new Operation();
	     operation.options();

		
		}

		statement.close();
		connection.close();
		}
		catch(SQLException exception) {
		System.out.println(exception);
		}
		

		}


		

}
