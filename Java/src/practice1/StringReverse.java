package practice1;

public class StringReverse {
public static void main(String[] args) {
	String s="well come to bangalore";
	String s1[]=s.split(" ");
	for (int i=s1.length/2-1;i>=0 ; i--) {
		for (int j =s1[i].length()-1;j>=0 ; j--) {
			System.out.print(s1[i].charAt(j));
		}
		System.out.print(" ");
	}
	System.out.println();
	for (int i=s1.length-1;i>=s1.length/2 ; i--) {
		for (int j =s1[i].length()-1;j>=0 ; j--) {
			System.out.print(s1[i].charAt(j));
		}
		System.out.print(" ");
	}
}
}
