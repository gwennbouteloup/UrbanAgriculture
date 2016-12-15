package urban.agriculture.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Specific type of installation. On roof installation is specific regarding the
 * security and the bearing capacity.
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Embeddable
@Table(name = "OnRoofInstallation")
@SuppressWarnings("serial")
public class OnRoofInstallation extends InstallationLocation {
}