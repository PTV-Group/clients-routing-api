/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.15
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
import com.ptvgroup.developer.client.routing.model.BorderEvent;
import com.ptvgroup.developer.client.routing.model.CombinedTransportEvent;
import com.ptvgroup.developer.client.routing.model.ManeuverEvent;
import com.ptvgroup.developer.client.routing.model.ScheduleEvent;
import com.ptvgroup.developer.client.routing.model.TollEvent;
import com.ptvgroup.developer.client.routing.model.TrafficEvent;
import com.ptvgroup.developer.client.routing.model.UTCOffsetChangeEvent;
import com.ptvgroup.developer.client.routing.model.ViolationEvent;
import com.ptvgroup.developer.client.routing.model.WaypointEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Event
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_LATITUDE,
  Event.JSON_PROPERTY_LONGITUDE,
  Event.JSON_PROPERTY_STARTS_AT,
  Event.JSON_PROPERTY_DISTANCE_FROM_START,
  Event.JSON_PROPERTY_TRAVEL_TIME_FROM_START,
  Event.JSON_PROPERTY_COUNTRY_CODE,
  Event.JSON_PROPERTY_UTC_OFFSET,
  Event.JSON_PROPERTY_TOLL,
  Event.JSON_PROPERTY_MANEUVER,
  Event.JSON_PROPERTY_BORDER,
  Event.JSON_PROPERTY_VIOLATION,
  Event.JSON_PROPERTY_WAYPOINT,
  Event.JSON_PROPERTY_UTC_OFFSET_CHANGE,
  Event.JSON_PROPERTY_SCHEDULE,
  Event.JSON_PROPERTY_COMBINED_TRANSPORT,
  Event.JSON_PROPERTY_TRAFFIC
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T08:42:46.399615Z[Etc/UTC]")
public class Event {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_STARTS_AT = "startsAt";
  private OffsetDateTime startsAt;

  public static final String JSON_PROPERTY_DISTANCE_FROM_START = "distanceFromStart";
  private Integer distanceFromStart;

  public static final String JSON_PROPERTY_TRAVEL_TIME_FROM_START = "travelTimeFromStart";
  private Integer travelTimeFromStart;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_UTC_OFFSET = "utcOffset";
  private Integer utcOffset;

  public static final String JSON_PROPERTY_TOLL = "toll";
  private TollEvent toll;

  public static final String JSON_PROPERTY_MANEUVER = "maneuver";
  private ManeuverEvent maneuver;

  public static final String JSON_PROPERTY_BORDER = "border";
  private BorderEvent border;

  public static final String JSON_PROPERTY_VIOLATION = "violation";
  private ViolationEvent violation;

  public static final String JSON_PROPERTY_WAYPOINT = "waypoint";
  private WaypointEvent waypoint;

  public static final String JSON_PROPERTY_UTC_OFFSET_CHANGE = "utcOffsetChange";
  private UTCOffsetChangeEvent utcOffsetChange;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private ScheduleEvent schedule;

  public static final String JSON_PROPERTY_COMBINED_TRANSPORT = "combinedTransport";
  private CombinedTransportEvent combinedTransport;

  public static final String JSON_PROPERTY_TRAFFIC = "traffic";
  private TrafficEvent traffic;

  public Event() { 
  }

