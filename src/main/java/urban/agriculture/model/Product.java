package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * The product(s): The reason to be of your urban agriculture business
 * 
 * @author Gwennael Bouteloup
 */

@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Product implements Serializable {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public Product() {
	}

	/**
	 * Fill all attributes constructor
	 * 
	 * @param id
	 * @param name
	 * @param description
	 */
	public Product(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	// Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}