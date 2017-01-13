package urban.agriculture.model;

/**
 * Do the link between Fruits And Vegetables products and used commercialisation
 * mode.
 * 
 * @author Gwennael Bouteloup
 */
// @Entity
// @Table(name = "product_commercialization_fruitsandvegetables_companyonroof")
@SuppressWarnings("serial")
public class Product_Commercialization_FruitsAndVegetables_CompanyOnRoof
		extends Product_Commercialization_FruitsAndVegetables {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idCompanyLocationOnRoof")
	private CompanyLocation_OnRoofInstallation companyLocation_OnRoofInstallation;

	// Methods
	// Constructors
	public Product_Commercialization_FruitsAndVegetables_CompanyOnRoof() {
		super();
	}

	public Product_Commercialization_FruitsAndVegetables_CompanyOnRoof(CommercializationMode commercializationMode,
			FruitsAndVegetablesProduct fruitsAndVegetablesProduct,
			CompanyLocation_OnRoofInstallation companyLocation_OnRoofInstallation) {
		super(commercializationMode, fruitsAndVegetablesProduct);
		this.companyLocation_OnRoofInstallation = companyLocation_OnRoofInstallation;
	}

	// Getters and setters
	public CompanyLocation_OnRoofInstallation getCompanyLocation_OnRoofInstallation() {
		return companyLocation_OnRoofInstallation;
	}

	public void setCompanyLocation_OnRoofInstallation(
			CompanyLocation_OnRoofInstallation companyLocation_OnRoofInstallation) {
		this.companyLocation_OnRoofInstallation = companyLocation_OnRoofInstallation;
	}
}
