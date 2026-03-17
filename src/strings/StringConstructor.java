package strings;

public class StringConstructor {
	
	static String s = new String ();
	
	static String s1 = new String("Dhanu");
	
	public static void main(String[] args) {
		
		System.out.println(s1);
		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
		
//		char cha[] = new char[] {'a','b','c','d','e','f'};//accept character array as parameter & convert into string object
		String s2 = new String(cha);
		System.out.println(s2);
		

}
}