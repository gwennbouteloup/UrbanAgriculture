package urban.agriculture.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import urban.agriculture.dao.impl.UserDAOImpl;
import urban.agriculture.model.User;

@Service
public class UserService {
	private UserDAOImpl userDAOImpl;

	public UserDAOImpl getUserDAOImpl() {
		return userDAOImpl;
	}

	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}

	public UserService(SessionFactory pSessionFactory) {
		this.userDAOImpl = new UserDAOImpl(pSessionFactory);
	}

	@Transactional
	public List<User> list() {
		return this.userDAOImpl.list();
	}
}
