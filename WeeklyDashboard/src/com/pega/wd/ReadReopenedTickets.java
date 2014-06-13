package com.pega.wd;

import java.io.File;
import java.util.ArrayList;

public class ReadReopenedTickets extends ReadCSVImpl{

	Object readFile(File file) {
		
		return null;
	}
	public static void main(String[] args) {
		ReadReopenedTickets reader = new ReadReopenedTickets();
		ArrayList list = (ArrayList) reader.readFile(new File(""));
		
		System.out.println("Size of Reopened Tickets report : "+list.size());
	}
}
