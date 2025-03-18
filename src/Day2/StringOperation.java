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
		String str1="sudhar";
		String str2="SUDHARSHINI";
		/*System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('S', '❤'));*/
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
