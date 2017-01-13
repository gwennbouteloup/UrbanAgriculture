package urban.agriculture.model;

//#GB_TO_DO# : to update regarding the best way to
//implements composed key and using objects for key
/**
 * Define the product commercialization mode for fruits and vegetables products
 * and a company located on ground ground
 * 
 * @author gbouteloup
 *
 */
// @Entity
// @Table(name =
// "Product_Commercialization_FruitsAndVegetables_CompanyOnGround")
@SuppressWarnings("serial")
public class Product_Commercialization_FruitsAndVegetables_CompanyOnGround
		extends Product_Commercialization_FruitsAndVegetables {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idCompanyLocationOnGround")
	private CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation;

	// Constructors
	public Product_Commercialization_FruitsAndVegetables_CompanyOnGround() {
		super();
	}

	public Product_Commercialization_FruitsAndVegetables_CompanyOnGround(CommercializationMode commercializationMode,
			CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation,
			FruitsAndVegetablesProduct fruitsAndVegetablesProduct) {
		super(commercializationMode, fruitsAndVegetablesProduct);
		this.companyLocation_OnGroundInstallation = companyLocation_OnGroundInstallation;
	}

	// Methods
	// Accessors
	public CompanyLocation_OnGroundInstallation getCompanyLocation_OnGroundInstallation() {
		return companyLocation_OnGroundInstallation;
	}

	public void setCompanyLocation_OnGroundInstallation(
			CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation) {
		this.companyLocation_OnGroundInstallation = companyLocation_OnGroundInstallation;
	}
}
