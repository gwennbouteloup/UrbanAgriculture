package urban.agriculture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type of installation on ground used for the business
 * 
 * @author Gwennael Bouteloup
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "business_installationtype_onground")
public class Business_InstallationType_OnGround extends Business_InstallationType {
	// #GB_TO_DO# : to update using @EmbeddedId for composed primary keys
	// And @JoinColumns({@JoinColumn( ...),...}) for foreign keys referencing
	// composed primary keys
}
