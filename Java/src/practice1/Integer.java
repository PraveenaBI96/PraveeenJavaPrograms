package practice1;

public class Integer {
public static void main(String[] args) {
	
	for (int i = 1; i <= 5; i++) {
		if(i%2==0)
		{
			System.out.println(i);
		}else
		{
			int a = 0;
			while(a<i)
			{
				System.out.print(i);
				a++;
			}
			System.out.println();
		}
	}
}
}
