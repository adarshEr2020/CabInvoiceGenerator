package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 5.0;
		int time = 15;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(65, fare, 0.0);
	}
	
	@Test
	public void givenLessDistanceAndTimeShouldReturnMinFare() {
		double distance = 0.1;
		int time = 2;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5,fare,0.0);
	}
	@Test
	public void givenMultipleRidesShouldReturnInvoiceSummary() {
		Ride[] rides = {new Ride(2.0,5),new Ride(0.1,1), new Ride(4.1,25)};
		double totalFare = cabInvoiceGenerator.calculateFareForMultipleRides(rides);
		Assert.assertEquals(96,totalFare,0);
	}

}
