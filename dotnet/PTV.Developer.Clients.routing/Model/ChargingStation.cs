/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
    public partial class ChargingStation : IValidatableObject
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
        /// <param name="useServiceTimeForCharging">If true, the service time can be used for charging. Will be ignored, if **serviceTime** is 0. This can have  an influence on charging optimization because the additional time needed for charging is minimized. (default to false).</param>
        public ChargingStation(int? power = default(int?), CurrentType currentType = default(CurrentType), int? setupTime = 0, double? kWhPrice = 0D, bool? useServiceTimeForCharging = false)
        {
            // to ensure "power" is required (not null)
            if (power == null)
            {
                throw new ArgumentNullException("power is a required property for ChargingStation and cannot be null");
            }
            this.Power = power;
            this.CurrentType = currentType;
            // use default value if no "setupTime" provided
            this.SetupTime = setupTime ?? 0;
            // use default value if no "kWhPrice" provided
            this.KWhPrice = kWhPrice ?? 0D;
            // use default value if no "useServiceTimeForCharging" provided
            this.UseServiceTimeForCharging = useServiceTimeForCharging ?? false;
        }

        /// <summary>
        /// The power delivered by the charging station [kW].
        /// </summary>
        /// <value>The power delivered by the charging station [kW].</value>
        [DataMember(Name = "power", IsRequired = true, EmitDefaultValue = true)]
        public int? Power { get; set; }

        /// <summary>
        /// The time to setup the connection [s].
        /// </summary>
        /// <value>The time to setup the connection [s].</value>
        [DataMember(Name = "setupTime", EmitDefaultValue = true)]
        public int? SetupTime { get; set; }

        /// <summary>
        /// The price of one kWh in the currency defined in **options[currency]**.
        /// </summary>
        /// <value>The price of one kWh in the currency defined in **options[currency]**.</value>
        [DataMember(Name = "kWhPrice", EmitDefaultValue = true)]
        public double? KWhPrice { get; set; }

        /// <summary>
        /// If true, the service time can be used for charging. Will be ignored, if **serviceTime** is 0. This can have  an influence on charging optimization because the additional time needed for charging is minimized.
        /// </summary>
        /// <value>If true, the service time can be used for charging. Will be ignored, if **serviceTime** is 0. This can have  an influence on charging optimization because the additional time needed for charging is minimized.</value>
        [DataMember(Name = "useServiceTimeForCharging", EmitDefaultValue = true)]
        public bool? UseServiceTimeForCharging { get; set; }

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
            sb.Append("  UseServiceTimeForCharging: ").Append(UseServiceTimeForCharging).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Power (int?) minimum
            if (this.Power < (int?)0)
            {
                yield return new ValidationResult("Invalid value for Power, must be a value greater than or equal to 0.", new [] { "Power" });
            }

            // SetupTime (int?) minimum
            if (this.SetupTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for SetupTime, must be a value greater than or equal to 0.", new [] { "SetupTime" });
            }

            // KWhPrice (double?) minimum
            if (this.KWhPrice < (double?)0)
            {
                yield return new ValidationResult("Invalid value for KWhPrice, must be a value greater than or equal to 0.", new [] { "KWhPrice" });
            }

            yield break;
        }
    }

}