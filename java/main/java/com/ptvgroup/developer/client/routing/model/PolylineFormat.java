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
 * Defines the format for polylines in the response.    * &#x60;GEO_JSON&#x60; - Polylines are returned in [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON) format.    * &#x60;GOOGLE_ENCODED_POLYLINE&#x60; - Polylines are returned in [Google&#39;s Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.  
 */
public enum PolylineFormat {
  
  GEO_JSON("GEO_JSON"),
  
  GOOGLE_ENCODED_POLYLINE("GOOGLE_ENCODED_POLYLINE");

  private String value;

  PolylineFormat(String value) {
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
  public static PolylineFormat fromValue(String value) {
    for (PolylineFormat b : PolylineFormat.values()) {
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

