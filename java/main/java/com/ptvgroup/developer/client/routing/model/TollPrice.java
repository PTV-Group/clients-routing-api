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
 * The toll price payable in this country.
 */
@ApiModel(description = "The toll price payable in this country.")
@JsonPropertyOrder({
  TollPrice.JSON_PROPERTY_PRICE,
  TollPrice.JSON_PROPERTY_CURRENCY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T08:11:59.671519Z[Etc/UTC]")
public class TollPrice {
  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public TollPrice() { 
  }

  public TollPrice price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The toll price in the specified currency.
   * minimum: 0
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12.91", required = true, value = "The toll price in the specified currency.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public TollPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EUR", required = true, value = "The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).")
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


  /**
   * Return true if this TollPrice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollPrice tollPrice = (TollPrice) o;
    return Objects.equals(this.price, tollPrice.price) &&
        Objects.equals(this.currency, tollPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollPrice {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

