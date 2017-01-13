package urban.agriculture.model;

/**
 * Define the product commercialization mode for a farming product and a company
 * located on roof
 * 
 * @author gbouteloup
 *
 */
// @Entity
// @Table(name = "product_commercialization_farmingproduct_companyonroof")
@SuppressWarnings("serial")
public class Product_Commercialization_FarmingProduct_CompanyOnRoof extends Product_Commercialization_FarmingProduct {
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
	public Product_Commercialization_FarmingProduct_CompanyOnRoof() {
		super();
	}

	public Product_Commercialization_FarmingProduct_CompanyOnRoof(CommercializationMode commercializationMode,
			FarmingProduct farmingProduct, CompanyLocation_OnRoofInstallation companyLocation_OnRoofInstallation) {
		super(commercializationMode, farmingProduct);
		this.companyLocation_OnRoofInstallation = companyLocation_OnRoofInstallation;
	}

	// Accessors
	public CompanyLocation_OnRoofInstallation getCompanyLocation_OnRoofInstallation() {
		return companyLocation_OnRoofInstallation;
	}

	public void setCompanyLocation_OnRoofInstallation(
			CompanyLocation_OnRoofInstallation companyLocation_OnRoofInstallation) {
		this.companyLocation_OnRoofInstallation = companyLocation_OnRoofInstallation;
	}
}
