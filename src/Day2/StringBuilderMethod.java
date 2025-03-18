package Day2;


public class StringBuilderMethod {
	public static void main(String[] args) {
		//string is immutable but string builder is mutable
		// only 4 method...1.append 2.reverse 3.insert 4.replace
		//not thread safe
		
		
		StringBuilder ss= new StringBuilder("Hello");
		ss.append("   d");
		System.out.println(ss);
		
		System.out.println(ss.insert(5, "s"));
		
		System.out.println(ss.replace(1,  5, "❤"));
		
		System.out.println(ss.reverse());
	}

}
