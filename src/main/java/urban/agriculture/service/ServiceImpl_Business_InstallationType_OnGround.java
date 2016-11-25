package urban.agriculture.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import urban.agriculture.dao.impl.DAOImpl_Business_InstallationType_OnGround;
import urban.agriculture.model.Business_InstallationType_OnGround;

/**
 * Define the service layer methods for Business_InstallationType_OnGround type
 * 
 * @author Gwennael Bouteloup
 *
 */
@Service
public class ServiceImpl_Business_InstallationType_OnGround {
	private DAOImpl_Business_InstallationType_OnGround daoImpl_Business_InstallationType_OnGround;

	// Getters and setters
	public DAOImpl_Business_InstallationType_OnGround getDaoImpl_Business_InstallationType_OnGround() {
		return daoImpl_Business_InstallationType_OnGround;
	}

	public void setDaoImpl_Business_InstallationType_OnGround(
			DAOImpl_Business_InstallationType_OnGround daoImpl_Business_InstallationType_OnGround) {
		this.daoImpl_Business_InstallationType_OnGround = daoImpl_Business_InstallationType_OnGround;
	}

	// Constructor
	public ServiceImpl_Business_InstallationType_OnGround(SessionFactory pSessionFactory) {
		this.daoImpl_Business_InstallationType_OnGround = new DAOImpl_Business_InstallationType_OnGround(
				pSessionFactory);
	}

	// Methods
	@Transactional
	public void createOrUpdate(Business_InstallationType_OnGround business_InstallationType_OnGround) {
		this.daoImpl_Business_InstallationType_OnGround.createOrUpdate(business_InstallationType_OnGround);
	}

	@Transactional
	public void delete(Business_InstallationType_OnGround business_InstallationType_OnGround) {
		this.daoImpl_Business_InstallationType_OnGround.delete(business_InstallationType_OnGround);
	}

	@Transactional
	public List<Business_InstallationType_OnGround> getAll() {
		return this.daoImpl_Business_InstallationType_OnGround.getAll();
	}

	@Transactional
	public Long countAll() {
		return this.daoImpl_Business_InstallationType_OnGround.countAll();
	}

	@Transactional
	public Integer deleteAll() {
		return this.daoImpl_Business_InstallationType_OnGround.deleteAll();
	}

}
