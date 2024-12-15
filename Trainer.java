package com.mcq;

public class Trainer {
	
    private int trainerid;
    private String trainername;
    private double basicsalary;
    private double haper;
    private double daper;
    private int batchcount;
    private double perkperbanch;
    
    
	public Trainer(int trainerid, String trainername, double basicsalary, double haper, double daper, int batchcount,
			double perkperbanch) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.basicsalary = basicsalary;
		this.haper = haper;
		this.daper = daper;
		this.batchcount = batchcount;
		this.perkperbanch = perkperbanch;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public double getHaper() {
		return haper;
	}
	public void setHaper(double haper) {
		this.haper = haper;
	}
	public double getDaper() {
		return daper;
	}
	public void setDaper(double daper) {
		this.daper = daper;
	}
	public int getBatchcount() {
		return batchcount;
	}
	public void setBatchcount(int batchcount) {
		this.batchcount = batchcount;
	}
	public double getPerkperbanch() {
		return perkperbanch;
	}
	public void setPerkperbanch(double perkperbanch) {
		this.perkperbanch = perkperbanch;
	}
    
	
    public double calculategrosssalary()
    {
    	return basicsalary+haper+daper+(batchcount*perkperbanch);
    }
    
	
}
