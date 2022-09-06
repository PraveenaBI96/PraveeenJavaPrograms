package Programming;

import java.util.Scanner;

public class A4 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = s.nextInt();
	int a[] =new int[size];
	System.out.println("Enter the values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the key");
	int key = s.nextInt();
	int count = 0;
	for(int i=0;i<a.length;i++)
	{
	  if (key==a[i])
	  {
	  count++;
	  }  
	}
	if(count==0)
	{
		System.out.println("Not Found");
	}else
		System.out.println("Found :"+count);
}
}
