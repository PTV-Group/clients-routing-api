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
    /// EmissionOptions
    /// </summary>
    [DataContract(Name = "EmissionOptions")]
    public partial class EmissionOptions : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Iso14083EmissionFactorsVersion
        /// </summary>
        [DataMember(Name = "iso14083EmissionFactorsVersion", EmitDefaultValue = true)]
        public Iso14083EmissionFactorsVersion? Iso14083EmissionFactorsVersion { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EmissionOptions" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EmissionOptions() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EmissionOptions" /> class.
        /// </summary>
        /// <param name="calculationMethods">Comma-separated list of the calculation method to be returned.  Available values are provided by type &#x60;EmissionCalculationMethod&#x60;:  * &#x60;EN16258_2012&#x60;     Emissions according to EN16258 from 2012 (a.k.a. CEN).  * &#x60;ISO14083_2023&#x60;     Emissions according to ISO 14083:2023 (a.k.a. ISO).      Only supported for [European and American profiles](../data-api/concepts/profiles).     If **defaultConsumption** is true, only supported for [European profiles](../data-api/concepts/profiles).  * &#x60;FRENCH_CO2E_DECREE_2017_639&#x60;     Emissions according to the French CO2E decree from 2017. (required).</param>
        /// <param name="defaultConsumption">If true, the fuel or electricity consumption is automatically calculated through HBEFA 4.2.  Otherwise, the **averageFuelConsumption** or **averageElectricityConsumption** specified calculating the route represented by **routeId** will be considered. Will be ignored for calculation method _FRENCH_CO2E_DECREE_2017_639_. (default to false).</param>
        /// <param name="iso14083EmissionFactorsVersion">iso14083EmissionFactorsVersion.</param>
        public EmissionOptions(string calculationMethods = default(string), bool defaultConsumption = false, Iso14083EmissionFactorsVersion? iso14083EmissionFactorsVersion = default(Iso14083EmissionFactorsVersion?))
        {
            // to ensure "calculationMethods" is required (not null)
            if (calculationMethods == null)
            {
                throw new ArgumentNullException("calculationMethods is a required property for EmissionOptions and cannot be null");
            }
            this.CalculationMethods = calculationMethods;
            this.DefaultConsumption = defaultConsumption;
            this.Iso14083EmissionFactorsVersion = iso14083EmissionFactorsVersion;
        }

        /// <summary>
        /// Comma-separated list of the calculation method to be returned.  Available values are provided by type &#x60;EmissionCalculationMethod&#x60;:  * &#x60;EN16258_2012&#x60;     Emissions according to EN16258 from 2012 (a.k.a. CEN).  * &#x60;ISO14083_2023&#x60;     Emissions according to ISO 14083:2023 (a.k.a. ISO).      Only supported for [European and American profiles](../data-api/concepts/profiles).     If **defaultConsumption** is true, only supported for [European profiles](../data-api/concepts/profiles).  * &#x60;FRENCH_CO2E_DECREE_2017_639&#x60;     Emissions according to the French CO2E decree from 2017.
        /// </summary>
        /// <value>Comma-separated list of the calculation method to be returned.  Available values are provided by type &#x60;EmissionCalculationMethod&#x60;:  * &#x60;EN16258_2012&#x60;     Emissions according to EN16258 from 2012 (a.k.a. CEN).  * &#x60;ISO14083_2023&#x60;     Emissions according to ISO 14083:2023 (a.k.a. ISO).      Only supported for [European and American profiles](../data-api/concepts/profiles).     If **defaultConsumption** is true, only supported for [European profiles](../data-api/concepts/profiles).  * &#x60;FRENCH_CO2E_DECREE_2017_639&#x60;     Emissions according to the French CO2E decree from 2017.</value>
        [DataMember(Name = "calculationMethods", IsRequired = true, EmitDefaultValue = true)]
        public string CalculationMethods { get; set; }

        /// <summary>
        /// If true, the fuel or electricity consumption is automatically calculated through HBEFA 4.2.  Otherwise, the **averageFuelConsumption** or **averageElectricityConsumption** specified calculating the route represented by **routeId** will be considered. Will be ignored for calculation method _FRENCH_CO2E_DECREE_2017_639_.
        /// </summary>
        /// <value>If true, the fuel or electricity consumption is automatically calculated through HBEFA 4.2.  Otherwise, the **averageFuelConsumption** or **averageElectricityConsumption** specified calculating the route represented by **routeId** will be considered. Will be ignored for calculation method _FRENCH_CO2E_DECREE_2017_639_.</value>
        [DataMember(Name = "defaultConsumption", EmitDefaultValue = true)]
        public bool DefaultConsumption { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EmissionOptions {\n");
            sb.Append("  CalculationMethods: ").Append(CalculationMethods).Append("\n");
            sb.Append("  DefaultConsumption: ").Append(DefaultConsumption).Append("\n");
            sb.Append("  Iso14083EmissionFactorsVersion: ").Append(Iso14083EmissionFactorsVersion).Append("\n");
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
            // CalculationMethods (string) minLength
            if (this.CalculationMethods != null && this.CalculationMethods.Length < 1)
            {
                yield return new ValidationResult("Invalid value for CalculationMethods, length must be greater than 1.", new [] { "CalculationMethods" });
            }

            yield break;
        }
    }

}
