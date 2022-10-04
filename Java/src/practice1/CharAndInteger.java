package practice1;

public class CharAndInteger {
public static void main(String[] args) {
	String s= "hello12world";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)-48>=9)
		{
			System.out.print(s.charAt(i));
		}
	}
	
}
}
