package Day2;

public class StringBufferMethod {
	public static void main(String[] args) {
		//string is immutable but string buffer is mutable
		// only 4 method...1.append 2.reverse 3.insert 4.replace
		//thread safe
	StringBuffer s= new StringBuffer("Hello");
	System.out.println(s);
	s.append("   d");
	System.out.println(s);
	
	System.out.println(s.insert(5, "s"));
	
	System.out.println(s.replace(0,  5, "❤"));
	
	System.out.println(s.reverse());
	
	}
}
