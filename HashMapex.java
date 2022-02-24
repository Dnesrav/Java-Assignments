package Exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//key : value 
//001 - Aishwa
//002 - some learners

//key should be unique
//value a=can be duplicate
//003 - aishwary 


//not thread safe, no inserion order is mainted

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> learnerMap = new HashMap<Integer, String>();
learnerMap.put(12, "lokitha");
learnerMap.put(1, "jothi");
learnerMap.put(16, "shradha");
learnerMap.put(19, "sidhant");
learnerMap.put(12, "aiswary");
//learnerMap.putAll(otherMap);  //add one more map / join another / similr to add all
learnerMap.putIfAbsent(41, "janani");
System.out.println(learnerMap);
learnerMap.putIfAbsent(41, "janani");


HashMap<Integer, String> learnerMap1 = new HashMap<Integer, String>();
learnerMap1.putIfAbsent(11, "rizwan");
learnerMap1.putIfAbsent(21, "dhamotharan");
learnerMap1.putAll(learnerMap);


learnerMap1.remove(11);
learnerMap1.remove(21, "dhamotharan");


learnerMap1.replace(41, "janani", "janani viswa");
learnerMap1.replaceAll((k,V) -> "janani");
for(Entry map : learnerMap1.entrySet()) {
	System.out.println(map.getKey() +" "+ map.getValue());
	
}
	}

}
