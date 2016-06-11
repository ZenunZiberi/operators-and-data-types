package datatypes;

                               // demonstrate block scope.

public class ScopeDemo {

	public static void main(String[] args) { 
		int x;                 //known to all code within main
		
		x = 10;
		 
		if (x == 10)  {        // start new scope
			int y = 20;        // know only to this block
			                   // x and y know here.
			
			System.out.println("x and y :" + x + " " + y);
			x = y *2;
		}
                             	//	y =100; error y not known here
		
		System.out.println("x is " + x); 
		                        // x is stil known here
		
		

	}

}
