package org.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Exe4 {

	public static void main(String[] args) throws IOException {
		File f =new File("D:\\JavaFileOper\\FileOperJava2.txt");
		List<String> r = FileUtils.readLines(f);
		for (int i = r.size()-5; i < r.size(); i++) {
		System.out.println(r.get(i));	
		}

	}

}
