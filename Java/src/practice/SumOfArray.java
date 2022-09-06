package practice;

public class SumOfArray {
	public static void main(String[] args)
	{
	int a[]={4,7,8};
	int b[]={6,4,9,7};
	//1011177
	int count=a.length;
	if(a.length<b.length)
	{
	count=b.length;
	}
	for(int i=0;i<count;i++)
	{
	try
	{
	System.out.print(a[i]+b[i]);
	}catch(ArrayIndexOutOfBoundsException ai)
	{
	try
	{
	System.out.print(a[i]);
	}catch(Exception e)
	{
	System.out.print(b[i]);
	}
	}
	}
	}
}
