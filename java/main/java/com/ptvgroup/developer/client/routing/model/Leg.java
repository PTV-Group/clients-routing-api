/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.TollCosts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Leg
 */
@JsonPropertyOrder({
  Leg.JSON_PROPERTY_DISTANCE,
  Leg.JSON_PROPERTY_TRAVEL_TIME,
  Leg.JSON_PROPERTY_TRAFFIC_DELAY,
  Leg.JSON_PROPERTY_VIOLATED,
  Leg.JSON_PROPERTY_TOLL_COSTS,
  Leg.JSON_PROPERTY_POLYLINE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T09:48:51.311424Z[Etc/UTC]")
public class Leg {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_TRAFFIC_DELAY = "trafficDelay";
  private Integer trafficDelay;

  public static final String JSON_PROPERTY_VIOLATED = "violated";
  private Boolean violated;

  public static final String JSON_PROPERTY_TOLL_COSTS = "tollCosts";
  private TollCosts tollCosts;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public Leg() { 
  }

  public Leg distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance of the leg [m].
   * minimum: 0
   * @return distance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1422", required = true, value = "The distance of the leg [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public Leg travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * The travel time for the leg [s].
   * minimum: 0
   * @return travelTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "56", required = true, value = "The travel time for the leg [s].")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTravelTime() {
    return travelTime;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }


  public Leg trafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
    return this;
  }

   /**
   * The total delay due to live traffic on this leg [s].  This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.
   * minimum: 0
   * @return trafficDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The total delay due to live traffic on this leg [s].  This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]=REALISTIC**. See [here](./concepts/traffic-modes) for more information.")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrafficDelay() {
    return trafficDelay;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
  }


  public Leg violated(Boolean violated) {
    this.violated = violated;
    return this;
  }

   /**
   * When the leg cannot be calculated for the given vehicle the resulting leg is marked as violated.
   * @return violated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "When the leg cannot be calculated for the given vehicle the resulting leg is marked as violated.")
  @JsonProperty(JSON_PROPERTY_VIOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getViolated() {
    return violated;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolated(Boolean violated) {
    this.violated = violated;
  }


  public Leg tollCosts(TollCosts tollCosts) {
    this.tollCosts = tollCosts;
    return this;
  }

   /**
   * Get tollCosts
   * @return tollCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOLL_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TollCosts getTollCosts() {
    return tollCosts;
  }


  @JsonProperty(JSON_PROPERTY_TOLL_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTollCosts(TollCosts tollCosts) {
    this.tollCosts = tollCosts;
  }


  public Leg polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * The polyline of the leg in the format specified by **options[polylineFormat]**.
   * @return polyline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The polyline of the leg in the format specified by **options[polylineFormat]**.")
  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolyline() {
    return polyline;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }


  /**
   * Return true if this Leg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leg leg = (Leg) o;
    return Objects.equals(this.distance, leg.distance) &&
        Objects.equals(this.travelTime, leg.travelTime) &&
        Objects.equals(this.trafficDelay, leg.trafficDelay) &&
        Objects.equals(this.violated, leg.violated) &&
        Objects.equals(this.tollCosts, leg.tollCosts) &&
        Objects.equals(this.polyline, leg.polyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, travelTime, trafficDelay, violated, tollCosts, polyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    trafficDelay: ").append(toIndentedString(trafficDelay)).append("\n");
    sb.append("    violated: ").append(toIndentedString(violated)).append("\n");
    sb.append("    tollCosts: ").append(toIndentedString(tollCosts)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
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

}

