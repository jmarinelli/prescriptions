package prescriptions.domain.entity;

import javax.persistence.Entity;

@Entity
public class Defaults extends PersistentEntity {
	
	private boolean available;
	private String defaultValue;
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
