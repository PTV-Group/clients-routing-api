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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ViolatedVehicleProperty
 */
@JsonPropertyOrder({
  ViolatedVehicleProperty.JSON_PROPERTY_PROPERTY,
  ViolatedVehicleProperty.JSON_PROPERTY_LIMIT,
  ViolatedVehicleProperty.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class ViolatedVehicleProperty {
  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ViolatedVehicleProperty() { 
  }

  public ViolatedVehicleProperty property(String property) {
    this.property = property;
    return this;
  }

   /**
   * The name of the violated vehicle property.  The following values represent a vehicle property which is greater than the given **limit**: \&quot;WEIGHT\&quot;, \&quot;HEIGHT\&quot;, \&quot;LENGTH\&quot;, \&quot;AXLE_WEIGHT\&quot;, \&quot;WIDTH\&quot;, \&quot;KPRA_LENGTH\&quot;, \&quot;NUMBER_OF_AXLES\&quot;, \&quot;TOTAL_PERMITTED_WEIGHT\&quot;.  The following values represent a vehicle property for which **value** contains additional information: \&quot;LOW_EMISSION_ZONE\&quot;, \&quot;TRUCK_ROUTE\&quot;, \&quot;HAZARDOUS_MATERIALS\&quot;, \&quot;TUNNEL_RESTRICTION\&quot;, \&quot;TRAILER\&quot;.  This list can be extended at any time, clients should handle unknown values properly.  See [here](./concepts/violations) for more information.
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the violated vehicle property.  The following values represent a vehicle property which is greater than the given **limit**: \"WEIGHT\", \"HEIGHT\", \"LENGTH\", \"AXLE_WEIGHT\", \"WIDTH\", \"KPRA_LENGTH\", \"NUMBER_OF_AXLES\", \"TOTAL_PERMITTED_WEIGHT\".  The following values represent a vehicle property for which **value** contains additional information: \"LOW_EMISSION_ZONE\", \"TRUCK_ROUTE\", \"HAZARDOUS_MATERIALS\", \"TUNNEL_RESTRICTION\", \"TRAILER\".  This list can be extended at any time, clients should handle unknown values properly.  See [here](./concepts/violations) for more information.")
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(String property) {
    this.property = property;
  }


  public ViolatedVehicleProperty limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * If the **property** represents a vehicle dimension such as _WEIGHT_ or _HEIGHT_, this value contains the limit which was exceeded by the vehicle.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the **property** represents a vehicle dimension such as _WEIGHT_ or _HEIGHT_, this value contains the limit which was exceeded by the vehicle.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ViolatedVehicleProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * If the **property** is:  * _LOW_EMISSION_ZONE_, this value contains the name of the low-emission zone, see the corresponding low-emission zone event for details on what is required to enter this zone, * _TRUCK_ROUTE_, this value contains the name of the truck route prohibited for the selected vehicle, * _HAZARDOUS_MATERIALS_, this value contains a comma-separated list of the prohibited hazardous materials. * _TUNNEL_RESTRICTION_, this value represents the allowed tunnel restriction code. * _TRAILER_, this value represents that a trailer is not allowed.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the **property** is:  * _LOW_EMISSION_ZONE_, this value contains the name of the low-emission zone, see the corresponding low-emission zone event for details on what is required to enter this zone, * _TRUCK_ROUTE_, this value contains the name of the truck route prohibited for the selected vehicle, * _HAZARDOUS_MATERIALS_, this value contains a comma-separated list of the prohibited hazardous materials. * _TUNNEL_RESTRICTION_, this value represents the allowed tunnel restriction code. * _TRAILER_, this value represents that a trailer is not allowed.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this ViolatedVehicleProperty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolatedVehicleProperty violatedVehicleProperty = (ViolatedVehicleProperty) o;
    return Objects.equals(this.property, violatedVehicleProperty.property) &&
        Objects.equals(this.limit, violatedVehicleProperty.limit) &&
        Objects.equals(this.value, violatedVehicleProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, limit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolatedVehicleProperty {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
