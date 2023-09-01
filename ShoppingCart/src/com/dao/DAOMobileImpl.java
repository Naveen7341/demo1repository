package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Mobile;

public class DAOMobileImpl implements DAOMobile {
	static List<Mobile> mobileList = new ArrayList(); // to avoid duplicates
	
	@Override
	public Mobile createMobile(Mobile mobile) {
		mobileList.add(mobile);
		return  mobile;
	}

	@Override
	public List<Mobile> ShowMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mobile readMobile(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mobile updateMobile(String modelNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mobile deleteMobile(String modelNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
