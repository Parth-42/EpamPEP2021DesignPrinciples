package first;
import java.util.Scanner;

import maths.Arithmetic;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		Arithmetic arth = new Arithmetic();
		
		System.out.println("Sum : " + arth.add(n1, n2));
		System.out.println("Difference : " + arth.subtract(n1, n2));
		System.out.println("Product : " + arth.multiply(n1, n2));
		System.out.println("Division : " + arth.divide(n1, n2));

	}

}
