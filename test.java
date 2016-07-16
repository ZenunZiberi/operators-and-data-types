package datatypes;

public class test {

	public static void main(String[] args) {
		int i, j;
		boolean prime;
		
		for (i=2; i <100; i++)  {
		
			prime =true;
		
		for (j=2; j <=i/j; j++)
			if ((i%j)==0)
				prime= false;
		
		if (prime);
		System.out.println(i);
		}

}
}