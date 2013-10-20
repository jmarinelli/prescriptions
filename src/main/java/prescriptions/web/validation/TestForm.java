package prescriptions.web.validation;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Test;

public class TestForm {
	
	private Test test;
	private String name;
	private String password;
	
	public TestForm() {
		
	}
	
	public TestForm(Test test) {
		this.test = test;
		this.name = test.getName();
		this.password = test.getPassword();
	}
	
	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Test build() throws CorruptedDataException {
		if (this.test == null)
			return new Test(this.name, this.password);
		else {
			test.setName(this.name);
			test.setPassword(this.password);
			return test;
		}
	}
	
}
