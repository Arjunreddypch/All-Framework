package restapi.programs;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJsonUsingPojo {
	
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		List<SampleJson> peopleList = Arrays.asList(
	            new SampleJson("Alice Johnson", "123 Maple Street, Springfield, IL 62704"),
	            new SampleJson("Bob Smith", "456 Oak Avenue, Denver, CO 80203"),
	            new SampleJson("Charlie Nguyen", "789 Pine Road, Austin, TX 73301"),
	            new SampleJson("Diana Carter", "321 Birch Lane, Seattle, WA 98101")
	        );
		
		
		EmployeeData employeeData=new EmployeeData(peopleList);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeData);
		
		System.out.println(json);
	
	
	}
	
	
		
	
	
	

}
