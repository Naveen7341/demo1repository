package com.dao;

import java.util.List;

import com.model.Mobile;

public interface DAOMobile {

	public abstract Mobile createMobile(Mobile mobile);
	public abstract List<Mobile> ShowMobiles();
	public abstract Mobile readMobile(String model);
	public abstract Mobile updateMobile(String modelNum);
	public abstract Mobile deleteMobile(String modelNum);
	
}
