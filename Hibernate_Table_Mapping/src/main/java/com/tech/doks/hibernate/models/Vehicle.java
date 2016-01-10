package com.tech.doks.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="Vehicle_Details")
public class Vehicle {
	
	@Id @GeneratedValue
	@Column(name="Vehicle_Id")
	private int vehicleId;
	@Column(name="Vehicle_Name")
	private String VehicleName;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String VehicleName) {
		this.VehicleName = VehicleName;
	}
}
