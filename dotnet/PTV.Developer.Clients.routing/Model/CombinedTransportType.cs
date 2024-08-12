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
    /// The type of the combined transport, i.e. how the vehicle is transported.  * &#x60;BOAT&#x60; - The combined transport is by boat, i.e. on a ferry.  * &#x60;RAIL&#x60; - The combined transport is by rail, i.e. on a train or rail shuttle.
    /// </summary>
    /// <value>The type of the combined transport, i.e. how the vehicle is transported.  * &#x60;BOAT&#x60; - The combined transport is by boat, i.e. on a ferry.  * &#x60;RAIL&#x60; - The combined transport is by rail, i.e. on a train or rail shuttle.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CombinedTransportType
    {
        /// <summary>
        /// Enum BOAT for value: BOAT
        /// </summary>
        [EnumMember(Value = "BOAT")]
        BOAT = 1,

        /// <summary>
        /// Enum RAIL for value: RAIL
        /// </summary>
        [EnumMember(Value = "RAIL")]
        RAIL = 2
    }

}
