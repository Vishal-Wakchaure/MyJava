package strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
//		We can declare string using two methods
//		1. Using initialization of string 
		
		String s= "vishal";
		System.out.println(s);
		
//		By using new Keyword
		String s1 = new String("Sushil");
		System.out.println(s1);
		
//		When we create string object by initialization then string object create in SCP & if we have two string with same value then only one object in 
//		memory & use its reference in two diff. variables.
		String a = "sushil";
		String b = "sushil";
		
		
		System.out.println("Hashcode of s1 " + System.identityHashCode(a));
		System.out.println("Hashcode of s2 " + System.identityHashCode(b));
		
		String c = new String("vishal");
		String d = new String("vishal");
		System.out.println("Hashcode of s1" +System.identityHashCode(d));
		
		System.out.println("Dhanu");
		
	}

}
