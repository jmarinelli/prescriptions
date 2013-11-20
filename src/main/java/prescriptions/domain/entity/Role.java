package prescriptions.domain.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Role extends PersistentEntity {

	private String username;
	private String password;
	private Integer roleId;
	
	@OneToMany(mappedBy="creator", cascade = CascadeType.ALL)
	private Set<Prescription> prescriptions;

	public Role() {
		
	}
	
	public Role(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Set<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public Integer getRole() {
		return roleId;
	}
	
	public boolean isAdmin() {
		return this.roleId.equals(1);
	}
	
	public Integer getPresQty() {
		return this.prescriptions.size();
	}
}
