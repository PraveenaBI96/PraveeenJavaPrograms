package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberofOccuranceofWord {
public static void main(String[] args) {
	String word="raja is rani is friend";
	String[]  name=word.split(" ");
    HashSet<String> a= new HashSet<String>();
	for(String name1:name)
	{
		a.add(name1);
	}
	for(String name2:a)
	{
		int count=0;
		for(int i=0;i<name.length;i++)
		{
			if(name2.equals(name[i]))
					{
				        count++;
					}
			
		}
		System.out.println(name2+" "+ count);
	}
}
}
