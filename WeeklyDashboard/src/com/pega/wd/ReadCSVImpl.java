package com.pega.wd;
//changes :: kunal
import java.io.File;
import com.csvreader.CsvReader; //CSV library 
import java.util.ArrayList;

public class ReadCSVImpl extends ReadCSV {

	@Override
	Object readFile(File file) {
		
		try{
		
		CsvReader csv=new CsvReader(file);
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
		return null;
	}
	
	public static void main(String[] args) {
		ReadElapsedTimeDateReport retdr = new ReadElapsedTimeDateReport();
		ArrayList list = (ArrayList)retdr.readFile(new File(""));
		System.out.println("Size of raw report : "+list.size());
	}
}
