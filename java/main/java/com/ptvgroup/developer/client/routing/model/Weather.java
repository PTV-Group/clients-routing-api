/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The weather at a waypoint. It is relevant to the electricity consumption calculation of electric vehicles. The  weather is valid until the end of the route unless it is changed again at a subsequent waypoint. If no weather  is configured at any waypoint, the weather is automatically determined using the [OpenMeteo](https://open-meteo.com)  weather service. This is only available if the time of the route is no more than 14 days in the future. If the routing is outside of this time box and no weather is configured at any waypoint, a temperature of 23°C and no  wind is assumed for minimal impact on the consumption calculation. The parameter **windDirection** must not be null if **windSpeed** is set to anything but 0. 
 */
@JsonPropertyOrder({
  Weather.JSON_PROPERTY_TEMPERATURE,
  Weather.JSON_PROPERTY_WIND_SPEED,
  Weather.JSON_PROPERTY_WIND_DIRECTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T09:38:59.391603257Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Weather {
  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  private JsonNullable<Double> temperature = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WIND_SPEED = "windSpeed";
  private JsonNullable<Integer> windSpeed = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_WIND_DIRECTION = "windDirection";
  private Integer windDirection;

  public Weather() { 
  }

  public Weather temperature(Double temperature) {
    this.temperature = JsonNullable.<Double>of(temperature);
    return this;
  }

  /**
   * The average temperature at a waypoint at 2 meters above ground[°C]. Used to estimate the state of health of the  battery and consumption due to air conditioning.
   * minimum: -50
   * maximum: 70
   * @return temperature
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Double getTemperature() {
        return temperature.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getTemperature_JsonNullable() {
    return temperature;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  public void setTemperature_JsonNullable(JsonNullable<Double> temperature) {
    this.temperature = temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = JsonNullable.<Double>of(temperature);
  }


  public Weather windSpeed(Integer windSpeed) {
    this.windSpeed = JsonNullable.<Integer>of(windSpeed);
    return this;
  }

  /**
   * The average wind speed at a waypoint at 10 meters above ground [km/h].
   * minimum: 0
   * @return windSpeed
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getWindSpeed() {
        return windSpeed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIND_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWindSpeed_JsonNullable() {
    return windSpeed;
  }
  
  @JsonProperty(JSON_PROPERTY_WIND_SPEED)
  public void setWindSpeed_JsonNullable(JsonNullable<Integer> windSpeed) {
    this.windSpeed = windSpeed;
  }

  public void setWindSpeed(Integer windSpeed) {
    this.windSpeed = JsonNullable.<Integer>of(windSpeed);
  }


  public Weather windDirection(Integer windDirection) {
    this.windDirection = windDirection;
    return this;
  }

  /**
   * The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees.
   * @return windDirection
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getWindDirection() {
    return windDirection;
  }


  @JsonProperty(JSON_PROPERTY_WIND_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindDirection(Integer windDirection) {
    this.windDirection = windDirection;
  }


  /**
   * Return true if this Weather object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weather weather = (Weather) o;
    return equalsNullable(this.temperature, weather.temperature) &&
        equalsNullable(this.windSpeed, weather.windSpeed) &&
        Objects.equals(this.windDirection, weather.windDirection);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(temperature), hashCodeNullable(windSpeed), windDirection);
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
    sb.append("class Weather {\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    windDirection: ").append(toIndentedString(windDirection)).append("\n");
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

    // add `temperature` to the URL query string
    if (getTemperature() != null) {
      joiner.add(String.format("%stemperature%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTemperature()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `windSpeed` to the URL query string
    if (getWindSpeed() != null) {
      joiner.add(String.format("%swindSpeed%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWindSpeed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `windDirection` to the URL query string
    if (getWindDirection() != null) {
      joiner.add(String.format("%swindDirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWindDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
