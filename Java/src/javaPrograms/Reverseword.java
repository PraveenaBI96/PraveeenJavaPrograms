package javaPrograms;

public class Reverseword {
	public static void main(String[] args) {
		String s="this is my name";
		String[] name=s.split(" ");
		String s1="";
		for(int i=name.length-1;i>=0;i--)
		{
			s1=s1+name[i]+" ";
		}
		System.out.print(s1);
		}
	}	