package Programming;

import java.util.Scanner;

public class A3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a = s.nextInt();
		System.out.println("Enter the 2nd value");
		int b = s.nextInt();
		
		for(;a<=b;a++)
		{
//		if(a%5==0 && a%2!=0)
			if(a%10==5)
		{
			continue;
		}
		System.out.println(a);
		}
	}

}
