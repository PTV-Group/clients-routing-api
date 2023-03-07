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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ExchangeRate
 */
@JsonPropertyOrder({
  ExchangeRate.JSON_PROPERTY_CURRENCY,
  ExchangeRate.JSON_PROPERTY_RATE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T09:48:51.311424Z[Etc/UTC]")
public class ExchangeRate {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Double rate;

  public ExchangeRate() { 
  }

  public ExchangeRate currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted.")
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


  public ExchangeRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The exchange rate to convert a price from the base currency to this currency.
   * @return rate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The exchange rate to convert a price from the base currency to this currency.")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRate(Double rate) {
    this.rate = rate;
  }


  /**
   * Return true if this ExchangeRate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.currency, exchangeRate.currency) &&
        Objects.equals(this.rate, exchangeRate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

