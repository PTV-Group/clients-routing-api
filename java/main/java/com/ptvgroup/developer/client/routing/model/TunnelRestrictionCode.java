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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The tunnel restriction code according to ADR (European Agreement Concerning the International Carriage of Dangerous Goods by Road) depending on the load of the vehicle.  Relevant for &#x60;routing&#x60;. 
 */
public enum TunnelRestrictionCode {
  
  NONE("NONE"),
  
  B("B"),
  
  C("C"),
  
  D("D"),
  
  E("E");

  private String value;

  TunnelRestrictionCode(String value) {
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
  public static TunnelRestrictionCode fromValue(String value) {
    for (TunnelRestrictionCode b : TunnelRestrictionCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

