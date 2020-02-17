package Control;

import java.sql.*;


public class DBConnector {
	
	 public static final String DRIVER = "com.mysql.jdbc.Driver";
	    
	    public static final String DBURL = "jdbc:mysql://localhost:3306/birreria";
	    
	    public static final String USER = "root";
	   
	    public static final String PASS = "04061995";
	    
	    public static Connection createConnection() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(DBURL, USER, PASS);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	        	e.printStackTrace();
	        }
	        return conn;
	    }
	    
}