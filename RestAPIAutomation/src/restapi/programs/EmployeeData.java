package restapi.programs;

import java.util.List;

public class EmployeeData {
	
	private List<SampleJson> employee;
	
	public EmployeeData() {
		
	}
	public EmployeeData(List<SampleJson> employee) {
		
		this.employee=employee;
	}

	public void setemployee(List<SampleJson> employee) {
		
		this.employee=employee;
	}
	
	public List<SampleJson> getemployee(){
		
		return employee;
	}

}

