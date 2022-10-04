package practice1;

import java.util.LinkedHashSet;

public class Recurcion {
	static String s= "hi good morning";
	static String s1 = s.replace(" ", "");
	static int i=0;
	static int k=s1.length();
	static LinkedHashSet<Character> set = new LinkedHashSet<>();
	static String s2;
	static int j;
	static int l;
	static int count=0;
public static void main(String[] args) {
	 addCharacterTOSet();
	 j=0;
	 l=s2.length();
	 
//	 getCharCount();
}
public static void addCharacterTOSet()
{
	if(i<k)
	{
		set.add(s1.charAt(i));
		i++;
		addCharacterTOSet();
	}else
	{
		i=0;
		
		System.out.println(s2);
	}
}
public static void getCharCount()
{
	if(j<l)
	{
		if(i<k)
		{
			if(s2.charAt(j)==s1.charAt(i)) {
				count++;
				i++;
				getCharCount();
			}else
			{
				i++;
				getCharCount();
			}
		}else
		{
			System.out.println(s2.charAt(j)+" "+count);
			j++;
			count=0;
			getCharCount();
		}
		
	}else
	{
		System.out.println(l);
	}
	
}
}
