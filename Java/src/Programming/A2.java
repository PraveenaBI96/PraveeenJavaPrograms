package Programming;

import java.util.Scanner;

public class A2 
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
	float sum = 0;
	for(int i=0;i<a.length;i++)
	{
//		sum=sum+a[i]/size; 
		sum=sum+a[i];
	}
	sum=sum/size;
	System.out.println(sum);
}
}