package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Exe1 {

	public static void main(String[] args) throws IOException {
		File f =new File("D:\\JavaFileOper\\FileOperJava2.txt");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile );
		FileUtils.write(f, "Print the last 5 lines from the file.\n Print the last 5 lines from the file.\n Print the last 5 lines from the file.\n Print the last 5 lines from the file.\n Print the last 5 lines from the file.\n Print the last 5 lines from the file. \nPrint the last 5 lines from the file. \nPrint the last 5 lines from the file.\nPrint the last 5 lines from the file.\nPrint the last 5 lines from the file.\n Print the last 5 lines from the file.\nPrint the last 5 lines from the file. \nPrint the last 5 lines from the file.");
	}

}
