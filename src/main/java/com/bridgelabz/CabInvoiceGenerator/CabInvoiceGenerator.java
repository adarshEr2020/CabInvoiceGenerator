package com.bridgelabz.CabInvoiceGenerator;

public class CabInvoiceGenerator {
	public static final double MAXIMUM_FARE = 5;
	public static final double PER_KILOMETER_COST = 10;
	public static final int PER_MINUTE_COST = 1;
	
	public double calculateFare(double distance, int time) {
		double totalFare = distance * PER_KILOMETER_COST + time * PER_MINUTE_COST;
		return Math.max(MAXIMUM_FARE, totalFare);
	}

}
