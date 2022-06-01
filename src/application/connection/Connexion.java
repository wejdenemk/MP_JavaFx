package application.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
static Connection con = null ;
static {
	try{
	String db_url="jdbc:mysql://localhost:3306/jdbcEnt";
	
	String userName="root";
	String password="";
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(db_url,userName,password);
	System.out.println("connected");
	
	}catch(ClassNotFoundException | SQLException e){
		
	}
}
public static Connection getCon(){
	return con ;	
}

public static void testCon() {
	System.out.println(con);
	
}

}

