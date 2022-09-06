package practice1;

public class String1 {
public static void main(String[] args) {
	String s="my name is praveen";
	String s1[]=s.split(" ");
	String s2=s.replace(" ", "");
    int count = s2.length()-1;
    
	for (int j = 0; j < s1.length; j++) {
		for (int k = 0; k < s1[j].length(); k++) {
			System.out.print(s2.charAt(count));
			count--;
		}
		System.out.print(" ");
	}
	
	System.out.println();
	String str="";
	for (int i = s2.length()-1; i >=0; i--) {
		str+=s2.charAt(i);
	}
	int count1=0;
	for (int i = 0; i < s1.length; i++) {
		String sub = str.substring(count1,(count1+s1[i].length()));
		count1=count1+s1[i].length();  
			System.out.print(sub+" ");
		}	
}
}
