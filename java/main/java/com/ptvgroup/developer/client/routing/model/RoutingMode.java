/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies which objective function should be used for the route calculation.   * _FAST_ is the default which returns a route considering a tradeoff between distance an travel time. All vehicle-specific restrictions are properly considered and violated only, if no other route can be found. * _SHORT_ returns a route which is probably shorter but accepting longer travel times. The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas. * _MONETARY_ assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption. Furthermore, toll costs are integrated as well. See [here](./Concepts/Monetary%20Costs.htm) for more information.
 */
public enum RoutingMode {
  
  FAST("FAST"),
  
  SHORT("SHORT"),
  
  MONETARY("MONETARY");

  private String value;

  RoutingMode(String value) {
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
  public static RoutingMode fromValue(String value) {
    for (RoutingMode b : RoutingMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
