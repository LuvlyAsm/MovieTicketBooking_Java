package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
class Main {
public static void main(String args[])
{
//Creating the connection
String url = "jdbc:Mysql://localhost:3306/new_schema";
String user = "root";
String pass = "Aspire@123";

//Inserting data using SQL query
String sql ="Select AVG(scost) as Average_Cost from software Where dev_in like 'PASCAL'";
try
{

Connection connection = DriverManager.getConnection(url,user,pass);
Statement statement = connection.createStatement();
PreparedStatement p = connection.prepareStatement(sql);

ResultSet result = p.executeQuery();
while(result.next()){
System.out.print(result.getString(1));

System.out.println();
}
//
statement.close();
connection.close();
}
catch(Exception exception)
{
System.err.println(exception);
}

}
}