package com.fce.repository;

import org.springframework.data.repository.CrudRepository;

import com.fce.pojo.QuoteRequest;

public interface VehicleRepository extends CrudRepository<QuoteRequest, String> {

}
