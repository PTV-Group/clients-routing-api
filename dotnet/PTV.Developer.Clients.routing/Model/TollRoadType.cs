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
    /// The reason why toll is charged.    * &#x60;GENERAL&#x60; - A general toll road where no special toll applies.    * &#x60;CITY&#x60; - An urban area or city is subject to toll.    * &#x60;BRIDGE&#x60; - A bridge is subject to toll.    * &#x60;TUNNEL&#x60; - A tunnel is subject to toll.    * &#x60;FERRY&#x60; - A ferry is subject to toll.    * &#x60;MOUNTAIN_PASS&#x60; - A mountain pass is subject to toll.  
    /// </summary>
    /// <value>The reason why toll is charged.    * &#x60;GENERAL&#x60; - A general toll road where no special toll applies.    * &#x60;CITY&#x60; - An urban area or city is subject to toll.    * &#x60;BRIDGE&#x60; - A bridge is subject to toll.    * &#x60;TUNNEL&#x60; - A tunnel is subject to toll.    * &#x60;FERRY&#x60; - A ferry is subject to toll.    * &#x60;MOUNTAIN_PASS&#x60; - A mountain pass is subject to toll.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TollRoadType
    {
        /// <summary>
        /// Enum GENERAL for value: GENERAL
        /// </summary>
        [EnumMember(Value = "GENERAL")]
        GENERAL = 1,

        /// <summary>
        /// Enum CITY for value: CITY
        /// </summary>
        [EnumMember(Value = "CITY")]
        CITY = 2,

        /// <summary>
        /// Enum BRIDGE for value: BRIDGE
        /// </summary>
        [EnumMember(Value = "BRIDGE")]
        BRIDGE = 3,

        /// <summary>
        /// Enum TUNNEL for value: TUNNEL
        /// </summary>
        [EnumMember(Value = "TUNNEL")]
        TUNNEL = 4,

        /// <summary>
        /// Enum FERRY for value: FERRY
        /// </summary>
        [EnumMember(Value = "FERRY")]
        FERRY = 5,

        /// <summary>
        /// Enum MOUNTAIN_PASS for value: MOUNTAIN_PASS
        /// </summary>
        [EnumMember(Value = "MOUNTAIN_PASS")]
        MOUNTAIN_PASS = 6

    }

}
