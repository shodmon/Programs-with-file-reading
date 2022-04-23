package readingFiles;

import java.util.Scanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;

class Main {
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        int input = scanner.nextInt();
//        System.out.println(reverse
//        		(input));
//        System.out.println(3/4);

		// see Swing
//		JButton button = new JButton("Click me");
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked");
//			}
//		});
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

//	public static int reverse(int input) {
//		int output = 0;
//		int units = 0;
//		int dozens = 0;
//		int hundreds = 0;
//
//		hundreds = input / 100;
//		dozens = (input % 100) / 10;
//		units = input % 10;
//
//		Integer a1 = new Integer(units);
//		Integer a2 = new Integer(dozens);
//		Integer a3 = new Integer(hundreds);
//
//		String reverse = a1.toString() + a2.toString() + a3.toString();
//
//		output = Integer.parseInt(reverse);
//
//		return output;
//	}

}
