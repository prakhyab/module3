package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TdsMaster {
     
	@Id
	private int id;
	private String deductor_Name;
	private String deductor_Pan;
	private int tds_Deposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductor_Name;
	}
	public void setDeductorName(String deductorName) {
		this.deductor_Name = deductorName;
	}
	public String getDeductorPan() {
		return deductor_Pan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductor_Pan = deductorPan;
	}
	public int getTdsDeposited() {
		return tds_Deposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tds_Deposited = tdsDeposited;
	}
	
	
	
}
