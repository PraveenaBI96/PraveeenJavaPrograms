package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	
	int[]a=new int[size];
	System.out.println("enter the values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
}
}
