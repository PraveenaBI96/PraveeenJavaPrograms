package practice;

import java.util.TreeSet;

public class MovieName {
public static void main(String[] args) {
	String s1= "movie name is kgf 3:00 starts";
	String s2= "movie name is kgf 2:00 starts";
	String s3= "movie name is kgf 1:00 starts";
	String[]s= {s1,s2,s3};
	TreeSet<String> set = new TreeSet<>();
	for (int i = 0; i < s.length; i++) {
		String str[]=s[i].split(" ");
		
		set.add(str[str.length-2]);
	}
	System.out.println(set);
	for (String duration : set) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].contains(duration))
			{
				System.out.println(s[i]);
			}
		}
		break;
	}
}
}
