package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The phytosanitary fight type used for product(s)
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Table(name = "phytosanitaryfighttype")
@SuppressWarnings("serial")
public class PhytosanitaryFightType implements Serializable {
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
	public PhytosanitaryFightType() {
	}

	/**
	 * Fill all attributes constructor
	 * 
	 * @param id
	 * @param name
	 * @param description
	 * @param productionCriteria
	 */
	public PhytosanitaryFightType(Integer id, String name, String description) {
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