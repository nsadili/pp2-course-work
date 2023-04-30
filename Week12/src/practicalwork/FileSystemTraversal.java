package practicalwork;

import java.io.File;

public class FileSystemTraversal {

	public static void main(String[] args) {
		String path = "";
		traverseFileSystem(path);
	}

	public static void printFileInfo(File file) {

		System.out.println("Name: " + file.getName());

		System.out.println("Path: " + file.getPath());

		System.out.println("Absolute path: " + file.getAbsolutePath());

		System.out.println("Is directory: " + file.isDirectory());

		System.out.println("Size: " + file.length() + " bytes");

		System.out.println("Last modified: " + file.lastModified());

		System.out.println("**********************************************S");
	}

	public static void traverseFileSystem(String path) {
		File file = new File(path);

		if (file.isFile()) {
			printFileInfo(file);
		} else if (file.isDirectory()) {
			printFileInfo(file);
			File[] subFiles = file.listFiles();

			if (subFiles != null) {
				for (File subFile : subFiles) {
					traverseFileSystem(subFile.getPath());
				}
			}
		}
	}
}
