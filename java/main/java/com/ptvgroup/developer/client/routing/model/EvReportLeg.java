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
import com.ptvgroup.developer.client.routing.model.WeatherResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The consumption summary for the specified vehicle model including the weather used for consumption calculation. Only present if both _EV_REPORT_ and _LEGS_ is requested. 
 */
@ApiModel(description = "The consumption summary for the specified vehicle model including the weather used for consumption calculation. Only present if both _EV_REPORT_ and _LEGS_ is requested. ")
@JsonPropertyOrder({
  EvReportLeg.JSON_PROPERTY_ELECTRICITY_CONSUMPTION,
  EvReportLeg.JSON_PROPERTY_BATTERY_STATE_OF_CHARGE,
  EvReportLeg.JSON_PROPERTY_WEATHER_AT_START,
  EvReportLeg.JSON_PROPERTY_WEATHER_AT_END
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class EvReportLeg {
  public static final String JSON_PROPERTY_ELECTRICITY_CONSUMPTION = "electricityConsumption";
  private Double electricityConsumption;

  public static final String JSON_PROPERTY_BATTERY_STATE_OF_CHARGE = "batteryStateOfCharge";
  private Double batteryStateOfCharge;

  public static final String JSON_PROPERTY_WEATHER_AT_START = "weatherAtStart";
  private WeatherResponse weatherAtStart;

  public static final String JSON_PROPERTY_WEATHER_AT_END = "weatherAtEnd";
  private WeatherResponse weatherAtEnd;

  public EvReportLeg() { 
  }

  public EvReportLeg electricityConsumption(Double electricityConsumption) {
    this.electricityConsumption = electricityConsumption;
    return this;
  }

   /**
   * The electricity consumption since the start of the leg [kWh].
   * @return electricityConsumption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The electricity consumption since the start of the leg [kWh].")
  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getElectricityConsumption() {
    return electricityConsumption;
  }


  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElectricityConsumption(Double electricityConsumption) {
    this.electricityConsumption = electricityConsumption;
  }


  public EvReportLeg batteryStateOfCharge(Double batteryStateOfCharge) {
    this.batteryStateOfCharge = batteryStateOfCharge;
    return this;
  }

   /**
   * The remaining battery capacity at the end of the leg [%].
   * maximum: 100
   * @return batteryStateOfCharge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58", required = true, value = "The remaining battery capacity at the end of the leg [%].")
  @JsonProperty(JSON_PROPERTY_BATTERY_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getBatteryStateOfCharge() {
    return batteryStateOfCharge;
  }


  @JsonProperty(JSON_PROPERTY_BATTERY_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBatteryStateOfCharge(Double batteryStateOfCharge) {
    this.batteryStateOfCharge = batteryStateOfCharge;
  }


  public EvReportLeg weatherAtStart(WeatherResponse weatherAtStart) {
    this.weatherAtStart = weatherAtStart;
    return this;
  }

   /**
   * Get weatherAtStart
   * @return weatherAtStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WEATHER_AT_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WeatherResponse getWeatherAtStart() {
    return weatherAtStart;
  }


  @JsonProperty(JSON_PROPERTY_WEATHER_AT_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeatherAtStart(WeatherResponse weatherAtStart) {
    this.weatherAtStart = weatherAtStart;
  }


  public EvReportLeg weatherAtEnd(WeatherResponse weatherAtEnd) {
    this.weatherAtEnd = weatherAtEnd;
    return this;
  }

   /**
   * Get weatherAtEnd
   * @return weatherAtEnd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WEATHER_AT_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WeatherResponse getWeatherAtEnd() {
    return weatherAtEnd;
  }


  @JsonProperty(JSON_PROPERTY_WEATHER_AT_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeatherAtEnd(WeatherResponse weatherAtEnd) {
    this.weatherAtEnd = weatherAtEnd;
  }


  /**
   * Return true if this EvReportLeg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvReportLeg evReportLeg = (EvReportLeg) o;
    return Objects.equals(this.electricityConsumption, evReportLeg.electricityConsumption) &&
        Objects.equals(this.batteryStateOfCharge, evReportLeg.batteryStateOfCharge) &&
        Objects.equals(this.weatherAtStart, evReportLeg.weatherAtStart) &&
        Objects.equals(this.weatherAtEnd, evReportLeg.weatherAtEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electricityConsumption, batteryStateOfCharge, weatherAtStart, weatherAtEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvReportLeg {\n");
    sb.append("    electricityConsumption: ").append(toIndentedString(electricityConsumption)).append("\n");
    sb.append("    batteryStateOfCharge: ").append(toIndentedString(batteryStateOfCharge)).append("\n");
    sb.append("    weatherAtStart: ").append(toIndentedString(weatherAtStart)).append("\n");
    sb.append("    weatherAtEnd: ").append(toIndentedString(weatherAtEnd)).append("\n");
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
