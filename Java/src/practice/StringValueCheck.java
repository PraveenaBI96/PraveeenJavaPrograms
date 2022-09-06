package practice;

public class StringValueCheck {
public static void main(String[] args) {
	String s1="abc";
	String s2=s1;
	s1+="d";
	System.out.println(s1+" "+s2+" "+(s1==s2)+" "+(s1.equals(s2))); //abc  abc  false false
	StringBuffer sb1=new StringBuffer("abc");
	StringBuffer sb2=sb1;
	sb1.append("d");
	System.out.println(sb1+" "+sb2+" "+(sb1==sb2)+" "+(sb1.equals(sb2))); // abcd  abcd  true  true
	
	String a="hello";
	String b=new String(a);
	System.out.println(a.equals(b)); // true
	System.out.println(a==b); //false
	System.out.println('A'+'B'); //131
	System.out.println(10+20+"java"); //30java
	System.out.println("java"+10+20);
	System.out.println('A'+10);
	System.out.println(10+'A'+1);
}
}
