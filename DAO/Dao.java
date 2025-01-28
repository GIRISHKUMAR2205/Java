package DAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
public interface Dao<T,K, V> {
	T getById(int id) throws SQLException;
	List<T>getAll() throws SQLException;
	int insert(T t) throws SQLException;
	int delete(T t) throws SQLException;
	int update(T t,Map<K,V> fieldsToUpdate) throws SQLException;
	void save() throws SQLException;
}
