/* use the pythagorean theroem to find
  the length of the hypotenuse given the 
  lengths of the two opposing sides */



package datatypes;

public class Hypot {

	public static void main(String[] args) {
		
     double x, y, z;
     
     x = 3;
     y = 4;
     z = Math.sqrt(x*x + y*y);   //sqrt is used to compute length of the hypotenuse
     
     System.out.println("Hypotenuse is " + z);
     
	}
}
