/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.20
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
    /// Emissions according to ISO 14083:2023 (a.k.a. ISO standard).
    /// </summary>
    [DataContract(Name = "Emissions_ISO14083_2023")]
    public partial class EmissionsISO140832023 : IEquatable<EmissionsISO140832023>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmissionsISO140832023" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EmissionsISO140832023() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EmissionsISO140832023" /> class.
        /// </summary>
        /// <param name="fuelConsumption">The total conventional fuel consumption [kg]. (required).</param>
        /// <param name="electricityConsumption">The total electric power consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh]. (required).</param>
        /// <param name="co2eTankToWheel">The amount of emitted CO2e from tank to wheel [kg]. (required).</param>
        /// <param name="co2eWellToWheel">The amount of emitted CO2e from well to wheel [kg]. (required).</param>
        /// <param name="energyUseTankToWheel">The tank-to-wheel energy use [MJ]. (required).</param>
        /// <param name="energyUseWellToWheel">The well-to-wheel energy use [MJ]. (required).</param>
        public EmissionsISO140832023(double fuelConsumption = default(double), double electricityConsumption = default(double), double co2eTankToWheel = default(double), double co2eWellToWheel = default(double), double energyUseTankToWheel = default(double), double energyUseWellToWheel = default(double))
        {
            this.FuelConsumption = fuelConsumption;
            this.ElectricityConsumption = electricityConsumption;
            this.Co2eTankToWheel = co2eTankToWheel;
            this.Co2eWellToWheel = co2eWellToWheel;
            this.EnergyUseTankToWheel = energyUseTankToWheel;
            this.EnergyUseWellToWheel = energyUseWellToWheel;
        }

        /// <summary>
        /// The total conventional fuel consumption [kg].
        /// </summary>
        /// <value>The total conventional fuel consumption [kg].</value>
        [DataMember(Name = "fuelConsumption", IsRequired = true, EmitDefaultValue = true)]
        public double FuelConsumption { get; set; }

        /// <summary>
        /// The total electric power consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh].
        /// </summary>
        /// <value>The total electric power consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh].</value>
        [DataMember(Name = "electricityConsumption", IsRequired = true, EmitDefaultValue = true)]
        public double ElectricityConsumption { get; set; }

        /// <summary>
        /// The amount of emitted CO2e from tank to wheel [kg].
        /// </summary>
        /// <value>The amount of emitted CO2e from tank to wheel [kg].</value>
        [DataMember(Name = "co2eTankToWheel", IsRequired = true, EmitDefaultValue = true)]
        public double Co2eTankToWheel { get; set; }

        /// <summary>
        /// The amount of emitted CO2e from well to wheel [kg].
        /// </summary>
        /// <value>The amount of emitted CO2e from well to wheel [kg].</value>
        [DataMember(Name = "co2eWellToWheel", IsRequired = true, EmitDefaultValue = true)]
        public double Co2eWellToWheel { get; set; }

        /// <summary>
        /// The tank-to-wheel energy use [MJ].
        /// </summary>
        /// <value>The tank-to-wheel energy use [MJ].</value>
        [DataMember(Name = "energyUseTankToWheel", IsRequired = true, EmitDefaultValue = true)]
        public double EnergyUseTankToWheel { get; set; }

        /// <summary>
        /// The well-to-wheel energy use [MJ].
        /// </summary>
        /// <value>The well-to-wheel energy use [MJ].</value>
        [DataMember(Name = "energyUseWellToWheel", IsRequired = true, EmitDefaultValue = true)]
        public double EnergyUseWellToWheel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EmissionsISO140832023 {\n");
            sb.Append("  FuelConsumption: ").Append(FuelConsumption).Append("\n");
            sb.Append("  ElectricityConsumption: ").Append(ElectricityConsumption).Append("\n");
            sb.Append("  Co2eTankToWheel: ").Append(Co2eTankToWheel).Append("\n");
            sb.Append("  Co2eWellToWheel: ").Append(Co2eWellToWheel).Append("\n");
            sb.Append("  EnergyUseTankToWheel: ").Append(EnergyUseTankToWheel).Append("\n");
            sb.Append("  EnergyUseWellToWheel: ").Append(EnergyUseWellToWheel).Append("\n");
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
            return this.Equals(input as EmissionsISO140832023);
        }

        /// <summary>
        /// Returns true if EmissionsISO140832023 instances are equal
        /// </summary>
        /// <param name="input">Instance of EmissionsISO140832023 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmissionsISO140832023 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FuelConsumption == input.FuelConsumption ||
                    this.FuelConsumption.Equals(input.FuelConsumption)
                ) && 
                (
                    this.ElectricityConsumption == input.ElectricityConsumption ||
                    this.ElectricityConsumption.Equals(input.ElectricityConsumption)
                ) && 
                (
                    this.Co2eTankToWheel == input.Co2eTankToWheel ||
                    this.Co2eTankToWheel.Equals(input.Co2eTankToWheel)
                ) && 
                (
                    this.Co2eWellToWheel == input.Co2eWellToWheel ||
                    this.Co2eWellToWheel.Equals(input.Co2eWellToWheel)
                ) && 
                (
                    this.EnergyUseTankToWheel == input.EnergyUseTankToWheel ||
                    this.EnergyUseTankToWheel.Equals(input.EnergyUseTankToWheel)
                ) && 
                (
                    this.EnergyUseWellToWheel == input.EnergyUseWellToWheel ||
                    this.EnergyUseWellToWheel.Equals(input.EnergyUseWellToWheel)
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
                hashCode = (hashCode * 59) + this.FuelConsumption.GetHashCode();
                hashCode = (hashCode * 59) + this.ElectricityConsumption.GetHashCode();
                hashCode = (hashCode * 59) + this.Co2eTankToWheel.GetHashCode();
                hashCode = (hashCode * 59) + this.Co2eWellToWheel.GetHashCode();
                hashCode = (hashCode * 59) + this.EnergyUseTankToWheel.GetHashCode();
                hashCode = (hashCode * 59) + this.EnergyUseWellToWheel.GetHashCode();
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
            // FuelConsumption (double) minimum
            if (this.FuelConsumption < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FuelConsumption, must be a value greater than or equal to 0.", new [] { "FuelConsumption" });
            }

            // ElectricityConsumption (double) minimum
            if (this.ElectricityConsumption < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ElectricityConsumption, must be a value greater than or equal to 0.", new [] { "ElectricityConsumption" });
            }

            // Co2eTankToWheel (double) minimum
            if (this.Co2eTankToWheel < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Co2eTankToWheel, must be a value greater than or equal to 0.", new [] { "Co2eTankToWheel" });
            }

            // Co2eWellToWheel (double) minimum
            if (this.Co2eWellToWheel < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Co2eWellToWheel, must be a value greater than or equal to 0.", new [] { "Co2eWellToWheel" });
            }

            // EnergyUseTankToWheel (double) minimum
            if (this.EnergyUseTankToWheel < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EnergyUseTankToWheel, must be a value greater than or equal to 0.", new [] { "EnergyUseTankToWheel" });
            }

            // EnergyUseWellToWheel (double) minimum
            if (this.EnergyUseWellToWheel < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EnergyUseWellToWheel, must be a value greater than or equal to 0.", new [] { "EnergyUseWellToWheel" });
            }

            yield break;
        }
    }

}
