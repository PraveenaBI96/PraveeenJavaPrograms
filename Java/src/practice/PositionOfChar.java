package practice;

import java.util.LinkedHashSet;

public class PositionOfChar {
public static void main(String[] args) {
	String s= "testyantra";
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
		
	}
	for (Character ch : set) {
		for (int i = 0; i <s.length(); i++) {
			if(ch==s.charAt(i))
			{
				System.out.println(ch+"  present in  "+(i+1));
			}
		}
	}
}
}
