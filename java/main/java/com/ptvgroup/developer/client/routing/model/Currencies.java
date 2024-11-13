/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
import com.ptvgroup.developer.client.routing.model.ExchangeRate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Information about the currencies that are listed in the toll costs and/or toll sections objects.
 */
@JsonPropertyOrder({
  Currencies.JSON_PROPERTY_DATE,
  Currencies.JSON_PROPERTY_PROVIDER,
  Currencies.JSON_PROPERTY_BASE_CURRENCY,
  Currencies.JSON_PROPERTY_EXCHANGE_RATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T09:18:49.935887368Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
    if (this.exchangeRates == null) {
      this.exchangeRates = new ArrayList<>();
    }
    this.exchangeRates.add(exchangeRatesItem);
    return this;
  }

  /**
   * The exchange rates that were used to determine the converted prices.
   * @return exchangeRates
   */
  @javax.annotation.Nonnull
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProvider()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `baseCurrency` to the URL query string
    if (getBaseCurrency() != null) {
      joiner.add(String.format("%sbaseCurrency%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBaseCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `exchangeRates` to the URL query string
    if (getExchangeRates() != null) {
      for (int i = 0; i < getExchangeRates().size(); i++) {
        if (getExchangeRates().get(i) != null) {
          joiner.add(getExchangeRates().get(i).toUrlQueryString(String.format("%sexchangeRates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

