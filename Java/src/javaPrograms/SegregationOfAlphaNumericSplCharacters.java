package javaPrograms;

public class SegregationOfAlphaNumericSplCharacters {
public static void main(String[] args) {
	String s="a@2hf^7(HuR8*";
	String al ="";
	String num ="";
	String spl ="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			al=al+s.charAt(i);
		}else
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			num=num+s.charAt(i);
		}else
		{
			spl=spl+s.charAt(i);
		}
	}
	System.out.println(al);
	System.out.println(num);
	System.out.println(spl);
	}
}
