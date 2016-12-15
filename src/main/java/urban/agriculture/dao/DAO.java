package urban.agriculture.dao;

import java.util.List;

/**
 * Define the global comportment of DAO for link and non link entities
 * 
 * @author Gwennael Bouteloup
 *
 * @param <T>
 */
public interface DAO<T> {
	public void createOrUpdate(T entity);

	public void delete(T entity);

	public List<T> getAll();

	public Long countAll();

	public Integer deleteAll();
}
