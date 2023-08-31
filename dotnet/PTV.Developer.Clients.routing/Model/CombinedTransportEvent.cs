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
    /// Issued when a combined transport is entered or exited. Requires _COMBINED_TRANSPORT_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "CombinedTransportEvent")]
    public partial class CombinedTransportEvent : IEquatable<CombinedTransportEvent>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public CombinedTransportType Type { get; set; }

        /// <summary>
        /// Gets or Sets AccessType
        /// </summary>
        [DataMember(Name = "accessType", IsRequired = true, EmitDefaultValue = true)]
        public AccessType AccessType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransportEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CombinedTransportEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransportEvent" /> class.
        /// </summary>
        /// <param name="name">The name of the combined transport. (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="accessType">accessType (required).</param>
        /// <param name="relatedEventIndex">For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise..</param>
        public CombinedTransportEvent(string name = default(string), CombinedTransportType type = default(CombinedTransportType), AccessType accessType = default(AccessType), int relatedEventIndex = default(int))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CombinedTransportEvent and cannot be null");
            }
            this.Name = name;
            this.Type = type;
            this.AccessType = accessType;
            this.RelatedEventIndex = relatedEventIndex;
        }

        /// <summary>
        /// The name of the combined transport.
        /// </summary>
        /// <value>The name of the combined transport.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
        /// </summary>
        /// <value>For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.</value>
        [DataMember(Name = "relatedEventIndex", EmitDefaultValue = false)]
        public int RelatedEventIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CombinedTransportEvent {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  AccessType: ").Append(AccessType).Append("\n");
            sb.Append("  RelatedEventIndex: ").Append(RelatedEventIndex).Append("\n");
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
            return this.Equals(input as CombinedTransportEvent);
        }

        /// <summary>
        /// Returns true if CombinedTransportEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of CombinedTransportEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CombinedTransportEvent input)
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
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.AccessType == input.AccessType ||
                    this.AccessType.Equals(input.AccessType)
                ) && 
                (
                    this.RelatedEventIndex == input.RelatedEventIndex ||
                    this.RelatedEventIndex.Equals(input.RelatedEventIndex)
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                hashCode = (hashCode * 59) + this.AccessType.GetHashCode();
                hashCode = (hashCode * 59) + this.RelatedEventIndex.GetHashCode();
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
