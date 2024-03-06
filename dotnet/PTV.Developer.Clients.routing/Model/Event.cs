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
    /// Event
    /// </summary>
    [DataContract(Name = "Event")]
    public partial class Event : IEquatable<Event>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Event() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        /// <param name="latitude">The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="startsAt">The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified..</param>
        /// <param name="distanceFromStart">The distance from the start to this event [m]. (required).</param>
        /// <param name="travelTimeFromStart">The travel time from the start to this event [s]. (required).</param>
        /// <param name="countryCode">Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. (required).</param>
        /// <param name="utcOffset">The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified. (required).</param>
        /// <param name="toll">toll.</param>
        /// <param name="maneuver">maneuver.</param>
        /// <param name="border">border.</param>
        /// <param name="violation">violation.</param>
        /// <param name="waypoint">waypoint.</param>
        /// <param name="utcOffsetChange">utcOffsetChange.</param>
        /// <param name="schedule">schedule.</param>
        /// <param name="combinedTransport">combinedTransport.</param>
        /// <param name="traffic">traffic.</param>
        /// <param name="lowEmissionZone">lowEmissionZone.</param>
        /// <param name="evStatus">evStatus.</param>
        /// <param name="charge">charge.</param>
        public Event(double latitude = default(double), double longitude = default(double), DateTimeOffset startsAt = default(DateTimeOffset), int distanceFromStart = default(int), int travelTimeFromStart = default(int), string countryCode = default(string), int utcOffset = default(int), TollEvent toll = default(TollEvent), ManeuverEvent maneuver = default(ManeuverEvent), BorderEvent border = default(BorderEvent), ViolationEvent violation = default(ViolationEvent), WaypointEvent waypoint = default(WaypointEvent), UTCOffsetChangeEvent utcOffsetChange = default(UTCOffsetChangeEvent), ScheduleEvent schedule = default(ScheduleEvent), CombinedTransportEvent combinedTransport = default(CombinedTransportEvent), TrafficEvent traffic = default(TrafficEvent), LowEmissionZoneEvent lowEmissionZone = default(LowEmissionZoneEvent), EvStatusEvent evStatus = default(EvStatusEvent), ChargeEvent charge = default(ChargeEvent))
        {
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.DistanceFromStart = distanceFromStart;
            this.TravelTimeFromStart = travelTimeFromStart;
            // to ensure "countryCode" is required (not null)
            if (countryCode == null)
            {
                throw new ArgumentNullException("countryCode is a required property for Event and cannot be null");
            }
            this.CountryCode = countryCode;
            this.UtcOffset = utcOffset;
            this.StartsAt = startsAt;
            this.Toll = toll;
            this.Maneuver = maneuver;
            this.Border = border;
            this.Violation = violation;
            this.Waypoint = waypoint;
            this.UtcOffsetChange = utcOffsetChange;
            this.Schedule = schedule;
            this.CombinedTransport = combinedTransport;
            this.Traffic = traffic;
            this.LowEmissionZone = lowEmissionZone;
            this.EvStatus = evStatus;
            this.Charge = charge;
        }

        /// <summary>
        /// The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double Latitude { get; set; }

        /// <summary>
        /// The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double Longitude { get; set; }

        /// <summary>
        /// The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
        /// </summary>
        /// <value>The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.</value>
        [DataMember(Name = "startsAt", EmitDefaultValue = false)]
        public DateTimeOffset StartsAt { get; set; }

        /// <summary>
        /// The distance from the start to this event [m].
        /// </summary>
        /// <value>The distance from the start to this event [m].</value>
        [DataMember(Name = "distanceFromStart", IsRequired = true, EmitDefaultValue = true)]
        public int DistanceFromStart { get; set; }

        /// <summary>
        /// The travel time from the start to this event [s].
        /// </summary>
        /// <value>The travel time from the start to this event [s].</value>
        [DataMember(Name = "travelTimeFromStart", IsRequired = true, EmitDefaultValue = true)]
        public int TravelTimeFromStart { get; set; }

        /// <summary>
        /// Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        [DataMember(Name = "countryCode", IsRequired = true, EmitDefaultValue = true)]
        public string CountryCode { get; set; }

        /// <summary>
        /// The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
        /// </summary>
        /// <value>The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.</value>
        [DataMember(Name = "utcOffset", IsRequired = true, EmitDefaultValue = true)]
        public int UtcOffset { get; set; }

        /// <summary>
        /// Gets or Sets Toll
        /// </summary>
        [DataMember(Name = "toll", EmitDefaultValue = false)]
        public TollEvent Toll { get; set; }

        /// <summary>
        /// Gets or Sets Maneuver
        /// </summary>
        [DataMember(Name = "maneuver", EmitDefaultValue = false)]
        public ManeuverEvent Maneuver { get; set; }

        /// <summary>
        /// Gets or Sets Border
        /// </summary>
        [DataMember(Name = "border", EmitDefaultValue = false)]
        public BorderEvent Border { get; set; }

        /// <summary>
        /// Gets or Sets Violation
        /// </summary>
        [DataMember(Name = "violation", EmitDefaultValue = false)]
        public ViolationEvent Violation { get; set; }

        /// <summary>
        /// Gets or Sets Waypoint
        /// </summary>
        [DataMember(Name = "waypoint", EmitDefaultValue = false)]
        public WaypointEvent Waypoint { get; set; }

        /// <summary>
        /// Gets or Sets UtcOffsetChange
        /// </summary>
        [DataMember(Name = "utcOffsetChange", EmitDefaultValue = false)]
        public UTCOffsetChangeEvent UtcOffsetChange { get; set; }

        /// <summary>
        /// Gets or Sets Schedule
        /// </summary>
        [DataMember(Name = "schedule", EmitDefaultValue = false)]
        public ScheduleEvent Schedule { get; set; }

        /// <summary>
        /// Gets or Sets CombinedTransport
        /// </summary>
        [DataMember(Name = "combinedTransport", EmitDefaultValue = false)]
        public CombinedTransportEvent CombinedTransport { get; set; }

        /// <summary>
        /// Gets or Sets Traffic
        /// </summary>
        [DataMember(Name = "traffic", EmitDefaultValue = false)]
        public TrafficEvent Traffic { get; set; }

        /// <summary>
        /// Gets or Sets LowEmissionZone
        /// </summary>
        [DataMember(Name = "lowEmissionZone", EmitDefaultValue = false)]
        public LowEmissionZoneEvent LowEmissionZone { get; set; }

        /// <summary>
        /// Gets or Sets EvStatus
        /// </summary>
        [DataMember(Name = "evStatus", EmitDefaultValue = false)]
        public EvStatusEvent EvStatus { get; set; }

        /// <summary>
        /// Gets or Sets Charge
        /// </summary>
        [DataMember(Name = "charge", EmitDefaultValue = false)]
        public ChargeEvent Charge { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Event {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  StartsAt: ").Append(StartsAt).Append("\n");
            sb.Append("  DistanceFromStart: ").Append(DistanceFromStart).Append("\n");
            sb.Append("  TravelTimeFromStart: ").Append(TravelTimeFromStart).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  UtcOffset: ").Append(UtcOffset).Append("\n");
            sb.Append("  Toll: ").Append(Toll).Append("\n");
            sb.Append("  Maneuver: ").Append(Maneuver).Append("\n");
            sb.Append("  Border: ").Append(Border).Append("\n");
            sb.Append("  Violation: ").Append(Violation).Append("\n");
            sb.Append("  Waypoint: ").Append(Waypoint).Append("\n");
            sb.Append("  UtcOffsetChange: ").Append(UtcOffsetChange).Append("\n");
            sb.Append("  Schedule: ").Append(Schedule).Append("\n");
            sb.Append("  CombinedTransport: ").Append(CombinedTransport).Append("\n");
            sb.Append("  Traffic: ").Append(Traffic).Append("\n");
            sb.Append("  LowEmissionZone: ").Append(LowEmissionZone).Append("\n");
            sb.Append("  EvStatus: ").Append(EvStatus).Append("\n");
            sb.Append("  Charge: ").Append(Charge).Append("\n");
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
            return this.Equals(input as Event);
        }

        /// <summary>
        /// Returns true if Event instances are equal
        /// </summary>
        /// <param name="input">Instance of Event to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Event input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Latitude == input.Latitude ||
                    this.Latitude.Equals(input.Latitude)
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    this.Longitude.Equals(input.Longitude)
                ) && 
                (
                    this.StartsAt == input.StartsAt ||
                    (this.StartsAt != null &&
                    this.StartsAt.Equals(input.StartsAt))
                ) && 
                (
                    this.DistanceFromStart == input.DistanceFromStart ||
                    this.DistanceFromStart.Equals(input.DistanceFromStart)
                ) && 
                (
                    this.TravelTimeFromStart == input.TravelTimeFromStart ||
                    this.TravelTimeFromStart.Equals(input.TravelTimeFromStart)
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.UtcOffset == input.UtcOffset ||
                    this.UtcOffset.Equals(input.UtcOffset)
                ) && 
                (
                    this.Toll == input.Toll ||
                    (this.Toll != null &&
                    this.Toll.Equals(input.Toll))
                ) && 
                (
                    this.Maneuver == input.Maneuver ||
                    (this.Maneuver != null &&
                    this.Maneuver.Equals(input.Maneuver))
                ) && 
                (
                    this.Border == input.Border ||
                    (this.Border != null &&
                    this.Border.Equals(input.Border))
                ) && 
                (
                    this.Violation == input.Violation ||
                    (this.Violation != null &&
                    this.Violation.Equals(input.Violation))
                ) && 
                (
                    this.Waypoint == input.Waypoint ||
                    (this.Waypoint != null &&
                    this.Waypoint.Equals(input.Waypoint))
                ) && 
                (
                    this.UtcOffsetChange == input.UtcOffsetChange ||
                    (this.UtcOffsetChange != null &&
                    this.UtcOffsetChange.Equals(input.UtcOffsetChange))
                ) && 
                (
                    this.Schedule == input.Schedule ||
                    (this.Schedule != null &&
                    this.Schedule.Equals(input.Schedule))
                ) && 
                (
                    this.CombinedTransport == input.CombinedTransport ||
                    (this.CombinedTransport != null &&
                    this.CombinedTransport.Equals(input.CombinedTransport))
                ) && 
                (
                    this.Traffic == input.Traffic ||
                    (this.Traffic != null &&
                    this.Traffic.Equals(input.Traffic))
                ) && 
                (
                    this.LowEmissionZone == input.LowEmissionZone ||
                    (this.LowEmissionZone != null &&
                    this.LowEmissionZone.Equals(input.LowEmissionZone))
                ) && 
                (
                    this.EvStatus == input.EvStatus ||
                    (this.EvStatus != null &&
                    this.EvStatus.Equals(input.EvStatus))
                ) && 
                (
                    this.Charge == input.Charge ||
                    (this.Charge != null &&
                    this.Charge.Equals(input.Charge))
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
                hashCode = (hashCode * 59) + this.Latitude.GetHashCode();
                hashCode = (hashCode * 59) + this.Longitude.GetHashCode();
                if (this.StartsAt != null)
                {
                    hashCode = (hashCode * 59) + this.StartsAt.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DistanceFromStart.GetHashCode();
                hashCode = (hashCode * 59) + this.TravelTimeFromStart.GetHashCode();
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UtcOffset.GetHashCode();
                if (this.Toll != null)
                {
                    hashCode = (hashCode * 59) + this.Toll.GetHashCode();
                }
                if (this.Maneuver != null)
                {
                    hashCode = (hashCode * 59) + this.Maneuver.GetHashCode();
                }
                if (this.Border != null)
                {
                    hashCode = (hashCode * 59) + this.Border.GetHashCode();
                }
                if (this.Violation != null)
                {
                    hashCode = (hashCode * 59) + this.Violation.GetHashCode();
                }
                if (this.Waypoint != null)
                {
                    hashCode = (hashCode * 59) + this.Waypoint.GetHashCode();
                }
                if (this.UtcOffsetChange != null)
                {
                    hashCode = (hashCode * 59) + this.UtcOffsetChange.GetHashCode();
                }
                if (this.Schedule != null)
                {
                    hashCode = (hashCode * 59) + this.Schedule.GetHashCode();
                }
                if (this.CombinedTransport != null)
                {
                    hashCode = (hashCode * 59) + this.CombinedTransport.GetHashCode();
                }
                if (this.Traffic != null)
                {
                    hashCode = (hashCode * 59) + this.Traffic.GetHashCode();
                }
                if (this.LowEmissionZone != null)
                {
                    hashCode = (hashCode * 59) + this.LowEmissionZone.GetHashCode();
                }
                if (this.EvStatus != null)
                {
                    hashCode = (hashCode * 59) + this.EvStatus.GetHashCode();
                }
                if (this.Charge != null)
                {
                    hashCode = (hashCode * 59) + this.Charge.GetHashCode();
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
            // Latitude (double) maximum
            if (this.Latitude > (double)90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double) minimum
            if (this.Latitude < (double)-90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double) maximum
            if (this.Longitude > (double)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double) minimum
            if (this.Longitude < (double)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            // DistanceFromStart (int) minimum
            if (this.DistanceFromStart < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DistanceFromStart, must be a value greater than or equal to 0.", new [] { "DistanceFromStart" });
            }

            // TravelTimeFromStart (int) minimum
            if (this.TravelTimeFromStart < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TravelTimeFromStart, must be a value greater than or equal to 0.", new [] { "TravelTimeFromStart" });
            }

            // UtcOffset (int) maximum
            if (this.UtcOffset > (int)840)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for UtcOffset, must be a value less than or equal to 840.", new [] { "UtcOffset" });
            }

            // UtcOffset (int) minimum
            if (this.UtcOffset < (int)-720)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for UtcOffset, must be a value greater than or equal to -720.", new [] { "UtcOffset" });
            }

            yield break;
        }
    }

}
