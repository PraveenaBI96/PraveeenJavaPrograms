package Programming;

import java.util.Scanner;

public class A12
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name");
	String name = s.next();
	for(int i =0 ; i<name.length();i++)
	{
		int count =0;
		for(int j=i ;j<name.length();j++)
		{
			if(name.charAt(i)==name.charAt(j))
			{
				count++;
			}
		}
		if(count ==1)
			System.out.print(name.charAt(i));
//		if(count > 1)
//		System.out.println(name.charAt(i)+"-is occured "+count+" times");
	}
}

}
