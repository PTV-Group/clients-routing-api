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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A time interval specified by two points in time - the beginning and the end of the interval.
 */
@ApiModel(description = "A time interval specified by two points in time - the beginning and the end of the interval.")
@JsonPropertyOrder({
  TimeInterval.JSON_PROPERTY_START,
  TimeInterval.JSON_PROPERTY_END
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T11:43:48.792943Z[Etc/UTC]")
public class TimeInterval {
  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public TimeInterval() { 
  }

  public TimeInterval start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The beginning of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-12-07T00:00Z", required = true, value = "The beginning of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public TimeInterval end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The end of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-12-07T01:00Z", required = true, value = "The end of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  /**
   * Return true if this TimeInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeInterval timeInterval = (TimeInterval) o;
    return Objects.equals(this.start, timeInterval.start) &&
        Objects.equals(this.end, timeInterval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeInterval {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

