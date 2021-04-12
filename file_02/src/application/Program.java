package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		System.out.println("\ngetPath: " + path.getPath());
		System.out.println("\ngetParent: " + path.getParent());
		System.out.println("\ngetName: " + path.getName());

		sc.close();
	}
}