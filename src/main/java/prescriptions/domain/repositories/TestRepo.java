package prescriptions.domain.repositories;

import java.util.List;

import prescriptions.domain.entity.Test;

public interface TestRepo {

	public List<Test> getAll();

	public Test get(int studentId);

	public void save(Test test);
	
}
