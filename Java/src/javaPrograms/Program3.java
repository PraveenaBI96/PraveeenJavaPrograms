package javaPrograms;

public class Program3 {
public static void main(String[] args) {
	String s="javaseleniumjavajavapython";
	String s1="java";
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		for (int j = i; j <= s.length(); j++) {
			String res=s.substring(i,j);
			System.out.println(res);
			if(s1.equals(res))
				count++;
		}
	}
	System.out.println(s1+" "+count);
}
}
