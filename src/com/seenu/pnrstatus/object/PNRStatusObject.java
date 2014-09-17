package com.seenu.pnrstatus.object;

import java.util.ArrayList;

public class PNRStatusObject {

	// JSON fields
	private ArrayList<Passengers> passengers;
	private String trainBoardCode;
	private String trainDest;
	private String trainOrigin;
	private String trainFareClass;
	private String chartStat;
	private String trainEmbarkCode;
	private String trainBoard;
	private String trainEmbark;
	private String trainNo;
	private String trainName;
	private String trainJourney;

	// default constructor
	public PNRStatusObject() {
		super();
		// TODO Auto-generated constructor stub
		passengers = new ArrayList<Passengers>();
	}

	// getters and setters methods
	public ArrayList<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passengers> passengers) {
		this.passengers = passengers;
	}

	public String getTrainBoardCode() {
		return trainBoardCode;
	}

	public void setTrainBoardCode(String trainBoardCode) {
		this.trainBoardCode = trainBoardCode;
	}

	public String getTrainDest() {
		return trainDest;
	}

	public void setTrainDest(String trainDest) {
		this.trainDest = trainDest;
	}

	public String getTrainOrigin() {
		return trainOrigin;
	}

	public void setTrainOrigin(String trainOrigin) {
		this.trainOrigin = trainOrigin;
	}

	public String getTrainFareClass() {
		return trainFareClass;
	}

	public void setTrainFareClass(String trainFareClass) {
		this.trainFareClass = trainFareClass;
	}

	public String getChartStat() {
		return chartStat;
	}

	public void setChartStat(String chartStat) {
		this.chartStat = chartStat;
	}

	public String getTrainEmbarkCode() {
		return trainEmbarkCode;
	}

	public void setTrainEmbarkCode(String trainEmbarkCode) {
		this.trainEmbarkCode = trainEmbarkCode;
	}

	public String getTrainBoard() {
		return trainBoard;
	}

	public void setTrainBoard(String trainBoard) {
		this.trainBoard = trainBoard;
	}

	public String getTrainEmbark() {
		return trainEmbark;
	}

	public void setTrainEmbark(String trainEmbark) {
		this.trainEmbark = trainEmbark;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainJourney() {
		return trainJourney;
	}

	public void setTrainJourney(String trainJourney) {
		this.trainJourney = trainJourney;
	}

}
