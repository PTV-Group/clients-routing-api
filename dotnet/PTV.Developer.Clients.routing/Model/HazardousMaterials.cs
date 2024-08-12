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
    /// Defines HazardousMaterials
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum HazardousMaterials
    {
        /// <summary>
        /// Enum HAZARDOUS_TO_WATER for value: HAZARDOUS_TO_WATER
        /// </summary>
        [EnumMember(Value = "HAZARDOUS_TO_WATER")]
        HAZARDOUS_TO_WATER = 1,

        /// <summary>
        /// Enum EXPLOSIVE for value: EXPLOSIVE
        /// </summary>
        [EnumMember(Value = "EXPLOSIVE")]
        EXPLOSIVE = 2,

        /// <summary>
        /// Enum FLAMMABLE for value: FLAMMABLE
        /// </summary>
        [EnumMember(Value = "FLAMMABLE")]
        FLAMMABLE = 3,

        /// <summary>
        /// Enum RADIOACTIVE for value: RADIOACTIVE
        /// </summary>
        [EnumMember(Value = "RADIOACTIVE")]
        RADIOACTIVE = 4,

        /// <summary>
        /// Enum INHALATION_HAZARD for value: INHALATION_HAZARD
        /// </summary>
        [EnumMember(Value = "INHALATION_HAZARD")]
        INHALATION_HAZARD = 5,

        /// <summary>
        /// Enum MEDICAL_WASTE for value: MEDICAL_WASTE
        /// </summary>
        [EnumMember(Value = "MEDICAL_WASTE")]
        MEDICAL_WASTE = 6,

        /// <summary>
        /// Enum OTHER for value: OTHER
        /// </summary>
        [EnumMember(Value = "OTHER")]
        OTHER = 7,

        /// <summary>
        /// Enum NONE for value: NONE
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE = 8
    }

}
