package javaPrograms1;

public class aaabbb_To_ababab {
public static void main(String[] args) {
	String s="abcxyz";
	for (int i =0 ; i <s.length()/2; i++) {
		System.out.print(s.charAt(i)+""+s.charAt(i+s.length()/2));
	}
	System.out.println();
	
	int n=s.length()-1;
	for (int i = 0; i < n; i++) {
		System.out.print(s.charAt(i)+""+s.charAt(n));
		n--;
	}
}
}
