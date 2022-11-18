package org.com;

import java.io.File;

public class Exe10 {

	public static void main(String[] args) {
		File f =new File("D:\\Naveen Study Material PDF");
		String[] list = f.list();
		for (String a : list) {
			System.out.println(a);
		}

	}

}
