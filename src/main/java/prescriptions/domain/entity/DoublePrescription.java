package prescriptions.domain.entity;

public class DoublePrescription {
	
	private Prescription first;
	private Prescription second;
	
	public DoublePrescription() { }

	public DoublePrescription(Prescription first, Prescription second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Prescription getFirst() {
		return first;
	}

	public void setFirst(Prescription first) {
		this.first = first;
	}

	public Prescription getSecond() {
		return second;
	}

	public void setSecond(Prescription second) {
		this.second = second;
	}

}
