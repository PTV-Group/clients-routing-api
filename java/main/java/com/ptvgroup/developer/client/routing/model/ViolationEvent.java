/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
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
import com.ptvgroup.developer.client.routing.model.ScheduleViolationType;
import com.ptvgroup.developer.client.routing.model.ViolatedVehicleProperty;
import com.ptvgroup.developer.client.routing.model.ViolationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when the route passes a road which is prohibited for the given vehicle but passed nevertheless as there is no other valid route or when schedule restrictions are violated. Requires _VIOLATION_EVENTS_ to be requested. See [here](./concepts/violations) for more information.
 */
@ApiModel(description = "Issued when the route passes a road which is prohibited for the given vehicle but passed nevertheless as there is no other valid route or when schedule restrictions are violated. Requires _VIOLATION_EVENTS_ to be requested. See [here](./concepts/violations) for more information.")
@JsonPropertyOrder({
  ViolationEvent.JSON_PROPERTY_TYPE,
  ViolationEvent.JSON_PROPERTY_SCHEDULE_VIOLATION_TYPES,
  ViolationEvent.JSON_PROPERTY_VIOLATED_VEHICLE_PROPERTIES,
  ViolationEvent.JSON_PROPERTY_TEMPORARY,
  ViolationEvent.JSON_PROPERTY_ACCESS_TYPE,
  ViolationEvent.JSON_PROPERTY_RELATED_EVENT_INDEX,
  ViolationEvent.JSON_PROPERTY_POLYLINE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class ViolationEvent {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ViolationType type;

  public static final String JSON_PROPERTY_SCHEDULE_VIOLATION_TYPES = "scheduleViolationTypes";
  private List<ScheduleViolationType> scheduleViolationTypes = null;

  public static final String JSON_PROPERTY_VIOLATED_VEHICLE_PROPERTIES = "violatedVehicleProperties";
  private List<ViolatedVehicleProperty> violatedVehicleProperties = null;

  public static final String JSON_PROPERTY_TEMPORARY = "temporary";
  private Boolean temporary;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public ViolationEvent() { 
  }

  public ViolationEvent type(ViolationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ViolationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ViolationType type) {
    this.type = type;
  }


  public ViolationEvent scheduleViolationTypes(List<ScheduleViolationType> scheduleViolationTypes) {
    this.scheduleViolationTypes = scheduleViolationTypes;
    return this;
  }

  public ViolationEvent addScheduleViolationTypesItem(ScheduleViolationType scheduleViolationTypesItem) {
    if (this.scheduleViolationTypes == null) {
      this.scheduleViolationTypes = new ArrayList<>();
    }
    this.scheduleViolationTypes.add(scheduleViolationTypesItem);
    return this;
  }

   /**
   * Contains the list of violated schedule restrictions at this event. Only present if **type&#x3D;SCHEDULE**. 
   * @return scheduleViolationTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the list of violated schedule restrictions at this event. Only present if **type=SCHEDULE**. ")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_VIOLATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ScheduleViolationType> getScheduleViolationTypes() {
    return scheduleViolationTypes;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_VIOLATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleViolationTypes(List<ScheduleViolationType> scheduleViolationTypes) {
    this.scheduleViolationTypes = scheduleViolationTypes;
  }


  public ViolationEvent violatedVehicleProperties(List<ViolatedVehicleProperty> violatedVehicleProperties) {
    this.violatedVehicleProperties = violatedVehicleProperties;
    return this;
  }

  public ViolationEvent addViolatedVehiclePropertiesItem(ViolatedVehicleProperty violatedVehiclePropertiesItem) {
    if (this.violatedVehicleProperties == null) {
      this.violatedVehicleProperties = new ArrayList<>();
    }
    this.violatedVehicleProperties.add(violatedVehiclePropertiesItem);
    return this;
  }

   /**
   * Contains the list of violated vehicle properties at this event. Only present if **type&#x3D;VEHICLE_PROPERTY**. 
   * @return violatedVehicleProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the list of violated vehicle properties at this event. Only present if **type=VEHICLE_PROPERTY**. ")
  @JsonProperty(JSON_PROPERTY_VIOLATED_VEHICLE_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ViolatedVehicleProperty> getViolatedVehicleProperties() {
    return violatedVehicleProperties;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATED_VEHICLE_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolatedVehicleProperties(List<ViolatedVehicleProperty> violatedVehicleProperties) {
    this.violatedVehicleProperties = violatedVehicleProperties;
  }


  public ViolationEvent temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * States whether the cause of the violation is only temporary, e.g. a road construction site. In such cases  see the corresponding traffic event for more information. 
   * @return temporary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "States whether the cause of the violation is only temporary, e.g. a road construction site. In such cases  see the corresponding traffic event for more information. ")
  @JsonProperty(JSON_PROPERTY_TEMPORARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTemporary() {
    return temporary;
  }


  @JsonProperty(JSON_PROPERTY_TEMPORARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }


  public ViolationEvent accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessType getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


  public ViolationEvent relatedEventIndex(Integer relatedEventIndex) {
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


  public ViolationEvent polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * The polyline of the violation in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _VIOLATION_EVENTS_POLYLINE_ to be requested.
   * @return polyline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The polyline of the violation in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _VIOLATION_EVENTS_POLYLINE_ to be requested.")
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
   * Return true if this ViolationEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolationEvent violationEvent = (ViolationEvent) o;
    return Objects.equals(this.type, violationEvent.type) &&
        Objects.equals(this.scheduleViolationTypes, violationEvent.scheduleViolationTypes) &&
        Objects.equals(this.violatedVehicleProperties, violationEvent.violatedVehicleProperties) &&
        Objects.equals(this.temporary, violationEvent.temporary) &&
        Objects.equals(this.accessType, violationEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, violationEvent.relatedEventIndex) &&
        Objects.equals(this.polyline, violationEvent.polyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scheduleViolationTypes, violatedVehicleProperties, temporary, accessType, relatedEventIndex, polyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scheduleViolationTypes: ").append(toIndentedString(scheduleViolationTypes)).append("\n");
    sb.append("    violatedVehicleProperties: ").append(toIndentedString(violatedVehicleProperties)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
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

}

