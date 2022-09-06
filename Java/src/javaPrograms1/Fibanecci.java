package javaPrograms1;

public class Fibanecci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum=0;
	System.out.println(sum);
	//System.out.println(b);
	int n=1;
	while(n<=9)
	{
		sum=a+b;
		a=b;
		b=sum;
		System.out.println(sum);
		n++;
	}
}
}
