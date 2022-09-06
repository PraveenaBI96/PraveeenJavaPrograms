package practice1;

import java.util.LinkedHashSet;

public class SubString {
public static void main(String[] args) {
	String s= "xyxyxyxy";
	LinkedHashSet<String> set= new LinkedHashSet<>();
	for (int i = 0; i < s.length(); i++) {
	    for (int j = i+1; j < s.length(); j++) {
			//String sub="";
			String sub = s.substring(i,j);
			
			if(sub.length()==2)
			{
			  set.add(sub);
			}
		}
	}
	for (String str : set) {
		System.out.println(str);
	}
	
     System.out.println();

	int start = s.length()/2;
	LinkedHashSet<String> set1= new LinkedHashSet<>();
	for (int i = 0; i < s.length()/2; i++) {
		for (int j = start; j < s.length(); j++) {
			String sum=s.charAt(i)+""+s.charAt(j);
			set1.add(sum);
		}
	}
	for (String str1 : set1) {
		System.out.println(str1);
	}
}
}
