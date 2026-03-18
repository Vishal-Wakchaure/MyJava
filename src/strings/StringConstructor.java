package strings;

public class StringConstructor {
	
	static String s = new String ();
	
	static String s1 = new String("Dhanu");
	
	public static void main(String[] args) {
		
//		System.out.println(s1);
		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
		
//		char cha[] = new char[] {'a','b','c','d','e','f'};//accept character array as parameter & convert into string object
//		String s2 = new String(cha);
//		System.out.println(s2);		
		
//		char ch[] = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l'};
//		String s = new String (ch,2,6);
//		System.out.println(s);
		
//		byte b[] = new byte[] {97,98,99,100};//convert byte array or ascii value to string
//		String s = new String(b);
//		System.out.println(s);
		
//		String s ="abcde";
//		int len = s.length();
//		for(int i=0;i<len;i++)
//		{
//			char ch = s.charAt(i);
//			System.out.printf("s[%d] --->%c\n",i,ch);
//		}
		
//		Calculate length of string without using length() function 
//		String s = "abcde";
//		int count =0;
//		try {
//			while(true)
//			{
//				s.charAt(count);
//				++count;
//			}
//		}
//		catch(Exception ex)
//		{
//			System.out.println("Length of string is "+count);
//		}
		
//		String toUpperCase()-This method can convert lower case string to upper case.
		
		String str = "good";
		String s1 = str.toUpperCase();
		System.out.println(s1);
		
}
}