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
    /// The result of the reachable areas calculation.
    /// </summary>
    [DataContract(Name = "ReachableAreas")]
    public partial class ReachableAreas : IEquatable<ReachableAreas>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableAreas" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReachableAreas() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableAreas" /> class.
        /// </summary>
        /// <param name="polygons">The list of polygons calculated for the specified horizons in GeoJson format. For each horizon there is a separate polygon at the same index. (required).</param>
        /// <param name="warnings">A list of warnings concerning the validity of the result..</param>
        public ReachableAreas(List<string> polygons = default(List<string>), List<Warning> warnings = default(List<Warning>))
        {
            // to ensure "polygons" is required (not null)
            if (polygons == null)
            {
                throw new ArgumentNullException("polygons is a required property for ReachableAreas and cannot be null");
            }
            this.Polygons = polygons;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The list of polygons calculated for the specified horizons in GeoJson format. For each horizon there is a separate polygon at the same index.
        /// </summary>
        /// <value>The list of polygons calculated for the specified horizons in GeoJson format. For each horizon there is a separate polygon at the same index.</value>
        [DataMember(Name = "polygons", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Polygons { get; set; }

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
            sb.Append("class ReachableAreas {\n");
            sb.Append("  Polygons: ").Append(Polygons).Append("\n");
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
            return this.Equals(input as ReachableAreas);
        }

        /// <summary>
        /// Returns true if ReachableAreas instances are equal
        /// </summary>
        /// <param name="input">Instance of ReachableAreas to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReachableAreas input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Polygons == input.Polygons ||
                    this.Polygons != null &&
                    input.Polygons != null &&
                    this.Polygons.SequenceEqual(input.Polygons)
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
                if (this.Polygons != null)
                {
                    hashCode = (hashCode * 59) + this.Polygons.GetHashCode();
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
