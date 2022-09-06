package javaPrograms;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateCharacterFromTheGivenString {
public static void main(String[] args) {
	String s = "india";
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
					//step 3 if char is matchedincrease the count
					count++;
				}
			}
			//step 4 print only the the count of duplicate character
			if(count>1) {
//			System.out.println(ch+" occures "+count+" times");
			System.out.print(ch+""+count);
			}
		}
	}
}
