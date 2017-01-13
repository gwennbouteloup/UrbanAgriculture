package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * Do the link between companies and corresponding locations
 * 
 * @author Gwennael Bouteloup
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class CompanyLocation implements Serializable {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys

	// Attributes
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "idCompany")
	private Company company;

	@Column(name = "responsibleFirstName")
	private String responsibleFirstName;

	@Column(name = "responsibleName")
	private String responsibleName;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "employeesNumber")
	private Integer employeesNumber;

	@Column(name = "description")
	private String description;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public CompanyLocation() {
	}

	/**
	 * Fill all attributes constructor
	 * 
	 * @param company
	 * @param responsibleFirstName
	 * @param responsibleName
	 * @param phoneNumber
	 * @param employeesNumber
	 * @param description
	 */
	public CompanyLocation(Company company, String responsibleFirstName, String responsibleName, String phoneNumber,
			Integer employeesNumber, String description) {
		this.company = company;
		this.description = description;
		this.employeesNumber = employeesNumber;
		this.phoneNumber = phoneNumber;
		this.responsibleFirstName = responsibleFirstName;
		this.responsibleName = responsibleName;
	}

	// Getters and setters
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getResponsibleFirstName() {
		return responsibleFirstName;
	}

	public void setResponsibleFirstName(String responsibleFirstName) {
		this.responsibleFirstName = responsibleFirstName;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
