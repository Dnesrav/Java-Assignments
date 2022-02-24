package Exercise2;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String>  map = new TreeMap<Integer, String> ();
		map.put(10,"hello");
		map.put(11,"hi");
		map.put(91,"task");
		map.put(81,"learner");
		map.put(17,"java");	
		for(Entry map1 : map.entrySet()) {
			System.out.println(map1.getKey() +" "+ map1.getValue());
		}
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		//head map , tail map, submap
		System.out.println(map.headMap(17, true));
		System.out.println(map.tailMap(17, true));
		System.out.println(map.subMap(17, true, 91, true));
	}

}
