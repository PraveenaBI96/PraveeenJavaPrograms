package Programming;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class A5 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name");
	 String str = s.next();
	LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
for (int i=0;i<str.length();i++)
{
	lhs.add(str.charAt(i));
}
for(Character ch:lhs)
{
	System.out.print(ch);
}
}
}
