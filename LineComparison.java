import java.util.*;
import java.util.Scanner;

public class LineComparison {
	
	public static void main(String args[]) {
		System.out.println("Welcom to Line Comparison Computaion Program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the points: ");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		System.out.println("Line Points are: " + x1 + x2 + y1 + y2);
		scan.close();
		System.out.println("Length of the line is: " + Math.sqrt(x2-x1) + Math.sqrt(y2-y1));
		
	}

	
}
