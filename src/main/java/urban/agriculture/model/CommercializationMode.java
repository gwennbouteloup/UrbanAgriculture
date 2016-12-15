package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Business commercialization mode
 * 
 * Define the selected commercialization mode for a product
 * 
 * @author Gwennael Bouteloup
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "CommercializationMode")
public class CommercializationMode implements Serializable {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

	@Column(name = "name")
	private String description;

	@Column(name = "description")
	private String name;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public CommercializationMode() {
	}

	/**
	 * Fill all fields constructor
	 * 
	 * @param id
	 * @param description
	 * @param name
	 */
	public CommercializationMode(Integer id, String description, String name) {
		this.description = description;
		this.id = id;
		this.name = name;
	}

	// Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}