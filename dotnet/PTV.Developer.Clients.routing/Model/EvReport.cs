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
    /// The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested. 
    /// </summary>
    [DataContract(Name = "EvReport")]
    public partial class EvReport : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvReport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EvReport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EvReport" /> class.
        /// </summary>
        /// <param name="electricityConsumption">The electricity consumption since the start of the route [kWh]. (required).</param>
        /// <param name="batteryStateOfCharge">The remaining state of charge at the end of the route [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero. (required).</param>
        /// <param name="chargingTime">The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it. (required).</param>
        /// <param name="electricityCharged">The amount of electricity charged along the route [kWh]. (required).</param>
        /// <param name="percentageCharged">The percentage of battery charged along the route [%]. (required).</param>
        /// <param name="cost">cost (required).</param>
        public EvReport(double? electricityConsumption = default(double?), double? batteryStateOfCharge = default(double?), int? chargingTime = default(int?), double? electricityCharged = default(double?), int? percentageCharged = default(int?), ElectricityPrice cost = default(ElectricityPrice))
        {
            // to ensure "electricityConsumption" is required (not null)
            if (electricityConsumption == null)
            {
                throw new ArgumentNullException("electricityConsumption is a required property for EvReport and cannot be null");
            }
            this.ElectricityConsumption = electricityConsumption;
            // to ensure "batteryStateOfCharge" is required (not null)
            if (batteryStateOfCharge == null)
            {
                throw new ArgumentNullException("batteryStateOfCharge is a required property for EvReport and cannot be null");
            }
            this.BatteryStateOfCharge = batteryStateOfCharge;
            // to ensure "chargingTime" is required (not null)
            if (chargingTime == null)
            {
                throw new ArgumentNullException("chargingTime is a required property for EvReport and cannot be null");
            }
            this.ChargingTime = chargingTime;
            // to ensure "electricityCharged" is required (not null)
            if (electricityCharged == null)
            {
                throw new ArgumentNullException("electricityCharged is a required property for EvReport and cannot be null");
            }
            this.ElectricityCharged = electricityCharged;
            // to ensure "percentageCharged" is required (not null)
            if (percentageCharged == null)
            {
                throw new ArgumentNullException("percentageCharged is a required property for EvReport and cannot be null");
            }
            this.PercentageCharged = percentageCharged;
            // to ensure "cost" is required (not null)
            if (cost == null)
            {
                throw new ArgumentNullException("cost is a required property for EvReport and cannot be null");
            }
            this.Cost = cost;
        }

        /// <summary>
        /// The electricity consumption since the start of the route [kWh].
        /// </summary>
        /// <value>The electricity consumption since the start of the route [kWh].</value>
        [DataMember(Name = "electricityConsumption", IsRequired = true, EmitDefaultValue = true)]
        public double? ElectricityConsumption { get; set; }

        /// <summary>
        /// The remaining state of charge at the end of the route [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.
        /// </summary>
        /// <value>The remaining state of charge at the end of the route [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.</value>
        /// <example>58</example>
        [DataMember(Name = "batteryStateOfCharge", IsRequired = true, EmitDefaultValue = true)]
        public double? BatteryStateOfCharge { get; set; }

        /// <summary>
        /// The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it.
        /// </summary>
        /// <value>The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it.</value>
        [DataMember(Name = "chargingTime", IsRequired = true, EmitDefaultValue = true)]
        public int? ChargingTime { get; set; }

        /// <summary>
        /// The amount of electricity charged along the route [kWh].
        /// </summary>
        /// <value>The amount of electricity charged along the route [kWh].</value>
        [DataMember(Name = "electricityCharged", IsRequired = true, EmitDefaultValue = true)]
        public double? ElectricityCharged { get; set; }

        /// <summary>
        /// The percentage of battery charged along the route [%].
        /// </summary>
        /// <value>The percentage of battery charged along the route [%].</value>
        [DataMember(Name = "percentageCharged", IsRequired = true, EmitDefaultValue = true)]
        public int? PercentageCharged { get; set; }

        /// <summary>
        /// Gets or Sets Cost
        /// </summary>
        [DataMember(Name = "cost", IsRequired = true, EmitDefaultValue = true)]
        public ElectricityPrice Cost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EvReport {\n");
            sb.Append("  ElectricityConsumption: ").Append(ElectricityConsumption).Append("\n");
            sb.Append("  BatteryStateOfCharge: ").Append(BatteryStateOfCharge).Append("\n");
            sb.Append("  ChargingTime: ").Append(ChargingTime).Append("\n");
            sb.Append("  ElectricityCharged: ").Append(ElectricityCharged).Append("\n");
            sb.Append("  PercentageCharged: ").Append(PercentageCharged).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
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
            // BatteryStateOfCharge (double?) maximum
            if (this.BatteryStateOfCharge > (double?)100)
            {
                yield return new ValidationResult("Invalid value for BatteryStateOfCharge, must be a value less than or equal to 100.", new [] { "BatteryStateOfCharge" });
            }

            // ChargingTime (int?) minimum
            if (this.ChargingTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for ChargingTime, must be a value greater than or equal to 0.", new [] { "ChargingTime" });
            }

            // ElectricityCharged (double?) minimum
            if (this.ElectricityCharged < (double?)0)
            {
                yield return new ValidationResult("Invalid value for ElectricityCharged, must be a value greater than or equal to 0.", new [] { "ElectricityCharged" });
            }

            // PercentageCharged (int?) minimum
            if (this.PercentageCharged < (int?)0)
            {
                yield return new ValidationResult("Invalid value for PercentageCharged, must be a value greater than or equal to 0.", new [] { "PercentageCharged" });
            }

            yield break;
        }
    }

}