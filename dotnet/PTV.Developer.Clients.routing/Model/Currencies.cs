/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
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
    /// Information about the currencies that are listed in the toll costs and/or toll sections objects.
    /// </summary>
    [DataContract(Name = "Currencies")]
    public partial class Currencies : IEquatable<Currencies>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Currencies" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Currencies() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Currencies" /> class.
        /// </summary>
        /// <param name="date">The date of the exchange rates formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        /// <param name="provider">The provider of the exchange rates. (required).</param>
        /// <param name="baseCurrency">The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code as provided in the request. (required).</param>
        /// <param name="exchangeRates">The exchange rates that were used to determine the converted prices. (required).</param>
        public Currencies(DateTimeOffset date = default(DateTimeOffset), string provider = default(string), string baseCurrency = default(string), List<ExchangeRate> exchangeRates = default(List<ExchangeRate>))
        {
            this.Date = date;
            // to ensure "provider" is required (not null)
            if (provider == null)
            {
                throw new ArgumentNullException("provider is a required property for Currencies and cannot be null");
            }
            this.Provider = provider;
            // to ensure "baseCurrency" is required (not null)
            if (baseCurrency == null)
            {
                throw new ArgumentNullException("baseCurrency is a required property for Currencies and cannot be null");
            }
            this.BaseCurrency = baseCurrency;
            // to ensure "exchangeRates" is required (not null)
            if (exchangeRates == null)
            {
                throw new ArgumentNullException("exchangeRates is a required property for Currencies and cannot be null");
            }
            this.ExchangeRates = exchangeRates;
        }

        /// <summary>
        /// The date of the exchange rates formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The date of the exchange rates formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "date", IsRequired = true, EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTimeOffset Date { get; set; }

        /// <summary>
        /// The provider of the exchange rates.
        /// </summary>
        /// <value>The provider of the exchange rates.</value>
        [DataMember(Name = "provider", IsRequired = true, EmitDefaultValue = true)]
        public string Provider { get; set; }

        /// <summary>
        /// The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code as provided in the request.
        /// </summary>
        /// <value>The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code as provided in the request.</value>
        [DataMember(Name = "baseCurrency", IsRequired = true, EmitDefaultValue = true)]
        public string BaseCurrency { get; set; }

        /// <summary>
        /// The exchange rates that were used to determine the converted prices.
        /// </summary>
        /// <value>The exchange rates that were used to determine the converted prices.</value>
        [DataMember(Name = "exchangeRates", IsRequired = true, EmitDefaultValue = true)]
        public List<ExchangeRate> ExchangeRates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Currencies {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Provider: ").Append(Provider).Append("\n");
            sb.Append("  BaseCurrency: ").Append(BaseCurrency).Append("\n");
            sb.Append("  ExchangeRates: ").Append(ExchangeRates).Append("\n");
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
            return this.Equals(input as Currencies);
        }

        /// <summary>
        /// Returns true if Currencies instances are equal
        /// </summary>
        /// <param name="input">Instance of Currencies to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Currencies input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Provider == input.Provider ||
                    (this.Provider != null &&
                    this.Provider.Equals(input.Provider))
                ) && 
                (
                    this.BaseCurrency == input.BaseCurrency ||
                    (this.BaseCurrency != null &&
                    this.BaseCurrency.Equals(input.BaseCurrency))
                ) && 
                (
                    this.ExchangeRates == input.ExchangeRates ||
                    this.ExchangeRates != null &&
                    input.ExchangeRates != null &&
                    this.ExchangeRates.SequenceEqual(input.ExchangeRates)
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Provider != null)
                {
                    hashCode = (hashCode * 59) + this.Provider.GetHashCode();
                }
                if (this.BaseCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.BaseCurrency.GetHashCode();
                }
                if (this.ExchangeRates != null)
                {
                    hashCode = (hashCode * 59) + this.ExchangeRates.GetHashCode();
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
            // BaseCurrency (string) pattern
            Regex regexBaseCurrency = new Regex(@"[A-Z]{3}", RegexOptions.CultureInvariant);
            if (false == regexBaseCurrency.Match(this.BaseCurrency).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BaseCurrency, must match a pattern of " + regexBaseCurrency, new [] { "BaseCurrency" });
            }

            yield break;
        }
    }

}
