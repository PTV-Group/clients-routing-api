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
    /// Emissions such as the CO2-equivalent (CO2e) according to the selected standards.  The CO2e value is the unit for comparing the radiative forcing of a greenhouse gas to carbon dioxide according to [ISO 14064-1:2006](https://en.wikipedia.org/wiki/ISO_14064).
    /// </summary>
    [DataContract(Name = "Emissions")]
    public partial class Emissions : IEquatable<Emissions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Emissions" /> class.
        /// </summary>
        /// <param name="en162582012">en162582012.</param>
        /// <param name="iso140832022">iso140832022.</param>
        /// <param name="iso140832023">iso140832023.</param>
        /// <param name="frenchCO2eDecree2017639">frenchCO2eDecree2017639.</param>
        public Emissions(EmissionsEN162582012 en162582012 = default(EmissionsEN162582012), EmissionsISO140832022 iso140832022 = default(EmissionsISO140832022), EmissionsISO140832023 iso140832023 = default(EmissionsISO140832023), EmissionsFrenchCO2eDecree2017639 frenchCO2eDecree2017639 = default(EmissionsFrenchCO2eDecree2017639))
        {
            this.En162582012 = en162582012;
            this.Iso140832022 = iso140832022;
            this.Iso140832023 = iso140832023;
            this.FrenchCO2eDecree2017639 = frenchCO2eDecree2017639;
        }

        /// <summary>
        /// Gets or Sets En162582012
        /// </summary>
        [DataMember(Name = "en16258_2012", EmitDefaultValue = false)]
        public EmissionsEN162582012 En162582012 { get; set; }

        /// <summary>
        /// Gets or Sets Iso140832022
        /// </summary>
        [DataMember(Name = "iso14083_2022", EmitDefaultValue = false)]
        public EmissionsISO140832022 Iso140832022 { get; set; }

        /// <summary>
        /// Gets or Sets Iso140832023
        /// </summary>
        [DataMember(Name = "iso14083_2023", EmitDefaultValue = false)]
        public EmissionsISO140832023 Iso140832023 { get; set; }

        /// <summary>
        /// Gets or Sets FrenchCO2eDecree2017639
        /// </summary>
        [DataMember(Name = "frenchCO2eDecree2017_639", EmitDefaultValue = false)]
        public EmissionsFrenchCO2eDecree2017639 FrenchCO2eDecree2017639 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Emissions {\n");
            sb.Append("  En162582012: ").Append(En162582012).Append("\n");
            sb.Append("  Iso140832022: ").Append(Iso140832022).Append("\n");
            sb.Append("  Iso140832023: ").Append(Iso140832023).Append("\n");
            sb.Append("  FrenchCO2eDecree2017639: ").Append(FrenchCO2eDecree2017639).Append("\n");
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
            return this.Equals(input as Emissions);
        }

        /// <summary>
        /// Returns true if Emissions instances are equal
        /// </summary>
        /// <param name="input">Instance of Emissions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Emissions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.En162582012 == input.En162582012 ||
                    (this.En162582012 != null &&
                    this.En162582012.Equals(input.En162582012))
                ) && 
                (
                    this.Iso140832022 == input.Iso140832022 ||
                    (this.Iso140832022 != null &&
                    this.Iso140832022.Equals(input.Iso140832022))
                ) && 
                (
                    this.Iso140832023 == input.Iso140832023 ||
                    (this.Iso140832023 != null &&
                    this.Iso140832023.Equals(input.Iso140832023))
                ) && 
                (
                    this.FrenchCO2eDecree2017639 == input.FrenchCO2eDecree2017639 ||
                    (this.FrenchCO2eDecree2017639 != null &&
                    this.FrenchCO2eDecree2017639.Equals(input.FrenchCO2eDecree2017639))
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
                if (this.En162582012 != null)
                {
                    hashCode = (hashCode * 59) + this.En162582012.GetHashCode();
                }
                if (this.Iso140832022 != null)
                {
                    hashCode = (hashCode * 59) + this.Iso140832022.GetHashCode();
                }
                if (this.Iso140832023 != null)
                {
                    hashCode = (hashCode * 59) + this.Iso140832023.GetHashCode();
                }
                if (this.FrenchCO2eDecree2017639 != null)
                {
                    hashCode = (hashCode * 59) + this.FrenchCO2eDecree2017639.GetHashCode();
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
            yield break;
        }
    }

}
