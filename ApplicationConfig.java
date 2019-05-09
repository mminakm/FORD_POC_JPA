package com.fce.config;

import javax.sql.DataSource;

import org.apache.camel.CamelContext;
import org.apache.camel.processor.idempotent.jdbc.JdbcMessageIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;


@Configuration
public class ApplicationConfig {
	
	/*
	 * @Autowired DataSource dataSource;
	 */

/*	@Autowired
	  CamelContext camelContext;
	
	
	public CamelContext createCamelContext() {
	    String url = "jdbc:mysql://localhost:3306/poc";
	    DataSource dataSource = setupDataSource(url);
	    SimpleRegistry registry = new SimpleRegistry();
	    registry.put("dataSource", dataSource);
	    CamelContext context = new DefaultCamelContext(registry);
	    // plug in a seda component, as we don't really need an embedded broker
	    return context;
	}
	
    private static DataSource setupDataSource(String connectURI) {
    	BasicDataSource ds = new BasicDataSource();
        ds.setUsername("root");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setPassword("root");
        ds.setUrl(connectURI);
        return ds;
    } */
}


