package beatboxer;
import java.sql.*;
public class CreateConnection {
	public Connection con;
	CreateConnection(){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123");
		}catch(Exception e){
			
		}
	}
}