  public Event latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "49.254878", required = true, value = "The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.")
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


  public Event longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8.544585", required = true, value = "The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.")
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


  public Event startsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
   * @return startsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-06T06:00Z", value = "The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.")
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }


  public Event distanceFromStart(Integer distanceFromStart) {
    this.distanceFromStart = distanceFromStart;
    return this;
  }

   /**
   * The distance from the start to this event [m].
   * minimum: 0
   * @return distanceFromStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1422", required = true, value = "The distance from the start to this event [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDistanceFromStart() {
    return distanceFromStart;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistanceFromStart(Integer distanceFromStart) {
    this.distanceFromStart = distanceFromStart;
  }


  public Event travelTimeFromStart(Integer travelTimeFromStart) {
    this.travelTimeFromStart = travelTimeFromStart;
    return this;
  }

   /**
   * The travel time from the start to this event [s].
   * minimum: 0
   * @return travelTimeFromStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "56", required = true, value = "The travel time from the start to this event [s].")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTravelTimeFromStart() {
    return travelTimeFromStart;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTravelTimeFromStart(Integer travelTimeFromStart) {
    this.travelTimeFromStart = travelTimeFromStart;
  }


  public Event countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DE", required = true, value = "Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Event utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
   * minimum: -720
   * maximum: 840
   * @return utcOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.")
  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUtcOffset() {
    return utcOffset;
  }


  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }


  public Event toll(TollEvent toll) {
    this.toll = toll;
    return this;
  }

   /**
   * Get toll
   * @return toll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOLL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TollEvent getToll() {
    return toll;
  }


  @JsonProperty(JSON_PROPERTY_TOLL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToll(TollEvent toll) {
    this.toll = toll;
  }


  public Event maneuver(ManeuverEvent maneuver) {
    this.maneuver = maneuver;
    return this;
  }

   /**
   * Get maneuver
   * @return maneuver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANEUVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ManeuverEvent getManeuver() {
    return maneuver;
  }


  @JsonProperty(JSON_PROPERTY_MANEUVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManeuver(ManeuverEvent maneuver) {
    this.maneuver = maneuver;
  }


  public Event border(BorderEvent border) {
    this.border = border;
    return this;
  }

   /**
   * Get border
   * @return border
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BorderEvent getBorder() {
    return border;
  }


  @JsonProperty(JSON_PROPERTY_BORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorder(BorderEvent border) {
    this.border = border;
  }


  public Event violation(ViolationEvent violation) {
    this.violation = violation;
    return this;
  }

   /**
   * Get violation
   * @return violation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIOLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViolationEvent getViolation() {
    return violation;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolation(ViolationEvent violation) {
    this.violation = violation;
  }


  public Event waypoint(WaypointEvent waypoint) {
    this.waypoint = waypoint;
    return this;
  }

   /**
   * Get waypoint
   * @return waypoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WAYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WaypointEvent getWaypoint() {
    return waypoint;
  }


  @JsonProperty(JSON_PROPERTY_WAYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaypoint(WaypointEvent waypoint) {
    this.waypoint = waypoint;
  }


  public Event utcOffsetChange(UTCOffsetChangeEvent utcOffsetChange) {
    this.utcOffsetChange = utcOffsetChange;
    return this;
  }

   /**
   * Get utcOffsetChange
   * @return utcOffsetChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UTC_OFFSET_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UTCOffsetChangeEvent getUtcOffsetChange() {
    return utcOffsetChange;
  }


  @JsonProperty(JSON_PROPERTY_UTC_OFFSET_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtcOffsetChange(UTCOffsetChangeEvent utcOffsetChange) {
    this.utcOffsetChange = utcOffsetChange;
  }


  public Event schedule(ScheduleEvent schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleEvent getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(ScheduleEvent schedule) {
    this.schedule = schedule;
  }


  public Event combinedTransport(CombinedTransportEvent combinedTransport) {
    this.combinedTransport = combinedTransport;
    return this;
  }

   /**
   * Get combinedTransport
   * @return combinedTransport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CombinedTransportEvent getCombinedTransport() {
    return combinedTransport;
  }


  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinedTransport(CombinedTransportEvent combinedTransport) {
    this.combinedTransport = combinedTransport;
  }


  public Event traffic(TrafficEvent traffic) {
    this.traffic = traffic;
    return this;
  }

   /**
   * Get traffic
   * @return traffic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrafficEvent getTraffic() {
    return traffic;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraffic(TrafficEvent traffic) {
    this.traffic = traffic;
  }


  /**
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.latitude, event.latitude) &&
        Objects.equals(this.longitude, event.longitude) &&
        Objects.equals(this.startsAt, event.startsAt) &&
        Objects.equals(this.distanceFromStart, event.distanceFromStart) &&
        Objects.equals(this.travelTimeFromStart, event.travelTimeFromStart) &&
        Objects.equals(this.countryCode, event.countryCode) &&
        Objects.equals(this.utcOffset, event.utcOffset) &&
        Objects.equals(this.toll, event.toll) &&
        Objects.equals(this.maneuver, event.maneuver) &&
        Objects.equals(this.border, event.border) &&
        Objects.equals(this.violation, event.violation) &&
        Objects.equals(this.waypoint, event.waypoint) &&
        Objects.equals(this.utcOffsetChange, event.utcOffsetChange) &&
        Objects.equals(this.schedule, event.schedule) &&
        Objects.equals(this.combinedTransport, event.combinedTransport) &&
        Objects.equals(this.traffic, event.traffic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, startsAt, distanceFromStart, travelTimeFromStart, countryCode, utcOffset, toll, maneuver, border, violation, waypoint, utcOffsetChange, schedule, combinedTransport, traffic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    distanceFromStart: ").append(toIndentedString(distanceFromStart)).append("\n");
    sb.append("    travelTimeFromStart: ").append(toIndentedString(travelTimeFromStart)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    toll: ").append(toIndentedString(toll)).append("\n");
    sb.append("    maneuver: ").append(toIndentedString(maneuver)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    violation: ").append(toIndentedString(violation)).append("\n");
    sb.append("    waypoint: ").append(toIndentedString(waypoint)).append("\n");
    sb.append("    utcOffsetChange: ").append(toIndentedString(utcOffsetChange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    combinedTransport: ").append(toIndentedString(combinedTransport)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
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

