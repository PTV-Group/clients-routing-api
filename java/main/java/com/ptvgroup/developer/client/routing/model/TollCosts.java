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
import com.ptvgroup.developer.client.routing.model.TollCostsByCountry;
import com.ptvgroup.developer.client.routing.model.TollCostsConvertedPrice;
import com.ptvgroup.developer.client.routing.model.TollPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The toll prices payable for this route or leg aggregated by currency.
 */
@ApiModel(description = "The toll prices payable for this route or leg aggregated by currency.")
@JsonPropertyOrder({
  TollCosts.JSON_PROPERTY_PRICES,
  TollCosts.JSON_PROPERTY_CONVERTED_PRICE,
  TollCosts.JSON_PROPERTY_COUNTRIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T07:23:48.569348Z[Etc/UTC]")
public class TollCosts {
  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<TollPrice> prices = new ArrayList<>();

  public static final String JSON_PROPERTY_CONVERTED_PRICE = "convertedPrice";
  private TollCostsConvertedPrice convertedPrice;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<TollCostsByCountry> countries = new ArrayList<>();

  public TollCosts() { 
  }

  public TollCosts prices(List<TollPrice> prices) {
    this.prices = prices;
    return this;
  }

  public TollCosts addPricesItem(TollPrice pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route.
   * @return prices
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route.")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TollPrice> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrices(List<TollPrice> prices) {
    this.prices = prices;
  }


  public TollCosts convertedPrice(TollCostsConvertedPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
    return this;
  }

   /**
   * Get convertedPrice
   * @return convertedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TollCostsConvertedPrice getConvertedPrice() {
    return convertedPrice;
  }


  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertedPrice(TollCostsConvertedPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
  }


  public TollCosts countries(List<TollCostsByCountry> countries) {
    this.countries = countries;
    return this;
  }

  public TollCosts addCountriesItem(TollCostsByCountry countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route.
   * @return countries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route.")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TollCostsByCountry> getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountries(List<TollCostsByCountry> countries) {
    this.countries = countries;
  }


  /**
   * Return true if this TollCosts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollCosts tollCosts = (TollCosts) o;
    return Objects.equals(this.prices, tollCosts.prices) &&
        Objects.equals(this.convertedPrice, tollCosts.convertedPrice) &&
        Objects.equals(this.countries, tollCosts.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, convertedPrice, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollCosts {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

