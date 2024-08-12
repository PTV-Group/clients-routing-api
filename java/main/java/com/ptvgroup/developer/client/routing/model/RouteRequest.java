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
import com.ptvgroup.developer.client.routing.model.DriverBody;
import com.ptvgroup.developer.client.routing.model.Waypoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * RouteRequest
 */
@JsonPropertyOrder({
  RouteRequest.JSON_PROPERTY_WAYPOINTS,
  RouteRequest.JSON_PROPERTY_ROUTE_ID,
  RouteRequest.JSON_PROPERTY_DRIVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-12T07:36:30.278221337Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class RouteRequest {
  public static final String JSON_PROPERTY_WAYPOINTS = "waypoints";
  private List<Waypoint> waypoints = new ArrayList<>();

  public static final String JSON_PROPERTY_ROUTE_ID = "routeId";
  private UUID routeId;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private DriverBody driver;

  public RouteRequest() { 
  }

  public RouteRequest waypoints(List<Waypoint> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public RouteRequest addWaypointsItem(Waypoint waypointsItem) {
    if (this.waypoints == null) {
      this.waypoints = new ArrayList<>();
    }
    this.waypoints.add(waypointsItem);
    return this;
  }

  /**
   * The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.
   * @return waypoints
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Waypoint> getWaypoints() {
    return waypoints;
  }


  @JsonProperty(JSON_PROPERTY_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaypoints(List<Waypoint> waypoints) {
    this.waypoints = waypoints;
  }


  public RouteRequest routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./concepts/waypoints) for more information.
   * @return routeId
   */
  @javax.annotation.Nullable
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


  public RouteRequest driver(DriverBody driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DriverBody getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriver(DriverBody driver) {
    this.driver = driver;
  }


  /**
   * Return true if this RouteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteRequest routeRequest = (RouteRequest) o;
    return Objects.equals(this.waypoints, routeRequest.waypoints) &&
        Objects.equals(this.routeId, routeRequest.routeId) &&
        Objects.equals(this.driver, routeRequest.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waypoints, routeId, driver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteRequest {\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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

    // add `waypoints` to the URL query string
    if (getWaypoints() != null) {
      for (int i = 0; i < getWaypoints().size(); i++) {
        if (getWaypoints().get(i) != null) {
          joiner.add(getWaypoints().get(i).toUrlQueryString(String.format("%swaypoints%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `routeId` to the URL query string
    if (getRouteId() != null) {
      joiner.add(String.format("%srouteId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRouteId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `driver` to the URL query string
    if (getDriver() != null) {
      joiner.add(getDriver().toUrlQueryString(prefix + "driver" + suffix));
    }

    return joiner.toString();
  }
}

