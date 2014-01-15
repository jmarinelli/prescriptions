package prescriptions.domain.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Convenio extends PersistentEntity {

	private String name;
	@ManyToMany
	private Map<String, Defaults> options;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Defaults> getOptions() {
		return options;
	}
	public void setOptions(Map<String, Defaults> options) {
		this.options = options;
	}
	
}
