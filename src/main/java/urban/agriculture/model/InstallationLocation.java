package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * The location of an installation
 * 
 * @author Gwennael Bouteloup
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class InstallationLocation implements Serializable {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

	@Column(name = "country")
	private String country;

	@Column(name = "address")
	private String address;

	@Column(name = "zipCode")
	private Integer zipCode;

	@Column(name = "city")
	private String city;

	@Column(name = "description")
	private String description;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public InstallationLocation() {
	}

	/**
	 * Fill all attributes constructor
	 * 
	 * @param id
	 * @param country
	 * @param address
	 * @param zipCode
	 * @param city
	 * @param description
	 */
	public InstallationLocation(Integer id, String country, String address, Integer zipCode, String city,
			String description) {
		this.address = address;
		this.city = city;
		this.country = country;
		this.description = description;
		this.id = id;
		this.zipCode = zipCode;
	}

	// Methods
	// Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}