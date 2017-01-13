package urban.agriculture.model;

/**
 * The location of a company with a business on ground
 * 
 * @author Gwennael Bouteloup
 *
 */
// @Entity
// @Table(name = "companylocation_ongroundinstallation")
@SuppressWarnings("serial")
public class CompanyLocation_OnGroundInstallation extends CompanyLocation {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys

	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idInstallation")
	private OnGroundInstallation onGroundInstallation;

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
	public CompanyLocation_OnGroundInstallation(Company company, OnGroundInstallation onGroundInstallation,
			String responsibleFirstName, String responsibleName, String phoneNumber, Integer employeesNumber,
			String description) {
		super(company, responsibleFirstName, responsibleName, phoneNumber, employeesNumber, description);
		this.onGroundInstallation = onGroundInstallation;
	}

	public OnGroundInstallation getOnGroundInstallation() {
		return onGroundInstallation;
	}

	public void setOnGroundInstallation(OnGroundInstallation onGroundInstallation) {
		this.onGroundInstallation = onGroundInstallation;
	}

}
