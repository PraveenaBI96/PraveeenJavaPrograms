package javaPrograms1;

public class HappyNumber {
public static void main(String[] args) {	
    int n= 7;
 
    while(n>9)
    {
    	   int sum=0;
    	while(n>0)
    	{
	       int rem=n%10;
	       sum=sum+(rem*rem);
	       n=n/10;
    	}
    	n=sum;
    }
    System.out.println(n);
    if(n==1|| n==7)
    {
    	System.out.println("Happy Num");
    }else
    	System.out.println("not");
}
}
