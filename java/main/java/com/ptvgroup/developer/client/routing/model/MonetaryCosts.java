/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.20
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
 * Provides an overview of the costs of the route.   Requires the result _MONETARY_COSTS_ to be requested.
 */
@ApiModel(description = "Provides an overview of the costs of the route.   Requires the result _MONETARY_COSTS_ to be requested.")
@JsonPropertyOrder({
  MonetaryCosts.JSON_PROPERTY_CURRENCY,
  MonetaryCosts.JSON_PROPERTY_TOTAL_COST,
  MonetaryCosts.JSON_PROPERTY_DISTANCE_COST,
  MonetaryCosts.JSON_PROPERTY_WORKING_TIME_COST,
  MonetaryCosts.JSON_PROPERTY_ENERGY_COST,
  MonetaryCosts.JSON_PROPERTY_TOLL_COST
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T08:11:59.671519Z[Etc/UTC]")
public class MonetaryCosts {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_TOTAL_COST = "totalCost";
  private Double totalCost;

  public static final String JSON_PROPERTY_DISTANCE_COST = "distanceCost";
  private Double distanceCost;

  public static final String JSON_PROPERTY_WORKING_TIME_COST = "workingTimeCost";
  private Double workingTimeCost;

  public static final String JSON_PROPERTY_ENERGY_COST = "energyCost";
  private Double energyCost;

  public static final String JSON_PROPERTY_TOLL_COST = "tollCost";
  private Double tollCost;

  public MonetaryCosts() { 
  }

  public MonetaryCosts currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public MonetaryCosts totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * The total monetary cost of the route.
   * minimum: 0
   * @return totalCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total monetary cost of the route.")
  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTotalCost() {
    return totalCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }


  public MonetaryCosts distanceCost(Double distanceCost) {
    this.distanceCost = distanceCost;
    return this;
  }

   /**
   * The distance cost based on the **monetaryCostOptions[costPerKilometer]** and the driving distance.
   * minimum: 0
   * @return distanceCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The distance cost based on the **monetaryCostOptions[costPerKilometer]** and the driving distance.")
  @JsonProperty(JSON_PROPERTY_DISTANCE_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDistanceCost() {
    return distanceCost;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistanceCost(Double distanceCost) {
    this.distanceCost = distanceCost;
  }


  public MonetaryCosts workingTimeCost(Double workingTimeCost) {
    this.workingTimeCost = workingTimeCost;
    return this;
  }

   /**
   * The working time cost based on **monetaryCostOptions[costPerWorkingHour]** and the driving time. Break, service and rest times are not considered.
   * minimum: 0
   * @return workingTimeCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The working time cost based on **monetaryCostOptions[costPerWorkingHour]** and the driving time. Break, service and rest times are not considered.")
  @JsonProperty(JSON_PROPERTY_WORKING_TIME_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getWorkingTimeCost() {
    return workingTimeCost;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_TIME_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkingTimeCost(Double workingTimeCost) {
    this.workingTimeCost = workingTimeCost;
  }


  public MonetaryCosts energyCost(Double energyCost) {
    this.energyCost = energyCost;
    return this;
  }

   /**
   * The energy cost based on the vehicle&#39;s consumption and the corresponding cost parameters.
   * minimum: 0
   * @return energyCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The energy cost based on the vehicle's consumption and the corresponding cost parameters.")
  @JsonProperty(JSON_PROPERTY_ENERGY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getEnergyCost() {
    return energyCost;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnergyCost(Double energyCost) {
    this.energyCost = energyCost;
  }


  public MonetaryCosts tollCost(Double tollCost) {
    this.tollCost = tollCost;
    return this;
  }

   /**
   * The toll cost based on the route and the vehicle.   Toll prices do not include VAT. 
   * minimum: 0
   * @return tollCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The toll cost based on the route and the vehicle.   Toll prices do not include VAT. ")
  @JsonProperty(JSON_PROPERTY_TOLL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTollCost() {
    return tollCost;
  }


  @JsonProperty(JSON_PROPERTY_TOLL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTollCost(Double tollCost) {
    this.tollCost = tollCost;
  }


  /**
   * Return true if this MonetaryCosts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryCosts monetaryCosts = (MonetaryCosts) o;
    return Objects.equals(this.currency, monetaryCosts.currency) &&
        Objects.equals(this.totalCost, monetaryCosts.totalCost) &&
        Objects.equals(this.distanceCost, monetaryCosts.distanceCost) &&
        Objects.equals(this.workingTimeCost, monetaryCosts.workingTimeCost) &&
        Objects.equals(this.energyCost, monetaryCosts.energyCost) &&
        Objects.equals(this.tollCost, monetaryCosts.tollCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, totalCost, distanceCost, workingTimeCost, energyCost, tollCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryCosts {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    distanceCost: ").append(toIndentedString(distanceCost)).append("\n");
    sb.append("    workingTimeCost: ").append(toIndentedString(workingTimeCost)).append("\n");
    sb.append("    energyCost: ").append(toIndentedString(energyCost)).append("\n");
    sb.append("    tollCost: ").append(toIndentedString(tollCost)).append("\n");
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

