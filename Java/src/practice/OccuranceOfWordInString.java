package practice;

import java.util.LinkedHashSet;

public class OccuranceOfWordInString {
public static void main(String[] args) {
	String s="My Name is my name hello";
	String s1= s.toLowerCase();
	String[] s2=s1.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<>();
	for (int i = 0; i < s2.length; i++) {
		set.add(s2[i]);
	}
	for(String str:set) {
		int count =0;
		for (int j = 0; j <s2.length; j++) {
			if(str.equals(s2[j]))
			{
				count++;
			}
		}
			System.out.println(str+" "+count);
	}
}
}
