package practice;

public class StringThirdCharacterRepeatedOrNot {
public static void main(String[] args) {
	String s="cbcdcdef";
	boolean repeated =false;
	int count=1;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(2)==s.charAt(i) && i!=2)
		{
			repeated =true;
			count++;
		}
	}
	if(count>1)
	{
		System.out.println(repeated);
		System.out.println(s.charAt(2)+" "+count);
	}
}
}
