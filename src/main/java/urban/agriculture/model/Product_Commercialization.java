package urban.agriculture.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * Do the link between products and used commercialisation mode.
 * 
 * @author Gwennael Bouteloup
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Product_Commercialization implements Serializable {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
	
	// Attributes
	// @Id
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "idCommercializationMode")
	private CommercializationMode commercializationMode;

	// Methods
	// Constructors
	/**
	 * Default constructor
	 */
	public Product_Commercialization() {
		this.commercializationMode = new CommercializationMode();
	}

	public Product_Commercialization(CommercializationMode commercializationMode) {
		this.commercializationMode = commercializationMode;
	}

	// Accessors
	public CommercializationMode getCommercializationMode() {
		return commercializationMode;
	}

	public void setCommercialisationMode(CommercializationMode commercializationMode) {
		this.commercializationMode = commercializationMode;
	}
}
