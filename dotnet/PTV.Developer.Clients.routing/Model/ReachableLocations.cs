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
    /// The results of a reachable locations calculation.
    /// </summary>
    [DataContract(Name = "ReachableLocations")]
    public partial class ReachableLocations : IEquatable<ReachableLocations>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableLocations" /> class.
        /// </summary>
        /// <param name="reachable">Reachable locations ordered by distance or travel time (depending on the request **horizonType**)..</param>
        /// <param name="unreachable">Indexes of the unreachable locations as given in the request locations..</param>
        /// <param name="warnings">A list of warnings concerning the validity of the result..</param>
        public ReachableLocations(List<ReachableLocation> reachable = default(List<ReachableLocation>), List<int> unreachable = default(List<int>), List<Warning> warnings = default(List<Warning>))
        {
            this.Reachable = reachable;
            this.Unreachable = unreachable;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Reachable locations ordered by distance or travel time (depending on the request **horizonType**).
        /// </summary>
        /// <value>Reachable locations ordered by distance or travel time (depending on the request **horizonType**).</value>
        [DataMember(Name = "reachable", EmitDefaultValue = false)]
        public List<ReachableLocation> Reachable { get; set; }

        /// <summary>
        /// Indexes of the unreachable locations as given in the request locations.
        /// </summary>
        /// <value>Indexes of the unreachable locations as given in the request locations.</value>
        [DataMember(Name = "unreachable", EmitDefaultValue = false)]
        public List<int> Unreachable { get; set; }

        /// <summary>
        /// A list of warnings concerning the validity of the result.
        /// </summary>
        /// <value>A list of warnings concerning the validity of the result.</value>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<Warning> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReachableLocations {\n");
            sb.Append("  Reachable: ").Append(Reachable).Append("\n");
            sb.Append("  Unreachable: ").Append(Unreachable).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return this.Equals(input as ReachableLocations);
        }

        /// <summary>
        /// Returns true if ReachableLocations instances are equal
        /// </summary>
        /// <param name="input">Instance of ReachableLocations to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReachableLocations input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Reachable == input.Reachable ||
                    this.Reachable != null &&
                    input.Reachable != null &&
                    this.Reachable.SequenceEqual(input.Reachable)
                ) && 
                (
                    this.Unreachable == input.Unreachable ||
                    this.Unreachable != null &&
                    input.Unreachable != null &&
                    this.Unreachable.SequenceEqual(input.Unreachable)
                ) && 
                (
                    this.Warnings == input.Warnings ||
                    this.Warnings != null &&
                    input.Warnings != null &&
                    this.Warnings.SequenceEqual(input.Warnings)
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
                if (this.Reachable != null)
                {
                    hashCode = (hashCode * 59) + this.Reachable.GetHashCode();
                }
                if (this.Unreachable != null)
                {
                    hashCode = (hashCode * 59) + this.Unreachable.GetHashCode();
                }
                if (this.Warnings != null)
                {
                    hashCode = (hashCode * 59) + this.Warnings.GetHashCode();
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
