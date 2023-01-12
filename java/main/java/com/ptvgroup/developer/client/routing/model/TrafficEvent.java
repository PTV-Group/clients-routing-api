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
import com.ptvgroup.developer.client.routing.model.AccessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.
 */
@ApiModel(description = "Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.")
@JsonPropertyOrder({
  TrafficEvent.JSON_PROPERTY_DELAY,
  TrafficEvent.JSON_PROPERTY_DESCRIPTION,
  TrafficEvent.JSON_PROPERTY_LANGUAGE,
  TrafficEvent.JSON_PROPERTY_ACCESS_TYPE,
  TrafficEvent.JSON_PROPERTY_RELATED_EVENT_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-12T09:51:18.360334Z[Etc/UTC]")
public class TrafficEvent {
  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public TrafficEvent() { 
  }

  public TrafficEvent delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * The delay due to this incident [s].
   * @return delay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The delay due to this incident [s].")
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelay(Integer delay) {
    this.delay = delay;
  }


  public TrafficEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the incident in the language specified by the parameter **options[language]**. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the incident in the language specified by the parameter **options[language]**. ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TrafficEvent language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the description, if the given language is not supported for this incident. Not present otherwise.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language of the description, if the given language is not supported for this incident. Not present otherwise.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public TrafficEvent accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public TrafficEvent relatedEventIndex(Integer relatedEventIndex) {
    this.relatedEventIndex = relatedEventIndex;
    return this;
  }

   /**
   * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
   * minimum: 0
   * @return relatedEventIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.")
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
   * Return true if this TrafficEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficEvent trafficEvent = (TrafficEvent) o;
    return Objects.equals(this.delay, trafficEvent.delay) &&
        Objects.equals(this.description, trafficEvent.description) &&
        Objects.equals(this.language, trafficEvent.language) &&
        Objects.equals(this.accessType, trafficEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, trafficEvent.relatedEventIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, description, language, accessType, relatedEventIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficEvent {\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

}

