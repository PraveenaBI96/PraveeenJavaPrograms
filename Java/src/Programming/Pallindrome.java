package Programming;

import java.util.Scanner;

public class Pallindrome 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value");
	 int num = s.nextInt();
	 int rev =0;
	 int temp = num;
	 while(num>0)
	 {
		int rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
	 }
	 System.out.println(rev);
	 if(temp==rev)
	 {
		 System.out.println("Pallindrome");

	 }
	 else
		 System.out.println("Not a Pallindrome");
}
}
