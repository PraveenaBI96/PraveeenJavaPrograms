package practice;

public class aabbbcaa {
	public static void main(String[] args)
	{
	String s= "a2b3c1a2";
	for(int i=0;i<s.length();i++)
	{
	int count=s.charAt(i+1)-48;
	while(count>0)
	{
	System.out.print(s.charAt(i));
	count--;
	}
	i++;
	}
	}
}
