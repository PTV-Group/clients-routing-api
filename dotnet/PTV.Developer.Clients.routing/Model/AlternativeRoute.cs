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
    /// AlternativeRoute
    /// </summary>
    [DataContract(Name = "AlternativeRoute")]
    public partial class AlternativeRoute : IEquatable<AlternativeRoute>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AlternativeRoute" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AlternativeRoute() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AlternativeRoute" /> class.
        /// </summary>
        /// <param name="distance">The distance of the alternative route [m]. (required).</param>
        /// <param name="travelTime">The travel time for the alternative route [s]. (required).</param>
        /// <param name="trafficDelay">The total delay due to live traffic on this alternative route [s].  This value contains the sum of all traffic events on this alternative route and  will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information..</param>
        /// <param name="violated">If the alternative route cannot be calculated for the given vehicle the resulting alternative route is marked as violated. (required).</param>
        /// <param name="polyline">The polyline of the alternative route in the format specified by **options[polylineFormat]**..</param>
        /// <param name="routeId">The ID of the alternative route..</param>
        public AlternativeRoute(int distance = default(int), int travelTime = default(int), int trafficDelay = default(int), bool violated = default(bool), string polyline = default(string), Guid routeId = default(Guid))
        {
            this.Distance = distance;
            this.TravelTime = travelTime;
            this.Violated = violated;
            this.TrafficDelay = trafficDelay;
            this.Polyline = polyline;
            this.RouteId = routeId;
        }

        /// <summary>
        /// The distance of the alternative route [m].
        /// </summary>
        /// <value>The distance of the alternative route [m].</value>
        [DataMember(Name = "distance", IsRequired = true, EmitDefaultValue = true)]
        public int Distance { get; set; }

        /// <summary>
        /// The travel time for the alternative route [s].
        /// </summary>
        /// <value>The travel time for the alternative route [s].</value>
        [DataMember(Name = "travelTime", IsRequired = true, EmitDefaultValue = true)]
        public int TravelTime { get; set; }

        /// <summary>
        /// The total delay due to live traffic on this alternative route [s].  This value contains the sum of all traffic events on this alternative route and  will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.
        /// </summary>
        /// <value>The total delay due to live traffic on this alternative route [s].  This value contains the sum of all traffic events on this alternative route and  will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.</value>
        [DataMember(Name = "trafficDelay", EmitDefaultValue = false)]
        public int TrafficDelay { get; set; }

        /// <summary>
        /// If the alternative route cannot be calculated for the given vehicle the resulting alternative route is marked as violated.
        /// </summary>
        /// <value>If the alternative route cannot be calculated for the given vehicle the resulting alternative route is marked as violated.</value>
        [DataMember(Name = "violated", IsRequired = true, EmitDefaultValue = true)]
        public bool Violated { get; set; }

        /// <summary>
        /// The polyline of the alternative route in the format specified by **options[polylineFormat]**.
        /// </summary>
        /// <value>The polyline of the alternative route in the format specified by **options[polylineFormat]**.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = false)]
        public string Polyline { get; set; }

        /// <summary>
        /// The ID of the alternative route.
        /// </summary>
        /// <value>The ID of the alternative route.</value>
        [DataMember(Name = "routeId", EmitDefaultValue = false)]
        public Guid RouteId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AlternativeRoute {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  TravelTime: ").Append(TravelTime).Append("\n");
            sb.Append("  TrafficDelay: ").Append(TrafficDelay).Append("\n");
            sb.Append("  Violated: ").Append(Violated).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
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
            return this.Equals(input as AlternativeRoute);
        }

        /// <summary>
        /// Returns true if AlternativeRoute instances are equal
        /// </summary>
        /// <param name="input">Instance of AlternativeRoute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AlternativeRoute input)
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
                    this.TrafficDelay == input.TrafficDelay ||
                    this.TrafficDelay.Equals(input.TrafficDelay)
                ) && 
                (
                    this.Violated == input.Violated ||
                    this.Violated.Equals(input.Violated)
                ) && 
                (
                    this.Polyline == input.Polyline ||
                    (this.Polyline != null &&
                    this.Polyline.Equals(input.Polyline))
                ) && 
                (
                    this.RouteId == input.RouteId ||
                    (this.RouteId != null &&
                    this.RouteId.Equals(input.RouteId))
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
                hashCode = (hashCode * 59) + this.TrafficDelay.GetHashCode();
                hashCode = (hashCode * 59) + this.Violated.GetHashCode();
                if (this.Polyline != null)
                {
                    hashCode = (hashCode * 59) + this.Polyline.GetHashCode();
                }
                if (this.RouteId != null)
                {
                    hashCode = (hashCode * 59) + this.RouteId.GetHashCode();
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
            // Distance (int) minimum
            if (this.Distance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // TravelTime (int) minimum
            if (this.TravelTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TravelTime, must be a value greater than or equal to 0.", new [] { "TravelTime" });
            }

            // TrafficDelay (int) minimum
            if (this.TrafficDelay < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TrafficDelay, must be a value greater than or equal to 0.", new [] { "TrafficDelay" });
            }

            yield break;
        }
    }

}
