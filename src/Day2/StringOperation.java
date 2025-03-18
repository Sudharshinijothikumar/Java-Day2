package Day2;
import java.util.*;
public class StringOperation {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		/*String og=s1.next();
		int si=s1.nextInt();
		int ei=s1.nextInt();
		String sub=og.substring(si,ei);
		System.out.println(sub);*/
		
		String str="SudharShini";
		String str2="SUDHARSHINI";
		/*System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('S', '❤'));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.charAt(6));*/
		/*String lan="Java,Python,C";
		String[] language=lan.split(",");
		for(String s:language) {
			System.out.println(s);
		}*/
		/*String a="hello  ";
		String b="d";
		System.out.println(a.concat(b));*/
		
		/*String my="    laddoo   ";
		System.out.println(my);
		System.out.println(my.length());
		System.out.println(my.strip());*/
		
		String f1="apple";
		String f2="banana";
		System.out.println(f1.compareTo(f2));
		
		System.out.println(str2.contains("HARSHINI"));
		
		String a="apple";
		String b= new String("apple");
		String c=a.intern();
		System.out.println(a==b);
		System.out.println(b==c);
	}

}
