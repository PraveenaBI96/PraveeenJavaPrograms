package javaPrograms;

import java.util.LinkedHashSet;

public class NumberofOccuranceOfCharacter {
	public static void main(String[] args) {
		//String s="raja is rani is friend";
		String s="this is my name";
		String s1=s.replace(" ","");
		
	    LinkedHashSet<Character> set= new LinkedHashSet<>();
      for(int i=0;i<s1.length();i++)
      {
    	  set.add(s1.charAt(i));
      }
      for(Character ch:set)
      { 
    	  int count=0;
    	  for(int j=0;j<s1.length();j++)
    	  {
    		char ch1= s1.charAt(j);
    		  if(ch==ch1)
    		  {
    			  count++;
    		  }
    	  }
      System.out.println(ch+" present "+count);
      }
	}		
}
