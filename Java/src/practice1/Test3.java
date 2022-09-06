package practice1;

public class Test3 {
public static void main(String[] args) {
	String s="I!am!a!coder";
	String[]str=s.split("!");
	for (int i = str.length-1; i >=0; i--) {
		if(i==str.length-1)
		{
		   System.out.print(str[i]);
		}else
			System.out.print("!"+str[i]);
	}
}
}
