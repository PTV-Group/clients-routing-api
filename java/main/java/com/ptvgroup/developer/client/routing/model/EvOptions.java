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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * EvOptions
 */
@JsonPropertyOrder({
  EvOptions.JSON_PROPERTY_INITIAL_STATE_OF_CHARGE,
  EvOptions.JSON_PROPERTY_MINIMUM_STATE_OF_CHARGE,
  EvOptions.JSON_PROPERTY_ENERGY_EFFICIENT_ROUTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-12T07:36:30.278221337Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class EvOptions {
  public static final String JSON_PROPERTY_INITIAL_STATE_OF_CHARGE = "initialStateOfCharge";
  private Double initialStateOfCharge = 100d;

  public static final String JSON_PROPERTY_MINIMUM_STATE_OF_CHARGE = "minimumStateOfCharge";
  private Double minimumStateOfCharge = 10d;

  public static final String JSON_PROPERTY_ENERGY_EFFICIENT_ROUTE = "energyEfficientRoute";
  private Boolean energyEfficientRoute = false;

  public EvOptions() { 
  }

  public EvOptions initialStateOfCharge(Double initialStateOfCharge) {
    this.initialStateOfCharge = initialStateOfCharge;
    return this;
  }

  /**
   * The available battery capacity at the start of the route [%].
   * minimum: 0
   * maximum: 100
   * @return initialStateOfCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInitialStateOfCharge() {
    return initialStateOfCharge;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialStateOfCharge(Double initialStateOfCharge) {
    this.initialStateOfCharge = initialStateOfCharge;
  }


  public EvOptions minimumStateOfCharge(Double minimumStateOfCharge) {
    this.minimumStateOfCharge = minimumStateOfCharge;
    return this;
  }

  /**
   * The minimum wanted remaining battery capacity at the end of the route and at the end of each leg [%].
   * minimum: 1
   * maximum: 99
   * @return minimumStateOfCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinimumStateOfCharge() {
    return minimumStateOfCharge;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumStateOfCharge(Double minimumStateOfCharge) {
    this.minimumStateOfCharge = minimumStateOfCharge;
  }


  public EvOptions energyEfficientRoute(Boolean energyEfficientRoute) {
    this.energyEfficientRoute = energyEfficientRoute;
    return this;
  }

  /**
   * Specifies if an energy efficient route should be calculated.
   * @return energyEfficientRoute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENERGY_EFFICIENT_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnergyEfficientRoute() {
    return energyEfficientRoute;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_EFFICIENT_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnergyEfficientRoute(Boolean energyEfficientRoute) {
    this.energyEfficientRoute = energyEfficientRoute;
  }


  /**
   * Return true if this EvOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvOptions evOptions = (EvOptions) o;
    return Objects.equals(this.initialStateOfCharge, evOptions.initialStateOfCharge) &&
        Objects.equals(this.minimumStateOfCharge, evOptions.minimumStateOfCharge) &&
        Objects.equals(this.energyEfficientRoute, evOptions.energyEfficientRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialStateOfCharge, minimumStateOfCharge, energyEfficientRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvOptions {\n");
    sb.append("    initialStateOfCharge: ").append(toIndentedString(initialStateOfCharge)).append("\n");
    sb.append("    minimumStateOfCharge: ").append(toIndentedString(minimumStateOfCharge)).append("\n");
    sb.append("    energyEfficientRoute: ").append(toIndentedString(energyEfficientRoute)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `initialStateOfCharge` to the URL query string
    if (getInitialStateOfCharge() != null) {
      joiner.add(String.format("%sinitialStateOfCharge%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInitialStateOfCharge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `minimumStateOfCharge` to the URL query string
    if (getMinimumStateOfCharge() != null) {
      joiner.add(String.format("%sminimumStateOfCharge%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMinimumStateOfCharge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `energyEfficientRoute` to the URL query string
    if (getEnergyEfficientRoute() != null) {
      joiner.add(String.format("%senergyEfficientRoute%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEnergyEfficientRoute()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

