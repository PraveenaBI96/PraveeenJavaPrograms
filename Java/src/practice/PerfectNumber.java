package practice;


public class PerfectNumber {
public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
    	int num=i;
    	int tempNum=num/2;
    	int sum=0;
    	while(tempNum>0)
    	{
    	    if(num%tempNum==0)
    	    {
    	    	sum=sum+tempNum;
    	    }
    	    tempNum--;
    	}
    	
    	if(num==sum)
    	{
    		System.out.println(num+" is Perfect Num");
    	}	
	}
}
}
