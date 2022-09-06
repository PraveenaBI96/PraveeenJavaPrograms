package practice1;

import java.util.Iterator;

public class MissingElementInArray {
public static void main(String[] args) {
	int a[]= {1,2,4,6,7,9};
	int n=a.length;
	int count=0;
	// 1,2,3,4,5
	for (int i = a[0]; i < a[n-1]; i++) {
		//1,2,3,4,5,6,7,8,9       9
		//1==1,2==2,3==4,4==4,6==5,6==6,7==7,9==8,9==9
		if(a[count]==i)
		{
			count++;
		}else
			System.out.println(i+" ");
		                      //3 5 8
	}
}
}
