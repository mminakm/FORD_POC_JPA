package com.fce.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fce.pojo.QuoteRequest;
import com.fce.repository.VehicleRepository;

@Component
public class Database {

	@Autowired
	VehicleRepository vehiclerepository;
	
	public QuoteRequest findVehicle(String id) {
		
		return vehiclerepository.findById(id).get();
    //    return orders.findById(id).get();
    }
	  
}
