package urban.agriculture.model;

/**
 * The criteria used to characterized the production
 * 
 * @author Gwennael Bouteloup
 */
public class ProductionCriteria {
	// Attributes
	private String description;
	private CompanyLocation companyLocation;

	// #GB_TO_DO# : to update regarding the best way to
	// implements composed key and using objects for key
	// using @Embeddable
	private InstallationType installationType;
	private FruitsAndVegetablesProduct fruitsAndVegetables;
	private IrrigationType irrigationType;
	private FertilizationType fertilizationType;
	private PhytosanitaryFightType phytosanitaryFightType;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public ProductionCriteria() {
	}

	/**
	 * Fill all attributes constructor
	 * 
	 * @param description
	 * @param companyLocation
	 * @param installationType
	 */
	public ProductionCriteria(String description, CompanyLocation companyLocation, InstallationType installationType,
			FruitsAndVegetablesProduct fruitsAndVegetables, IrrigationType irrigationType,
			FertilizationType fertilizationType, PhytosanitaryFightType phytosanitaryFightType) {
		this.companyLocation = companyLocation;
		this.description = description;
		this.setFertilizationType(fertilizationType);
		this.fruitsAndVegetables = fruitsAndVegetables;
		this.installationType = installationType;
		this.setIrrigationType(irrigationType);
		this.setPhytosanitaryFightType(phytosanitaryFightType);
	}

	// Getters and setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public InstallationType getInstallationType() {
		return installationType;
	}

	public void setInstallationType(InstallationType installationType) {
		this.installationType = installationType;
	}

	public CompanyLocation getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(CompanyLocation companyLocation) {
		this.companyLocation = companyLocation;
	}

	public FruitsAndVegetablesProduct getFruitsAndVegetables() {
		return fruitsAndVegetables;
	}

	public void setFruitsAndVegetables(FruitsAndVegetablesProduct fruitsAndVegetables) {
		this.fruitsAndVegetables = fruitsAndVegetables;
	}

	public IrrigationType getIrrigationType() {
		return irrigationType;
	}

	public void setIrrigationType(IrrigationType irrigationType) {
		this.irrigationType = irrigationType;
	}

	public FertilizationType getFertilizationType() {
		return fertilizationType;
	}

	public void setFertilizationType(FertilizationType fertilizationType) {
		this.fertilizationType = fertilizationType;
	}

	public PhytosanitaryFightType getPhytosanitaryFightType() {
		return phytosanitaryFightType;
	}

	public void setPhytosanitaryFightType(PhytosanitaryFightType phytosanitaryFightType) {
		this.phytosanitaryFightType = phytosanitaryFightType;
	}
}