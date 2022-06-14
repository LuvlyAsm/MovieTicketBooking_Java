package ticket.booking;

import java.util.*;
import java.sql.*;

public class Operation1 {
	String url = "jdbc:Mysql://localhost:3306/new_schema"; //bankApp - dB name
	String user = "root";
	String pass = "Aspire@123";

	Operation1(String username,String password){

	String url = "jdbc:Mysql://localhost:3306/new_schema"; //bankApp - dB name
	String user = "root";
	String pass = "Aspire@123";
	String sql="";

	if(password==1) {
	sql = "update seatdetails set seatno=seatno+"+1+" where name='"+sqlName+"';";
	}
	else if(password==2) {
	sql = "update seatdetails set seatno=balance-"+1+" where name='"+sqlName+"';";
	}

	try {

	Connection connection = DriverManager.getConnection(username,password);
	Statement statement = connection.createStatement();
	PreparedStatement prepare = connection.prepareStatement(sql);
	int result =prepare.executeUpdate();

	if(password==1) {
	sql="insert into transaction_history values('"+sqlName+"',"+"'+"+amount+"');";
	}
	if(password==2) {
	sql="insert into transaction_history values('"+sqlName+"',"+"'-"+amount+"');";
	}
	PreparedStatement prepared = connection.prepareStatement(sql);
	int resultt =prepared.executeUpdate();

	statement.close();
	connection.close();
	}
	catch(Exception exception) {
	System.out.println(exception);
	}
	finally {
	System.out.println("Done");
	}



	}

}
