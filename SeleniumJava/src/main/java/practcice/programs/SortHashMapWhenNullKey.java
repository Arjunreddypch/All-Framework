package practcice.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapWhenNullKey {
	
	public static void main(String args[]) {
		
		
		Map<String, String> map=new HashMap<>();
		
		map.put(null, "unknown");
		map.put("Reddy", "Employee1");
		map.put("Pullalacheruvu", "Employee2");
		map.put("Arjun", "Employee3");
		String nullValue=null;
		if(map.containsKey(null)) {
			
			nullValue=map.remove(null);
			
		}
		
		Map<String, String> sortedMap=new TreeMap<String, String>(map);
		
		Map<String, String> addNullValue=new LinkedHashMap<String, String>();
		
		if(nullValue!=null) {
			addNullValue.put(null, nullValue);
		}
		addNullValue.putAll(sortedMap);
		
		Iterator<String> it=addNullValue.keySet().iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			
			System.out.println(key+" and "+addNullValue.get(key));
		}
		
	}

}
