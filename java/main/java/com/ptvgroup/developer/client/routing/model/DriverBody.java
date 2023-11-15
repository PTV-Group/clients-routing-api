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
import com.ptvgroup.developer.client.routing.model.WorkLogbook;
import com.ptvgroup.developer.client.routing.model.WorkingHoursPreset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DriverBody
 */
@JsonPropertyOrder({
  DriverBody.JSON_PROPERTY_WORKING_HOURS_PRESET,
  DriverBody.JSON_PROPERTY_WORK_LOGBOOK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class DriverBody {
  public static final String JSON_PROPERTY_WORKING_HOURS_PRESET = "workingHoursPreset";
  private WorkingHoursPreset workingHoursPreset;

  public static final String JSON_PROPERTY_WORK_LOGBOOK = "workLogbook";
  private WorkLogbook workLogbook;

  public DriverBody() { 
  }

  public DriverBody workingHoursPreset(WorkingHoursPreset workingHoursPreset) {
    this.workingHoursPreset = workingHoursPreset;
    return this;
  }

   /**
   * Get workingHoursPreset
   * @return workingHoursPreset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKING_HOURS_PRESET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkingHoursPreset getWorkingHoursPreset() {
    return workingHoursPreset;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_HOURS_PRESET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkingHoursPreset(WorkingHoursPreset workingHoursPreset) {
    this.workingHoursPreset = workingHoursPreset;
  }


  public DriverBody workLogbook(WorkLogbook workLogbook) {
    this.workLogbook = workLogbook;
    return this;
  }

   /**
   * Get workLogbook
   * @return workLogbook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_LOGBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkLogbook getWorkLogbook() {
    return workLogbook;
  }


  @JsonProperty(JSON_PROPERTY_WORK_LOGBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkLogbook(WorkLogbook workLogbook) {
    this.workLogbook = workLogbook;
  }


  /**
   * Return true if this DriverBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverBody driverBody = (DriverBody) o;
    return Objects.equals(this.workingHoursPreset, driverBody.workingHoursPreset) &&
        Objects.equals(this.workLogbook, driverBody.workLogbook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workingHoursPreset, workLogbook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverBody {\n");
    sb.append("    workingHoursPreset: ").append(toIndentedString(workingHoursPreset)).append("\n");
    sb.append("    workLogbook: ").append(toIndentedString(workLogbook)).append("\n");
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
