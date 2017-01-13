package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Do the link between Objectives and Business
 * 
 * @author Gwennael Bouteloup
 */

@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Objective_Business implements Serializable {
	// Attributes
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "id", updatable = false, nullable = false)
	private Objective objective;

	private Business business;

	private CompanyLocation companyLocation;

	// Methods
	// Constructors
	public Objective_Business() {
	}

	/**
	 * Fill all attributes methods
	 * 
	 * @param objective
	 * @param business
	 * @param companyLocation
	 */
	public Objective_Business(Objective objective, Business business, CompanyLocation companyLocation) {
		this.business = business;
		this.companyLocation = companyLocation;
		this.objective = objective;
	}

	// Getters and setters
	public Objective getObjective() {
		return objective;
	}

	public void setObjective(Objective objective) {
		this.objective = objective;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public CompanyLocation getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(CompanyLocation companyLocation) {
		this.companyLocation = companyLocation;
	}
}
