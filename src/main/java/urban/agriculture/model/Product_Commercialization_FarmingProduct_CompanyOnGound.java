package urban.agriculture.model;

/**
 * Define the product commercialization mode for a farming product and a company
 * located on ground
 * 
 * @author gbouteloup
 *
 */
// @Entity
// @Table(name = "product_commercialization_farmingproduct_companyonground")
@SuppressWarnings("serial")
public class Product_Commercialization_FarmingProduct_CompanyOnGound extends Product_Commercialization_FarmingProduct {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idCompanyLocationOnGround")
	private CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation;

	// Methods
	// Constructors
	public Product_Commercialization_FarmingProduct_CompanyOnGound() {
		super();
	}

	public Product_Commercialization_FarmingProduct_CompanyOnGound(CommercializationMode commercializationMode,
			FarmingProduct farmingProduct, CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation) {
		super(commercializationMode, farmingProduct);
		this.companyLocation_OnGroundInstallation = companyLocation_OnGroundInstallation;
	}

	// Accessors
	public CompanyLocation_OnGroundInstallation getCompanyLocation_OnGroundInstallation() {
		return companyLocation_OnGroundInstallation;
	}

	public void setCompanyLocation_OnGroundInstallation(
			CompanyLocation_OnGroundInstallation companyLocation_OnGroundInstallation) {
		this.companyLocation_OnGroundInstallation = companyLocation_OnGroundInstallation;
	}
}
