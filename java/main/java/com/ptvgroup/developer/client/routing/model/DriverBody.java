/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
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
import com.ptvgroup.developer.client.routing.model.WorkLogbook;
import com.ptvgroup.developer.client.routing.model.WorkingHoursPreset;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * DriverBody
 */
@JsonPropertyOrder({
  DriverBody.JSON_PROPERTY_WORKING_HOURS_PRESET,
  DriverBody.JSON_PROPERTY_WORK_LOGBOOK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T09:57:52.401871Z[Etc/UTC]")
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

    // add `workingHoursPreset` to the URL query string
    if (getWorkingHoursPreset() != null) {
      joiner.add(String.format("%sworkingHoursPreset%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWorkingHoursPreset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `workLogbook` to the URL query string
    if (getWorkLogbook() != null) {
      joiner.add(getWorkLogbook().toUrlQueryString(prefix + "workLogbook" + suffix));
    }

    return joiner.toString();
  }
}

