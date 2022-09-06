package javaPrograms;

public class SumOfEachDigitInTheGivenString {
public static void main(String[] args) {
	String s="1av2c3*h";
	int sum = 0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=48&&s.charAt(i)<=57)
		{
			sum =sum+s.charAt(i)-48;
		}
	}
	System.out.println(sum);
}
}
