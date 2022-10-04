package javaPrograms1;

import java.util.LinkedHashSet;

public class OccuranceOfCharacterWithMaximumOccuredCharacter {
public static void main(String[] args) {
	String s= "hello praveen good morning";
	String s1=s.replace(" ", "");
	LinkedHashSet<Character> set=new LinkedHashSet<>();
	for (int i = 0; i < s1.length(); i++) {
		set.add(s1.charAt(i));
	}
	String s3="";
	String s2="";
	int firstMaxCount=0;
	int secondMaxCount=0;
	
	for (Character ch : set) {
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if(ch==s1.charAt(i))
			{
				count++;
			}
		}
		if(count>firstMaxCount)
		{
			s3=s2;
			s2=ch+" "+count;
			
			firstMaxCount=count;
			secondMaxCount=firstMaxCount;
		}
		System.out.println(ch+" "+count);
		
	}
	System.out.println(s2);
	System.out.println(s3);
	//----------------------------------------
	
	String[] str=new String[set.size()];
	for (Character ch : set) {
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if(ch==s1.charAt(i))
			{
				count++;
			}
		}
		
		
	
	}
}
}
