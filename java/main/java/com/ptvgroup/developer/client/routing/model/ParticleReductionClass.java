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
 * The particle reduction class (Partikelminderungsklasse) according to &#39;Anlage XIV zu &amp;sect; 48 StVZO&#39; (German law).  Supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for &#x60;toll&#x60;. 
 */
public enum ParticleReductionClass {
  
  PMK_0("PMK_0"),
  
  PMK_1("PMK_1"),
  
  PMK_2("PMK_2"),
  
  PMK_3("PMK_3"),
  
  PMK_4("PMK_4"),
  
  NONE("NONE");

  private String value;

  ParticleReductionClass(String value) {
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
  public static ParticleReductionClass fromValue(String value) {
    for (ParticleReductionClass b : ParticleReductionClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
