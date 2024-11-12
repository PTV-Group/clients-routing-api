/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
    /// EvOptions
    /// </summary>
    [DataContract(Name = "EvOptions")]
    public partial class EvOptions : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvOptions" /> class.
        /// </summary>
        /// <param name="initialStateOfCharge">The available battery capacity at the start of the route [%]. (default to 100D).</param>
        /// <param name="minimumStateOfCharge">The minimum wanted remaining battery capacity at the end of the route and at the end of each leg [%]. (default to 10D).</param>
        /// <param name="energyEfficientRoute">Specifies if an energy efficient route should be calculated. (default to false).</param>
        public EvOptions(double? initialStateOfCharge = 100D, double? minimumStateOfCharge = 10D, bool? energyEfficientRoute = false)
        {
            // use default value if no "initialStateOfCharge" provided
            this.InitialStateOfCharge = initialStateOfCharge ?? 100D;
            // use default value if no "minimumStateOfCharge" provided
            this.MinimumStateOfCharge = minimumStateOfCharge ?? 10D;
            // use default value if no "energyEfficientRoute" provided
            this.EnergyEfficientRoute = energyEfficientRoute ?? false;
        }

        /// <summary>
        /// The available battery capacity at the start of the route [%].
        /// </summary>
        /// <value>The available battery capacity at the start of the route [%].</value>
        [DataMember(Name = "initialStateOfCharge", EmitDefaultValue = true)]
        public double? InitialStateOfCharge { get; set; }

        /// <summary>
        /// The minimum wanted remaining battery capacity at the end of the route and at the end of each leg [%].
        /// </summary>
        /// <value>The minimum wanted remaining battery capacity at the end of the route and at the end of each leg [%].</value>
        [DataMember(Name = "minimumStateOfCharge", EmitDefaultValue = true)]
        public double? MinimumStateOfCharge { get; set; }

        /// <summary>
        /// Specifies if an energy efficient route should be calculated.
        /// </summary>
        /// <value>Specifies if an energy efficient route should be calculated.</value>
        [DataMember(Name = "energyEfficientRoute", EmitDefaultValue = true)]
        public bool? EnergyEfficientRoute { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EvOptions {\n");
            sb.Append("  InitialStateOfCharge: ").Append(InitialStateOfCharge).Append("\n");
            sb.Append("  MinimumStateOfCharge: ").Append(MinimumStateOfCharge).Append("\n");
            sb.Append("  EnergyEfficientRoute: ").Append(EnergyEfficientRoute).Append("\n");
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
            // InitialStateOfCharge (double?) maximum
            if (this.InitialStateOfCharge > (double?)100)
            {
                yield return new ValidationResult("Invalid value for InitialStateOfCharge, must be a value less than or equal to 100.", new [] { "InitialStateOfCharge" });
            }

            // InitialStateOfCharge (double?) minimum
            if (this.InitialStateOfCharge < (double?)0)
            {
                yield return new ValidationResult("Invalid value for InitialStateOfCharge, must be a value greater than or equal to 0.", new [] { "InitialStateOfCharge" });
            }

            // MinimumStateOfCharge (double?) maximum
            if (this.MinimumStateOfCharge > (double?)99)
            {
                yield return new ValidationResult("Invalid value for MinimumStateOfCharge, must be a value less than or equal to 99.", new [] { "MinimumStateOfCharge" });
            }

            // MinimumStateOfCharge (double?) minimum
            if (this.MinimumStateOfCharge < (double?)1)
            {
                yield return new ValidationResult("Invalid value for MinimumStateOfCharge, must be a value greater than or equal to 1.", new [] { "MinimumStateOfCharge" });
            }

            yield break;
        }
    }

}