package com.fce.route;

import java.sql.SQLException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.fce.pojo.QuoteResponse;

@Component("updateVehicleID")
public class DBRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		onException(RuntimeException.class,SQLException.class)
		.maximumRedeliveries(3)
		.maximumRedeliveryDelay(300000)
		.log(LoggingLevel.ERROR,"Exception occurred when connecting to DB in Route updateVehicleID .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
		.setBody(constant("Exception occurred when connecting to DB in Route updateVehicleID .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"));
		//.to("file:{{file.backup.location}}/Error");	
		
		from("jpa://fce-integration-service/src/main/java/com/fce/pojo/QuoteResponse.java?consumer.namedQuery=step1")
		.routeId("updateVehicleID")
		.bean(QuoteResponse.class);
		
		
		
	}

}
