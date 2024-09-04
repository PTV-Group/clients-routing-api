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
import com.ptvgroup.developer.client.routing.model.AccessType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when the route passes roads which are prohibited except for delivery vehicles such as factory premises or pedestrian zones.  Requires _DELIVERY_ONLY_EVENTS_ to be requested.
 */
@JsonPropertyOrder({
  DeliveryOnlyEvent.JSON_PROPERTY_ACCESS_TYPE,
  DeliveryOnlyEvent.JSON_PROPERTY_RELATED_EVENT_INDEX,
  DeliveryOnlyEvent.JSON_PROPERTY_POLYLINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T09:38:59.391603257Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryOnlyEvent {
  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public DeliveryOnlyEvent() { 
  }

  public DeliveryOnlyEvent accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AccessType getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


  public DeliveryOnlyEvent relatedEventIndex(Integer relatedEventIndex) {
    this.relatedEventIndex = relatedEventIndex;
    return this;
  }

  /**
   * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
   * minimum: 0
   * @return relatedEventIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRelatedEventIndex() {
    return relatedEventIndex;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedEventIndex(Integer relatedEventIndex) {
    this.relatedEventIndex = relatedEventIndex;
  }


  public DeliveryOnlyEvent polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * The polyline of the delivery-only event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _DELIVERY_ONLY_EVENTS_POLYLINE_ to be requested.
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


  /**
   * Return true if this DeliveryOnlyEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryOnlyEvent deliveryOnlyEvent = (DeliveryOnlyEvent) o;
    return Objects.equals(this.accessType, deliveryOnlyEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, deliveryOnlyEvent.relatedEventIndex) &&
        Objects.equals(this.polyline, deliveryOnlyEvent.polyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, relatedEventIndex, polyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryOnlyEvent {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    relatedEventIndex: ").append(toIndentedString(relatedEventIndex)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
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

    // add `accessType` to the URL query string
    if (getAccessType() != null) {
      joiner.add(String.format("%saccessType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccessType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `relatedEventIndex` to the URL query string
    if (getRelatedEventIndex() != null) {
      joiner.add(String.format("%srelatedEventIndex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRelatedEventIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `polyline` to the URL query string
    if (getPolyline() != null) {
      joiner.add(String.format("%spolyline%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolyline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

