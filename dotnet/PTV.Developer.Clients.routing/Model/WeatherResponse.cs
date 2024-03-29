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
    /// The weather used for the electricity consumption calculation. 
    /// </summary>
    [DataContract(Name = "WeatherResponse")]
    public partial class WeatherResponse : IEquatable<WeatherResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WeatherResponse" /> class.
        /// </summary>
        /// <param name="temperature">The average temperature at 2 meters above ground [°C]. Used to estimate the state of health of the  battery and consumption due to air conditioning..</param>
        /// <param name="windSpeed">The average wind speed at 10 meters above ground [km/h]..</param>
        /// <param name="windDirection">The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees..</param>
        public WeatherResponse(double temperature = default(double), int windSpeed = default(int), int windDirection = default(int))
        {
            this.Temperature = temperature;
            this.WindSpeed = windSpeed;
            this.WindDirection = windDirection;
        }

        /// <summary>
        /// The average temperature at 2 meters above ground [°C]. Used to estimate the state of health of the  battery and consumption due to air conditioning.
        /// </summary>
        /// <value>The average temperature at 2 meters above ground [°C]. Used to estimate the state of health of the  battery and consumption due to air conditioning.</value>
        [DataMember(Name = "temperature", EmitDefaultValue = false)]
        public double Temperature { get; set; }

        /// <summary>
        /// The average wind speed at 10 meters above ground [km/h].
        /// </summary>
        /// <value>The average wind speed at 10 meters above ground [km/h].</value>
        [DataMember(Name = "windSpeed", EmitDefaultValue = false)]
        public int WindSpeed { get; set; }

        /// <summary>
        /// The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees.
        /// </summary>
        /// <value>The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees.</value>
        [DataMember(Name = "windDirection", EmitDefaultValue = false)]
        public int WindDirection { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WeatherResponse {\n");
            sb.Append("  Temperature: ").Append(Temperature).Append("\n");
            sb.Append("  WindSpeed: ").Append(WindSpeed).Append("\n");
            sb.Append("  WindDirection: ").Append(WindDirection).Append("\n");
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
            return this.Equals(input as WeatherResponse);
        }

        /// <summary>
        /// Returns true if WeatherResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of WeatherResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WeatherResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Temperature == input.Temperature ||
                    this.Temperature.Equals(input.Temperature)
                ) && 
                (
                    this.WindSpeed == input.WindSpeed ||
                    this.WindSpeed.Equals(input.WindSpeed)
                ) && 
                (
                    this.WindDirection == input.WindDirection ||
                    this.WindDirection.Equals(input.WindDirection)
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
                hashCode = (hashCode * 59) + this.Temperature.GetHashCode();
                hashCode = (hashCode * 59) + this.WindSpeed.GetHashCode();
                hashCode = (hashCode * 59) + this.WindDirection.GetHashCode();
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
            // Temperature (double) maximum
            if (this.Temperature > (double)70)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Temperature, must be a value less than or equal to 70.", new [] { "Temperature" });
            }

            // Temperature (double) minimum
            if (this.Temperature < (double)-50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Temperature, must be a value greater than or equal to -50.", new [] { "Temperature" });
            }

            // WindSpeed (int) minimum
            if (this.WindSpeed < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WindSpeed, must be a value greater than or equal to 0.", new [] { "WindSpeed" });
            }

            yield break;
        }
    }

}
