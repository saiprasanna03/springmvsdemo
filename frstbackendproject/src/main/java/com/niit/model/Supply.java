package com.niit.model;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supply 
{
	@Id
	@GeneratedValue
	int supplyId;
	String supplyName;
	String supplyAdderess;
	String supplyDesc;
	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	public String getSupplyName() {
		return supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	public String getSupplyAdderess() {
		return supplyAdderess;
	}
	public void setSupplyAdderess(String supplyAdderess) {
		this.supplyAdderess = supplyAdderess;
	}
	public String getSupplyDesc() {
		return supplyDesc;
	}
	public void setSupplyDesc(String supplyDesc) {
		this.supplyDesc = supplyDesc;
	}
			}
