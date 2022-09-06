package practice1;

public class aabbbcddde {
public static void main(String[] args) {
	String s= "aabbbcdde";
	for(int i=0;i<s.length();i++)
	{
		int count =1;
		for (int j = i+1; j < s.length(); j++) {
			
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				i++;
			}
			else
				break;
		}
		System.out.print(s.charAt(i)+""+count);
	}
	System.out.println();
	
	String s2="a2b3c1d2e1";
	for(int i=0;i<s2.length();i++)
	{
		int count=s2.charAt(i+1)-48;
		
		while(count>0)
		{
			System.out.print(s2.charAt(i));
			count--;
		}
		i++;
	}
}
}
