package datatypes;

                                 // Demonstrate lifetime of a variable

public class VarInitDemo {

	public static void main(String[] args) {
		int x;
		 
		for(x = 0; x < 7; x++) {
			int y = -1;          // y is initialized each time block is entered
			System.out.println("y is : " + y);
			y = 100;
			System.out.println("y is now " +y);
			System.out.println(x);
			
		}
	}

}
