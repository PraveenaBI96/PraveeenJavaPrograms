package Programming;

public class prime 
{
public static void main(String[] args) 
{
	int num=13;
	boolean prime=true;
	for(int a=2;a<num;a++)
	{
		if(num%a==0)
		{
			prime=false;
		}
	}
	if(prime==true)
	    System.out.println("prime");
	else
		System.out.println("not a prime");
}
}
