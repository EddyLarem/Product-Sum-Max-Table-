

import java.util.Scanner;

public class ProductSumMax {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		

//How many rows of values do you want to compute

		
System.out.println("Enter No. of rows: ");

		int noOfRows = scanner.nextInt();


		
// Create arrays for values using noOfRows


		int[] valueOne = new int[noOfRows];
		
int[] valueTwo = new int[noOfRows];
		
int[] valueThree = new int[noOfRows];

		int[] product = new int[noOfRows];
		
int[] sum = new int[noOfRows];
		
int[] max = new int[noOfRows];

		

// Enter values for the three integers

		
for ( int i = 0; i < noOfRows; i++) {

		System.out.println("Enter first value for row " + ( i + 1) + " :");

		valueOne[i] = scanner.nextInt();


		System.out.println("Enter second value for row " + ( i + 1) + " :");
		
valueTwo[i] = scanner.nextInt();

		
System.out.println("Enter third value for row " + ( i + 1) + " :");
		
valueThree[i] = scanner.nextInt();

		

//compute product sum and maximum

		
product[i] = valueOne[i] * valueTwo[i] * valueThree[i];
		
sum[i] = valueOne[i] + valueTwo[i] + valueThree[i];
		
max[i] = getMax(valueOne[i], valueTwo[i], valueThree[i]);

		
}

		

//Display product sum and maximum in a table

		//Create the table head

		//Call the printBorder method
 

		printBorder();

		
//format output using the printf method
 

		System.out.printf("| %-10s | %-10s | %-10s | %n", "Product", "Sum", "Maximum");

		
printBorder();


		//Output computed values for product sum and maximum in table using printf

		
for ( int i = 0; i < noOfRows; i++) {

		System.out.printf("| %-10d | %-10d | %-10d | %n", product[i], sum[i], max[i]);
		
}


		printBorder();

		
scanner.close();

	}

	
public static int getMax(int a, int b, int c) {

		int maxi = a;

		if ( b > maxi) {
		
maxi = b;
		
}
		
if ( c > maxi) {

		maxi = c;

		}

		return maxi;

	}

	

private static void printBorder() {

	
	System.out.println("+------------+------------+------------+");
	
	
}
}