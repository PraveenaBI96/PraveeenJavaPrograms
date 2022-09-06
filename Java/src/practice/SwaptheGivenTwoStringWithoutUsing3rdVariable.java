package practice;

public class SwaptheGivenTwoStringWithoutUsing3rdVariable {
public static void main(String[] args) {
	
	String s1= "good";
	String s2= "morning";
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
	
	/*
	String s1="abc";
	String s2="xyz";
	//s1=s1+s2;
	StringBuffer s3 = new StringBuffer(s1);
	System.out.println(s3+" "+s2+" "+s1);
	System.out.println(s1==s2);  // false
	System.out.println(s1.equals(s3)); //false
	
	System.out.println(s1.equals(s2)); //false
	*/
}
}
