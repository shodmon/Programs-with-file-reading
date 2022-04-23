package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
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
