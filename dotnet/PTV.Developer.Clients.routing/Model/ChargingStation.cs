/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
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
    /// Defines the charging capabilities available the a waypoint. 
    /// </summary>
    [DataContract(Name = "ChargingStation")]
    public partial class ChargingStation : IEquatable<ChargingStation>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets CurrentType
        /// </summary>
        [DataMember(Name = "currentType", IsRequired = true, EmitDefaultValue = true)]
        public CurrentType CurrentType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChargingStation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChargingStation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChargingStation" /> class.
        /// </summary>
        /// <param name="power">The power delivered by the charging station [kW]. (required).</param>
        /// <param name="currentType">currentType (required).</param>
        /// <param name="setupTime">The time to setup the connection [s]. (default to 0).</param>
        /// <param name="kWhPrice">The price of one kWh in the currency defined in **options[currency]**. (default to 0D).</param>
        public ChargingStation(int power = default(int), CurrentType currentType = default(CurrentType), int setupTime = 0, double kWhPrice = 0D)
        {
            this.Power = power;
            this.CurrentType = currentType;
            this.SetupTime = setupTime;
            this.KWhPrice = kWhPrice;
        }

        /// <summary>
        /// The power delivered by the charging station [kW].
        /// </summary>
        /// <value>The power delivered by the charging station [kW].</value>
        [DataMember(Name = "power", IsRequired = true, EmitDefaultValue = true)]
        public int Power { get; set; }

        /// <summary>
        /// The time to setup the connection [s].
        /// </summary>
        /// <value>The time to setup the connection [s].</value>
        [DataMember(Name = "setupTime", EmitDefaultValue = false)]
        public int SetupTime { get; set; }

        /// <summary>
        /// The price of one kWh in the currency defined in **options[currency]**.
        /// </summary>
        /// <value>The price of one kWh in the currency defined in **options[currency]**.</value>
        [DataMember(Name = "kWhPrice", EmitDefaultValue = false)]
        public double KWhPrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChargingStation {\n");
            sb.Append("  Power: ").Append(Power).Append("\n");
            sb.Append("  CurrentType: ").Append(CurrentType).Append("\n");
            sb.Append("  SetupTime: ").Append(SetupTime).Append("\n");
            sb.Append("  KWhPrice: ").Append(KWhPrice).Append("\n");
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
            return this.Equals(input as ChargingStation);
        }

        /// <summary>
        /// Returns true if ChargingStation instances are equal
        /// </summary>
        /// <param name="input">Instance of ChargingStation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChargingStation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Power == input.Power ||
                    this.Power.Equals(input.Power)
                ) && 
                (
                    this.CurrentType == input.CurrentType ||
                    this.CurrentType.Equals(input.CurrentType)
                ) && 
                (
                    this.SetupTime == input.SetupTime ||
                    this.SetupTime.Equals(input.SetupTime)
                ) && 
                (
                    this.KWhPrice == input.KWhPrice ||
                    this.KWhPrice.Equals(input.KWhPrice)
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
                hashCode = (hashCode * 59) + this.Power.GetHashCode();
                hashCode = (hashCode * 59) + this.CurrentType.GetHashCode();
                hashCode = (hashCode * 59) + this.SetupTime.GetHashCode();
                hashCode = (hashCode * 59) + this.KWhPrice.GetHashCode();
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
            // SetupTime (int) minimum
            if (this.SetupTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SetupTime, must be a value greater than or equal to 0.", new [] { "SetupTime" });
            }

            // KWhPrice (double) minimum
            if (this.KWhPrice < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for KWhPrice, must be a value greater than or equal to 0.", new [] { "KWhPrice" });
            }

            yield break;
        }
    }

}
