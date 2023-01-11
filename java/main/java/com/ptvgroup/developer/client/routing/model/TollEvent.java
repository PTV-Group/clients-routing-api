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
 * Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.
 */
@ApiModel(description = "Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.")
@JsonPropertyOrder({
  TollEvent.JSON_PROPERTY_SECTION_INDEX,
  TollEvent.JSON_PROPERTY_DISPLAY_NAME,
  TollEvent.JSON_PROPERTY_ACCESS_TYPE,
  TollEvent.JSON_PROPERTY_RELATED_EVENT_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T11:43:48.792943Z[Etc/UTC]")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events.")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ.")
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


  public TollEvent relatedEventIndex(Integer relatedEventIndex) {
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

}
