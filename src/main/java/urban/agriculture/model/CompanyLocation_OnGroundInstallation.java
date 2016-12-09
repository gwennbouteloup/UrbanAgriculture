package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The location of a company with a business on ground
 * 
 * @author Gwennael Bouteloup
 *
 */
@Entity
@Table(name = "companylocation_ongroundinstallation")
public class CompanyLocation_OnGroundInstallation extends CompanyLocation {

}
