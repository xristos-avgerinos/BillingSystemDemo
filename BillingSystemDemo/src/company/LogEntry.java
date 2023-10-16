package company;

import java.util.Date;

public class LogEntry {
	
	//The LogEntry class with all the necessary fields 
	private String ID;
	private String type;
	private Date date;
	private double hours;
	private double hourlyRate;
	private double fixedCost;
	
	// Constructor that initializes all the required fields
	public LogEntry(String ID, String type, Date date, double hours, double hourlyRate, double fixedCost) {
        this.ID = ID;
        this.type = type;
        this.date = date;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.fixedCost = fixedCost;
	}

	//Getters and Setters for all the private properties
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}

	
	 
}
