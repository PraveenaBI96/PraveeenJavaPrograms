package practice;


import java.util.HashMap;
import java.util.Map.Entry;

public class a2b3c1a2b1 {
public static void main(String[] args) {
	String s="aabbbcaab";
//	for (int i = 0; i < s.length(); i++) {
//		int count =1;
//		for (int j = i+1; j < s.length(); j++) {
//			if(s.charAt(i)==s.charAt(j))
//			{
//				count++;
//				i++;
//			}
//			else
//				break;
//		}
//		System.out.print(s.charAt(i)+""+count);
//	}
	
	HashMap<Integer, String> map= new HashMap<Integer, String>();
	map.put(1, "Praveen");
	map.put(2, "B");
	map.put(3, "I");
	
	System.out.println(map.get(1));
//for(Entry<Object,String> entry : map.entrySet())
//{
//	System.out.println(entry.getValue());
//}
}
}
