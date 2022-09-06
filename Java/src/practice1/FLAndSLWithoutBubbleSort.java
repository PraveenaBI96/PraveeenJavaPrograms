package practice1;

public class FLAndSLWithoutBubbleSort {
public static void main(String[] args) {
	int []a= {15,30,10,40,20,50,5,10,35,80,95};
	
	int FL=a[0];
	int SL=a[1];
	if(FL<SL)
	{
		FL=a[1];
		SL=a[0];
	}
	for (int i = 2; i < a.length; i++) {
		
		if(SL<a[i])
		{
			if(FL<a[i])
			{
				SL=FL;
				FL=a[i];
			}else
			{
				SL=a[i];
			}
				
		}
	}
	System.out.println(FL);
	System.out.println(SL);
	
	
	int FS=a[0];
	int SS=a[1];
	if(FS>SS)
	{
		FS=a[1];
		SS=a[0];
	}
	for (int i = 2; i < a.length; i++) {
		if(SS>a[i])
		{
			if(FS>a[i])
			{
				SS=FS;
				FS=a[i];
			}else
				SS=a[i];
		}
	}
	System.out.println(FS);
	System.out.println(SS);
	
}
}
