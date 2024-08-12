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
 * The reason why the road or the schedule is violated.  * &#x60;PROHIBITED&#x60; - The violated road is prohibited in general for the current vehicle such as some roads in city centers, parks, forests and farmland or it is temporarily closed due to construction sites.    * &#x60;DELIVERY_ONLY&#x60; - The violated road is prohibited except for delivery vehicles such as factory premises. Cars and vans are no delivery vehicles and may produce such violations.    * &#x60;URBAN&#x60; - The violated road is prohibited because urban roads are prohibited for the current vehicle. This will not happen for the predefined profiles.    * &#x60;RESIDENTS_ONLY&#x60; - The violated road is prohibited because roads flagged as residents only are prohibited for the current vehicle. This will not happen for the predefined profiles.  * &#x60;RESTRICTED_ACCESS&#x60; - The violated road is prohibited because it has restricted access because a gate or a bollard has to be passed. This will always have **accessType** _PASS_.    * &#x60;VEHICLE_PROPERTY&#x60; - The violated road is prohibited for the current vehicle as some vehicle property exceeds a limit such as the weight or height, or the road is prohibited for trucks in general.    * &#x60;COMBINED_TRANSPORT&#x60; - The violated road is a boat (ferry) or rail (train or rail shuttle) connection prohibited for the current vehicle.  * &#x60;SCHEDULE&#x60; - The schedule is violated. The reasons can be found in **scheduleViolationTypes**.  * &#x60;BLOCKED_ROAD_BY_INTERSECTION&#x60; - The violated road has been blocked through **options[blockIntersectingRoads]**.
 */
public enum ViolationType {
  
  PROHIBITED("PROHIBITED"),
  
  DELIVERY_ONLY("DELIVERY_ONLY"),
  
  URBAN("URBAN"),
  
  RESIDENTS_ONLY("RESIDENTS_ONLY"),
  
  RESTRICTED_ACCESS("RESTRICTED_ACCESS"),
  
  VEHICLE_PROPERTY("VEHICLE_PROPERTY"),
  
  COMBINED_TRANSPORT("COMBINED_TRANSPORT"),
  
  SCHEDULE("SCHEDULE"),
  
  BLOCKED_ROAD_BY_INTERSECTION("BLOCKED_ROAD_BY_INTERSECTION");

  private String value;

  ViolationType(String value) {
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
  public static ViolationType fromValue(String value) {
    for (ViolationType b : ViolationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

