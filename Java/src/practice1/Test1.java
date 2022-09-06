package practice1;

public class Test1 {
Test1(double a, double b)
{
	System.out.println("a "+a+"b "+b);
}
	Test1(int a, byte b)
	{
		System.out.println("a "+a+"b "+b);
	}
	public static void main(String[] args) {
		int a=11;
		int b=15;
		Test1 t=new Test1(a,b);
	}

}
