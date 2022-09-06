package practice1;

public class StringOccurance {
public static void main(String[] args) {
	String s= "javaseleniumjavapythonjava";
	String s1="java";
	int count =0;
	
	for (int i = 0; i < s.length(); i++) {
		for (int j = i+1; j <= s.length(); j++) {
			String sub = s.substring(i,j);
			if(sub.equals(s1))
			{
				count++;
			}
		}
		
	}
	System.out.println(count);
}
}
