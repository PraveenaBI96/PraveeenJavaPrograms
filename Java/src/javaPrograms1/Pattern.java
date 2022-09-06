package javaPrograms1;

public class Pattern {
public static void main(String[] args) {
	int n=8;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if((i%2==0 && j%2==0)&& (i<=j && i+j<=n-1))
			{
				System.out.print("*");
			}else
		      if(i%2!=0 && j%2!=0 && i<=j && i+j<=n-1)
		    {
		    	System.out.print("*");
		    }else
			    System.out.print(" ");
	}
	System.out.println();
	}
}
}