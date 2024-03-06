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
    /// MonetaryCostOptions
    /// </summary>
    [DataContract(Name = "MonetaryCostOptions")]
    public partial class MonetaryCostOptions : IEquatable<MonetaryCostOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MonetaryCostOptions" /> class.
        /// </summary>
        /// <param name="costPerKilometer">Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time..</param>
        /// <param name="workingCostPerHour">Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time..</param>
        /// <param name="costPerKwh">Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_..</param>
        /// <param name="costPerFuelUnit">Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_..</param>
        public MonetaryCostOptions(double? costPerKilometer = default(double?), double? workingCostPerHour = default(double?), double? costPerKwh = default(double?), double? costPerFuelUnit = default(double?))
        {
            this.CostPerKilometer = costPerKilometer;
            this.WorkingCostPerHour = workingCostPerHour;
            this.CostPerKwh = costPerKwh;
            this.CostPerFuelUnit = costPerFuelUnit;
        }

        /// <summary>
        /// Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
        /// </summary>
        /// <value>Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.</value>
        [DataMember(Name = "costPerKilometer", EmitDefaultValue = true)]
        public double? CostPerKilometer { get; set; }

        /// <summary>
        /// Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
        /// </summary>
        /// <value>Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.</value>
        [DataMember(Name = "workingCostPerHour", EmitDefaultValue = true)]
        public double? WorkingCostPerHour { get; set; }

        /// <summary>
        /// Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.
        /// </summary>
        /// <value>Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.</value>
        [DataMember(Name = "costPerKwh", EmitDefaultValue = true)]
        public double? CostPerKwh { get; set; }

        /// <summary>
        /// Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.
        /// </summary>
        /// <value>Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.</value>
        [DataMember(Name = "costPerFuelUnit", EmitDefaultValue = true)]
        public double? CostPerFuelUnit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MonetaryCostOptions {\n");
            sb.Append("  CostPerKilometer: ").Append(CostPerKilometer).Append("\n");
            sb.Append("  WorkingCostPerHour: ").Append(WorkingCostPerHour).Append("\n");
            sb.Append("  CostPerKwh: ").Append(CostPerKwh).Append("\n");
            sb.Append("  CostPerFuelUnit: ").Append(CostPerFuelUnit).Append("\n");
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
            return this.Equals(input as MonetaryCostOptions);
        }

        /// <summary>
        /// Returns true if MonetaryCostOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of MonetaryCostOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MonetaryCostOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CostPerKilometer == input.CostPerKilometer ||
                    (this.CostPerKilometer != null &&
                    this.CostPerKilometer.Equals(input.CostPerKilometer))
                ) && 
                (
                    this.WorkingCostPerHour == input.WorkingCostPerHour ||
                    (this.WorkingCostPerHour != null &&
                    this.WorkingCostPerHour.Equals(input.WorkingCostPerHour))
                ) && 
                (
                    this.CostPerKwh == input.CostPerKwh ||
                    (this.CostPerKwh != null &&
                    this.CostPerKwh.Equals(input.CostPerKwh))
                ) && 
                (
                    this.CostPerFuelUnit == input.CostPerFuelUnit ||
                    (this.CostPerFuelUnit != null &&
                    this.CostPerFuelUnit.Equals(input.CostPerFuelUnit))
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
                if (this.CostPerKilometer != null)
                {
                    hashCode = (hashCode * 59) + this.CostPerKilometer.GetHashCode();
                }
                if (this.WorkingCostPerHour != null)
                {
                    hashCode = (hashCode * 59) + this.WorkingCostPerHour.GetHashCode();
                }
                if (this.CostPerKwh != null)
                {
                    hashCode = (hashCode * 59) + this.CostPerKwh.GetHashCode();
                }
                if (this.CostPerFuelUnit != null)
                {
                    hashCode = (hashCode * 59) + this.CostPerFuelUnit.GetHashCode();
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
            // CostPerKilometer (double?) minimum
            if (this.CostPerKilometer < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CostPerKilometer, must be a value greater than or equal to 0.", new [] { "CostPerKilometer" });
            }

            // WorkingCostPerHour (double?) minimum
            if (this.WorkingCostPerHour < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WorkingCostPerHour, must be a value greater than or equal to 0.", new [] { "WorkingCostPerHour" });
            }

            // CostPerKwh (double?) minimum
            if (this.CostPerKwh < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CostPerKwh, must be a value greater than or equal to 0.", new [] { "CostPerKwh" });
            }

            // CostPerFuelUnit (double?) minimum
            if (this.CostPerFuelUnit < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CostPerFuelUnit, must be a value greater than or equal to 0.", new [] { "CostPerFuelUnit" });
            }

            yield break;
        }
    }

}
