package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//#GB_TO_DO# : to update regarding the best way to
//implements composed key and using objects for key
//using @Embeddable
/**
* Define the product commercialization mode for fruits and vegetables products
* and a company located on ground ground
* 
* @author gbouteloup
*
*/
@Entity
@Table(name = "Product_Commercialization_FruitsAndVegetables_CompanyOnGround")
public class Product_Commercialization_FruitsAndVegetables_CompanyOnGround extends Product_Commercialization {
}
