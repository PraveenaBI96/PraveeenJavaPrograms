package javaPrograms;

import java.util.LinkedHashSet;

public class SubString{
public static void main(String[] args) {
	String s="welcome";
   
//	for (int i = 0; i < s.length(); i++) {
//		String res="";
//		for (int j = i; j < s.length(); j++) {
//			{
//				res=res+s.charAt(j);
//			System.out.println(res);
//			}
//		}
//	}
	
//	for (int i = 0; i < s.length(); i++) {
//		for (int j = i+1; j <=s.length(); j++) {
//			{
//			System.out.println(s.substring(i,j));
//			}
//		}
//	}
	
//	for (int i = 0; i < s.length(); i++) {
//		for (int j = i+1; j <=s.length(); j++) {
//			{
//			    String res=s.substring(i,j);
//			    if(res.length()==2)
//			    {
//			    	System.out.println(res);
//			    }
//			}
//		}
//	}
	
	LinkedHashSet<String> set= new LinkedHashSet<String>();
	for (int i = 0; i < s.length(); i++) {
		for (int j = i+1; j <=s.length(); j++) {
			{
			    String res=s.substring(i,j);
			    if(res.length()==2)
			    {
			    	set.add(res);
			    }
			}
		}
		
	}
	for (String str : set) {
		System.out.println(str);
	}
	
}
}
