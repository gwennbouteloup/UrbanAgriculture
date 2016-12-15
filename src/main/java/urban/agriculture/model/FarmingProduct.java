package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FarmingProduct sub-type of products production mode. A farming Produt is not
 * a fruit and vegetables product
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Table(name = "farmingproduct")
@SuppressWarnings("serial")
public class FarmingProduct extends Product {
}