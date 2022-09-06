package javaPrograms;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharacterInTheGivenString {
public static void main(String[] args) {
    String s="india";
    LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
		set1.add(s.charAt(i));
	}
    for (Character ch : set1) {
    System.out.print(ch);
    }
}
}
