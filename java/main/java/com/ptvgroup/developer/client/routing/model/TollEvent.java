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
import com.ptvgroup.developer.client.routing.model.AccessType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.
 */
@JsonPropertyOrder({
  TollEvent.JSON_PROPERTY_SECTION_INDEX,
  TollEvent.JSON_PROPERTY_DISPLAY_NAME,
  TollEvent.JSON_PROPERTY_ACCESS_TYPE,
  TollEvent.JSON_PROPERTY_RELATED_EVENT_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-12T07:36:30.278221337Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TollEvent {
  public static final String JSON_PROPERTY_SECTION_INDEX = "sectionIndex";
  private Integer sectionIndex;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public TollEvent() { 
  }

  public TollEvent sectionIndex(Integer sectionIndex) {
    this.sectionIndex = sectionIndex;
    return this;
  }

  /**
   * The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events.
   * minimum: 0
   * @return sectionIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSectionIndex() {
    return sectionIndex;
  }


  @JsonProperty(JSON_PROPERTY_SECTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectionIndex(Integer sectionIndex) {
    this.sectionIndex = sectionIndex;
  }


  public TollEvent displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ.
   * @return displayName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TollEvent accessType(AccessType accessType) {
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


  public TollEvent relatedEventIndex(Integer relatedEventIndex) {
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


  /**
   * Return true if this TollEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollEvent tollEvent = (TollEvent) o;
    return Objects.equals(this.sectionIndex, tollEvent.sectionIndex) &&
        Objects.equals(this.displayName, tollEvent.displayName) &&
        Objects.equals(this.accessType, tollEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, tollEvent.relatedEventIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionIndex, displayName, accessType, relatedEventIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollEvent {\n");
    sb.append("    sectionIndex: ").append(toIndentedString(sectionIndex)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    relatedEventIndex: ").append(toIndentedString(relatedEventIndex)).append("\n");
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

    // add `sectionIndex` to the URL query string
    if (getSectionIndex() != null) {
      joiner.add(String.format("%ssectionIndex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSectionIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `displayName` to the URL query string
    if (getDisplayName() != null) {
      joiner.add(String.format("%sdisplayName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisplayName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accessType` to the URL query string
    if (getAccessType() != null) {
      joiner.add(String.format("%saccessType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccessType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `relatedEventIndex` to the URL query string
    if (getRelatedEventIndex() != null) {
      joiner.add(String.format("%srelatedEventIndex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRelatedEventIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

