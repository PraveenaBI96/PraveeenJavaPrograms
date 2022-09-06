package practice1;

public class String2 {
public static void main(String[] args) {
	
	String s[]={"apple","appu","application","apply","approve"};
	int size=s[0].length();
	for (int i = 1; i < s.length; i++) {
		if(size > s[i].length())
		{
			size=s[i].length();
		}
	}
	for (int j = 0; j < size; j++) {
		boolean check=true; 
	for (int i = 0; i < s.length; i++) {
			if(s[0].charAt(j)!=s[i].charAt(j))
			{
			   check=false;
			}
		}
		if(check)
		{
			System.out.print(s[0].charAt(j));
		}
	}
}
}
