package urban.agriculture.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Specific type of installation
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Embeddable
@Table(name = "OnGroundInstallation")
@SuppressWarnings("serial")
public class OnGroundInstallation extends InstallationLocation {
}