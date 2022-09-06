package Programming;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class A6 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name");
	String str = s.next();
	char[]ch =str.toCharArray();
	 for(char c:ch)
	 {
		 if(str.indexOf(c)==str.lastIndexOf(c))
		 {
			 System.out.println(c);
			 break;
		 }
	 }
	 
}
}
