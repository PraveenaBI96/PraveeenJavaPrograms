package javaPrograms;

public class program2 {
public static void main(String[] args) {
	String s="india";
	for (int i = 0;i<s.length(); i++) {
		for (int j = 0; j < s.length(); j++) {
			if(i>=j)
			{
				System.out.print(s.charAt(j));
			}
		}
		System.out.println();
		
	}
//	String res ="";
//	for(int i=0;i<s.length();i++)
//	{
//		res=res+s.charAt(i);
//		System.out.println(res);
//	}
}
}
