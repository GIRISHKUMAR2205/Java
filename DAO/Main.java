package DAO;

import java.sql.SQLException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws SQLException,NullPointerException {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDao();
		User newUser=new User(0,"Gh","9121052205","H.no 74,BHC,Kavali","girishkumarthatavarthi@gmail.com","HI");
		System.out.println("Insert");
		userDao.insert(newUser);
		System.out.println("Select");
		User get=userDao.getById(0);
		System.out.println(get.toString());
		System.out.print("Update");
		Map<String,Object> fieldsToUpdate=new HashMap();
		fieldsToUpdate.put("name", "Naman");
		userDao.update(newUser, fieldsToUpdate);
		System.out.println("SelectAll");
		List<User> users=new ArrayList();
		users=userDao.getAll();
		users.forEach(user->System.out.println(user.toString()));
		System.out.println("Delete");
		userDao.delete(newUser);
		System.out.println("SelectAll");
		users=userDao.getAll();
		users.forEach(user->System.out.println(user.toString()));
	}

}
