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
    /// The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested. 
    /// </summary>
    [DataContract(Name = "EvReport")]
    public partial class EvReport : IEquatable<EvReport>, IValidatableObject
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
        /// <param name="batteryStateOfCharge">The remaining battery capacity at the end of the route [%]. (required).</param>
        /// <param name="chargingTime">The time spent for charging the battery [s]. (required).</param>
        /// <param name="electricityCharged">The amount of electricity charged along the route [kWh]. (required).</param>
        /// <param name="percentageCharged">The percentage of battery charged along the route [%]. (required).</param>
        /// <param name="cost">cost (required).</param>
        public EvReport(double electricityConsumption = default(double), double batteryStateOfCharge = default(double), int chargingTime = default(int), double electricityCharged = default(double), int percentageCharged = default(int), ElectricityPrice cost = default(ElectricityPrice))
        {
            this.ElectricityConsumption = electricityConsumption;
            this.BatteryStateOfCharge = batteryStateOfCharge;
            this.ChargingTime = chargingTime;
            this.ElectricityCharged = electricityCharged;
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
        public double ElectricityConsumption { get; set; }

        /// <summary>
        /// The remaining battery capacity at the end of the route [%].
        /// </summary>
        /// <value>The remaining battery capacity at the end of the route [%].</value>
        [DataMember(Name = "batteryStateOfCharge", IsRequired = true, EmitDefaultValue = true)]
        public double BatteryStateOfCharge { get; set; }

        /// <summary>
        /// The time spent for charging the battery [s].
        /// </summary>
        /// <value>The time spent for charging the battery [s].</value>
        [DataMember(Name = "chargingTime", IsRequired = true, EmitDefaultValue = true)]
        public int ChargingTime { get; set; }

        /// <summary>
        /// The amount of electricity charged along the route [kWh].
        /// </summary>
        /// <value>The amount of electricity charged along the route [kWh].</value>
        [DataMember(Name = "electricityCharged", IsRequired = true, EmitDefaultValue = true)]
        public double ElectricityCharged { get; set; }

        /// <summary>
        /// The percentage of battery charged along the route [%].
        /// </summary>
        /// <value>The percentage of battery charged along the route [%].</value>
        [DataMember(Name = "percentageCharged", IsRequired = true, EmitDefaultValue = true)]
        public int PercentageCharged { get; set; }

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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EvReport);
        }

        /// <summary>
        /// Returns true if EvReport instances are equal
        /// </summary>
        /// <param name="input">Instance of EvReport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EvReport input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ElectricityConsumption == input.ElectricityConsumption ||
                    this.ElectricityConsumption.Equals(input.ElectricityConsumption)
                ) && 
                (
                    this.BatteryStateOfCharge == input.BatteryStateOfCharge ||
                    this.BatteryStateOfCharge.Equals(input.BatteryStateOfCharge)
                ) && 
                (
                    this.ChargingTime == input.ChargingTime ||
                    this.ChargingTime.Equals(input.ChargingTime)
                ) && 
                (
                    this.ElectricityCharged == input.ElectricityCharged ||
                    this.ElectricityCharged.Equals(input.ElectricityCharged)
                ) && 
                (
                    this.PercentageCharged == input.PercentageCharged ||
                    this.PercentageCharged.Equals(input.PercentageCharged)
                ) && 
                (
                    this.Cost == input.Cost ||
                    (this.Cost != null &&
                    this.Cost.Equals(input.Cost))
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
                hashCode = (hashCode * 59) + this.ElectricityConsumption.GetHashCode();
                hashCode = (hashCode * 59) + this.BatteryStateOfCharge.GetHashCode();
                hashCode = (hashCode * 59) + this.ChargingTime.GetHashCode();
                hashCode = (hashCode * 59) + this.ElectricityCharged.GetHashCode();
                hashCode = (hashCode * 59) + this.PercentageCharged.GetHashCode();
                if (this.Cost != null)
                {
                    hashCode = (hashCode * 59) + this.Cost.GetHashCode();
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
            // BatteryStateOfCharge (double) maximum
            if (this.BatteryStateOfCharge > (double)100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BatteryStateOfCharge, must be a value less than or equal to 100.", new [] { "BatteryStateOfCharge" });
            }

            // ChargingTime (int) minimum
            if (this.ChargingTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ChargingTime, must be a value greater than or equal to 0.", new [] { "ChargingTime" });
            }

            // ElectricityCharged (double) minimum
            if (this.ElectricityCharged < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ElectricityCharged, must be a value greater than or equal to 0.", new [] { "ElectricityCharged" });
            }

            // PercentageCharged (int) minimum
            if (this.PercentageCharged < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PercentageCharged, must be a value greater than or equal to 0.", new [] { "PercentageCharged" });
            }

            yield break;
        }
    }

}