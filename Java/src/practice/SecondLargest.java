package practice;

public class SecondLargest {
	public static void main(String[] args)
	{
	int[] a={20,50,10,30,40,80};
	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]<a[j])
	{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	}
	System.out.print(a[1]);
	}
}
