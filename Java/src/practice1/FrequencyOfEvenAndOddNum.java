package practice1;

public class FrequencyOfEvenAndOddNum {
public static void main(String[] args) {
	int a[][]= {{2,1,3},{4,5,6},{7,8,9},{10,11,13}};
    int countEven=0, r=a.length;
    int countOdd=0, c=a[0].length;
    for (int i = 0; i < r; i++) {
    	for (int j = 0; j < c; j++) {
			if(a[i][j]%2==0)
			{
				countEven++;
			}else
				countOdd++;
		}
	}
    System.out.println("frequency of even Number is:"+countEven);
    System.out.println("frequency of even Number is:"+countOdd);
}
}
