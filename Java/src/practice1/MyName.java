package practice1;

public class MyName {
	public static void main(String[] args)
	{
	String s= "praveena bi";
	String s1=s.replace(" ","");
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
	   if(s1.charAt(i)=='e')
	  {
	     count++;
	  }
	}
	System.out.println("e"+" present "+count+" times");
	
	for(int i=s1.length()-1;i>=0;i--)
	{
	 System.out.print(s1.charAt(i));
	}
	}
}
