package practice1;

public class String3 {
public static void main(String[] args) {
	String s="a b c d e f g h";
//	O/P---- h b f d e c g a 
	String s1[]=s.split(" ");
	
	for (int j = 0; j < s1.length/2; j++) {
		if(j%2==0)
		{
			String temp=s1[j];
			s1[j]=s1[s1.length-(j+1)];
			s1[s1.length-(j+1)]=temp;
		}
}
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+" ");
	}
}
}
