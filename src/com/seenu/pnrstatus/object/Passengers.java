package com.seenu.pnrstatus.object;

public class Passengers {

	// JSON fields
	private String trainBookingBerth;
	private String trainPassenger;
	private String trainCurrentStatus;

	// getter and setter methods
	public String getTrainBookingBerth() {
		return trainBookingBerth;
	}

	public void setTrainBookingBerth(String trainBookingBerth) {
		this.trainBookingBerth = trainBookingBerth;
	}

	public String getTrainPassenger() {
		return trainPassenger;
	}

	public void setTrainPassenger(String trainPassenger) {
		this.trainPassenger = trainPassenger;
	}

	public String getTrainCurrentStatus() {
		return trainCurrentStatus;
	}

	public void setTrainCurrentStatus(String trainCurrentStatus) {
		this.trainCurrentStatus = trainCurrentStatus;
	}

}
