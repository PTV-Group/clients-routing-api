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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.ChargingStation;
import com.ptvgroup.developer.client.routing.model.Weather;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The ev parameters that are specific to a waypoint.  This parameter is in a preview state, the API is stable, feature changes could be introduced in future. 
 */
@JsonPropertyOrder({
  EvParametersAtWaypoint.JSON_PROPERTY_WEATHER,
  EvParametersAtWaypoint.JSON_PROPERTY_CHARGING_STATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T09:57:52.401871Z[Etc/UTC]")
public class EvParametersAtWaypoint {
  public static final String JSON_PROPERTY_WEATHER = "weather";
  private Weather weather;

  public static final String JSON_PROPERTY_CHARGING_STATION = "chargingStation";
  private ChargingStation chargingStation;

  public EvParametersAtWaypoint() { 
  }

  public EvParametersAtWaypoint weather(Weather weather) {
    this.weather = weather;
    return this;
  }

   /**
   * Get weather
   * @return weather
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEATHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Weather getWeather() {
    return weather;
  }


  @JsonProperty(JSON_PROPERTY_WEATHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeather(Weather weather) {
    this.weather = weather;
  }


  public EvParametersAtWaypoint chargingStation(ChargingStation chargingStation) {
    this.chargingStation = chargingStation;
    return this;
  }

   /**
   * Get chargingStation
   * @return chargingStation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGING_STATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargingStation getChargingStation() {
    return chargingStation;
  }


  @JsonProperty(JSON_PROPERTY_CHARGING_STATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargingStation(ChargingStation chargingStation) {
    this.chargingStation = chargingStation;
  }


  /**
   * Return true if this EvParametersAtWaypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvParametersAtWaypoint evParametersAtWaypoint = (EvParametersAtWaypoint) o;
    return Objects.equals(this.weather, evParametersAtWaypoint.weather) &&
        Objects.equals(this.chargingStation, evParametersAtWaypoint.chargingStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weather, chargingStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvParametersAtWaypoint {\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    chargingStation: ").append(toIndentedString(chargingStation)).append("\n");
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

    // add `weather` to the URL query string
    if (getWeather() != null) {
      joiner.add(getWeather().toUrlQueryString(prefix + "weather" + suffix));
    }

    // add `chargingStation` to the URL query string
    if (getChargingStation() != null) {
      joiner.add(getChargingStation().toUrlQueryString(prefix + "chargingStation" + suffix));
    }

    return joiner.toString();
  }
}

