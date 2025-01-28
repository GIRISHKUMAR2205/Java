package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao implements Dao<User,String,Object> {

	@Override
	public User getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		User user=null;
		PreparedStatement ps=conn.prepareStatement("select * from users where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			user =new User(rs.getInt("id"),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
		}
		return user;
	}

	@Override
	public List<User> getAll() throws SQLException{
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		List<User> users=new ArrayList<>();
		User user=null;
		PreparedStatement ps=conn.prepareStatement("select * from users");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			user =new User(rs.getInt("id"),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			users.add(user);
		}
		return users;
	}

	@Override
	public int insert(User t) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?) ");
		ps.setInt(1, t.getId());
		ps.setString(2, t.getName());
		ps.setString(3, t.getPhoneno());
		ps.setString(4, t.getAddress());
		ps.setString(5,t.getEmail());
		ps.setString(6, t.getPassword());
		int result=ps.executeUpdate();
		return result;
	}

	@Override
	public int delete(User t) throws SQLException{
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		int id=t.getId();
		PreparedStatement ps=conn.prepareStatement("delete from users where id=?");
		ps.setInt(1, id);
		int result=ps.executeUpdate();
		return result;
	}

	@Override
	public int update(User t,Map<String,Object>fieldsToUpdate) throws SQLException {
		// TODO Auto-generated method stub
		StringBuilder sql=new StringBuilder("update users set ");
		List<Object> objects=new ArrayList<>();
		fieldsToUpdate.forEach((key,value)->{
			sql.append(key);
			sql.append(" =?, ");
			objects.add(value);
		});
		sql.delete(sql.length()-2,sql.length());
		sql.append(" where id=?");
		objects.add(t.getId());
		Connection conn=ConnDB.getInstance();
		int id=t.getId();
		PreparedStatement ps=conn.prepareStatement(sql.toString());
		for(int i=0;i<objects.size();i++) {
			ps.setObject(i+1,objects.get(i));
		}
		int result=ps.executeUpdate();
		return result;
	}

	@Override
	public void save() throws SQLException{
		// TODO Auto-generated method stub
		Connection conn=ConnDB.getInstance();
		conn.commit();
		
	}

}
