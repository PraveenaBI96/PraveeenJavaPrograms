package practice1;

public class Test6 {
public static void main(String[] args) {
	int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
	int r=a.length;
	int c=a[0].length;
	int sum=0;
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			if(i+j==r-1)
			{
				sum+=a[i][j];
			}
		}
	}
	System.out.println(sum);
}
}
