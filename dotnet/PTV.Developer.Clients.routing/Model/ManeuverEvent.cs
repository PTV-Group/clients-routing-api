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
    /// Issued when the driver has to perform a maneuver, e.g. to turn or to enter a roundabout. Requires _MANEUVER_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "ManeuverEvent")]
    public partial class ManeuverEvent : IEquatable<ManeuverEvent>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public ManeuverType Type { get; set; }

        /// <summary>
        /// Gets or Sets CombinedTransportType
        /// </summary>
        [DataMember(Name = "combinedTransportType", EmitDefaultValue = false)]
        public CombinedTransportType? CombinedTransportType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ManeuverEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ManeuverEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ManeuverEvent" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="relativeDirection">The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise)..</param>
        /// <param name="absoluteDirection">The absolute direction of the outgoing road (clockwise). North represents 0 degrees..</param>
        /// <param name="description">A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language. (required).</param>
        /// <param name="roadAhead">roadAhead.</param>
        /// <param name="directionSignText">The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available..</param>
        /// <param name="exitNumber">The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number..</param>
        /// <param name="exitName">The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name..</param>
        /// <param name="roundaboutExit">The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\\_ROUNDABOUT_..</param>
        /// <param name="combinedTransportName">The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\\_COMBINED\\_TRANSPORT_..</param>
        /// <param name="combinedTransportType">combinedTransportType.</param>
        /// <param name="crossingRoadName">The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\\_U\\_TURN_ and if the U-turn takes place at a crossing..</param>
        public ManeuverEvent(ManeuverType type = default(ManeuverType), int relativeDirection = default(int), int absoluteDirection = default(int), string description = default(string), RoadAhead roadAhead = default(RoadAhead), string directionSignText = default(string), string exitNumber = default(string), string exitName = default(string), int roundaboutExit = default(int), string combinedTransportName = default(string), CombinedTransportType? combinedTransportType = default(CombinedTransportType?), string crossingRoadName = default(string))
        {
            this.Type = type;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for ManeuverEvent and cannot be null");
            }
            this.Description = description;
            this.RelativeDirection = relativeDirection;
            this.AbsoluteDirection = absoluteDirection;
            this.RoadAhead = roadAhead;
            this.DirectionSignText = directionSignText;
            this.ExitNumber = exitNumber;
            this.ExitName = exitName;
            this.RoundaboutExit = roundaboutExit;
            this.CombinedTransportName = combinedTransportName;
            this.CombinedTransportType = combinedTransportType;
            this.CrossingRoadName = crossingRoadName;
        }

        /// <summary>
        /// The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise).
        /// </summary>
        /// <value>The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise).</value>
        [DataMember(Name = "relativeDirection", EmitDefaultValue = false)]
        public int RelativeDirection { get; set; }

        /// <summary>
        /// The absolute direction of the outgoing road (clockwise). North represents 0 degrees.
        /// </summary>
        /// <value>The absolute direction of the outgoing road (clockwise). North represents 0 degrees.</value>
        [DataMember(Name = "absoluteDirection", EmitDefaultValue = false)]
        public int AbsoluteDirection { get; set; }

        /// <summary>
        /// A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language.
        /// </summary>
        /// <value>A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets RoadAhead
        /// </summary>
        [DataMember(Name = "roadAhead", EmitDefaultValue = false)]
        public RoadAhead RoadAhead { get; set; }

        /// <summary>
        /// The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available.
        /// </summary>
        /// <value>The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available.</value>
        [DataMember(Name = "directionSignText", EmitDefaultValue = false)]
        public string DirectionSignText { get; set; }

        /// <summary>
        /// The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number.
        /// </summary>
        /// <value>The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number.</value>
        [DataMember(Name = "exitNumber", EmitDefaultValue = false)]
        public string ExitNumber { get; set; }

        /// <summary>
        /// The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name.
        /// </summary>
        /// <value>The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name.</value>
        [DataMember(Name = "exitName", EmitDefaultValue = false)]
        public string ExitName { get; set; }

        /// <summary>
        /// The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\\_ROUNDABOUT_.
        /// </summary>
        /// <value>The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\\_ROUNDABOUT_.</value>
        [DataMember(Name = "roundaboutExit", EmitDefaultValue = false)]
        public int RoundaboutExit { get; set; }

        /// <summary>
        /// The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\\_COMBINED\\_TRANSPORT_.
        /// </summary>
        /// <value>The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\\_COMBINED\\_TRANSPORT_.</value>
        [DataMember(Name = "combinedTransportName", EmitDefaultValue = false)]
        public string CombinedTransportName { get; set; }

        /// <summary>
        /// The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\\_U\\_TURN_ and if the U-turn takes place at a crossing.
        /// </summary>
        /// <value>The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\\_U\\_TURN_ and if the U-turn takes place at a crossing.</value>
        [DataMember(Name = "crossingRoadName", EmitDefaultValue = false)]
        public string CrossingRoadName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ManeuverEvent {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  RelativeDirection: ").Append(RelativeDirection).Append("\n");
            sb.Append("  AbsoluteDirection: ").Append(AbsoluteDirection).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  RoadAhead: ").Append(RoadAhead).Append("\n");
            sb.Append("  DirectionSignText: ").Append(DirectionSignText).Append("\n");
            sb.Append("  ExitNumber: ").Append(ExitNumber).Append("\n");
            sb.Append("  ExitName: ").Append(ExitName).Append("\n");
            sb.Append("  RoundaboutExit: ").Append(RoundaboutExit).Append("\n");
            sb.Append("  CombinedTransportName: ").Append(CombinedTransportName).Append("\n");
            sb.Append("  CombinedTransportType: ").Append(CombinedTransportType).Append("\n");
            sb.Append("  CrossingRoadName: ").Append(CrossingRoadName).Append("\n");
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
            return this.Equals(input as ManeuverEvent);
        }

        /// <summary>
        /// Returns true if ManeuverEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of ManeuverEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ManeuverEvent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.RelativeDirection == input.RelativeDirection ||
                    this.RelativeDirection.Equals(input.RelativeDirection)
                ) && 
                (
                    this.AbsoluteDirection == input.AbsoluteDirection ||
                    this.AbsoluteDirection.Equals(input.AbsoluteDirection)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.RoadAhead == input.RoadAhead ||
                    (this.RoadAhead != null &&
                    this.RoadAhead.Equals(input.RoadAhead))
                ) && 
                (
                    this.DirectionSignText == input.DirectionSignText ||
                    (this.DirectionSignText != null &&
                    this.DirectionSignText.Equals(input.DirectionSignText))
                ) && 
                (
                    this.ExitNumber == input.ExitNumber ||
                    (this.ExitNumber != null &&
                    this.ExitNumber.Equals(input.ExitNumber))
                ) && 
                (
                    this.ExitName == input.ExitName ||
                    (this.ExitName != null &&
                    this.ExitName.Equals(input.ExitName))
                ) && 
                (
                    this.RoundaboutExit == input.RoundaboutExit ||
                    this.RoundaboutExit.Equals(input.RoundaboutExit)
                ) && 
                (
                    this.CombinedTransportName == input.CombinedTransportName ||
                    (this.CombinedTransportName != null &&
                    this.CombinedTransportName.Equals(input.CombinedTransportName))
                ) && 
                (
                    this.CombinedTransportType == input.CombinedTransportType ||
                    this.CombinedTransportType.Equals(input.CombinedTransportType)
                ) && 
                (
                    this.CrossingRoadName == input.CrossingRoadName ||
                    (this.CrossingRoadName != null &&
                    this.CrossingRoadName.Equals(input.CrossingRoadName))
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                hashCode = (hashCode * 59) + this.RelativeDirection.GetHashCode();
                hashCode = (hashCode * 59) + this.AbsoluteDirection.GetHashCode();
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.RoadAhead != null)
                {
                    hashCode = (hashCode * 59) + this.RoadAhead.GetHashCode();
                }
                if (this.DirectionSignText != null)
                {
                    hashCode = (hashCode * 59) + this.DirectionSignText.GetHashCode();
                }
                if (this.ExitNumber != null)
                {
                    hashCode = (hashCode * 59) + this.ExitNumber.GetHashCode();
                }
                if (this.ExitName != null)
                {
                    hashCode = (hashCode * 59) + this.ExitName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RoundaboutExit.GetHashCode();
                if (this.CombinedTransportName != null)
                {
                    hashCode = (hashCode * 59) + this.CombinedTransportName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CombinedTransportType.GetHashCode();
                if (this.CrossingRoadName != null)
                {
                    hashCode = (hashCode * 59) + this.CrossingRoadName.GetHashCode();
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
            // RelativeDirection (int) maximum
            if (this.RelativeDirection > (int)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelativeDirection, must be a value less than or equal to 180.", new [] { "RelativeDirection" });
            }

            // RelativeDirection (int) minimum
            if (this.RelativeDirection < (int)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelativeDirection, must be a value greater than or equal to -180.", new [] { "RelativeDirection" });
            }

            // AbsoluteDirection (int) maximum
            if (this.AbsoluteDirection > (int)360)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AbsoluteDirection, must be a value less than or equal to 360.", new [] { "AbsoluteDirection" });
            }

            // AbsoluteDirection (int) minimum
            if (this.AbsoluteDirection < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AbsoluteDirection, must be a value greater than or equal to 0.", new [] { "AbsoluteDirection" });
            }

            // RoundaboutExit (int) minimum
            if (this.RoundaboutExit < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RoundaboutExit, must be a value greater than or equal to 0.", new [] { "RoundaboutExit" });
            }

            yield break;
        }
    }

}
