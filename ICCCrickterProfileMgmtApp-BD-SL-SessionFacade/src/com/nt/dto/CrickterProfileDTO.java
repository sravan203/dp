package com.nt.dto;

public class CrickterProfileDTO extends CrickterInputsDTO {
	private String fullName;
	private int id;
	private  String type;
	private  int totalMaches;
	private int totalRuns;
	private  int totalWickets;
	private  int totalCatches;
	private  int totalInnings;
	private  int totalStumpings;
	private  float  battingAvg;
	private float bowlingAvg;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotalMaches() {
		return totalMaches;
	}
	public void setTotalMaches(int totalMaches) {
		this.totalMaches = totalMaches;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getTotalWickets() {
		return totalWickets;
	}
	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}
	public int getTotalCatches() {
		return totalCatches;
	}
	public void setTotalCatches(int totalCatches) {
		this.totalCatches = totalCatches;
	}
	public int getTotalInnings() {
		return totalInnings;
	}
	public void setTotalInnings(int totalInnings) {
		this.totalInnings = totalInnings;
	}
	public int getTotalStumpings() {
		return totalStumpings;
	}
	public void setTotalStumpings(int totalStumpings) {
		this.totalStumpings = totalStumpings;
	}
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
	public float getBowlingAvg() {
		return bowlingAvg;
	}
	public void setBowlingAvg(float bowlingAvg) {
		this.bowlingAvg = bowlingAvg;
	}
}
