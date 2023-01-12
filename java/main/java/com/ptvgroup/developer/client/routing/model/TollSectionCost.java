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
import com.ptvgroup.developer.client.routing.model.PaymentMethod;
import com.ptvgroup.developer.client.routing.model.TollSectionCostConvertedPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TollSectionCost
 */
@JsonPropertyOrder({
  TollSectionCost.JSON_PROPERTY_PRICE,
  TollSectionCost.JSON_PROPERTY_CURRENCY,
  TollSectionCost.JSON_PROPERTY_PAYMENT_METHODS,
  TollSectionCost.JSON_PROPERTY_ETC_SUBSCRIPTIONS,
  TollSectionCost.JSON_PROPERTY_CONVERTED_PRICE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-12T07:57:01.625851Z[Etc/UTC]")
public class TollSectionCost {
  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PAYMENT_METHODS = "paymentMethods";
  private List<PaymentMethod> paymentMethods = null;

  public static final String JSON_PROPERTY_ETC_SUBSCRIPTIONS = "etcSubscriptions";
  private JsonNullable<List<String>> etcSubscriptions = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CONVERTED_PRICE = "convertedPrice";
  private TollSectionCostConvertedPrice convertedPrice;

  public TollSectionCost() { 
  }

  public TollSectionCost price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The price in the specified currency.
   * minimum: 0
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The price in the specified currency.")
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


  public TollSectionCost currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nonnull
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


  public TollSectionCost paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public TollSectionCost addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment methods for toll costs.    * `ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION` - Electronic toll collection system with a subscription required.    * `ELECTRONIC_TOLL_COLLECTION` - Electronic toll collection system with no subscription required.    * `CASH` - Cash payment at a toll booth.    * `CREDIT_CARD` - Credit card payment at a toll booth.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public TollSectionCost etcSubscriptions(List<String> etcSubscriptions) {
    this.etcSubscriptions = JsonNullable.<List<String>>of(etcSubscriptions);
    return this;
  }

  public TollSectionCost addEtcSubscriptionsItem(String etcSubscriptionsItem) {
    if (this.etcSubscriptions == null || !this.etcSubscriptions.isPresent()) {
      this.etcSubscriptions = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.etcSubscriptions.get().add(etcSubscriptionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The required electronic toll collection subscriptions for the payment method ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION.
   * @return etcSubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The required electronic toll collection subscriptions for the payment method ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION.")
  @JsonIgnore

  public List<String> getEtcSubscriptions() {
        return etcSubscriptions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ETC_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getEtcSubscriptions_JsonNullable() {
    return etcSubscriptions;
  }
  
  @JsonProperty(JSON_PROPERTY_ETC_SUBSCRIPTIONS)
  public void setEtcSubscriptions_JsonNullable(JsonNullable<List<String>> etcSubscriptions) {
    this.etcSubscriptions = etcSubscriptions;
  }

  public void setEtcSubscriptions(List<String> etcSubscriptions) {
    this.etcSubscriptions = JsonNullable.<List<String>>of(etcSubscriptions);
  }


  public TollSectionCost convertedPrice(TollSectionCostConvertedPrice convertedPrice) {
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

  public TollSectionCostConvertedPrice getConvertedPrice() {
    return convertedPrice;
  }


  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertedPrice(TollSectionCostConvertedPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
  }


  /**
   * Return true if this TollSectionCost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollSectionCost tollSectionCost = (TollSectionCost) o;
    return Objects.equals(this.price, tollSectionCost.price) &&
        Objects.equals(this.currency, tollSectionCost.currency) &&
        Objects.equals(this.paymentMethods, tollSectionCost.paymentMethods) &&
        equalsNullable(this.etcSubscriptions, tollSectionCost.etcSubscriptions) &&
        Objects.equals(this.convertedPrice, tollSectionCost.convertedPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currency, paymentMethods, hashCodeNullable(etcSubscriptions), convertedPrice);
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
    sb.append("class TollSectionCost {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    etcSubscriptions: ").append(toIndentedString(etcSubscriptions)).append("\n");
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

}

