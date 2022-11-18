package org.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Exe7 {

	public static void main(String[] args) throws IOException {
		File f =new File("D:\\Java");
		System.out.println(f.exists());
System.out.println(f.mkdir());
	}

}
