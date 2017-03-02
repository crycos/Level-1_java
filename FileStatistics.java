/* Exercise 12.13
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument, as shown in Figure 12.13.
 * 
 * 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileStatistics {
	public static void main(String[] args) {
		// Start number of characters, words, and lines
		int characters = 0;
		int words = 0;
		int lines = 0;
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage: java FileStatistics file name");
			System.exit(1);
		}
		// Check if source file exists
		File inputFile = new File(args[0]);
		if (!inputFile.exists()) {
			System.out.println("Target file " + args[0] + " does not exists");
			System.exit(2);
		}
	
		try (
				Scanner input = new Scanner(inputFile);
				) {
			String inputLine;
			while (input.hasNextLine()) {
				inputLine = input.nextLine();
				characters += inputLine.length();
				lines++;
				words += inputLine.split("\\w+").length;
				
			}
		}
		
		 catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		// Print result
		System.out.println("File " + inputFile.getName() + " has " );
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
}
}

