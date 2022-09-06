package practice;

public class PrimeArray {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<a.length;i++)
	{
		int b=2;
		int count=1;
		while(b<a[i])
		{
			if(a[i]%b==0)
			{
				count++;
			}
			b++;
		}
		if(count==1)
		{
			System.out.println(a[i]);
		}
	}
}
}
