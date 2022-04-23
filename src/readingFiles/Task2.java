package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	// Java program that counts numbers that are greater than or equal to 9999.
public class Task2 {
	public static void main(String[] args) throws FileNotFoundException {
		int number = 0;
		int count = 0;
		File file = new File("dataset_91022.txt");
		Scanner scanner = new Scanner(file);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		while (scanner.hasNextLine()) {
			if (scanner.nextInt() >= 9999) {
				count++;
			}
		}
		System.out.println(count);

		scanner.close();
	}
}
