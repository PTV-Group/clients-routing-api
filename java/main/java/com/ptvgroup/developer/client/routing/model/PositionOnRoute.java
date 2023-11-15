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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route. This parameter is mutually exclusive with **waypoint**.
 */
@ApiModel(description = "The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route. This parameter is mutually exclusive with **waypoint**.")
@JsonPropertyOrder({
  PositionOnRoute.JSON_PROPERTY_LATITUDE,
  PositionOnRoute.JSON_PROPERTY_LONGITUDE,
  PositionOnRoute.JSON_PROPERTY_NEXT_WAYPOINT_NAME,
  PositionOnRoute.JSON_PROPERTY_HEADING,
  PositionOnRoute.JSON_PROPERTY_HEADING_TOLERANCE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class PositionOnRoute {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_NEXT_WAYPOINT_NAME = "nextWaypointName";
  private String nextWaypointName;

  public static final String JSON_PROPERTY_HEADING = "heading";
  private JsonNullable<Integer> heading = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_HEADING_TOLERANCE = "headingTolerance";
  private Integer headingTolerance = 45;

  public PositionOnRoute() { 
  }

  public PositionOnRoute latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49.480301", required = true, value = "The latitude value in degrees (WGS84/EPSG:4326) from south to north.")
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


  public PositionOnRoute longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.110667", required = true, value = "The longitude value in degrees (WGS84/EPSG:4326) from west to east.")
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


  public PositionOnRoute nextWaypointName(String nextWaypointName) {
    this.nextWaypointName = nextWaypointName;
    return this;
  }

   /**
   * The name of the next waypoint on the route.
   * @return nextWaypointName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the next waypoint on the route.")
  @JsonProperty(JSON_PROPERTY_NEXT_WAYPOINT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNextWaypointName() {
    return nextWaypointName;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_WAYPOINT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextWaypointName(String nextWaypointName) {
    this.nextWaypointName = nextWaypointName;
  }


  public PositionOnRoute heading(Integer heading) {
    this.heading = JsonNullable.<Integer>of(heading);
    return this;
  }

   /**
   * The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival).
   * minimum: 0
   * maximum: 360
   * @return heading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival).")
  @JsonIgnore

  public Integer getHeading() {
        return heading.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getHeading_JsonNullable() {
    return heading;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADING)
  public void setHeading_JsonNullable(JsonNullable<Integer> heading) {
    this.heading = heading;
  }

  public void setHeading(Integer heading) {
    this.heading = JsonNullable.<Integer>of(heading);
  }


  public PositionOnRoute headingTolerance(Integer headingTolerance) {
    this.headingTolerance = headingTolerance;
    return this;
  }

   /**
   * Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.
   * minimum: 0
   * maximum: 180
   * @return headingTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.")
  @JsonProperty(JSON_PROPERTY_HEADING_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeadingTolerance() {
    return headingTolerance;
  }


  @JsonProperty(JSON_PROPERTY_HEADING_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadingTolerance(Integer headingTolerance) {
    this.headingTolerance = headingTolerance;
  }


  /**
   * Return true if this PositionOnRoute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionOnRoute positionOnRoute = (PositionOnRoute) o;
    return Objects.equals(this.latitude, positionOnRoute.latitude) &&
        Objects.equals(this.longitude, positionOnRoute.longitude) &&
        Objects.equals(this.nextWaypointName, positionOnRoute.nextWaypointName) &&
        equalsNullable(this.heading, positionOnRoute.heading) &&
        Objects.equals(this.headingTolerance, positionOnRoute.headingTolerance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, nextWaypointName, hashCodeNullable(heading), headingTolerance);
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
    sb.append("class PositionOnRoute {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    nextWaypointName: ").append(toIndentedString(nextWaypointName)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    headingTolerance: ").append(toIndentedString(headingTolerance)).append("\n");
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
