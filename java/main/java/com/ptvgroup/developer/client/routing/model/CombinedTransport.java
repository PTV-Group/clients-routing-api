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
import com.ptvgroup.developer.client.routing.model.CombinedTransportLocation;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Influences the route course, so that the route uses a ferry or railway connection between the given locations. Both locations will be matched to the nearest ports looking for a direct connection. If no connection can be found, this waypoint will be ignored, and the warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED_ will be returned. If more than one connection is found, the best one will be used, and the alternative connections will be returned in the response in a warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS_. This waypoint will not appear as a waypoint event in the response and may not be used as start or destination. We will refer to this type of waypoint as a _combined-transport waypoint_.
 */
@JsonPropertyOrder({
  CombinedTransport.JSON_PROPERTY_START,
  CombinedTransport.JSON_PROPERTY_DESTINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T09:38:59.391603257Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CombinedTransport {
  public static final String JSON_PROPERTY_START = "start";
  private CombinedTransportLocation start;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private CombinedTransportLocation destination;

  public CombinedTransport() { 
  }

  public CombinedTransport start(CombinedTransportLocation start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CombinedTransportLocation getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(CombinedTransportLocation start) {
    this.start = start;
  }


  public CombinedTransport destination(CombinedTransportLocation destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CombinedTransportLocation getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(CombinedTransportLocation destination) {
    this.destination = destination;
  }


  /**
   * Return true if this CombinedTransport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CombinedTransport combinedTransport = (CombinedTransport) o;
    return Objects.equals(this.start, combinedTransport.start) &&
        Objects.equals(this.destination, combinedTransport.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedTransport {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(getStart().toUrlQueryString(prefix + "start" + suffix));
    }

    // add `destination` to the URL query string
    if (getDestination() != null) {
      joiner.add(getDestination().toUrlQueryString(prefix + "destination" + suffix));
    }

    return joiner.toString();
  }
}

