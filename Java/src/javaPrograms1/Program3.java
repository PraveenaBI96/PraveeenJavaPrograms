package javaPrograms1;

public class Program3 {
public static void main(String[] args) {
	String s="welcome to tyss bangalore"; 
	// O/P erolagnab to tyss emoclew
	String []a= s.split(" ");
	String temp=a[0];
	a[0]=a[a.length-1];
	a[a.length-1]=temp;
	
	for (int i = 0; i < a.length; i++) {
		String str=a[i];
		if(i==0 || i==a.length-1)
		{
			for (int j = str.length()-1; j >=0 ; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}else
		System.out.print(str+" ");
	}
}
}
