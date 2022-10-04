package practice1;

import java.util.LinkedList;

public class Test5 {
public static void main(String[] args) {
	int[]a= {1,2,'A',8,'G',3,'X','M',9};
	LinkedList<Integer> list=new LinkedList<Integer>();
	for (int i = a.length-1; i>=0; i--) {
		if(a[i]<=9)
		{
//		  list.add(a[i]);
		}		
	}
	for (int i = 0; i < a.length; i++) {
		if(a[i]<=9)
		{
			for (Integer it : list) {
		    System.out.print(it);
		    list.remove(it);
		    break;	
		    }
	    }else
    	{
	    	char c= (char)a[i];
	        System.out.print(c);
	    }
	}
}
}
