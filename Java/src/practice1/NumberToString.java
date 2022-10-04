package practice1;

import java.util.Scanner;

public class NumberToString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	try
	{
	int num=sc.nextInt();
	int n1=num,n2=num;
	int b=n1%10,a=n2/10;
	String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
	String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
	String[] tens_multiple = new String[]{"","ten","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
	String[] hundread_multiple = new String[]{"","","","hundread","two hundread","three hundread","four hundread","five hundread", "six hundread","seven hundread","eight hundread","nine hundread"};
 
	if(num>=0 && num<=9)
	{
		System.out.println(single_digits[num]);
	}
	else if(a==1)
	{
		System.out.println(two_digits[b+1]);
	}
	else if(b==0)
		System.out.println(tens_multiple[a]);
	else if(a>9)
	{
		int c=num%10;
		num=a;
//		n1=num;
//		n2=num;
		b=num%10;
		a=num/10;
		if(a==1)
			System.out.println(hundread_multiple[a+2]+" "+two_digits[c+1]);
		else if(b==0)
			System.out.println(hundread_multiple[a+2]+" "+tens_multiple[a]);
		else
		System.out.println(hundread_multiple[a+2]+" "+tens_multiple[b]+" "+single_digits[c]);
	}
	else
		System.out.println(tens_multiple[a]+" "+single_digits[b]);
	}catch(Exception e)
	{
		System.out.println("Please enter less than 4 digit number");
	}
}
}
