package urban.agriculture.model;

import javax.persistence.MappedSuperclass;

/**
 * Do the link between fruits and vegetables products and used commercialisation
 * mode.
 * 
 * @author Gwennael Bouteloup
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Product_Commercialization_FruitsAndVegetables extends Product_Commercialization {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idFruitsAndVegetables")
	private FruitsAndVegetablesProduct fruitsAndVegetablesProduct;

	// Methods
	// Constructors
	public Product_Commercialization_FruitsAndVegetables() {
		super();
	}

	public Product_Commercialization_FruitsAndVegetables(CommercializationMode commercializationMode,
			FruitsAndVegetablesProduct fruitsAndVegetablesProduct) {
		super(commercializationMode);
		this.fruitsAndVegetablesProduct = fruitsAndVegetablesProduct;
	}

	// Accessors
	public FruitsAndVegetablesProduct getFruitsAndVegetablesProduct() {
		return fruitsAndVegetablesProduct;
	}

	public void setFruitsAndVegetablesProduct(FruitsAndVegetablesProduct fruitsAndVegetablesProduct) {
		this.fruitsAndVegetablesProduct = fruitsAndVegetablesProduct;
	}
}
