package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		//Lists only the folders
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nFOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		//Lists only the files
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES:");
		for (File file : files) {
			System.out.println(file);
		}

		//Creates a subfolder
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("\nDirectory created successfully: " + success);

		sc.close();
	}
}