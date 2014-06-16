package com.pega.wd;

import java.io.File;
import java.util.ArrayList;

public class ReadElapsedTimeDateReport extends ReadCSVImpl{

	String ticketNo;
	String account;
	String currentStatus;
	String submittedDate;
	String closureDate;
	String overallPending;
	String timePendingAssignment;
	String timePendingCustomerResponse;
	String timePendingGCSFulfillment;
	String pendingCustomerApproval;
	String pendingCloudApproval;
	String source;
	String techCategory;
	String techSubCategory;
	String action;
	
	Object readFile(File file) {
		
		return null;
	}
	public static void main(String[] args) {
		ReadElapsedTimeDateReport retdr = new ReadElapsedTimeDateReport();
		ArrayList list = (ArrayList)retdr.readFile(new File(""));
		
		System.out.println("Size of Elapsed Time Date report : "+list.size());
	}
}
