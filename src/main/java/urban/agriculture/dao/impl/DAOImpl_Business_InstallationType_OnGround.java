package urban.agriculture.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import urban.agriculture.model.Business_InstallationType_OnGround;

@Repository
public class DAOImpl_Business_InstallationType_OnGround
		implements urban.agriculture.dao.DAO_Business_InstallationType_OnGround {
	private final Logger logger = Logger.getLogger(getClass().getName());
	@Autowired
	private SessionFactory sessionFactory;
	@PersistenceContext
	protected EntityManager entityManager;

	public DAOImpl_Business_InstallationType_OnGround(SessionFactory pSessionFactory) {
		this.sessionFactory = pSessionFactory;
	}

	@Override
	@Transactional
	public void createOrUpdate(Business_InstallationType_OnGround business_InstallationType_OnGround) {
	}

	@Override
	@Transactional
	public void delete(Business_InstallationType_OnGround business_InstallationType_OnGround) {
	}

	@Override
	@Transactional
	public List<Business_InstallationType_OnGround> getAll() {
		Query<Business_InstallationType_OnGround> query = this.sessionFactory.getCurrentSession().createQuery(
				"FROM " + Business_InstallationType_OnGround.class.getName(), Business_InstallationType_OnGround.class);
		List<Business_InstallationType_OnGround> usersList = (List<Business_InstallationType_OnGround>) query
				.getResultList();

		return usersList;
	}

	@Override
	@Transactional
	public Long countAll() {
		return null;
	}

	@Override
	@Transactional
	public Integer deleteAll() {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			int result = session.createQuery("delete from Business_InstallationType_OnGround").executeUpdate();
			tx.commit();
			return result;
		} catch (HibernateException ex) {
			logger.info("deleteAll error: " + ex.getLocalizedMessage());
			if (tx != null) {
				tx.rollback();
			}
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
