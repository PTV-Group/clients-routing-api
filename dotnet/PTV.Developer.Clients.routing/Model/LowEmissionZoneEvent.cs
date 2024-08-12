/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.29
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
    /// Issued when the route passes a low-emission zone. Requires _LOW_EMISSION_ZONE_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "LowEmissionZoneEvent")]
    public partial class LowEmissionZoneEvent : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets AccessType
        /// </summary>
        [DataMember(Name = "accessType", IsRequired = true, EmitDefaultValue = true)]
        public AccessType AccessType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="LowEmissionZoneEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LowEmissionZoneEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LowEmissionZoneEvent" /> class.
        /// </summary>
        /// <param name="name">The name of the low-emission zone.  (required).</param>
        /// <param name="accessType">accessType (required).</param>
        /// <param name="relatedEventIndex">For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise..</param>
        public LowEmissionZoneEvent(string name = default(string), AccessType accessType = default(AccessType), int relatedEventIndex = default(int))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for LowEmissionZoneEvent and cannot be null");
            }
            this.Name = name;
            this.AccessType = accessType;
            this.RelatedEventIndex = relatedEventIndex;
        }

        /// <summary>
        /// The name of the low-emission zone. 
        /// </summary>
        /// <value>The name of the low-emission zone. </value>
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
            sb.Append("class LowEmissionZoneEvent {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // RelatedEventIndex (int) minimum
            if (this.RelatedEventIndex < (int)0)
            {
                yield return new ValidationResult("Invalid value for RelatedEventIndex, must be a value greater than or equal to 0.", new [] { "RelatedEventIndex" });
            }

            yield break;
        }
    }

}
