package practice1;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map {
public static void main(String[] args) {
	String s[]= {"A:20","C:40","D:10","B:30"};
	TreeSet<String> set= new TreeSet<>();
	for (int i = 0; i < s.length; i++) {
		set.add(s[i]);
	}
	System.out.println(set);

	
	
	
	TreeMap<String, String> map= new TreeMap<>();
	for (int i = 0; i < s.length; i++) {
		String[] s1=s[i].split(":");
		for (int j = 0; j < s1.length-1; j++) {
			
			map.put(s1[j], s1[j+1]);
		}
	}
	System.out.println(map);
	
    for (Entry<String, String> entry : map.entrySet()) {
		String key = entry.getKey();
		String val = entry.getValue();
		System.out.print(key+":"+val+", ");
		
	}
}
}
