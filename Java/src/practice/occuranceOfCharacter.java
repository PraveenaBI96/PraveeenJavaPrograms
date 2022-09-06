package practice;

public class occuranceOfCharacter {
public static void main(String[] args) {
	/*
	String s="a2b3c4";
	for (int i = 0; i < s.length(); i++) {
		int n= s.charAt(i+1)-48;
		while(n>0)
		{
			System.out.print(s.charAt(i));
			n--;
		}
		i++;
	}
	*/
	
	String s="aabbbccddc";
	for(int i=0;i<s.length();i++)
	{
		int count=1;
		for (int j = i+1; j < s.length(); j++) {
			
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				i++;
			}
			else
			{
				break;
			}
		}
		System.out.print(s.charAt(i)+""+count);
	}
	
	
}
}
