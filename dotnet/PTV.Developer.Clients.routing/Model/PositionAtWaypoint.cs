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
    /// The vehicle position if it is at a waypoint. This parameter is mutually exclusive with **position**.
    /// </summary>
    [DataContract(Name = "PositionAtWaypoint")]
    public partial class PositionAtWaypoint : IEquatable<PositionAtWaypoint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionAtWaypoint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PositionAtWaypoint() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionAtWaypoint" /> class.
        /// </summary>
        /// <param name="name">The name of the waypoint. (required).</param>
        /// <param name="performedServiceTime">The service time [s] which has already been performed. (default to 0).</param>
        public PositionAtWaypoint(string name = default(string), int performedServiceTime = 0)
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for PositionAtWaypoint and cannot be null");
            }
            this.Name = name;
            this.PerformedServiceTime = performedServiceTime;
        }

        /// <summary>
        /// The name of the waypoint.
        /// </summary>
        /// <value>The name of the waypoint.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The service time [s] which has already been performed.
        /// </summary>
        /// <value>The service time [s] which has already been performed.</value>
        [DataMember(Name = "performedServiceTime", EmitDefaultValue = false)]
        public int PerformedServiceTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PositionAtWaypoint {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PerformedServiceTime: ").Append(PerformedServiceTime).Append("\n");
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
            return this.Equals(input as PositionAtWaypoint);
        }

        /// <summary>
        /// Returns true if PositionAtWaypoint instances are equal
        /// </summary>
        /// <param name="input">Instance of PositionAtWaypoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PositionAtWaypoint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.PerformedServiceTime == input.PerformedServiceTime ||
                    this.PerformedServiceTime.Equals(input.PerformedServiceTime)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PerformedServiceTime.GetHashCode();
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
            // PerformedServiceTime (int) minimum
            if (this.PerformedServiceTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PerformedServiceTime, must be a value greater than or equal to 0.", new [] { "PerformedServiceTime" });
            }

            yield break;
        }
    }

}
