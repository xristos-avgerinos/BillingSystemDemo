package company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // In order to display the date to the user at this form
		
		 BillingSystem billingSystem = new BillingSystem(); // We create an instance of the BillingSystem Class so as to call all the methods and see the results

		 // We create all Log Entries
	     LogEntry entry1 = new LogEntry("A17", "I", dateFormat.parse("22/05/2017"), 7.5, 22, 0);
	     LogEntry entry2 = new LogEntry("A655", "O", dateFormat.parse("22/05/2017"), 7.2, 17, 5);
	     LogEntry entry3 = new LogEntry("A999", "I", dateFormat.parse("22/05/2017"), 7.3, 20, 8);
	     LogEntry entry4 = new LogEntry("A239", "I", dateFormat.parse("21/05/2017"), 8.4, 19, 10);
	     LogEntry entry5 = new LogEntry("A123", "O", dateFormat.parse("21/05/2017"), 8.2, 21, 5);
	     LogEntry entry6 = new LogEntry("A276", "I", dateFormat.parse("21/05/2017"), 7.4, 19, 0);
	     LogEntry entry7 = new LogEntry("A276", "I", dateFormat.parse("22/05/2017"), 7.8, 19, 0);
	     LogEntry entry8 = new LogEntry("A999", "I", dateFormat.parse("21/05/2017"), 7.5, 20, 8);
	     
	     // We add all the log entries to the billing system class
	     billingSystem.addLogEntry(entry1);
	     billingSystem.addLogEntry(entry2);
	     billingSystem.addLogEntry(entry3);
	     billingSystem.addLogEntry(entry4);
	     billingSystem.addLogEntry(entry5);
	     billingSystem.addLogEntry(entry6);
	     billingSystem.addLogEntry(entry7);
	     billingSystem.addLogEntry(entry8);
	     
	     System.out.println("In-House Total Cost Report");
	     billingSystem.getDailyTotalCostReport("I");
	     
	     System.out.println();
	     
	     System.out.println("Outsource Total Cost Report");
	     billingSystem.getDailyTotalCostReport("O");
	     
	     System.out.println();
	     
	     System.out.println("In-House Ranking Report");
	     billingSystem.getRankingReport("I");
	     
	     System.out.println();
	     
	     System.out.println("Outsource Ranking Report");
	     billingSystem.getRankingReport("O");
	     
	}

}
