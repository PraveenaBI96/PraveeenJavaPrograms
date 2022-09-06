package practice1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {
public static void main(String[] args) {
	int a[]= {7,-3,0,2,1,-9};
//	int a[]= {10,40,20,50,30};
//	for (int i = 0; i < a.length; i++) {
//		for (int j = i+1; j < a.length; j++) {
//			if(a[i]<a[j])
//			{
//				int temp =a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		System.out.print(a[i]+" ");
//	}
//	System.out.println();
//	int sum=0;
//	for(int i=0;i<3;i++)
//	{
//		sum+=a[i];
//		System.out.println(a[i]);
//	}
//	System.out.println(sum);
	
	TreeSet set=new TreeSet<>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	System.out.println(set);
	Object[] set1 = set.toArray();
	
	for (int i = 0; i < set.size(); i++) {
		System.out.println();
	}
	
	
}
}
