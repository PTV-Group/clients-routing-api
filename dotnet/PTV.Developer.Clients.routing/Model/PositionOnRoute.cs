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
    /// The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route. This parameter is mutually exclusive with **waypoint**.
    /// </summary>
    [DataContract(Name = "PositionOnRoute")]
    public partial class PositionOnRoute : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionOnRoute" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PositionOnRoute() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionOnRoute" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="nextWaypointName">The name of the next waypoint on the route. (required).</param>
        /// <param name="heading">The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival)..</param>
        /// <param name="headingTolerance">Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified. (default to 45).</param>
        public PositionOnRoute(double? latitude = default(double?), double? longitude = default(double?), string nextWaypointName = default(string), int? heading = default(int?), int headingTolerance = 45)
        {
            // to ensure "latitude" is required (not null)
            if (latitude == null)
            {
                throw new ArgumentNullException("latitude is a required property for PositionOnRoute and cannot be null");
            }
            this.Latitude = latitude;
            // to ensure "longitude" is required (not null)
            if (longitude == null)
            {
                throw new ArgumentNullException("longitude is a required property for PositionOnRoute and cannot be null");
            }
            this.Longitude = longitude;
            // to ensure "nextWaypointName" is required (not null)
            if (nextWaypointName == null)
            {
                throw new ArgumentNullException("nextWaypointName is a required property for PositionOnRoute and cannot be null");
            }
            this.NextWaypointName = nextWaypointName;
            this.Heading = heading;
            this.HeadingTolerance = headingTolerance;
        }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        /// <example>49.480301</example>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        /// <example>6.110667</example>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Longitude { get; set; }

        /// <summary>
        /// The name of the next waypoint on the route.
        /// </summary>
        /// <value>The name of the next waypoint on the route.</value>
        [DataMember(Name = "nextWaypointName", IsRequired = true, EmitDefaultValue = true)]
        public string NextWaypointName { get; set; }

        /// <summary>
        /// The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival).
        /// </summary>
        /// <value>The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival).</value>
        [DataMember(Name = "heading", EmitDefaultValue = true)]
        public int? Heading { get; set; }

        /// <summary>
        /// Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.
        /// </summary>
        /// <value>Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.</value>
        [DataMember(Name = "headingTolerance", EmitDefaultValue = false)]
        public int HeadingTolerance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PositionOnRoute {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  NextWaypointName: ").Append(NextWaypointName).Append("\n");
            sb.Append("  Heading: ").Append(Heading).Append("\n");
            sb.Append("  HeadingTolerance: ").Append(HeadingTolerance).Append("\n");
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
            // Latitude (double?) maximum
            if (this.Latitude > (double?)90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double?) minimum
            if (this.Latitude < (double?)-90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double?) maximum
            if (this.Longitude > (double?)180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double?) minimum
            if (this.Longitude < (double?)-180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            // Heading (int?) maximum
            if (this.Heading > (int?)360)
            {
                yield return new ValidationResult("Invalid value for Heading, must be a value less than or equal to 360.", new [] { "Heading" });
            }

            // Heading (int?) minimum
            if (this.Heading < (int?)0)
            {
                yield return new ValidationResult("Invalid value for Heading, must be a value greater than or equal to 0.", new [] { "Heading" });
            }

            // HeadingTolerance (int) maximum
            if (this.HeadingTolerance > (int)180)
            {
                yield return new ValidationResult("Invalid value for HeadingTolerance, must be a value less than or equal to 180.", new [] { "HeadingTolerance" });
            }

            // HeadingTolerance (int) minimum
            if (this.HeadingTolerance < (int)0)
            {
                yield return new ValidationResult("Invalid value for HeadingTolerance, must be a value greater than or equal to 0.", new [] { "HeadingTolerance" });
            }

            yield break;
        }
    }

}
