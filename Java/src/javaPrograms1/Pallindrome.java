package javaPrograms1;

import java.util.Iterator;

public class Pallindrome {
public static void main(String[] args) {
	int a=12321;
	int temp=a;
	int num =0;
	for (; temp>0;) {
		int rem=temp%10;
		num=num*10+rem;
		temp=temp/10;
	}
	if(a==num)
	{
		System.out.println("pallindrome");
	}
	else
		System.out.println("not a pallindrome");
}
}
