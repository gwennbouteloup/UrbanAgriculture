package urban.agriculture.model;

/**
 * The location of a company with a business on Roof
 * 
 * @author Gwennael Bouteloup
 *
 */
// @Entity
// @Table(name = "companylocation_onroofinstallation")
@SuppressWarnings("serial")
public class CompanyLocation_OnRoofInstallation extends CompanyLocation {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idInstallation")
	private OnRoofInstallation onRoofInstallation;

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
	public CompanyLocation_OnRoofInstallation(Company company, OnRoofInstallation onRoofInstallation,
			String responsibleFirstName, String responsibleName, String phoneNumber, Integer employeesNumber,
			String description) {
		super(company, responsibleFirstName, responsibleName, phoneNumber, employeesNumber, description);
		this.onRoofInstallation = onRoofInstallation;
	}

	public OnRoofInstallation getOnRoofInstallation() {
		return onRoofInstallation;
	}

	public void setOnRoofInstallation(OnRoofInstallation onRoofInstallation) {
		this.onRoofInstallation = onRoofInstallation;
	}
}
