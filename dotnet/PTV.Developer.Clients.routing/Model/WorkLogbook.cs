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
    /// Defines the accumulated driving, working and travel times since the last break or daily rest. For details see this [concept](./concepts/drivers-working-hours).
    /// </summary>
    [DataContract(Name = "WorkLogbook")]
    public partial class WorkLogbook : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkLogbook" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WorkLogbook() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkLogbook" /> class.
        /// </summary>
        /// <param name="lastTimeTheDriverWorked">The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).    The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The date must provide an offset to UTC.   See [here](./concepts/date-and-time) for more information on the relevance of date and time. (required).</param>
        /// <param name="accumulatedDrivingTimeSinceLastBreak">Accumulated driving time since end of last break [s], this includes all time behind the wheel.   Values higher than the maximum driving time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset.  (default to 0).</param>
        /// <param name="accumulatedWorkingTimeSinceLastBreak">Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold.     Values higher than the maximum working time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. .</param>
        /// <param name="accumulatedDrivingTimeSinceLastDailyRest">Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel.   Values higher than the maximum driving time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. .</param>
        /// <param name="accumulatedTravelTimeSinceLastDailyRest">Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest.   Values higher than maximum travel time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0. .</param>
        public WorkLogbook(DateTimeOffset? lastTimeTheDriverWorked = default(DateTimeOffset?), int accumulatedDrivingTimeSinceLastBreak = 0, int? accumulatedWorkingTimeSinceLastBreak = default(int?), int? accumulatedDrivingTimeSinceLastDailyRest = default(int?), int? accumulatedTravelTimeSinceLastDailyRest = default(int?))
        {
            // to ensure "lastTimeTheDriverWorked" is required (not null)
            if (lastTimeTheDriverWorked == null)
            {
                throw new ArgumentNullException("lastTimeTheDriverWorked is a required property for WorkLogbook and cannot be null");
            }
            this.LastTimeTheDriverWorked = lastTimeTheDriverWorked;
            this.AccumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
            this.AccumulatedWorkingTimeSinceLastBreak = accumulatedWorkingTimeSinceLastBreak;
            this.AccumulatedDrivingTimeSinceLastDailyRest = accumulatedDrivingTimeSinceLastDailyRest;
            this.AccumulatedTravelTimeSinceLastDailyRest = accumulatedTravelTimeSinceLastDailyRest;
        }

        /// <summary>
        /// The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).    The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The date must provide an offset to UTC.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
        /// </summary>
        /// <value>The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).    The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The date must provide an offset to UTC.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.</value>
        /// <example>2020-12-04T06:00Z</example>
        [DataMember(Name = "lastTimeTheDriverWorked", IsRequired = true, EmitDefaultValue = true)]
        public DateTimeOffset? LastTimeTheDriverWorked { get; set; }

        /// <summary>
        /// Accumulated driving time since end of last break [s], this includes all time behind the wheel.   Values higher than the maximum driving time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. 
        /// </summary>
        /// <value>Accumulated driving time since end of last break [s], this includes all time behind the wheel.   Values higher than the maximum driving time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. </value>
        [DataMember(Name = "accumulatedDrivingTimeSinceLastBreak", EmitDefaultValue = false)]
        public int AccumulatedDrivingTimeSinceLastBreak { get; set; }

        /// <summary>
        /// Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold.     Values higher than the maximum working time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. 
        /// </summary>
        /// <value>Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold.     Values higher than the maximum working time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. </value>
        [DataMember(Name = "accumulatedWorkingTimeSinceLastBreak", EmitDefaultValue = true)]
        public int? AccumulatedWorkingTimeSinceLastBreak { get; set; }

        /// <summary>
        /// Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel.   Values higher than the maximum driving time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. 
        /// </summary>
        /// <value>Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel.   Values higher than the maximum driving time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. </value>
        [DataMember(Name = "accumulatedDrivingTimeSinceLastDailyRest", EmitDefaultValue = true)]
        public int? AccumulatedDrivingTimeSinceLastDailyRest { get; set; }

        /// <summary>
        /// Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest.   Values higher than maximum travel time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0. 
        /// </summary>
        /// <value>Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest.   Values higher than maximum travel time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0. </value>
        [DataMember(Name = "accumulatedTravelTimeSinceLastDailyRest", EmitDefaultValue = true)]
        public int? AccumulatedTravelTimeSinceLastDailyRest { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WorkLogbook {\n");
            sb.Append("  LastTimeTheDriverWorked: ").Append(LastTimeTheDriverWorked).Append("\n");
            sb.Append("  AccumulatedDrivingTimeSinceLastBreak: ").Append(AccumulatedDrivingTimeSinceLastBreak).Append("\n");
            sb.Append("  AccumulatedWorkingTimeSinceLastBreak: ").Append(AccumulatedWorkingTimeSinceLastBreak).Append("\n");
            sb.Append("  AccumulatedDrivingTimeSinceLastDailyRest: ").Append(AccumulatedDrivingTimeSinceLastDailyRest).Append("\n");
            sb.Append("  AccumulatedTravelTimeSinceLastDailyRest: ").Append(AccumulatedTravelTimeSinceLastDailyRest).Append("\n");
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
            // AccumulatedDrivingTimeSinceLastBreak (int) minimum
            if (this.AccumulatedDrivingTimeSinceLastBreak < (int)0)
            {
                yield return new ValidationResult("Invalid value for AccumulatedDrivingTimeSinceLastBreak, must be a value greater than or equal to 0.", new [] { "AccumulatedDrivingTimeSinceLastBreak" });
            }

            // AccumulatedWorkingTimeSinceLastBreak (int?) minimum
            if (this.AccumulatedWorkingTimeSinceLastBreak < (int?)0)
            {
                yield return new ValidationResult("Invalid value for AccumulatedWorkingTimeSinceLastBreak, must be a value greater than or equal to 0.", new [] { "AccumulatedWorkingTimeSinceLastBreak" });
            }

            // AccumulatedDrivingTimeSinceLastDailyRest (int?) minimum
            if (this.AccumulatedDrivingTimeSinceLastDailyRest < (int?)0)
            {
                yield return new ValidationResult("Invalid value for AccumulatedDrivingTimeSinceLastDailyRest, must be a value greater than or equal to 0.", new [] { "AccumulatedDrivingTimeSinceLastDailyRest" });
            }

            // AccumulatedTravelTimeSinceLastDailyRest (int?) minimum
            if (this.AccumulatedTravelTimeSinceLastDailyRest < (int?)0)
            {
                yield return new ValidationResult("Invalid value for AccumulatedTravelTimeSinceLastDailyRest, must be a value greater than or equal to 0.", new [] { "AccumulatedTravelTimeSinceLastDailyRest" });
            }

            yield break;
        }
    }

}
