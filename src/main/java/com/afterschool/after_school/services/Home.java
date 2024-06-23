package com.afterschool.after_school.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afterschool.after_school.service_impl.HomeImpl;

@Service
public class Home {
	
	@Autowired
	private HomeImpl homeImpl;
	
	public String getHome() {
		return homeImpl.getHome();
	}

}
