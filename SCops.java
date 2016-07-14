package datatypes;

public class SCops {

	public static void main(String[] args) {
		// DEmo short circuit operators
		int n, d;
		
		n = 10;
		d = 20;
		if (d != 0 && (n%d) == 0)
			System.out.println(d + " is a fctor of "+ n);
         d = 0;
		if (d != 0 && (n%d) == 0)
			System.out.println(d + " is a fctor of "+ n);
	}

}
