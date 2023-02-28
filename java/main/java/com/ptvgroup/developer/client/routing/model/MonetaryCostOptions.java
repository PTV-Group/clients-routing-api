/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MonetaryCostOptions
 */
@JsonPropertyOrder({
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_KILOMETER,
  MonetaryCostOptions.JSON_PROPERTY_WORKING_COST_PER_HOUR,
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_KWH,
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_FUEL_UNIT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T07:23:48.569348Z[Etc/UTC]")
public class MonetaryCostOptions {
  public static final String JSON_PROPERTY_COST_PER_KILOMETER = "costPerKilometer";
  private JsonNullable<Double> costPerKilometer = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WORKING_COST_PER_HOUR = "workingCostPerHour";
  private JsonNullable<Double> workingCostPerHour = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COST_PER_KWH = "costPerKwh";
  private JsonNullable<Double> costPerKwh = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COST_PER_FUEL_UNIT = "costPerFuelUnit";
  private JsonNullable<Double> costPerFuelUnit = JsonNullable.<Double>undefined();

  public MonetaryCostOptions() { 
  }

  public MonetaryCostOptions costPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = JsonNullable.<Double>of(costPerKilometer);
    return this;
  }

   /**
   * Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
   * minimum: 0
   * @return costPerKilometer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.")
  @JsonIgnore

  public Double getCostPerKilometer() {
        return costPerKilometer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST_PER_KILOMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCostPerKilometer_JsonNullable() {
    return costPerKilometer;
  }
  
  @JsonProperty(JSON_PROPERTY_COST_PER_KILOMETER)
  public void setCostPerKilometer_JsonNullable(JsonNullable<Double> costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }

  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = JsonNullable.<Double>of(costPerKilometer);
  }


  public MonetaryCostOptions workingCostPerHour(Double workingCostPerHour) {
    this.workingCostPerHour = JsonNullable.<Double>of(workingCostPerHour);
    return this;
  }

   /**
   * Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
   * minimum: 0
   * @return workingCostPerHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.")
  @JsonIgnore

  public Double getWorkingCostPerHour() {
        return workingCostPerHour.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORKING_COST_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWorkingCostPerHour_JsonNullable() {
    return workingCostPerHour;
  }
  
  @JsonProperty(JSON_PROPERTY_WORKING_COST_PER_HOUR)
  public void setWorkingCostPerHour_JsonNullable(JsonNullable<Double> workingCostPerHour) {
    this.workingCostPerHour = workingCostPerHour;
  }

  public void setWorkingCostPerHour(Double workingCostPerHour) {
    this.workingCostPerHour = JsonNullable.<Double>of(workingCostPerHour);
  }


  public MonetaryCostOptions costPerKwh(Double costPerKwh) {
    this.costPerKwh = JsonNullable.<Double>of(costPerKwh);
    return this;
  }

   /**
   * Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.
   * minimum: 0
   * @return costPerKwh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.")
  @JsonIgnore

  public Double getCostPerKwh() {
        return costPerKwh.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST_PER_KWH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCostPerKwh_JsonNullable() {
    return costPerKwh;
  }
  
  @JsonProperty(JSON_PROPERTY_COST_PER_KWH)
  public void setCostPerKwh_JsonNullable(JsonNullable<Double> costPerKwh) {
    this.costPerKwh = costPerKwh;
  }

  public void setCostPerKwh(Double costPerKwh) {
    this.costPerKwh = JsonNullable.<Double>of(costPerKwh);
  }


  public MonetaryCostOptions costPerFuelUnit(Double costPerFuelUnit) {
    this.costPerFuelUnit = JsonNullable.<Double>of(costPerFuelUnit);
    return this;
  }

   /**
   * Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.
   * minimum: 0
   * @return costPerFuelUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.")
  @JsonIgnore

  public Double getCostPerFuelUnit() {
        return costPerFuelUnit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST_PER_FUEL_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCostPerFuelUnit_JsonNullable() {
    return costPerFuelUnit;
  }
  
  @JsonProperty(JSON_PROPERTY_COST_PER_FUEL_UNIT)
  public void setCostPerFuelUnit_JsonNullable(JsonNullable<Double> costPerFuelUnit) {
    this.costPerFuelUnit = costPerFuelUnit;
  }

  public void setCostPerFuelUnit(Double costPerFuelUnit) {
    this.costPerFuelUnit = JsonNullable.<Double>of(costPerFuelUnit);
  }


  /**
   * Return true if this MonetaryCostOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryCostOptions monetaryCostOptions = (MonetaryCostOptions) o;
    return equalsNullable(this.costPerKilometer, monetaryCostOptions.costPerKilometer) &&
        equalsNullable(this.workingCostPerHour, monetaryCostOptions.workingCostPerHour) &&
        equalsNullable(this.costPerKwh, monetaryCostOptions.costPerKwh) &&
        equalsNullable(this.costPerFuelUnit, monetaryCostOptions.costPerFuelUnit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(costPerKilometer), hashCodeNullable(workingCostPerHour), hashCodeNullable(costPerKwh), hashCodeNullable(costPerFuelUnit));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryCostOptions {\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    workingCostPerHour: ").append(toIndentedString(workingCostPerHour)).append("\n");
    sb.append("    costPerKwh: ").append(toIndentedString(costPerKwh)).append("\n");
    sb.append("    costPerFuelUnit: ").append(toIndentedString(costPerFuelUnit)).append("\n");
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

