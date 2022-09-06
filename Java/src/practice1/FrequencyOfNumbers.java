package practice1;

public class FrequencyOfNumbers {
public static void main(String[] args) {
	int []a= {2,0,3,3,4,4,5};
	//01221
	for (int j = 1; j <= a[a.length-1]; j++) {
		int count =0;
	for (int i = 0; i < a.length; i++) {
			if(j==a[i])
			{
				count++;
			}		
		}
	   System.out.print(count);
	}
}
}
