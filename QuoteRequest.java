package com.fce.pojo;




import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"vehicleID",
"vehicleName"
})
public class QuoteRequest {

/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleID")
private String vehicleID;
/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleName")
private String vehicleName;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleID")
public String getVehicleID() {
return vehicleID;
}

/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleID")
public void setVehicleID(String vehicleID) {
this.vehicleID = vehicleID;
}

/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleName")
public String getVehicleName() {
return vehicleName;
}

/**
* 
* (Required)
* 
*/
@JsonProperty("vehicleName")
public void setVehicleName(String vehicleName) {
this.vehicleName = vehicleName;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}