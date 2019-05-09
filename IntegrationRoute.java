package com.fce.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fce.pojo.QuoteRequest;
import com.fce.processor.QuoteProcessor;
import com.fce.util.AppConstants;

@Component
public class IntegrationRoute extends RouteBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(IntegrationRoute.class);
    
	@Override
	public void configure() throws Exception {
		// Receiving - Channel
		from("file:C:\\Users\\MMISHRA8\\Input_TestFiles")
		
		// Router details
		.id(AppConstants.INTEGRATION_ROUTER)
		.routeGroup(AppConstants.INTEGRATION_ROUTER_GROUP)
		.description(AppConstants.INTEGRATION_ROUTER_DETAILS)
		
		//Backing up the file picked from direct:start endpoint
		//.wireTap("file:{{file.backup.location}}")
		// Processor details
		// Modifying address details
		.setProperty("InputBody", simple("${body}"))
		//.log(LoggingLevel.INFO, "Response : ${body}")
		//.process(new QuoteProcessor())
		.setBody(simple("${property.InputBody}"))
		.convertBodyTo(String.class)
		.log(LoggingLevel.INFO, "Body : ${body}")
	    .log(LoggingLevel.INFO, "Before Unmarshalling")	
		.unmarshal().json(JsonLibrary.Jackson,QuoteRequest.class)
		.log(LoggingLevel.INFO, "After Unmarshalling ")	
		.to("jpa://fce-integration-service/src/main/java/com/fce/pojo/QuoteResponse.java?consumer.namedQuery=step1")
		.log(LoggingLevel.INFO, "After JPA Endpoint")
		//.log(LoggingLevel.INFO, "DB updated successfully")
	    .marshal().json(JsonLibrary.Jackson, true)
	    .log(LoggingLevel.INFO, "After marshalling")
		// Routing - Channel 
		.to(AppConstants.SEDA_END);
	}
}
