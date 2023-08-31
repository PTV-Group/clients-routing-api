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
    /// Issued when the route passes a road which is prohibited for the given vehicle but passed nevertheless as there is no other valid route or when schedule restrictions are violated. Requires _VIOLATION_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "ViolationEvent")]
    public partial class ViolationEvent : IEquatable<ViolationEvent>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public ViolationType Type { get; set; }

        /// <summary>
        /// Gets or Sets AccessType
        /// </summary>
        [DataMember(Name = "accessType", EmitDefaultValue = false)]
        public AccessType? AccessType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ViolationEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ViolationEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ViolationEvent" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="scheduleViolationTypes">Contains the list of violated schedule restrictions at this event. Only present if **type&#x3D;SCHEDULE**. .</param>
        /// <param name="accessType">accessType.</param>
        /// <param name="relatedEventIndex">For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise..</param>
        /// <param name="polyline">The polyline of the violation in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _VIOLATION_EVENTS_POLYLINE_ to be requested..</param>
        public ViolationEvent(ViolationType type = default(ViolationType), List<ScheduleViolationType> scheduleViolationTypes = default(List<ScheduleViolationType>), AccessType? accessType = default(AccessType?), int relatedEventIndex = default(int), string polyline = default(string))
        {
            this.Type = type;
            this.ScheduleViolationTypes = scheduleViolationTypes;
            this.AccessType = accessType;
            this.RelatedEventIndex = relatedEventIndex;
            this.Polyline = polyline;
        }

        /// <summary>
        /// Contains the list of violated schedule restrictions at this event. Only present if **type&#x3D;SCHEDULE**. 
        /// </summary>
        /// <value>Contains the list of violated schedule restrictions at this event. Only present if **type&#x3D;SCHEDULE**. </value>
        [DataMember(Name = "scheduleViolationTypes", EmitDefaultValue = false)]
        public List<ScheduleViolationType> ScheduleViolationTypes { get; set; }

        /// <summary>
        /// For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
        /// </summary>
        /// <value>For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.</value>
        [DataMember(Name = "relatedEventIndex", EmitDefaultValue = false)]
        public int RelatedEventIndex { get; set; }

        /// <summary>
        /// The polyline of the violation in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _VIOLATION_EVENTS_POLYLINE_ to be requested.
        /// </summary>
        /// <value>The polyline of the violation in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _VIOLATION_EVENTS_POLYLINE_ to be requested.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = false)]
        public string Polyline { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ViolationEvent {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ScheduleViolationTypes: ").Append(ScheduleViolationTypes).Append("\n");
            sb.Append("  AccessType: ").Append(AccessType).Append("\n");
            sb.Append("  RelatedEventIndex: ").Append(RelatedEventIndex).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
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
            return this.Equals(input as ViolationEvent);
        }

        /// <summary>
        /// Returns true if ViolationEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of ViolationEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ViolationEvent input)
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
                    this.ScheduleViolationTypes == input.ScheduleViolationTypes ||
                    this.ScheduleViolationTypes != null &&
                    input.ScheduleViolationTypes != null &&
                    this.ScheduleViolationTypes.SequenceEqual(input.ScheduleViolationTypes)
                ) && 
                (
                    this.AccessType == input.AccessType ||
                    this.AccessType.Equals(input.AccessType)
                ) && 
                (
                    this.RelatedEventIndex == input.RelatedEventIndex ||
                    this.RelatedEventIndex.Equals(input.RelatedEventIndex)
                ) && 
                (
                    this.Polyline == input.Polyline ||
                    (this.Polyline != null &&
                    this.Polyline.Equals(input.Polyline))
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
                if (this.ScheduleViolationTypes != null)
                {
                    hashCode = (hashCode * 59) + this.ScheduleViolationTypes.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AccessType.GetHashCode();
                hashCode = (hashCode * 59) + this.RelatedEventIndex.GetHashCode();
                if (this.Polyline != null)
                {
                    hashCode = (hashCode * 59) + this.Polyline.GetHashCode();
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
            // RelatedEventIndex (int) minimum
            if (this.RelatedEventIndex < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelatedEventIndex, must be a value greater than or equal to 0.", new [] { "RelatedEventIndex" });
            }

            yield break;
        }
    }

}
