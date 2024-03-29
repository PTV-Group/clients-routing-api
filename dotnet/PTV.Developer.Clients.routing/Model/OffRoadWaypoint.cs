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
    /// An _off-road waypoint_ will be part of the route. The air-line connection between given and matched coordinates is included in the route polyline, distance and duration. Use this waypoint type to recalculate a route planned by the Route Optimization API.
    /// </summary>
    [DataContract(Name = "OffRoadWaypoint")]
    public partial class OffRoadWaypoint : IEquatable<OffRoadWaypoint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OffRoadWaypoint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OffRoadWaypoint() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OffRoadWaypoint" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="roadAcess">roadAcess.</param>
        /// <param name="matchSideOfStreet">Specifies that this waypoint will be reached at the side of street on which it is located. This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint. (default to false).</param>
        /// <param name="serviceTime">The service time [s] that is required at this waypoint, e.g. for pickup or delivery. (default to 0).</param>
        /// <param name="openingIntervals">The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals. If the vehicle does not arrive at a waypoint within an opening interval, a waiting time will be scheduled.  When using a multi-day **workingHoursPreset** this waiting time will usually be used for daily rests instead, in order to continue the route with a rested driver..</param>
        /// <param name="vehicleParameters">vehicleParameters.</param>
        /// <param name="evParameters">evParameters.</param>
        public OffRoadWaypoint(double latitude = default(double), double longitude = default(double), RoadAccess roadAcess = default(RoadAccess), bool matchSideOfStreet = false, int serviceTime = 0, List<TimeInterval> openingIntervals = default(List<TimeInterval>), VehicleParametersAtWaypoint vehicleParameters = default(VehicleParametersAtWaypoint), EvParametersAtWaypoint evParameters = default(EvParametersAtWaypoint))
        {
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.RoadAcess = roadAcess;
            this.MatchSideOfStreet = matchSideOfStreet;
            this.ServiceTime = serviceTime;
            this.OpeningIntervals = openingIntervals;
            this.VehicleParameters = vehicleParameters;
            this.EvParameters = evParameters;
        }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double Longitude { get; set; }

        /// <summary>
        /// Gets or Sets RoadAcess
        /// </summary>
        [DataMember(Name = "roadAcess", EmitDefaultValue = false)]
        public RoadAccess RoadAcess { get; set; }

        /// <summary>
        /// Specifies that this waypoint will be reached at the side of street on which it is located. This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.
        /// </summary>
        /// <value>Specifies that this waypoint will be reached at the side of street on which it is located. This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.</value>
        [DataMember(Name = "matchSideOfStreet", EmitDefaultValue = true)]
        public bool MatchSideOfStreet { get; set; }

        /// <summary>
        /// The service time [s] that is required at this waypoint, e.g. for pickup or delivery.
        /// </summary>
        /// <value>The service time [s] that is required at this waypoint, e.g. for pickup or delivery.</value>
        [DataMember(Name = "serviceTime", EmitDefaultValue = false)]
        public int ServiceTime { get; set; }

        /// <summary>
        /// The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals. If the vehicle does not arrive at a waypoint within an opening interval, a waiting time will be scheduled.  When using a multi-day **workingHoursPreset** this waiting time will usually be used for daily rests instead, in order to continue the route with a rested driver.
        /// </summary>
        /// <value>The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals. If the vehicle does not arrive at a waypoint within an opening interval, a waiting time will be scheduled.  When using a multi-day **workingHoursPreset** this waiting time will usually be used for daily rests instead, in order to continue the route with a rested driver.</value>
        [DataMember(Name = "openingIntervals", EmitDefaultValue = false)]
        public List<TimeInterval> OpeningIntervals { get; set; }

        /// <summary>
        /// Gets or Sets VehicleParameters
        /// </summary>
        [DataMember(Name = "vehicleParameters", EmitDefaultValue = false)]
        public VehicleParametersAtWaypoint VehicleParameters { get; set; }

        /// <summary>
        /// Gets or Sets EvParameters
        /// </summary>
        [DataMember(Name = "evParameters", EmitDefaultValue = false)]
        public EvParametersAtWaypoint EvParameters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OffRoadWaypoint {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  RoadAcess: ").Append(RoadAcess).Append("\n");
            sb.Append("  MatchSideOfStreet: ").Append(MatchSideOfStreet).Append("\n");
            sb.Append("  ServiceTime: ").Append(ServiceTime).Append("\n");
            sb.Append("  OpeningIntervals: ").Append(OpeningIntervals).Append("\n");
            sb.Append("  VehicleParameters: ").Append(VehicleParameters).Append("\n");
            sb.Append("  EvParameters: ").Append(EvParameters).Append("\n");
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
            return this.Equals(input as OffRoadWaypoint);
        }

        /// <summary>
        /// Returns true if OffRoadWaypoint instances are equal
        /// </summary>
        /// <param name="input">Instance of OffRoadWaypoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OffRoadWaypoint input)
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
                    this.RoadAcess == input.RoadAcess ||
                    (this.RoadAcess != null &&
                    this.RoadAcess.Equals(input.RoadAcess))
                ) && 
                (
                    this.MatchSideOfStreet == input.MatchSideOfStreet ||
                    this.MatchSideOfStreet.Equals(input.MatchSideOfStreet)
                ) && 
                (
                    this.ServiceTime == input.ServiceTime ||
                    this.ServiceTime.Equals(input.ServiceTime)
                ) && 
                (
                    this.OpeningIntervals == input.OpeningIntervals ||
                    this.OpeningIntervals != null &&
                    input.OpeningIntervals != null &&
                    this.OpeningIntervals.SequenceEqual(input.OpeningIntervals)
                ) && 
                (
                    this.VehicleParameters == input.VehicleParameters ||
                    (this.VehicleParameters != null &&
                    this.VehicleParameters.Equals(input.VehicleParameters))
                ) && 
                (
                    this.EvParameters == input.EvParameters ||
                    (this.EvParameters != null &&
                    this.EvParameters.Equals(input.EvParameters))
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
                if (this.RoadAcess != null)
                {
                    hashCode = (hashCode * 59) + this.RoadAcess.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MatchSideOfStreet.GetHashCode();
                hashCode = (hashCode * 59) + this.ServiceTime.GetHashCode();
                if (this.OpeningIntervals != null)
                {
                    hashCode = (hashCode * 59) + this.OpeningIntervals.GetHashCode();
                }
                if (this.VehicleParameters != null)
                {
                    hashCode = (hashCode * 59) + this.VehicleParameters.GetHashCode();
                }
                if (this.EvParameters != null)
                {
                    hashCode = (hashCode * 59) + this.EvParameters.GetHashCode();
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

            // ServiceTime (int) minimum
            if (this.ServiceTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ServiceTime, must be a value greater than or equal to 0.", new [] { "ServiceTime" });
            }

            yield break;
        }
    }

}
