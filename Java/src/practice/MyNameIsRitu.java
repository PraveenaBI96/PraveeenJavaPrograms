package practice;

public class MyNameIsRitu {
public static void main(String[] args) {
	String s= "my name is praveen";
	String[]s1=s.split(" ");
	//My  Name  Is  Praveen
	for (int i = 0; i < s1.length; i++) {
		for (int j = 0;j<s1[i].length(); j++) {
			if(j==0)
			{
			String s2 = s1[i].toUpperCase();
				System.out.print(s2.charAt(j));
			}else
			{
			    System.out.print(s1[i].charAt(j));
			}
		}
      System.out.print("  ");
	}
}
}
