/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
    /// ReachableOptions
    /// </summary>
    [DataContract(Name = "ReachableOptions")]
    public partial class ReachableOptions : IEquatable<ReachableOptions>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets DrivingDirection
        /// </summary>
        [DataMember(Name = "drivingDirection", EmitDefaultValue = false)]
        public DrivingDirection? DrivingDirection { get; set; }

        /// <summary>
        /// Gets or Sets TrafficMode
        /// </summary>
        [DataMember(Name = "trafficMode", EmitDefaultValue = false)]
        public ReachableTrafficMode? TrafficMode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableOptions" /> class.
        /// </summary>
        /// <param name="drivingDirection">drivingDirection.</param>
        /// <param name="referenceTime">Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. Responses will contain the offset to UTC specified in the request or that of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time..</param>
        /// <param name="trafficMode">trafficMode.</param>
        /// <param name="allowedCountries">The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision..</param>
        /// <param name="prohibitedCountries">The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision..</param>
        /// <param name="blockIntersectingRoads">Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. .</param>
        public ReachableOptions(DrivingDirection? drivingDirection = default(DrivingDirection?), DateTimeOffset? referenceTime = default(DateTimeOffset?), ReachableTrafficMode? trafficMode = default(ReachableTrafficMode?), List<string> allowedCountries = default(List<string>), List<string> prohibitedCountries = default(List<string>), string blockIntersectingRoads = default(string))
        {
            this.DrivingDirection = drivingDirection;
            this.ReferenceTime = referenceTime;
            this.TrafficMode = trafficMode;
            this.AllowedCountries = allowedCountries;
            this.ProhibitedCountries = prohibitedCountries;
            this.BlockIntersectingRoads = blockIntersectingRoads;
        }

        /// <summary>
        /// Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. Responses will contain the offset to UTC specified in the request or that of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.
        /// </summary>
        /// <value>Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. Responses will contain the offset to UTC specified in the request or that of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.</value>
        [DataMember(Name = "referenceTime", EmitDefaultValue = true)]
        public DateTimeOffset? ReferenceTime { get; set; }

        /// <summary>
        /// The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        [DataMember(Name = "allowedCountries", EmitDefaultValue = true)]
        public List<string> AllowedCountries { get; set; }

        /// <summary>
        /// The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        [DataMember(Name = "prohibitedCountries", EmitDefaultValue = true)]
        public List<string> ProhibitedCountries { get; set; }

        /// <summary>
        /// Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
        /// </summary>
        /// <value>Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. </value>
        [DataMember(Name = "blockIntersectingRoads", EmitDefaultValue = true)]
        public string BlockIntersectingRoads { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReachableOptions {\n");
            sb.Append("  DrivingDirection: ").Append(DrivingDirection).Append("\n");
            sb.Append("  ReferenceTime: ").Append(ReferenceTime).Append("\n");
            sb.Append("  TrafficMode: ").Append(TrafficMode).Append("\n");
            sb.Append("  AllowedCountries: ").Append(AllowedCountries).Append("\n");
            sb.Append("  ProhibitedCountries: ").Append(ProhibitedCountries).Append("\n");
            sb.Append("  BlockIntersectingRoads: ").Append(BlockIntersectingRoads).Append("\n");
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
            return this.Equals(input as ReachableOptions);
        }

        /// <summary>
        /// Returns true if ReachableOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of ReachableOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReachableOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DrivingDirection == input.DrivingDirection ||
                    this.DrivingDirection.Equals(input.DrivingDirection)
                ) && 
                (
                    this.ReferenceTime == input.ReferenceTime ||
                    (this.ReferenceTime != null &&
                    this.ReferenceTime.Equals(input.ReferenceTime))
                ) && 
                (
                    this.TrafficMode == input.TrafficMode ||
                    this.TrafficMode.Equals(input.TrafficMode)
                ) && 
                (
                    this.AllowedCountries == input.AllowedCountries ||
                    this.AllowedCountries != null &&
                    input.AllowedCountries != null &&
                    this.AllowedCountries.SequenceEqual(input.AllowedCountries)
                ) && 
                (
                    this.ProhibitedCountries == input.ProhibitedCountries ||
                    this.ProhibitedCountries != null &&
                    input.ProhibitedCountries != null &&
                    this.ProhibitedCountries.SequenceEqual(input.ProhibitedCountries)
                ) && 
                (
                    this.BlockIntersectingRoads == input.BlockIntersectingRoads ||
                    (this.BlockIntersectingRoads != null &&
                    this.BlockIntersectingRoads.Equals(input.BlockIntersectingRoads))
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
                hashCode = (hashCode * 59) + this.DrivingDirection.GetHashCode();
                if (this.ReferenceTime != null)
                {
                    hashCode = (hashCode * 59) + this.ReferenceTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TrafficMode.GetHashCode();
                if (this.AllowedCountries != null)
                {
                    hashCode = (hashCode * 59) + this.AllowedCountries.GetHashCode();
                }
                if (this.ProhibitedCountries != null)
                {
                    hashCode = (hashCode * 59) + this.ProhibitedCountries.GetHashCode();
                }
                if (this.BlockIntersectingRoads != null)
                {
                    hashCode = (hashCode * 59) + this.BlockIntersectingRoads.GetHashCode();
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