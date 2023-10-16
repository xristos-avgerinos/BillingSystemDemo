package company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class BillingSystem {
	
	// We create a list that will keep all the current log entries
	List<LogEntry> logEntries = new ArrayList<LogEntry>();
	
	// This method adds a log entry to the list
	public void addLogEntry(LogEntry logEntry) {
		logEntries.add(logEntry);
	}
	
	// This method displays the report for the company total cost per day and for a specific type(I/O)
	public void getDailyTotalCostReport(String type) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //In order to display the date to the user at this form
		
		List<Date> allDates = new ArrayList<>(); // This list will contain all the distinct dates of the log entry
	
		for (LogEntry logEntry : logEntries) {
			
			if (logEntry.getType().equals(type) && !(allDates.contains( logEntry.getDate()) ) ) {
				allDates.add(logEntry.getDate());
			}
		}
		
		// We iterate through each separate date and then to all log entries so as to calculate the  total cost for each date
		// and store it into the "dateTotalCost" variable by adding all entry costs and finally display the result to the user
		for (Date date : allDates) {
			
			double dateTotalCost = 0.0;
			
			for (LogEntry logEntry : logEntries) {
				
				if (logEntry.getType().equals(type) && logEntry.getDate().equals(date)) {
					 double entryCost = (logEntry.getHours() * logEntry.getHourlyRate()) + logEntry.getFixedCost();
					 dateTotalCost += entryCost;
				}
				
			}
			
		    System.out.println(dateFormat.format(date) + ": " + dateTotalCost + "€");
			
		}
		
	}
	
	// This method displays the ranking report for the company for a specific type(I/O)
    public void getRankingReport(String type) {
		
		List<String> allEmployeesId = new ArrayList<>();  // This list will contain all the distinct dates of the log entry
		List<Double> allEmployeesSum = new ArrayList<>(); // This list will contain all the employees' sum
	
		for (LogEntry logEntry : logEntries) {
			
			if (logEntry.getType().equals(type) && !(allEmployeesId.contains(logEntry.getID()) ) ) {
				allEmployeesId.add(logEntry.getID());
			}
		}
		
		// We iterate through each separate employee id and then to all log entries so as to calculate the  sum for each employee
	    // and store it into the "employeeSum" variable by adding all entry costs of the employee and finally add the result to the "allEmployeesSum" List
		for (String employeeId : allEmployeesId) {
			
			double employeeSum = 0.0;
			
			for (LogEntry logEntry : logEntries) {
				
				if (logEntry.getType().equals(type) && logEntry.getID().equals(employeeId)) {
					 double entryCost = (logEntry.getHours() * logEntry.getHourlyRate()) + logEntry.getFixedCost();
					 employeeSum += entryCost;
				}
				
			}
			
			allEmployeesSum.add(employeeSum);
		}
		
		
        List<Double> allEmployeesSumSorted = new ArrayList<>(allEmployeesSum); // Clone of the original "allEmployeesSum" List so as to know the index of each ID in "allEmployeesId" List 
		Collections.sort(allEmployeesSumSorted, Collections.reverseOrder()); // We sort the list with all employees' sum by descending order
		
		// We display the results to the user
		System.out.println("Employee Id     Sum");
		for (Double sum : allEmployeesSumSorted) {
			int index = allEmployeesSum.indexOf(sum);
			System.out.println("    " + allEmployeesId.get(index) + "       " + sum + "€");
		}
		
	}

}
