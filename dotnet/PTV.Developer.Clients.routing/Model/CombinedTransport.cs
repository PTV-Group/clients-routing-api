/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.15
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
    /// Influences the route course, so that the route uses a ferry or railway connection between the given locations. Both locations will be matched to the nearest ports looking for a direct connection. If no connection can be found, this waypoint will be ignored, and the warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED_ will be returned. If more than one connection is found, the best one will be used, and the alternative connections will be returned in the response in a warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS_. This waypoint will not appear as a waypoint event in the response and may not be used as start or destination. We will refer to this type of waypoint as a _combined-transport waypoint_.
    /// </summary>
    [DataContract(Name = "CombinedTransport")]
    public partial class CombinedTransport : IEquatable<CombinedTransport>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CombinedTransport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransport" /> class.
        /// </summary>
        /// <param name="start">start (required).</param>
        /// <param name="destination">destination (required).</param>
        public CombinedTransport(CombinedTransportLocation start = default(CombinedTransportLocation), CombinedTransportLocation destination = default(CombinedTransportLocation))
        {
            // to ensure "start" is required (not null)
            if (start == null)
            {
                throw new ArgumentNullException("start is a required property for CombinedTransport and cannot be null");
            }
            this.Start = start;
            // to ensure "destination" is required (not null)
            if (destination == null)
            {
                throw new ArgumentNullException("destination is a required property for CombinedTransport and cannot be null");
            }
            this.Destination = destination;
        }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name = "start", IsRequired = true, EmitDefaultValue = false)]
        public CombinedTransportLocation Start { get; set; }

        /// <summary>
        /// Gets or Sets Destination
        /// </summary>
        [DataMember(Name = "destination", IsRequired = true, EmitDefaultValue = false)]
        public CombinedTransportLocation Destination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CombinedTransport {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  Destination: ").Append(Destination).Append("\n");
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
            return this.Equals(input as CombinedTransport);
        }

        /// <summary>
        /// Returns true if CombinedTransport instances are equal
        /// </summary>
        /// <param name="input">Instance of CombinedTransport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CombinedTransport input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.Destination == input.Destination ||
                    (this.Destination != null &&
                    this.Destination.Equals(input.Destination))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.Destination != null)
                {
                    hashCode = (hashCode * 59) + this.Destination.GetHashCode();
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
