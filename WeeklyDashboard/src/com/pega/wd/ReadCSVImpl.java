package com.pega.wd;

import java.io.File;
import java.util.ArrayList;

public class ReadCSVImpl extends ReadCSV {

	@Override
	Object readFile(File file) {
		return null;
	}
	
	public static void main(String[] args) {
		ReadElapsedTimeDateReport retdr = new ReadElapsedTimeDateReport();
		ArrayList list = (ArrayList)retdr.readFile(new File(""));
		System.out.println("Size of raw report : "+list.size());
	}
}
