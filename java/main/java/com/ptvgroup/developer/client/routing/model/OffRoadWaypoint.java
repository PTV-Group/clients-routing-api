/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
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
import com.ptvgroup.developer.client.routing.model.EvParametersAtWaypoint;
import com.ptvgroup.developer.client.routing.model.RoadAccess;
import com.ptvgroup.developer.client.routing.model.TimeInterval;
import com.ptvgroup.developer.client.routing.model.VehicleParametersAtWaypoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * An _off-road waypoint_ will be part of the route. The air-line connection between given and matched coordinates is included in the route polyline, distance and duration. Use this waypoint type to recalculate a route planned by the Route Optimization API.
 */
@JsonPropertyOrder({
  OffRoadWaypoint.JSON_PROPERTY_LATITUDE,
  OffRoadWaypoint.JSON_PROPERTY_LONGITUDE,
  OffRoadWaypoint.JSON_PROPERTY_ROAD_ACESS,
  OffRoadWaypoint.JSON_PROPERTY_MATCH_SIDE_OF_STREET,
  OffRoadWaypoint.JSON_PROPERTY_SERVICE_TIME,
  OffRoadWaypoint.JSON_PROPERTY_USE_SERVICE_TIME_FOR_RECREATION,
  OffRoadWaypoint.JSON_PROPERTY_OPENING_INTERVALS,
  OffRoadWaypoint.JSON_PROPERTY_VEHICLE_PARAMETERS,
  OffRoadWaypoint.JSON_PROPERTY_EV_PARAMETERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T09:38:59.391603257Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OffRoadWaypoint {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_ROAD_ACESS = "roadAcess";
  private RoadAccess roadAcess;

  public static final String JSON_PROPERTY_MATCH_SIDE_OF_STREET = "matchSideOfStreet";
  private Boolean matchSideOfStreet = false;

  public static final String JSON_PROPERTY_SERVICE_TIME = "serviceTime";
  private Integer serviceTime = 0;

  public static final String JSON_PROPERTY_USE_SERVICE_TIME_FOR_RECREATION = "useServiceTimeForRecreation";
  private Boolean useServiceTimeForRecreation = false;

  public static final String JSON_PROPERTY_OPENING_INTERVALS = "openingIntervals";
  private List<TimeInterval> openingIntervals = new ArrayList<>();

  public static final String JSON_PROPERTY_VEHICLE_PARAMETERS = "vehicleParameters";
  private VehicleParametersAtWaypoint vehicleParameters;

  public static final String JSON_PROPERTY_EV_PARAMETERS = "evParameters";
  private EvParametersAtWaypoint evParameters;

  public OffRoadWaypoint() { 
  }

  public OffRoadWaypoint latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public OffRoadWaypoint longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public OffRoadWaypoint roadAcess(RoadAccess roadAcess) {
    this.roadAcess = roadAcess;
    return this;
  }

  /**
   * Get roadAcess
   * @return roadAcess
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROAD_ACESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoadAccess getRoadAcess() {
    return roadAcess;
  }


  @JsonProperty(JSON_PROPERTY_ROAD_ACESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoadAcess(RoadAccess roadAcess) {
    this.roadAcess = roadAcess;
  }


  public OffRoadWaypoint matchSideOfStreet(Boolean matchSideOfStreet) {
    this.matchSideOfStreet = matchSideOfStreet;
    return this;
  }

  /**
   * Specifies that this waypoint will be reached at the side of street on which it is located. This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.
   * @return matchSideOfStreet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_SIDE_OF_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMatchSideOfStreet() {
    return matchSideOfStreet;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_SIDE_OF_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchSideOfStreet(Boolean matchSideOfStreet) {
    this.matchSideOfStreet = matchSideOfStreet;
  }


  public OffRoadWaypoint serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

  /**
   * The service time [s] that is required at this waypoint, e.g. for pickup or delivery.
   * minimum: 0
   * @return serviceTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getServiceTime() {
    return serviceTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public OffRoadWaypoint useServiceTimeForRecreation(Boolean useServiceTimeForRecreation) {
    this.useServiceTimeForRecreation = useServiceTimeForRecreation;
    return this;
  }

  /**
   * If true, the service time can be used for a break or rest. Will be ignored, if **serviceTime** is 0 or if no **driver** is specified.
   * @return useServiceTimeForRecreation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_SERVICE_TIME_FOR_RECREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseServiceTimeForRecreation() {
    return useServiceTimeForRecreation;
  }


  @JsonProperty(JSON_PROPERTY_USE_SERVICE_TIME_FOR_RECREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseServiceTimeForRecreation(Boolean useServiceTimeForRecreation) {
    this.useServiceTimeForRecreation = useServiceTimeForRecreation;
  }


  public OffRoadWaypoint openingIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
    return this;
  }

  public OffRoadWaypoint addOpeningIntervalsItem(TimeInterval openingIntervalsItem) {
    if (this.openingIntervals == null) {
      this.openingIntervals = new ArrayList<>();
    }
    this.openingIntervals.add(openingIntervalsItem);
    return this;
  }

  /**
   * The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals. If the vehicle does not arrive at a waypoint within an opening interval, a waiting time will be scheduled.  When using a multi-day **workingHoursPreset** this waiting time will usually be used for daily rests instead, in order to continue the route with a rested driver.
   * @return openingIntervals
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeInterval> getOpeningIntervals() {
    return openingIntervals;
  }


  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpeningIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
  }


  public OffRoadWaypoint vehicleParameters(VehicleParametersAtWaypoint vehicleParameters) {
    this.vehicleParameters = vehicleParameters;
    return this;
  }

  /**
   * Get vehicleParameters
   * @return vehicleParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEHICLE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VehicleParametersAtWaypoint getVehicleParameters() {
    return vehicleParameters;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleParameters(VehicleParametersAtWaypoint vehicleParameters) {
    this.vehicleParameters = vehicleParameters;
  }


  public OffRoadWaypoint evParameters(EvParametersAtWaypoint evParameters) {
    this.evParameters = evParameters;
    return this;
  }

  /**
   * Get evParameters
   * @return evParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EV_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EvParametersAtWaypoint getEvParameters() {
    return evParameters;
  }


  @JsonProperty(JSON_PROPERTY_EV_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvParameters(EvParametersAtWaypoint evParameters) {
    this.evParameters = evParameters;
  }


  /**
   * Return true if this OffRoadWaypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffRoadWaypoint offRoadWaypoint = (OffRoadWaypoint) o;
    return Objects.equals(this.latitude, offRoadWaypoint.latitude) &&
        Objects.equals(this.longitude, offRoadWaypoint.longitude) &&
        Objects.equals(this.roadAcess, offRoadWaypoint.roadAcess) &&
        Objects.equals(this.matchSideOfStreet, offRoadWaypoint.matchSideOfStreet) &&
        Objects.equals(this.serviceTime, offRoadWaypoint.serviceTime) &&
        Objects.equals(this.useServiceTimeForRecreation, offRoadWaypoint.useServiceTimeForRecreation) &&
        Objects.equals(this.openingIntervals, offRoadWaypoint.openingIntervals) &&
        Objects.equals(this.vehicleParameters, offRoadWaypoint.vehicleParameters) &&
        Objects.equals(this.evParameters, offRoadWaypoint.evParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, roadAcess, matchSideOfStreet, serviceTime, useServiceTimeForRecreation, openingIntervals, vehicleParameters, evParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffRoadWaypoint {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    roadAcess: ").append(toIndentedString(roadAcess)).append("\n");
    sb.append("    matchSideOfStreet: ").append(toIndentedString(matchSideOfStreet)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    useServiceTimeForRecreation: ").append(toIndentedString(useServiceTimeForRecreation)).append("\n");
    sb.append("    openingIntervals: ").append(toIndentedString(openingIntervals)).append("\n");
    sb.append("    vehicleParameters: ").append(toIndentedString(vehicleParameters)).append("\n");
    sb.append("    evParameters: ").append(toIndentedString(evParameters)).append("\n");
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

    // add `latitude` to the URL query string
    if (getLatitude() != null) {
      joiner.add(String.format("%slatitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLatitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `longitude` to the URL query string
    if (getLongitude() != null) {
      joiner.add(String.format("%slongitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLongitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `roadAcess` to the URL query string
    if (getRoadAcess() != null) {
      joiner.add(getRoadAcess().toUrlQueryString(prefix + "roadAcess" + suffix));
    }

    // add `matchSideOfStreet` to the URL query string
    if (getMatchSideOfStreet() != null) {
      joiner.add(String.format("%smatchSideOfStreet%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMatchSideOfStreet()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serviceTime` to the URL query string
    if (getServiceTime() != null) {
      joiner.add(String.format("%sserviceTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getServiceTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `useServiceTimeForRecreation` to the URL query string
    if (getUseServiceTimeForRecreation() != null) {
      joiner.add(String.format("%suseServiceTimeForRecreation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUseServiceTimeForRecreation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `openingIntervals` to the URL query string
    if (getOpeningIntervals() != null) {
      for (int i = 0; i < getOpeningIntervals().size(); i++) {
        if (getOpeningIntervals().get(i) != null) {
          joiner.add(getOpeningIntervals().get(i).toUrlQueryString(String.format("%sopeningIntervals%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `vehicleParameters` to the URL query string
    if (getVehicleParameters() != null) {
      joiner.add(getVehicleParameters().toUrlQueryString(prefix + "vehicleParameters" + suffix));
    }

    // add `evParameters` to the URL query string
    if (getEvParameters() != null) {
      joiner.add(getEvParameters().toUrlQueryString(prefix + "evParameters" + suffix));
    }

    return joiner.toString();
  }
}

