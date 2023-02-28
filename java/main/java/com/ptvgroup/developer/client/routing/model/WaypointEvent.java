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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when a waypoint is reached by the route, but not for route-manipulation waypoints. Requires _WAYPOINT_EVENTS_ to be requested.
 */
@ApiModel(description = "Issued when a waypoint is reached by the route, but not for route-manipulation waypoints. Requires _WAYPOINT_EVENTS_ to be requested.")
@JsonPropertyOrder({
  WaypointEvent.JSON_PROPERTY_INDEX,
  WaypointEvent.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T07:23:48.569348Z[Etc/UTC]")
public class WaypointEvent {
  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public WaypointEvent() { 
  }

  public WaypointEvent index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the waypoint in the request.
   * minimum: 0
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The index of the waypoint in the request.")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public WaypointEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the waypoint as given in the request. This field is only present if it is not empty.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the waypoint as given in the request. This field is only present if it is not empty.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this WaypointEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaypointEvent waypointEvent = (WaypointEvent) o;
    return Objects.equals(this.index, waypointEvent.index) &&
        Objects.equals(this.name, waypointEvent.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaypointEvent {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

