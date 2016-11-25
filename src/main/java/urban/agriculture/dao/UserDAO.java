package urban.agriculture.dao;

import java.util.List;

import urban.agriculture.model.User;

public interface UserDAO {
	public List<User> list();
	
	public User get(int id);
	
	public void createOrUpdate(User user);
	
	public void delete(int id);
}