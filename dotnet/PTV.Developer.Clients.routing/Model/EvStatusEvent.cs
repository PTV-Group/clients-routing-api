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
    /// Issued periodically to report electricity consumption and battery status. Requires _EV_STATUS_EVENTS_ or _EV_STATUS_EVENTS_POLYLINE_ to be requested.
    /// </summary>
    [DataContract(Name = "EvStatusEvent")]
    public partial class EvStatusEvent : IEquatable<EvStatusEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvStatusEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EvStatusEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EvStatusEvent" /> class.
        /// </summary>
        /// <param name="batteryStateOfCharge">The remaining battery capacity at the location of this event [%]. (required).</param>
        /// <param name="electricityConsumption">The electricity consumption since the previous event containing **evStatus** [kWh]. (required).</param>
        /// <param name="polyline">The route polyline snippet since the previous event containing **evStatus** in the format specified by **options[polylineFormat]**. Requires _EV_STATUS_EVENTS_POLYLINE_ to be requested..</param>
        public EvStatusEvent(double batteryStateOfCharge = default(double), double electricityConsumption = default(double), string polyline = default(string))
        {
            this.BatteryStateOfCharge = batteryStateOfCharge;
            this.ElectricityConsumption = electricityConsumption;
            this.Polyline = polyline;
        }

        /// <summary>
        /// The remaining battery capacity at the location of this event [%].
        /// </summary>
        /// <value>The remaining battery capacity at the location of this event [%].</value>
        [DataMember(Name = "batteryStateOfCharge", IsRequired = true, EmitDefaultValue = true)]
        public double BatteryStateOfCharge { get; set; }

        /// <summary>
        /// The electricity consumption since the previous event containing **evStatus** [kWh].
        /// </summary>
        /// <value>The electricity consumption since the previous event containing **evStatus** [kWh].</value>
        [DataMember(Name = "electricityConsumption", IsRequired = true, EmitDefaultValue = true)]
        public double ElectricityConsumption { get; set; }

        /// <summary>
        /// The route polyline snippet since the previous event containing **evStatus** in the format specified by **options[polylineFormat]**. Requires _EV_STATUS_EVENTS_POLYLINE_ to be requested.
        /// </summary>
        /// <value>The route polyline snippet since the previous event containing **evStatus** in the format specified by **options[polylineFormat]**. Requires _EV_STATUS_EVENTS_POLYLINE_ to be requested.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = false)]
        public string Polyline { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EvStatusEvent {\n");
            sb.Append("  BatteryStateOfCharge: ").Append(BatteryStateOfCharge).Append("\n");
            sb.Append("  ElectricityConsumption: ").Append(ElectricityConsumption).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
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
            return this.Equals(input as EvStatusEvent);
        }

        /// <summary>
        /// Returns true if EvStatusEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of EvStatusEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EvStatusEvent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BatteryStateOfCharge == input.BatteryStateOfCharge ||
                    this.BatteryStateOfCharge.Equals(input.BatteryStateOfCharge)
                ) && 
                (
                    this.ElectricityConsumption == input.ElectricityConsumption ||
                    this.ElectricityConsumption.Equals(input.ElectricityConsumption)
                ) && 
                (
                    this.Polyline == input.Polyline ||
                    (this.Polyline != null &&
                    this.Polyline.Equals(input.Polyline))
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
                hashCode = (hashCode * 59) + this.BatteryStateOfCharge.GetHashCode();
                hashCode = (hashCode * 59) + this.ElectricityConsumption.GetHashCode();
                if (this.Polyline != null)
                {
                    hashCode = (hashCode * 59) + this.Polyline.GetHashCode();
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

            yield break;
        }
    }

}
