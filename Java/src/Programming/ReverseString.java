package Programming;

public class ReverseString 
{
	public static void main(String[] args) 
	{
      String name="aba";
      String reverse="";
      for(int i=name.length()-1;i>=0;i--)
      {
    	 reverse+=name.charAt(i); 
      }
      System.out.println(reverse);
      if(name.equals(reverse))
      {
    	  System.out.println("Pallindrome");
      }
      else
    	  System.out.println("not");
	}
}
