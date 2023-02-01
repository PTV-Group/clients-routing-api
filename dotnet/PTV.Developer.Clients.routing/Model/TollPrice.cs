/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.15
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
    /// The toll price payable in this country.
    /// </summary>
    [DataContract(Name = "TollPrice")]
    public partial class TollPrice : IEquatable<TollPrice>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TollPrice" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollPrice() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollPrice" /> class.
        /// </summary>
        /// <param name="price">The toll price in the specified currency. (required).</param>
        /// <param name="currency">The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). (required).</param>
        public TollPrice(double price = default(double), string currency = default(string))
        {
            this.Price = price;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for TollPrice and cannot be null");
            }
            this.Currency = currency;
        }

        /// <summary>
        /// The toll price in the specified currency.
        /// </summary>
        /// <value>The toll price in the specified currency.</value>
        [DataMember(Name = "price", IsRequired = true, EmitDefaultValue = false)]
        public double Price { get; set; }

        /// <summary>
        /// The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
        /// </summary>
        /// <value>The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollPrice {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as TollPrice);
        }

        /// <summary>
        /// Returns true if TollPrice instances are equal
        /// </summary>
        /// <param name="input">Instance of TollPrice to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TollPrice input)
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
