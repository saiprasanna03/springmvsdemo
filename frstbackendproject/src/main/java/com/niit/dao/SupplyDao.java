package com.niit.dao;

import java.util.List;

import com.niit.model.Supply;

public interface SupplyDao
{
	public boolean addSupply(Supply supply);
	   public boolean deleteSupply(Supply supply);
	   public boolean updateSupply(Supply supply);
	   public List<Supply> listsuppliers();
	   public Supply getSupply(int supplyID);



}
