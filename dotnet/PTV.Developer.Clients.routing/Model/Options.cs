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
    /// Options
    /// </summary>
    [DataContract(Name = "Options")]
    public partial class Options : IEquatable<Options>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets TrafficMode
        /// </summary>
        [DataMember(Name = "trafficMode", EmitDefaultValue = false)]
        public TrafficMode? TrafficMode { get; set; }

        /// <summary>
        /// Gets or Sets PolylineFormat
        /// </summary>
        [DataMember(Name = "polylineFormat", EmitDefaultValue = false)]
        public PolylineFormat? PolylineFormat { get; set; }

        /// <summary>
        /// Gets or Sets RoutingMode
        /// </summary>
        [DataMember(Name = "routingMode", EmitDefaultValue = false)]
        public RoutingMode? RoutingMode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Options" /> class.
        /// </summary>
        /// <param name="startTime">Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **arrivalTime**. If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. Responses will contain the offset to UTC specified in the request or that of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time..</param>
        /// <param name="arrivalTime">Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **startTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. Responses will contain the offset to UTC specified in the request or that of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time..</param>
        /// <param name="trafficMode">trafficMode.</param>
        /// <param name="language">The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; is returned if the language is not supported for maneuvers. (default to &quot;en&quot;).</param>
        /// <param name="polylineFormat">polylineFormat.</param>
        /// <param name="allowedCountries">The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision..</param>
        /// <param name="prohibitedCountries">The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision..</param>
        /// <param name="currency">The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]&#x3D;MONETARY**..</param>
        /// <param name="preferTurnsOnPassengerSide">Specifies that the route is constructed such that turns to the passenger side are preferred.  (default to false).</param>
        /// <param name="avoid">Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise. * &#x60;TOLL&#x60; - Avoid roads with toll. * &#x60;FERRIES&#x60; - Avoid ferries. Ferries which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;BOAT&#x60;. * &#x60;RAIL_SHUTTLES&#x60; - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;RAIL&#x60;.   Cannot be used with **options[routingMode]&#x3D;MONETARY**..</param>
        /// <param name="blockIntersectingRoads">Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine. If they have to be used to connect two waypoints then the route will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. .</param>
        /// <param name="routingMode">routingMode.</param>
        public Options(DateTimeOffset? startTime = default(DateTimeOffset?), DateTimeOffset? arrivalTime = default(DateTimeOffset?), TrafficMode? trafficMode = default(TrafficMode?), string language = "en", PolylineFormat? polylineFormat = default(PolylineFormat?), List<string> allowedCountries = default(List<string>), List<string> prohibitedCountries = default(List<string>), string currency = default(string), bool preferTurnsOnPassengerSide = false, List<AvoidFeature> avoid = default(List<AvoidFeature>), string blockIntersectingRoads = default(string), RoutingMode? routingMode = default(RoutingMode?))
        {
            this.StartTime = startTime;
            this.ArrivalTime = arrivalTime;
            this.TrafficMode = trafficMode;
            // use default value if no "language" provided
            this.Language = language ?? "en";
            this.PolylineFormat = polylineFormat;
            this.AllowedCountries = allowedCountries;
            this.ProhibitedCountries = prohibitedCountries;
            this.Currency = currency;
            this.PreferTurnsOnPassengerSide = preferTurnsOnPassengerSide;
            this.Avoid = avoid;
            this.BlockIntersectingRoads = blockIntersectingRoads;
            this.RoutingMode = routingMode;
        }

        /// <summary>
        /// Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **arrivalTime**. If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. Responses will contain the offset to UTC specified in the request or that of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
        /// </summary>
        /// <value>Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **arrivalTime**. If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. Responses will contain the offset to UTC specified in the request or that of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.</value>
        [DataMember(Name = "startTime", EmitDefaultValue = true)]
        public DateTimeOffset? StartTime { get; set; }

        /// <summary>
        /// Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **startTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. Responses will contain the offset to UTC specified in the request or that of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
        /// </summary>
        /// <value>Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **startTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. Responses will contain the offset to UTC specified in the request or that of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.</value>
        [DataMember(Name = "arrivalTime", EmitDefaultValue = true)]
        public DateTimeOffset? ArrivalTime { get; set; }

        /// <summary>
        /// The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; is returned if the language is not supported for maneuvers.
        /// </summary>
        /// <value>The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; is returned if the language is not supported for maneuvers.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

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
        /// The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]&#x3D;MONETARY**.
        /// </summary>
        /// <value>The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]&#x3D;MONETARY**.</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Specifies that the route is constructed such that turns to the passenger side are preferred. 
        /// </summary>
        /// <value>Specifies that the route is constructed such that turns to the passenger side are preferred. </value>
        [DataMember(Name = "preferTurnsOnPassengerSide", EmitDefaultValue = true)]
        public bool PreferTurnsOnPassengerSide { get; set; }

        /// <summary>
        /// Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise. * &#x60;TOLL&#x60; - Avoid roads with toll. * &#x60;FERRIES&#x60; - Avoid ferries. Ferries which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;BOAT&#x60;. * &#x60;RAIL_SHUTTLES&#x60; - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;RAIL&#x60;.   Cannot be used with **options[routingMode]&#x3D;MONETARY**.
        /// </summary>
        /// <value>Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise. * &#x60;TOLL&#x60; - Avoid roads with toll. * &#x60;FERRIES&#x60; - Avoid ferries. Ferries which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;BOAT&#x60;. * &#x60;RAIL_SHUTTLES&#x60; - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;RAIL&#x60;.   Cannot be used with **options[routingMode]&#x3D;MONETARY**.</value>
        [DataMember(Name = "avoid", EmitDefaultValue = true)]
        public List<AvoidFeature> Avoid { get; set; }

        /// <summary>
        /// Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine. If they have to be used to connect two waypoints then the route will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
        /// </summary>
        /// <value>Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine. If they have to be used to connect two waypoints then the route will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. </value>
        [DataMember(Name = "blockIntersectingRoads", EmitDefaultValue = true)]
        public string BlockIntersectingRoads { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Options {\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  ArrivalTime: ").Append(ArrivalTime).Append("\n");
            sb.Append("  TrafficMode: ").Append(TrafficMode).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  PolylineFormat: ").Append(PolylineFormat).Append("\n");
            sb.Append("  AllowedCountries: ").Append(AllowedCountries).Append("\n");
            sb.Append("  ProhibitedCountries: ").Append(ProhibitedCountries).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  PreferTurnsOnPassengerSide: ").Append(PreferTurnsOnPassengerSide).Append("\n");
            sb.Append("  Avoid: ").Append(Avoid).Append("\n");
            sb.Append("  BlockIntersectingRoads: ").Append(BlockIntersectingRoads).Append("\n");
            sb.Append("  RoutingMode: ").Append(RoutingMode).Append("\n");
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
            return this.Equals(input as Options);
        }

        /// <summary>
        /// Returns true if Options instances are equal
        /// </summary>
        /// <param name="input">Instance of Options to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Options input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.ArrivalTime == input.ArrivalTime ||
                    (this.ArrivalTime != null &&
                    this.ArrivalTime.Equals(input.ArrivalTime))
                ) && 
                (
                    this.TrafficMode == input.TrafficMode ||
                    this.TrafficMode.Equals(input.TrafficMode)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.PolylineFormat == input.PolylineFormat ||
                    this.PolylineFormat.Equals(input.PolylineFormat)
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
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.PreferTurnsOnPassengerSide == input.PreferTurnsOnPassengerSide ||
                    this.PreferTurnsOnPassengerSide.Equals(input.PreferTurnsOnPassengerSide)
                ) && 
                (
                    this.Avoid == input.Avoid ||
                    this.Avoid != null &&
                    input.Avoid != null &&
                    this.Avoid.SequenceEqual(input.Avoid)
                ) && 
                (
                    this.BlockIntersectingRoads == input.BlockIntersectingRoads ||
                    (this.BlockIntersectingRoads != null &&
                    this.BlockIntersectingRoads.Equals(input.BlockIntersectingRoads))
                ) && 
                (
                    this.RoutingMode == input.RoutingMode ||
                    this.RoutingMode.Equals(input.RoutingMode)
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
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                if (this.ArrivalTime != null)
                {
                    hashCode = (hashCode * 59) + this.ArrivalTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TrafficMode.GetHashCode();
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PolylineFormat.GetHashCode();
                if (this.AllowedCountries != null)
                {
                    hashCode = (hashCode * 59) + this.AllowedCountries.GetHashCode();
                }
                if (this.ProhibitedCountries != null)
                {
                    hashCode = (hashCode * 59) + this.ProhibitedCountries.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PreferTurnsOnPassengerSide.GetHashCode();
                if (this.Avoid != null)
                {
                    hashCode = (hashCode * 59) + this.Avoid.GetHashCode();
                }
                if (this.BlockIntersectingRoads != null)
                {
                    hashCode = (hashCode * 59) + this.BlockIntersectingRoads.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RoutingMode.GetHashCode();
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
            // Language (string) pattern
            Regex regexLanguage = new Regex(@"[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*", RegexOptions.CultureInvariant);
            if (false == regexLanguage.Match(this.Language).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, must match a pattern of " + regexLanguage, new [] { "Language" });
            }

            // Currency (string) pattern
            Regex regexCurrency = new Regex(@"[A-Z]{3}", RegexOptions.CultureInvariant);
            if (false == regexCurrency.Match(this.Currency).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Currency, must match a pattern of " + regexCurrency, new [] { "Currency" });
            }

            yield break;
        }
    }

}
