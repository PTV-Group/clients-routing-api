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
    /// Locations
    /// </summary>
    [DataContract(Name = "Locations")]
    public partial class Locations : IEquatable<Locations>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Locations" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Locations() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Locations" /> class.
        /// </summary>
        /// <param name="locations">locations (required).</param>
        public Locations(List<Location> locations = default(List<Location>))
        {
            // to ensure "locations" is required (not null)
            if (locations == null)
            {
                throw new ArgumentNullException("locations is a required property for Locations and cannot be null");
            }
            this._Locations = locations;
        }

        /// <summary>
        /// Gets or Sets _Locations
        /// </summary>
        [DataMember(Name = "locations", IsRequired = true, EmitDefaultValue = true)]
        public List<Location> _Locations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Locations {\n");
            sb.Append("  _Locations: ").Append(_Locations).Append("\n");
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
            return this.Equals(input as Locations);
        }

        /// <summary>
        /// Returns true if Locations instances are equal
        /// </summary>
        /// <param name="input">Instance of Locations to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Locations input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Locations == input._Locations ||
                    this._Locations != null &&
                    input._Locations != null &&
                    this._Locations.SequenceEqual(input._Locations)
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
                if (this._Locations != null)
                {
                    hashCode = (hashCode * 59) + this._Locations.GetHashCode();
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
