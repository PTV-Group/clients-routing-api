/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.29
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The emission standard of the vehicle valid in the European Union. This parameter is not only important for proper toll and emission calculation,  there are also low-emission zones which can be entered only if the vehicle has a proper emission standard. In contrast to explicit approvals like environmental badges or vehicle registrations the emission standard is automatically considered when entering such low-emission zones.  Values different from _NONE_ are supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;, &#x60;emissions&#x60;. 
 */
public enum EmissionStandard {
  
  NONE("NONE"),
  
  EURO_0("EURO_0"),
  
  EURO_1("EURO_1"),
  
  EURO_2("EURO_2"),
  
  EURO_3("EURO_3"),
  
  EURO_4("EURO_4"),
  
  EURO_5("EURO_5"),
  
  EURO_EEV("EURO_EEV"),
  
  EURO_6("EURO_6"),
  
  EURO_6C("EURO_6C"),
  
  EURO_6D_TEMP("EURO_6D_TEMP"),
  
  EURO_6D("EURO_6D"),
  
  EURO_6E("EURO_6E"),
  
  EURO_7("EURO_7");

  private String value;

  EmissionStandard(String value) {
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
  public static EmissionStandard fromValue(String value) {
    for (EmissionStandard b : EmissionStandard.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

