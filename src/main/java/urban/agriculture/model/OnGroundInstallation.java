package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Specific type of installation
 * 
 * @author Gwennael Bouteloup
 */
@Entity
@Table(name = "OnGroundInstallation")
@SuppressWarnings("serial")
public class OnGroundInstallation extends InstallationLocation {
}