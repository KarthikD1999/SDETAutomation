package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Redmi k20 pro", 30000);
		map.put("Iphone 13", 63000);
		map.put("samsung s20", 50000);
		map.put("poco", 20000);
		map.put("nokia", 5000);
		map.put("vivo", 25000);
		map.put("poco", 75000);
		System.out.println(map);
		
		for (java.util.Map.Entry<String, Integer> eachentry : map.entrySet()) {
			
	
			//System.out.println(eachentry);
			String key = eachentry.getKey();
			System.out.println(key+"->"+eachentry.getValue());
		}
		System.out.println("***********************************");
		Set<String> keySet = map.keySet();
		for (String eachkey : keySet) {
			System.out.println(eachkey+"->"+map.get(eachkey));
		}
	}

}
