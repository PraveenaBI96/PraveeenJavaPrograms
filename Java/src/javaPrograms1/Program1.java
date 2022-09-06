package javaPrograms1;

import java.util.ArrayList;

public class Program1 {public Program1() {
}public static void main(String[] args) {
//	int[] a= {1,2,3};
//	int[] b= {2,3,4};
//	for (int i = 0; i < a.length; i++) {
//				System.out.println(a[i]+b[i]);
//	}
	
//	int[] a= {1,2,3,4,5};
//	int[] b= {2,3,4};
	
//	for (int i = 0; i < a.length; i++) {
//			if(i<b.length)
//			{
//				System.out.println(a[i]+b[i]);
//			}else
//			{
//			  System.out.println(a[i]);
//			}
//	}
	
//	int[] a= {1,2,3};
//	int[] b= {2,3,4,5,6};
//	int count = a.length;
//	if(a.length<b.length)
//	{
//		count=b.length;
//	}
//	for (int i = 0; i < count; i++) {
//		try
//		{
//          System.out.println(a[i]+b[i]);	
//		}catch(ArrayIndexOutOfBoundsException ar)
//		{
//			try
//			{
//			    System.out.println(a[i]);
//			}catch(Exception e)
//			{
//				System.out.println(b[i]);
//			}
//		}
//	}
	
	int[] a= {1,2,3};
	int[] b= {2,3,4,5,6};
	int count = a.length;
	if(a.length<b.length)
	{
		count=b.length;
	}
	ArrayList<Integer> ar= new ArrayList<>();
	for (int i = 0; i < count; i++) {
		try
		{
          ar.add(a[i]+b[i]);	
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			try
			{
			    ar.add(a[i]);
			}catch(Exception e)
			{
				ar.add(b[i]);
			}
		}
	}
	System.out.println(ar);
}
}
