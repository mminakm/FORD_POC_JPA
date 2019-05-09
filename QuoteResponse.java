package com.fce.pojo;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
@NamedQuery(name = "step1", query = "select * from vehicle vehicle where vehicle.vehicleId = :vehicleID")
public class QuoteResponse {
	
	private String usageType;
	private String vehicleType;
	private String vehicleId;
	private String vehicleIdType;
	private String vehicleYear;
	private String uscCodes;
	private String newUsed;
	private String milesOrKMPerAnnum;
	
	public String getUsageType() {
		return usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleIdType() {
		return vehicleIdType;
	}
	public void setVehicleIdType(String vehicleIdType) {
		this.vehicleIdType = vehicleIdType;
	}
	public String getVehicleYear() {
		return vehicleYear;
	}
	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public String getUscCodes() {
		return uscCodes;
	}
	public void setUscCodes(String uscCodes) {
		this.uscCodes = uscCodes;
	}
	public String getNewUsed() {
		return newUsed;
	}
	public void setNewUsed(String newUsed) {
		this.newUsed = newUsed;
	}
	public String getMilesOrKMPerAnnum() {
		return milesOrKMPerAnnum;
	}
	
	public void setMilesOrKMPerAnnum(String milesOrKMPerAnnum) {
		this.milesOrKMPerAnnum = milesOrKMPerAnnum;
	}
	
	
}
