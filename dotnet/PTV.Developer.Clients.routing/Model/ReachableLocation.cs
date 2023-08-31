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
    /// Contains the distance and travel time from the input waypoint or route to a reached location or vice versa (depending on the request drivingDirection).
    /// </summary>
    [DataContract(Name = "ReachableLocation")]
    public partial class ReachableLocation : IEquatable<ReachableLocation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableLocation" /> class.
        /// </summary>
        /// <param name="distance">The distance from the input waypoint to this location or vice versa..</param>
        /// <param name="travelTime">The travel time from the input waypoint to this location or vice versa..</param>
        /// <param name="index">The index of the reached input location..</param>
        public ReachableLocation(int distance = default(int), int travelTime = default(int), int index = default(int))
        {
            this.Distance = distance;
            this.TravelTime = travelTime;
            this.Index = index;
        }

        /// <summary>
        /// The distance from the input waypoint to this location or vice versa.
        /// </summary>
        /// <value>The distance from the input waypoint to this location or vice versa.</value>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The travel time from the input waypoint to this location or vice versa.
        /// </summary>
        /// <value>The travel time from the input waypoint to this location or vice versa.</value>
        [DataMember(Name = "travelTime", EmitDefaultValue = false)]
        public int TravelTime { get; set; }

        /// <summary>
        /// The index of the reached input location.
        /// </summary>
        /// <value>The index of the reached input location.</value>
        [DataMember(Name = "index", EmitDefaultValue = false)]
        public int Index { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReachableLocation {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  TravelTime: ").Append(TravelTime).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
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
            return this.Equals(input as ReachableLocation);
        }

        /// <summary>
        /// Returns true if ReachableLocation instances are equal
        /// </summary>
        /// <param name="input">Instance of ReachableLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReachableLocation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.TravelTime == input.TravelTime ||
                    this.TravelTime.Equals(input.TravelTime)
                ) && 
                (
                    this.Index == input.Index ||
                    this.Index.Equals(input.Index)
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
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.TravelTime.GetHashCode();
                hashCode = (hashCode * 59) + this.Index.GetHashCode();
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
