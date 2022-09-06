package practice1;

public class StaticAndNonStaticBlock {
	
	{
		System.out.println("Hai");
	}
	static
	{
	    System.out.println("Hello");
	}
	
    public static void main(String[] args) {

	StaticAndNonStaticBlock sb=new StaticAndNonStaticBlock();	
}
}
