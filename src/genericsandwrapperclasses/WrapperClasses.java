package genericsandwrapperclasses;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		Integer obj = new Integer(12);
		
		Integer obj2 = Integer.valueOf(12);
		System.out.println(obj);
		System.out.println(obj2);
		
		Integer obj3 =10;//Autoboxing
		
		int age = obj; //unboxing
		
		Boolean myboolean = Boolean.valueOf(false);
		System.out.println(myboolean);
	}

}
