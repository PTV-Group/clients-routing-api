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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains the distance and travel time from the input waypoint or route to a reached location or vice versa (depending on the request drivingDirection).
 */
@ApiModel(description = "Contains the distance and travel time from the input waypoint or route to a reached location or vice versa (depending on the request drivingDirection).")
@JsonPropertyOrder({
  ReachableLocation.JSON_PROPERTY_DISTANCE,
  ReachableLocation.JSON_PROPERTY_TRAVEL_TIME,
  ReachableLocation.JSON_PROPERTY_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-12T09:51:18.360334Z[Etc/UTC]")
public class ReachableLocation {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public ReachableLocation() { 
  }

  public ReachableLocation distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance from the input waypoint to this location or vice versa.
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distance from the input waypoint to this location or vice versa.")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public ReachableLocation travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * The travel time from the input waypoint to this location or vice versa.
   * @return travelTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The travel time from the input waypoint to this location or vice versa.")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTravelTime() {
    return travelTime;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }


  public ReachableLocation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the reached input location.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the reached input location.")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  /**
   * Return true if this ReachableLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableLocation reachableLocation = (ReachableLocation) o;
    return Objects.equals(this.distance, reachableLocation.distance) &&
        Objects.equals(this.travelTime, reachableLocation.travelTime) &&
        Objects.equals(this.index, reachableLocation.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, travelTime, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableLocation {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

