package practice;

public class WithoutUsingLength {
public static void main(String[] args) {
	String s= "admin";
//	char[]c=s.toCharArray();
//	int count=0;
//	for (Character ch:c) {
//		count++;
//	}
	String s1="";
	int count=s.compareTo(s1);
	for (int i = count-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
}
}
