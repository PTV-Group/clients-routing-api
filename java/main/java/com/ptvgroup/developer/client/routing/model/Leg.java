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
import com.ptvgroup.developer.client.routing.model.EvReportLeg;
import com.ptvgroup.developer.client.routing.model.TollCosts;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Leg
 */
@JsonPropertyOrder({
  Leg.JSON_PROPERTY_DISTANCE,
  Leg.JSON_PROPERTY_TRAVEL_TIME,
  Leg.JSON_PROPERTY_TRAFFIC_DELAY,
  Leg.JSON_PROPERTY_VIOLATED,
  Leg.JSON_PROPERTY_TOLL_COSTS,
  Leg.JSON_PROPERTY_POLYLINE,
  Leg.JSON_PROPERTY_EV_REPORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-12T07:36:30.278221337Z[Etc/UTC]", comments = "Generator version: 7.7.0")
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

  public static final String JSON_PROPERTY_EV_REPORT = "evReport";
  private EvReportLeg evReport;

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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nullable
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
   * If there is no valid connection between the waypoints of this leg but the resulting leg can be calculated by using actually prohibited roads, the route is marked as violated.
   * @return violated
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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


  public Leg evReport(EvReportLeg evReport) {
    this.evReport = evReport;
    return this;
  }

  /**
   * Get evReport
   * @return evReport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EV_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EvReportLeg getEvReport() {
    return evReport;
  }


  @JsonProperty(JSON_PROPERTY_EV_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvReport(EvReportLeg evReport) {
    this.evReport = evReport;
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
        Objects.equals(this.polyline, leg.polyline) &&
        Objects.equals(this.evReport, leg.evReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, travelTime, trafficDelay, violated, tollCosts, polyline, evReport);
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
    sb.append("    evReport: ").append(toIndentedString(evReport)).append("\n");
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

    // add `distance` to the URL query string
    if (getDistance() != null) {
      joiner.add(String.format("%sdistance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `travelTime` to the URL query string
    if (getTravelTime() != null) {
      joiner.add(String.format("%stravelTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTravelTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trafficDelay` to the URL query string
    if (getTrafficDelay() != null) {
      joiner.add(String.format("%strafficDelay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrafficDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `violated` to the URL query string
    if (getViolated() != null) {
      joiner.add(String.format("%sviolated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getViolated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tollCosts` to the URL query string
    if (getTollCosts() != null) {
      joiner.add(getTollCosts().toUrlQueryString(prefix + "tollCosts" + suffix));
    }

    // add `polyline` to the URL query string
    if (getPolyline() != null) {
      joiner.add(String.format("%spolyline%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolyline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evReport` to the URL query string
    if (getEvReport() != null) {
      joiner.add(getEvReport().toUrlQueryString(prefix + "evReport" + suffix));
    }

    return joiner.toString();
  }
}

