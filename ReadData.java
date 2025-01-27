package hotel;

import java.sql.*;

class ReadData{
	
	static void readData(Connection con) {
		Connection conn=con;
		try {			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM USERS");
			while(rs.next()) {
				System.out.println(rs.getString(1)+'\t'+rs.getString(2)+'\t'+rs.getString(3)+'\t'+rs.getString(4)+'\t'+rs.getString(5)+'\t'+rs.getString(6));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
