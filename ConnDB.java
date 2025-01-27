package hotel;
import java.util.*;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class ConnDB {

	//private ConnDB() {};
	static Connection conn=null;
	static Connection getInstance() {
		if(conn==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?user=root","root","admin123");
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
