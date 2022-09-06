package javaPrograms1;

import java.util.HashSet;

public class Program2 {
public static void main(String[] args) {
	String s= "This is sindhu and i love java";
	String[] s2=s.split(" ");
	HashSet<String> set = new HashSet<String>();
	for (int i = 0; i < s2.length; i++) {
		set.add(s2[i]);
	}
	for (String string : set) {
		System.out.print(string);
		System.out.print(" ");
	}
}
}
