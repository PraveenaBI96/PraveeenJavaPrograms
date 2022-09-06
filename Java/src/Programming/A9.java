package Programming;

import java.util.Scanner;

public class A9
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	 String str = s.next();
	 int length=str.length();
	 System.out.println(Digits(str,length));
}
	 public static boolean Digits(String str,int n)
	 {
	 for(int i=0;i<n;i++)
	 {
		 if(str.charAt(i)>='0'&& str.charAt(i)<='9')
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
	 }
	 return false;
}
}
