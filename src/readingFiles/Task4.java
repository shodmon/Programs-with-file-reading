package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// There's a file that stores data on the world population since 1950, according to the United States Census Bureau (2017).
// This Java program finds out in what year the largest increase in population occurred as compared to the previous year.

public class Task4 {
	public static void main(String[] args) {

		ArrayList<Integer> years = new ArrayList<Integer>();
		ArrayList<Long> populations = new ArrayList<Long>();
		ArrayList<Long> differenceInPop = new ArrayList<Long>();

		try {
			File file = new File("dataset_91069.txt");
			Scanner scanner;
			scanner = new Scanner(file);

			scanner.nextLine(); // skipping headers

			while (scanner.hasNext()) {
				years.add(scanner.nextInt());
				populations.add(scanner.nextLong());
			}

			for (int i = 0; i < populations.size(); i++) {
				differenceInPop.add((populations.get(i + 1) - populations.get(i)));
//				
//				if ((populations.get(i + 2) - populations.get(i + 1)) > (populations.get(i + 1)
//						- populations.get(i))) {
//					highestChangeYear = years.get(i + 2);
//				}
			}

//			if (tempPopGrown >  
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchElementException e1) {
			e1.printStackTrace();
		} catch (IndexOutOfBoundsException e2) {

		} finally {
			long highestNumber = Collections.max(differenceInPop);
			System.out.print("Highest change (" + highestNumber);
			int indexOfHighestChange = differenceInPop.indexOf(highestNumber);
			System.out.println(") was in the year " + (years.get(indexOfHighestChange) + 1));
		}

	}
}
