package prescriptions.domain.entity;

import javax.persistence.Entity;

@Entity
public class Role extends PersistentEntity {

	private String username;
	private String password;

	Role() {

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
}
