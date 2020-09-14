package exercise;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnum = new Random();
		int counter;
		int[] numbers = new int[500]; // you want 500 numbers ; so size should reflect that.
		numbers[0] = rnum.nextInt(1000); // Init First number
		int largest = numbers[0]; // Set it as largest
		int smallest = numbers[0]; // Set it as smallest
		for (counter = 1; counter < 500; counter++) {
			numbers[counter] = rnum.nextInt(1000); // Store numbers;
			largest = Math.max(largest, numbers[counter]); // Compare with previous largest
			smallest = Math.min(smallest, numbers[counter]); // Compare with previous smallest
			System.out.println(rnum.nextInt(500));

		}

		System.out.println("Nth smallest number:" + smallest);

	}

}
