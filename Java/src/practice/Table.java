package practice;

public class Table {
public static void main(String[] args) {
	int n=1;
	
	for(int i=n;i<=10;i++)
	{
		int sum=0;
		for (int j = 1; j <=10; j++) {
			sum=i*j;
			System.out.println(i+"x"+j+"="+sum);
		}
		System.out.println();
	}
}
}
