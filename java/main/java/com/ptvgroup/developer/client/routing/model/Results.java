/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Results
 */
public enum Results {
  
  ROUTE_ID("ROUTE_ID"),
  
  LEGS("LEGS"),
  
  LEGS_POLYLINE("LEGS_POLYLINE"),
  
  TOLL_COSTS("TOLL_COSTS"),
  
  TOLL_SECTIONS("TOLL_SECTIONS"),
  
  TOLL_SYSTEMS("TOLL_SYSTEMS"),
  
  TOLL_EVENTS("TOLL_EVENTS"),
  
  POLYLINE("POLYLINE"),
  
  MANEUVER_EVENTS("MANEUVER_EVENTS"),
  
  BORDER_EVENTS("BORDER_EVENTS"),
  
  VIOLATION_EVENTS("VIOLATION_EVENTS"),
  
  VIOLATION_EVENTS_POLYLINE("VIOLATION_EVENTS_POLYLINE"),
  
  WAYPOINT_EVENTS("WAYPOINT_EVENTS"),
  
  UTC_OFFSET_CHANGE_EVENTS("UTC_OFFSET_CHANGE_EVENTS"),
  
  COMBINED_TRANSPORT_EVENTS("COMBINED_TRANSPORT_EVENTS"),
  
  TRAFFIC_EVENTS("TRAFFIC_EVENTS"),
  
  SCHEDULE_EVENTS("SCHEDULE_EVENTS"),
  
  EMISSIONS_EN16258_2012("EMISSIONS_EN16258_2012"),
  
  EMISSIONS_EN16258_2012_HBEFA("EMISSIONS_EN16258_2012_HBEFA"),
  
  EMISSIONS_ISO14083_2022("EMISSIONS_ISO14083_2022"),
  
  EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION("EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION"),
  
  EMISSIONS_FRENCH_CO2E_DECREE_2017_639("EMISSIONS_FRENCH_CO2E_DECREE_2017_639"),
  
  ALTERNATIVE_ROUTES("ALTERNATIVE_ROUTES"),
  
  SCHEDULE_REPORT("SCHEDULE_REPORT"),
  
  GUIDED_NAVIGATION("GUIDED_NAVIGATION"),
  
  MONETARY_COSTS("MONETARY_COSTS");

  private String value;

  Results(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Results fromValue(String value) {
    for (Results b : Results.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

