package javaPrograms1;

public class Number {
public static void main(String[] args) {
	String n= "123";
	for (int i = 0; i < n.length(); i++) {
		int num = n.charAt(i)-48;
		int num1=num;
		
		while(num1>0)
		{
			int num2=num;
			while(num2>0)
			{
			   System.out.print(num);
			   num2--;
			}
			System.out.print(" ");
			num1--;
		}
		System.out.println();
	}
}
}
