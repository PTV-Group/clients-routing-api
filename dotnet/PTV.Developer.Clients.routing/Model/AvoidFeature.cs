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
    /// Defines AvoidFeature
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AvoidFeature
    {
        /// <summary>
        /// Enum TOLL for value: TOLL
        /// </summary>
        [EnumMember(Value = "TOLL")]
        TOLL = 1,

        /// <summary>
        /// Enum FERRIES for value: FERRIES
        /// </summary>
        [EnumMember(Value = "FERRIES")]
        FERRIES = 2,

        /// <summary>
        /// Enum RAIL_SHUTTLES for value: RAIL_SHUTTLES
        /// </summary>
        [EnumMember(Value = "RAIL_SHUTTLES")]
        RAIL_SHUTTLES = 3

    }

}
