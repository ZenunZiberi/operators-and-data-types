package datatypes;

public class BooleanDemo {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);

		//boolean value can control if statement
		if (b) System.out.println("This is executed");
		
		b = false;
		if (b) System.out.println("this is not executed");
		
		//outcome of a relational operator is a boolean value
		System.out.println("10 > 9 " + (10 > 9));
		
	}

}
