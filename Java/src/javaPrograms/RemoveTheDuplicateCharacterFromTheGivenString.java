package javaPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharacterFromTheGivenString {
public static void main(String[] args) {
	String s= "india";
	//Step 1 Create any Set Collection and Add each character of given string into the collection
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	    for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
	    //step 2 compare each character of set with each character of given string
	    for (Character ch : set) {
	    	int count =0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					//step 3 if char is matched increase the count
					count++;
				}
			}
			//step 4 remove the duplicates
			if(count==1)
			System.out.print(ch);
		}
  }
}
