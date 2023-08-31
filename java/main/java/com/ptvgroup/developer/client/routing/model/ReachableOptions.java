/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.20
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
import com.ptvgroup.developer.client.routing.model.DrivingDirection;
import com.ptvgroup.developer.client.routing.model.ReachableTrafficMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReachableOptions
 */
@JsonPropertyOrder({
  ReachableOptions.JSON_PROPERTY_DRIVING_DIRECTION,
  ReachableOptions.JSON_PROPERTY_REFERENCE_TIME,
  ReachableOptions.JSON_PROPERTY_TRAFFIC_MODE,
  ReachableOptions.JSON_PROPERTY_ALLOWED_COUNTRIES,
  ReachableOptions.JSON_PROPERTY_PROHIBITED_COUNTRIES,
  ReachableOptions.JSON_PROPERTY_BLOCK_INTERSECTING_ROADS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T08:11:59.671519Z[Etc/UTC]")
public class ReachableOptions {
  public static final String JSON_PROPERTY_DRIVING_DIRECTION = "drivingDirection";
  private DrivingDirection drivingDirection = DrivingDirection.OUTBOUND;

  public static final String JSON_PROPERTY_REFERENCE_TIME = "referenceTime";
  private JsonNullable<OffsetDateTime> referenceTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TRAFFIC_MODE = "trafficMode";
  private ReachableTrafficMode trafficMode = ReachableTrafficMode.AVERAGE;

  public static final String JSON_PROPERTY_ALLOWED_COUNTRIES = "allowedCountries";
  private JsonNullable<List<String>> allowedCountries = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PROHIBITED_COUNTRIES = "prohibitedCountries";
  private JsonNullable<List<String>> prohibitedCountries = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_BLOCK_INTERSECTING_ROADS = "blockIntersectingRoads";
  private JsonNullable<String> blockIntersectingRoads = JsonNullable.<String>undefined();

  public ReachableOptions() { 
  }

  public ReachableOptions drivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
    return this;
  }

   /**
   * Get drivingDirection
   * @return drivingDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DrivingDirection getDrivingDirection() {
    return drivingDirection;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
  }


  public ReachableOptions referenceTime(OffsetDateTime referenceTime) {
    this.referenceTime = JsonNullable.<OffsetDateTime>of(referenceTime);
    return this;
  }

   /**
   * Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. Responses will contain the offset to UTC specified in the request or that of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./concepts/date-and-time) for more information on the relevance of date and time.
   * @return referenceTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-04T06:00Z", value = "Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. Responses will contain the offset to UTC specified in the request or that of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./concepts/date-and-time) for more information on the relevance of date and time.")
  @JsonIgnore

  public OffsetDateTime getReferenceTime() {
        return referenceTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFERENCE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getReferenceTime_JsonNullable() {
    return referenceTime;
  }
  
  @JsonProperty(JSON_PROPERTY_REFERENCE_TIME)
  public void setReferenceTime_JsonNullable(JsonNullable<OffsetDateTime> referenceTime) {
    this.referenceTime = referenceTime;
  }

  public void setReferenceTime(OffsetDateTime referenceTime) {
    this.referenceTime = JsonNullable.<OffsetDateTime>of(referenceTime);
  }


  public ReachableOptions trafficMode(ReachableTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

   /**
   * Get trafficMode
   * @return trafficMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReachableTrafficMode getTrafficMode() {
    return trafficMode;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficMode(ReachableTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
  }


  public ReachableOptions allowedCountries(List<String> allowedCountries) {
    this.allowedCountries = JsonNullable.<List<String>>of(allowedCountries);
    return this;
  }

  public ReachableOptions addAllowedCountriesItem(String allowedCountriesItem) {
    if (this.allowedCountries == null || !this.allowedCountries.isPresent()) {
      this.allowedCountries = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.allowedCountries.get().add(allowedCountriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return allowedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonIgnore

  public List<String> getAllowedCountries() {
        return allowedCountries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getAllowedCountries_JsonNullable() {
    return allowedCountries;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  public void setAllowedCountries_JsonNullable(JsonNullable<List<String>> allowedCountries) {
    this.allowedCountries = allowedCountries;
  }

  public void setAllowedCountries(List<String> allowedCountries) {
    this.allowedCountries = JsonNullable.<List<String>>of(allowedCountries);
  }


  public ReachableOptions prohibitedCountries(List<String> prohibitedCountries) {
    this.prohibitedCountries = JsonNullable.<List<String>>of(prohibitedCountries);
    return this;
  }

  public ReachableOptions addProhibitedCountriesItem(String prohibitedCountriesItem) {
    if (this.prohibitedCountries == null || !this.prohibitedCountries.isPresent()) {
      this.prohibitedCountries = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.prohibitedCountries.get().add(prohibitedCountriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return prohibitedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonIgnore

  public List<String> getProhibitedCountries() {
        return prohibitedCountries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getProhibitedCountries_JsonNullable() {
    return prohibitedCountries;
  }
  
  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  public void setProhibitedCountries_JsonNullable(JsonNullable<List<String>> prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
  }

  public void setProhibitedCountries(List<String> prohibitedCountries) {
    this.prohibitedCountries = JsonNullable.<List<String>>of(prohibitedCountries);
  }


  public ReachableOptions blockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = JsonNullable.<String>of(blockIntersectingRoads);
    return this;
  }

   /**
   * Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked. Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma. Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * If there is no other route connecting two waypoints the will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * consists of less than two points,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
   * @return blockIntersectingRoads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49.8,9.9,49.9,10|33.1,-111.1,33.0,-111.2", value = "Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked. Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma. Format: `<poly1_lat1>,<poly1_lon1>,...,<poly1_latN>,<poly1_lonN>|<poly2_lat1>,<poly2_lon1>,...,<poly2_latN>,<poly2_lonN>|...`   Notes: * Be aware of the URL length restrictions. * If there is no other route connecting two waypoints the will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * consists of less than two points,   * contains invalid coordinates or   * intersects more than 5000 road segments. ")
  @JsonIgnore

  public String getBlockIntersectingRoads() {
        return blockIntersectingRoads.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBlockIntersectingRoads_JsonNullable() {
    return blockIntersectingRoads;
  }
  
  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  public void setBlockIntersectingRoads_JsonNullable(JsonNullable<String> blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
  }

  public void setBlockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = JsonNullable.<String>of(blockIntersectingRoads);
  }


  /**
   * Return true if this ReachableOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableOptions reachableOptions = (ReachableOptions) o;
    return Objects.equals(this.drivingDirection, reachableOptions.drivingDirection) &&
        equalsNullable(this.referenceTime, reachableOptions.referenceTime) &&
        Objects.equals(this.trafficMode, reachableOptions.trafficMode) &&
        equalsNullable(this.allowedCountries, reachableOptions.allowedCountries) &&
        equalsNullable(this.prohibitedCountries, reachableOptions.prohibitedCountries) &&
        equalsNullable(this.blockIntersectingRoads, reachableOptions.blockIntersectingRoads);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivingDirection, hashCodeNullable(referenceTime), trafficMode, hashCodeNullable(allowedCountries), hashCodeNullable(prohibitedCountries), hashCodeNullable(blockIntersectingRoads));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableOptions {\n");
    sb.append("    drivingDirection: ").append(toIndentedString(drivingDirection)).append("\n");
    sb.append("    referenceTime: ").append(toIndentedString(referenceTime)).append("\n");
    sb.append("    trafficMode: ").append(toIndentedString(trafficMode)).append("\n");
    sb.append("    allowedCountries: ").append(toIndentedString(allowedCountries)).append("\n");
    sb.append("    prohibitedCountries: ").append(toIndentedString(prohibitedCountries)).append("\n");
    sb.append("    blockIntersectingRoads: ").append(toIndentedString(blockIntersectingRoads)).append("\n");
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

