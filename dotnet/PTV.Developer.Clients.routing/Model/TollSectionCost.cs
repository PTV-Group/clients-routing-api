/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routing.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routing.Model
{
    /// <summary>
    /// TollSectionCost
    /// </summary>
    [DataContract(Name = "TollSectionCost")]
    public partial class TollSectionCost : IEquatable<TollSectionCost>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSectionCost" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollSectionCost() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSectionCost" /> class.
        /// </summary>
        /// <param name="price">The price in the specified currency. (required).</param>
        /// <param name="currency">The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). (required).</param>
        /// <param name="paymentMethods">The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth..</param>
        /// <param name="etcSubscriptions">The required electronic toll collection subscriptions for the payment method ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION..</param>
        /// <param name="convertedPrice">convertedPrice.</param>
        public TollSectionCost(double price = default(double), string currency = default(string), List<PaymentMethod> paymentMethods = default(List<PaymentMethod>), List<string> etcSubscriptions = default(List<string>), TollSectionCostConvertedPrice convertedPrice = default(TollSectionCostConvertedPrice))
        {
            this.Price = price;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for TollSectionCost and cannot be null");
            }
            this.Currency = currency;
            this.PaymentMethods = paymentMethods;
            this.EtcSubscriptions = etcSubscriptions;
            this.ConvertedPrice = convertedPrice;
        }

        /// <summary>
        /// The price in the specified currency.
        /// </summary>
        /// <value>The price in the specified currency.</value>
        [DataMember(Name = "price", IsRequired = true, EmitDefaultValue = false)]
        public double Price { get; set; }

        /// <summary>
        /// The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
        /// </summary>
        /// <value>The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.
        /// </summary>
        /// <value>The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.</value>
        [DataMember(Name = "paymentMethods", EmitDefaultValue = false)]
        public List<PaymentMethod> PaymentMethods { get; set; }

        /// <summary>
        /// The required electronic toll collection subscriptions for the payment method ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION.
        /// </summary>
        /// <value>The required electronic toll collection subscriptions for the payment method ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION.</value>
        [DataMember(Name = "etcSubscriptions", EmitDefaultValue = true)]
        public List<string> EtcSubscriptions { get; set; }

        /// <summary>
        /// Gets or Sets ConvertedPrice
        /// </summary>
        [DataMember(Name = "convertedPrice", EmitDefaultValue = false)]
        public TollSectionCostConvertedPrice ConvertedPrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollSectionCost {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  PaymentMethods: ").Append(PaymentMethods).Append("\n");
            sb.Append("  EtcSubscriptions: ").Append(EtcSubscriptions).Append("\n");
            sb.Append("  ConvertedPrice: ").Append(ConvertedPrice).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TollSectionCost);
        }

        /// <summary>
        /// Returns true if TollSectionCost instances are equal
        /// </summary>
        /// <param name="input">Instance of TollSectionCost to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TollSectionCost input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.PaymentMethods == input.PaymentMethods ||
                    this.PaymentMethods != null &&
                    input.PaymentMethods != null &&
                    this.PaymentMethods.SequenceEqual(input.PaymentMethods)
                ) && 
                (
                    this.EtcSubscriptions == input.EtcSubscriptions ||
                    this.EtcSubscriptions != null &&
                    input.EtcSubscriptions != null &&
                    this.EtcSubscriptions.SequenceEqual(input.EtcSubscriptions)
                ) && 
                (
                    this.ConvertedPrice == input.ConvertedPrice ||
                    (this.ConvertedPrice != null &&
                    this.ConvertedPrice.Equals(input.ConvertedPrice))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Price.GetHashCode();
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.PaymentMethods != null)
                {
                    hashCode = (hashCode * 59) + this.PaymentMethods.GetHashCode();
                }
                if (this.EtcSubscriptions != null)
                {
                    hashCode = (hashCode * 59) + this.EtcSubscriptions.GetHashCode();
                }
                if (this.ConvertedPrice != null)
                {
                    hashCode = (hashCode * 59) + this.ConvertedPrice.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // Price (double) minimum
            if (this.Price < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Price, must be a value greater than or equal to 0.", new [] { "Price" });
            }

            yield break;
        }
    }

}