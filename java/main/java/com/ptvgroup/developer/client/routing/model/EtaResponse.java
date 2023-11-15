/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
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
import com.ptvgroup.developer.client.routing.model.RemainingWaypoint;
import com.ptvgroup.developer.client.routing.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The response of an ETA calculation.
 */
@ApiModel(description = "The response of an ETA calculation.")
@JsonPropertyOrder({
  EtaResponse.JSON_PROPERTY_REMAINING_WAYPOINTS,
  EtaResponse.JSON_PROPERTY_ROUTE_ID,
  EtaResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class EtaResponse {
  public static final String JSON_PROPERTY_REMAINING_WAYPOINTS = "remainingWaypoints";
  private List<RemainingWaypoint> remainingWaypoints = new ArrayList<>();

  public static final String JSON_PROPERTY_ROUTE_ID = "routeId";
  private UUID routeId;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = null;

  public EtaResponse() { 
  }

  public EtaResponse remainingWaypoints(List<RemainingWaypoint> remainingWaypoints) {
    this.remainingWaypoints = remainingWaypoints;
    return this;
  }

  public EtaResponse addRemainingWaypointsItem(RemainingWaypoint remainingWaypointsItem) {
    this.remainingWaypoints.add(remainingWaypointsItem);
    return this;
  }

   /**
   * The ETA and the remaining distance and travel time to the waypoints not yet reached by the route.
   * @return remainingWaypoints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ETA and the remaining distance and travel time to the waypoints not yet reached by the route.")
  @JsonProperty(JSON_PROPERTY_REMAINING_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RemainingWaypoint> getRemainingWaypoints() {
    return remainingWaypoints;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingWaypoints(List<RemainingWaypoint> remainingWaypoints) {
    this.remainingWaypoints = remainingWaypoints;
  }


  public EtaResponse routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * If the route has been recalculated, this is the ID of the new route. That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route, or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier.
   * @return routeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the route has been recalculated, this is the ID of the new route. That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route, or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier.")
  @JsonProperty(JSON_PROPERTY_ROUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRouteId() {
    return routeId;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRouteId(UUID routeId) {
    this.routeId = routeId;
  }


  public EtaResponse warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public EtaResponse addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings concerning the validity of the result.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Warning> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this EtaResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtaResponse etaResponse = (EtaResponse) o;
    return Objects.equals(this.remainingWaypoints, etaResponse.remainingWaypoints) &&
        Objects.equals(this.routeId, etaResponse.routeId) &&
        Objects.equals(this.warnings, etaResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainingWaypoints, routeId, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtaResponse {\n");
    sb.append("    remainingWaypoints: ").append(toIndentedString(remainingWaypoints)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
