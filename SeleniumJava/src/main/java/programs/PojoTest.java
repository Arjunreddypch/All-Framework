package programs;

public class PojoTest extends ReadData {
	
	public static void main(String[] args) throws Exception{
		
		
		PojoTest pojo=new PojoTest();
		pojo.setName("Arjun");
		pojo.setId(123);
		
		try {
		System.out.println(1/0);
		}catch (Exception e) {
			throw new CustomException("this is my own exception created by me");
		}
		
		System.out.println(pojo.getName());
		System.out.println(pojo.getId());
	}

}
