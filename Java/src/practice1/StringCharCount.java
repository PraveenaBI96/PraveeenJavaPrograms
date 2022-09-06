package practice1;

import java.util.LinkedHashSet;

public class StringCharCount {
public static void main(String[] args) {
	String s= "my name is praveena";
	String s1= s.replace(" ", "");
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for (int i = 0; i < s1.length(); i++) {
		set.add(s1.charAt(i));
	}
	for (Character ch : set) {
		int count =0;
		for (int i = 0;i <s1.length(); i++) {
			if(ch==s1.charAt(i))
			{
			 count++;
			}
		}
		System.out.println(ch+" "+count);
		
	}

}
}
