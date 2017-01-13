package urban.agriculture.model;

import javax.persistence.MappedSuperclass;

/**
 * Do the link between farming products and used commercialisation mode.
 * 
 * @author Gwennael Bouteloup
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Product_Commercialization_FarmingProduct extends Product_Commercialization {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idFarmingProduct")
	private FarmingProduct farmingProduct;

	// Methods
	// Constructors
	public Product_Commercialization_FarmingProduct() {
		super();
	}

	public Product_Commercialization_FarmingProduct(CommercializationMode commercializationMode,
			FarmingProduct farmingProduct) {
		super(commercializationMode);
		this.farmingProduct = farmingProduct;
	}

	// Accessors
	public FarmingProduct getFarmingProduct() {
		return farmingProduct;
	}

	public void setFarmingProduct(FarmingProduct farmingProduct) {
		this.farmingProduct = farmingProduct;
	}
}
