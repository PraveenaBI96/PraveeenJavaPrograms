package javaPrograms;

public class ReverseString1 {
public static void main(String[] args) {
	String name ="I!am!a!coder";
	String[] name1=name.split("!");
	String name2="";
	for(int i=name1.length-1;i>=0;i--)
	{
		name2=name2+name1[i]+"!";
	}
	System.out.println(name2);
}
}
