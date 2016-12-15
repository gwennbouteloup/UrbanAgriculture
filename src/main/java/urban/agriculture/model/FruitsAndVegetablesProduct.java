package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Type of products: Fruits and vegetables. A fruit or a vegetable could not be
 * a farming product
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Table(name = "fruitsandvegetablesproduct")
@SuppressWarnings("serial")
public class FruitsAndVegetablesProduct extends Product {
}