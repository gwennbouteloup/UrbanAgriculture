package urban.agriculture.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import urban.agriculture.dao.UserDAO;
import urban.agriculture.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@PersistenceContext
	protected EntityManager entityManager;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<User> list() {
		Query<User> query = this.sessionFactory.getCurrentSession().createQuery("FROM " + User.class.getName(),
				User.class);
		List<User> usersList = (List<User>) query.getResultList();
		return usersList;
	}

	@Override
	@Transactional
	public void createOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		User userToDelete = new User();
		userToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public User get(int id) {
		// String hql = "from User where id=" + id;
		// Query query = sessionFactory.getCurrentSession().createQuery(hql);
		//
		// @SuppressWarnings("unchecked")
		// List<User> listUser = (List<User>) query.list();
		//
		// if (listUser != null && !listUser.isEmpty()) {
		// return listUser.get(0);
		// }
		//
		return null;
	}
}