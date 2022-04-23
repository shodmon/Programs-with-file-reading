package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	// dataset_91033.txt
	public static void main(String[] args) throws FileNotFoundException {

		int number = 0;
		int count = 0;
		File file = new File("dataset_91033.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			number += scanner.nextInt();
			count++;
			System.out.println(number + " " + count);
		}

		scanner.close();
	}
}