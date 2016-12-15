package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

/**
 * Do the link between companies and corresponding locations
 * 
 * @author Gwennael Bouteloup
 */
@MappedSuperclass
@Embeddable
@SuppressWarnings("serial")
public abstract class CompanyLocation implements Serializable {
	// Attributes
	// #GB_TO_DO# : to update regarding the best way to
	// implements composed key and using objects for key
	// using @Embeddable
	private Company company;
	private InstallationLocation installationLocation;

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
	 * @param installationLocation
	 * @param responsibleFirstName
	 * @param responsibleName
	 * @param phoneNumber
	 * @param employeesNumber
	 * @param description
	 */
	public CompanyLocation(Company company, InstallationLocation installationLocation, String responsibleFirstName,
			String responsibleName, String phoneNumber, Integer employeesNumber, String description) {
		this.setCompany(company);
		this.setDescription(description);
		this.setEmployeesNumber(employeesNumber);
		this.setInstallationLocation(installationLocation);
		this.setPhoneNumber(phoneNumber);
		this.setResponsibleFirstName(responsibleFirstName);
		this.setResponsibleName(responsibleName);
	}

	// Getters and setters
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public InstallationLocation getInstallationLocation() {
		return installationLocation;
	}

	public void setInstallationLocation(InstallationLocation installationLocation) {
		this.installationLocation = installationLocation;
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
