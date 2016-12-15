package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Do the link between Fruits And Vegetables products and used commercialisation
 * mode.
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Table(name = "Product_Commercialization_FruitsAndVegetables_CompanyOnRoof")
public class Product_Commercialization_FruitsAndVegetables_CompanyOnRoof extends Product_Commercialization {
}
