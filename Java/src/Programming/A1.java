package Programming;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class A1 
{
public static void main(String[] args) 
{
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the size");
//	int size = sc.nextInt();
//	ArrayList a= new ArrayList();
//	System.out.println("Enter the values");
//	for(int i=0 ;i<size ;i++)
//	{
//		a.add(sc.next());
//		a.add(sc.nextInt());
//		a.add(sc.next().charAt(0));
//	}
//	System.out.println("User entered values are");
//	System.out.println(a);
//	LinkedHashSet b = new LinkedHashSet(a);
//	System.out.println("After removing duplicates");
//	System.out.println(b);
	
	int a=1;
	int b=100;
	
	for(int i=a;i<b;i++)
	{
	boolean prime=true;
		for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			prime=false;
		}
	}
		if(prime)
		{
			System.out.println(i);
		}
	}
}
}
