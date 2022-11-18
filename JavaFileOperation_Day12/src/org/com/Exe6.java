package org.com;

import java.io.File;
import java.io.IOException;


public class Exe6 {

	public static void main(String[] args) throws IOException {
		File f =new File("D:\\Java");
		System.out.println(f.exists());
System.out.println(f.mkdir());

	}

}
