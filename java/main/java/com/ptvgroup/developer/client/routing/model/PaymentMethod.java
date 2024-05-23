/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
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
 * A payment method for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Pay with an electronic toll collection system for which a subscription is required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Pay with some electronic toll collection system for which no prior subscription is required.    * &#x60;CASH&#x60; - Pay with cash at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Pay with credit card at a toll booth.
 */
public enum PaymentMethod {
  
  ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION("ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION"),
  
  ELECTRONIC_TOLL_COLLECTION("ELECTRONIC_TOLL_COLLECTION"),
  
  CASH("CASH"),
  
  CREDIT_CARD("CREDIT_CARD");

  private String value;

  PaymentMethod(String value) {
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
  public static PaymentMethod fromValue(String value) {
    for (PaymentMethod b : PaymentMethod.values()) {
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

