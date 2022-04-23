package readingFiles;

import java.util.Scanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;

class Task1 {
	public static void main(String[] args) {

		// Java program that counts the number of even numbers in file.
		// Stops counting either if it gets 0 or the last number is reached.
		int number = 0;

		try {
			File file = new File("dataset_91065.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				int data = scanner.nextInt();
				if (data == 0) {
					System.exit(0);
				} else if (data % 2 == 0) {
					number++;
				}
				System.out.println(data + " " + number);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(0 % 2);

	}
}
