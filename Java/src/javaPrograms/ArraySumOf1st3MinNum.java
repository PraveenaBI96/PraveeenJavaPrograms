package javaPrograms;

public class ArraySumOf1st3MinNum {
	public static void main(String[] args) {
		int []a= {30,50,10,40,20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
