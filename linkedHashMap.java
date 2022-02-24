package Exercise2;

import java.util.LinkedHashMap;

public class linkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
	map.put(12, "lokitha");
	map.put(1, "jothi");
	map.put(24, "rizwan");
	map.put(90, "shivraj");
	
	
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	}

}
