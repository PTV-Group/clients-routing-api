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
import com.ptvgroup.developer.client.routing.model.TollPrice;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * TollCostsByCountry
 */
@JsonPropertyOrder({
  TollCostsByCountry.JSON_PROPERTY_COUNTRY_CODE,
  TollCostsByCountry.JSON_PROPERTY_PRICE,
  TollCostsByCountry.JSON_PROPERTY_CONVERTED_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T09:38:59.391603257Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TollCostsByCountry {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_PRICE = "price";
  private TollPrice price;

  public static final String JSON_PROPERTY_CONVERTED_PRICE = "convertedPrice";
  private TollPrice convertedPrice;

  public TollCostsByCountry() { 
  }

  public TollCostsByCountry countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return countryCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public TollCostsByCountry price(TollPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TollPrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(TollPrice price) {
    this.price = price;
  }


  public TollCostsByCountry convertedPrice(TollPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
    return this;
  }

  /**
   * Get convertedPrice
   * @return convertedPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TollPrice getConvertedPrice() {
    return convertedPrice;
  }


  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertedPrice(TollPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
  }


  /**
   * Return true if this TollCostsByCountry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollCostsByCountry tollCostsByCountry = (TollCostsByCountry) o;
    return Objects.equals(this.countryCode, tollCostsByCountry.countryCode) &&
        Objects.equals(this.price, tollCostsByCountry.price) &&
        Objects.equals(this.convertedPrice, tollCostsByCountry.convertedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, price, convertedPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollCostsByCountry {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
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

    // add `countryCode` to the URL query string
    if (getCountryCode() != null) {
      joiner.add(String.format("%scountryCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountryCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      joiner.add(getPrice().toUrlQueryString(prefix + "price" + suffix));
    }

    // add `convertedPrice` to the URL query string
    if (getConvertedPrice() != null) {
      joiner.add(getConvertedPrice().toUrlQueryString(prefix + "convertedPrice" + suffix));
    }

    return joiner.toString();
  }
}

