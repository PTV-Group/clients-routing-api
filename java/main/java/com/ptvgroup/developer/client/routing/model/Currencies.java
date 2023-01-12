/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
import com.ptvgroup.developer.client.routing.model.ExchangeRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about the currencies that are listed in the toll costs and/or toll sections objects.
 */
@ApiModel(description = "Information about the currencies that are listed in the toll costs and/or toll sections objects.")
@JsonPropertyOrder({
  Currencies.JSON_PROPERTY_DATE,
  Currencies.JSON_PROPERTY_PROVIDER,
  Currencies.JSON_PROPERTY_BASE_CURRENCY,
  Currencies.JSON_PROPERTY_EXCHANGE_RATES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-12T09:51:18.360334Z[Etc/UTC]")
public class Currencies {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_BASE_CURRENCY = "baseCurrency";
  private String baseCurrency;

  public static final String JSON_PROPERTY_EXCHANGE_RATES = "exchangeRates";
  private List<ExchangeRate> exchangeRates = new ArrayList<>();

  public Currencies() { 
  }

  public Currencies date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the exchange rates formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date of the exchange rates formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public Currencies provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * The provider of the exchange rates.
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The provider of the exchange rates.")
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  public Currencies baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code as provided in the request.
   * @return baseCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code as provided in the request.")
  @JsonProperty(JSON_PROPERTY_BASE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBaseCurrency() {
    return baseCurrency;
  }


  @JsonProperty(JSON_PROPERTY_BASE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public Currencies exchangeRates(List<ExchangeRate> exchangeRates) {
    this.exchangeRates = exchangeRates;
    return this;
  }

  public Currencies addExchangeRatesItem(ExchangeRate exchangeRatesItem) {
    this.exchangeRates.add(exchangeRatesItem);
    return this;
  }

   /**
   * The exchange rates that were used to determine the converted prices.
   * @return exchangeRates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The exchange rates that were used to determine the converted prices.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ExchangeRate> getExchangeRates() {
    return exchangeRates;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeRates(List<ExchangeRate> exchangeRates) {
    this.exchangeRates = exchangeRates;
  }


  /**
   * Return true if this Currencies object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currencies currencies = (Currencies) o;
    return Objects.equals(this.date, currencies.date) &&
        Objects.equals(this.provider, currencies.provider) &&
        Objects.equals(this.baseCurrency, currencies.baseCurrency) &&
        Objects.equals(this.exchangeRates, currencies.exchangeRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, provider, baseCurrency, exchangeRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currencies {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    exchangeRates: ").append(toIndentedString(exchangeRates)).append("\n");
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

