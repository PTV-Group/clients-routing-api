/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
    /// Defines how to consider traffic in a reachable areas or a reachable locations calculation.  * &#x60;REALISTIC&#x60; - Uses the most realistic **travelTime** and **distance** for the selected vehicle and the  given **referenceTime** (or the current time if none **referenceTime** is specified).  Takes into account the live traffic situation such as traffic jams or road works  as well as the typical traffic situation at the time of day and the day of week of travel such as the rushhour  on Monday morning or light traffic on Saturday evening.  * &#x60;AVERAGE&#x60; - Uses the average **travelTime** and **distance** for the selected vehicle.  If **referenceTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rushhour  on Monday morning or light traffic on Saturday evening.  If no **referenceTime** is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.  See [here](./Concepts/Traffic%20Modes.htm) for more information. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.
    /// </summary>
    /// <value>Defines how to consider traffic in a reachable areas or a reachable locations calculation.  * &#x60;REALISTIC&#x60; - Uses the most realistic **travelTime** and **distance** for the selected vehicle and the  given **referenceTime** (or the current time if none **referenceTime** is specified).  Takes into account the live traffic situation such as traffic jams or road works  as well as the typical traffic situation at the time of day and the day of week of travel such as the rushhour  on Monday morning or light traffic on Saturday evening.  * &#x60;AVERAGE&#x60; - Uses the average **travelTime** and **distance** for the selected vehicle.  If **referenceTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rushhour  on Monday morning or light traffic on Saturday evening.  If no **referenceTime** is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.  See [here](./Concepts/Traffic%20Modes.htm) for more information. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ReachableTrafficMode
    {
        /// <summary>
        /// Enum REALISTIC for value: REALISTIC
        /// </summary>
        [EnumMember(Value = "REALISTIC")]
        REALISTIC = 1,

        /// <summary>
        /// Enum AVERAGE for value: AVERAGE
        /// </summary>
        [EnumMember(Value = "AVERAGE")]
        AVERAGE = 2

    }

}