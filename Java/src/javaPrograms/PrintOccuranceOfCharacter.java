package javaPrograms;

public class PrintOccuranceOfCharacter {
public static void main(String[] args) {
	String s="a2b3c4"; //aabbbcccc
	for(int i=0;i<s.length();)
	{
		int n = s.charAt(i+1)-48;
		while(n>0)
		{
			System.out.print(s.charAt(i));
			n--;
		}
		i=i+2;
	}
}
}
