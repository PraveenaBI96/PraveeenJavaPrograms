package practice;

import java.util.LinkedHashSet;

public class String1 {
public static void main(String[] args) {
	String a="my name is raj";
	String b="my name is king";
    String s= a+" "+b;
    String[]s1=s.split(" ");
    
    for (int i = 0; i < s1.length; i++) {
    	int count=0;
		for (int j = 0; j < s1.length; j++) {
			
			if(s1[i].equals(s1[j]))
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(s1[i]);
		}
	}
    System.out.println();
    
    //----------------------------------------
    LinkedHashSet<String> set = new LinkedHashSet<>();
    for (int i = 0; i < s1.length; i++) {
		set.add(s1[i]);
	}
    for (String word : set) {
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			if(word.equals(s1[i]))
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(word);
		}
	}
    
}
}
