//1.WAP to find the sum of the odd numbers between 7 to 21 using for loop.
//Display the odd numbers and print the sum as an output.

package code_Test;

public class SumOfOddNumbers {
	public static void main(String[] args) {

		int sum = 0;

		System.out.println("The odd Numbers from 7 to 21 are: ");

		
		for (int i = 7; i <= 21; i++) {
			if (i % 2 != 0) {
			System.out.println(i + "\n ");	
				sum += i;
				
			}

		}
		System.out.print("The sum of all odd Numbers from 7 to 21 are: ");
		System.out.println(sum);
	}
}
