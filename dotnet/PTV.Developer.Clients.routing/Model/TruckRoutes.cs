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
    /// Defines TruckRoutes
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TruckRoutes
    {
        /// <summary>
        /// Enum DE_LKWUEBERLSTVAUSNV for value: DE_LKWUEBERLSTVAUSNV
        /// </summary>
        [EnumMember(Value = "DE_LKWUEBERLSTVAUSNV")]
        DE_LKWUEBERLSTVAUSNV = 1,

        /// <summary>
        /// Enum NL_LZV for value: NL_LZV
        /// </summary>
        [EnumMember(Value = "NL_LZV")]
        NL_LZV = 2,

        /// <summary>
        /// Enum NZ_HPMV for value: NZ_HPMV
        /// </summary>
        [EnumMember(Value = "NZ_HPMV")]
        NZ_HPMV = 3,

        /// <summary>
        /// Enum SE_BK_1 for value: SE_BK_1
        /// </summary>
        [EnumMember(Value = "SE_BK_1")]
        SE_BK_1 = 4,

        /// <summary>
        /// Enum SE_BK_2 for value: SE_BK_2
        /// </summary>
        [EnumMember(Value = "SE_BK_2")]
        SE_BK_2 = 5,

        /// <summary>
        /// Enum SE_BK_3 for value: SE_BK_3
        /// </summary>
        [EnumMember(Value = "SE_BK_3")]
        SE_BK_3 = 6,

        /// <summary>
        /// Enum SE_BK_4 for value: SE_BK_4
        /// </summary>
        [EnumMember(Value = "SE_BK_4")]
        SE_BK_4 = 7,

        /// <summary>
        /// Enum US_STAA for value: US_STAA
        /// </summary>
        [EnumMember(Value = "US_STAA")]
        US_STAA = 8,

        /// <summary>
        /// Enum US_TD for value: US_TD
        /// </summary>
        [EnumMember(Value = "US_TD")]
        US_TD = 9,

        /// <summary>
        /// Enum AU_B_DOUBLE for value: AU_B_DOUBLE
        /// </summary>
        [EnumMember(Value = "AU_B_DOUBLE")]
        AU_B_DOUBLE = 10,

        /// <summary>
        /// Enum AU_B_DOUBLE_HML for value: AU_B_DOUBLE_HML
        /// </summary>
        [EnumMember(Value = "AU_B_DOUBLE_HML")]
        AU_B_DOUBLE_HML = 11,

        /// <summary>
        /// Enum AU_B_TRIPLE for value: AU_B_TRIPLE
        /// </summary>
        [EnumMember(Value = "AU_B_TRIPLE")]
        AU_B_TRIPLE = 12,

        /// <summary>
        /// Enum AU_B_TRIPLE_HML for value: AU_B_TRIPLE_HML
        /// </summary>
        [EnumMember(Value = "AU_B_TRIPLE_HML")]
        AU_B_TRIPLE_HML = 13,

        /// <summary>
        /// Enum AU_AB_TRIPLE for value: AU_AB_TRIPLE
        /// </summary>
        [EnumMember(Value = "AU_AB_TRIPLE")]
        AU_AB_TRIPLE = 14,

        /// <summary>
        /// Enum AU_AB_TRIPLE_HML for value: AU_AB_TRIPLE_HML
        /// </summary>
        [EnumMember(Value = "AU_AB_TRIPLE_HML")]
        AU_AB_TRIPLE_HML = 15,

        /// <summary>
        /// Enum NONE for value: NONE
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE = 16

    }

}
