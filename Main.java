package hotel;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		ReadData.readData(conn);

	}

}
