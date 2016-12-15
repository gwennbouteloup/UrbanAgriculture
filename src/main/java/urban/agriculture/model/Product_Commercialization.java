package urban.agriculture.model;

/**
 * Do the link between products and used commercialisation mode.
 * 
 * @author Gwennael Bouteloup
 */
public abstract class Product_Commercialization {
	// Attributes
	// #GB_TO_DO# : to update regarding the best way to
	// implements composed key and using objects for key
	// using @Embeddable
	private CommercializationMode commercializationMode;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public Product_Commercialization() {
		this.commercializationMode = new CommercializationMode();
	}

	public CommercializationMode getCommercializationMode() {
		return commercializationMode;
	}

	public void setCommercialisationMode(CommercializationMode commercializationMode) {
		this.commercializationMode = commercializationMode;
	}
}
