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
    /// Describes the type of maneuver to execute.     * &#x60;START&#x60; - Departure at an on-road waypoint.     * &#x60;START_LEFT&#x60; - Departure at an off-road waypoint to begin the route heading left.     * &#x60;START_RIGHT&#x60; - Departure at an off-road waypoint to begin the route heading right.     * &#x60;ARRIVE&#x60; - Arrival at an on-road waypoint.     * &#x60;ARRIVE_LEFT&#x60; - Arrival at an off-road waypoint if the waypoint is on the left.     * &#x60;ARRIVE_RIGHT&#x60; - Arrival at an off-road waypoint if the waypoint is on the right.     * &#x60;CONTINUE&#x60; - Follow the current road, usually when the road type changes although the road goes straight.     * &#x60;KEEP_STRAIGHT&#x60; - Stay on the straight lane, usually in fork-shaped intersections with more than two spikes.     * &#x60;KEEP_LEFT&#x60; - Keep left or to take the left lane, usually in Y-shaped intersections.     * &#x60;KEEP_RIGHT&#x60; - Keep right or to take the right lane, usually  in Y-shaped intersections.     * &#x60;TURN_HALF_LEFT&#x60; - Turn half left at a crossing where at least one additional trailing road exists,  usually at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_LEFT&#x60; - Turn left at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_LEFT&#x60; - Turn sharp left at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_HALF_RIGHT&#x60; - Turn half right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_RIGHT&#x60; - Turn right at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_RIGHT&#x60; - Turn sharp right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;MAKE_U_TURN&#x60; - Make a U-turn, either at the same road or at structurally separated roads. The **relativeDirection**   indicates whether to turn left or right.     * &#x60;TAKE_ROUNDABOUT_LEFT&#x60; - Enter a roundabout to the left and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_ROUNDABOUT_RIGHT&#x60; - Enter a roundabout to the right and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_COMBINED_TRANSPORT&#x60; - Take boat (ferry) or rail (train or rail shuttle) connection.  * &#x60;ENTER&#x60; - Enter a highway/freeway/major road straight.     * &#x60;ENTER_LEFT&#x60; - Enter a highway/freeway/major road to the left.     * &#x60;ENTER_RIGHT&#x60; - Enter a highway/freeway/major road to the right.     * &#x60;EXIT&#x60; - Leave a highway/freeway/major road straight.     * &#x60;EXIT_LEFT&#x60; - Leave a highway/freeway/major road to the left.     * &#x60;EXIT_RIGHT&#x60; - Leave a highway/freeway/major road to the right.     * &#x60;CHANGE&#x60; - Change straight to another highway/freeway at an interchange.     * &#x60;CHANGE_LEFT&#x60; - Change to the left to another highway/freeway at an interchange.     * &#x60;CHANGE_RIGHT&#x60; - Change to the right to another highway/freeway at an interchange.
    /// </summary>
    /// <value>Describes the type of maneuver to execute.     * &#x60;START&#x60; - Departure at an on-road waypoint.     * &#x60;START_LEFT&#x60; - Departure at an off-road waypoint to begin the route heading left.     * &#x60;START_RIGHT&#x60; - Departure at an off-road waypoint to begin the route heading right.     * &#x60;ARRIVE&#x60; - Arrival at an on-road waypoint.     * &#x60;ARRIVE_LEFT&#x60; - Arrival at an off-road waypoint if the waypoint is on the left.     * &#x60;ARRIVE_RIGHT&#x60; - Arrival at an off-road waypoint if the waypoint is on the right.     * &#x60;CONTINUE&#x60; - Follow the current road, usually when the road type changes although the road goes straight.     * &#x60;KEEP_STRAIGHT&#x60; - Stay on the straight lane, usually in fork-shaped intersections with more than two spikes.     * &#x60;KEEP_LEFT&#x60; - Keep left or to take the left lane, usually in Y-shaped intersections.     * &#x60;KEEP_RIGHT&#x60; - Keep right or to take the right lane, usually  in Y-shaped intersections.     * &#x60;TURN_HALF_LEFT&#x60; - Turn half left at a crossing where at least one additional trailing road exists,  usually at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_LEFT&#x60; - Turn left at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_LEFT&#x60; - Turn sharp left at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_HALF_RIGHT&#x60; - Turn half right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_RIGHT&#x60; - Turn right at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_RIGHT&#x60; - Turn sharp right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;MAKE_U_TURN&#x60; - Make a U-turn, either at the same road or at structurally separated roads. The **relativeDirection**   indicates whether to turn left or right.     * &#x60;TAKE_ROUNDABOUT_LEFT&#x60; - Enter a roundabout to the left and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_ROUNDABOUT_RIGHT&#x60; - Enter a roundabout to the right and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_COMBINED_TRANSPORT&#x60; - Take boat (ferry) or rail (train or rail shuttle) connection.  * &#x60;ENTER&#x60; - Enter a highway/freeway/major road straight.     * &#x60;ENTER_LEFT&#x60; - Enter a highway/freeway/major road to the left.     * &#x60;ENTER_RIGHT&#x60; - Enter a highway/freeway/major road to the right.     * &#x60;EXIT&#x60; - Leave a highway/freeway/major road straight.     * &#x60;EXIT_LEFT&#x60; - Leave a highway/freeway/major road to the left.     * &#x60;EXIT_RIGHT&#x60; - Leave a highway/freeway/major road to the right.     * &#x60;CHANGE&#x60; - Change straight to another highway/freeway at an interchange.     * &#x60;CHANGE_LEFT&#x60; - Change to the left to another highway/freeway at an interchange.     * &#x60;CHANGE_RIGHT&#x60; - Change to the right to another highway/freeway at an interchange.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ManeuverType
    {
        /// <summary>
        /// Enum START for value: START
        /// </summary>
        [EnumMember(Value = "START")]
        START = 1,

        /// <summary>
        /// Enum START_LEFT for value: START_LEFT
        /// </summary>
        [EnumMember(Value = "START_LEFT")]
        START_LEFT = 2,

        /// <summary>
        /// Enum START_RIGHT for value: START_RIGHT
        /// </summary>
        [EnumMember(Value = "START_RIGHT")]
        START_RIGHT = 3,

        /// <summary>
        /// Enum ARRIVE for value: ARRIVE
        /// </summary>
        [EnumMember(Value = "ARRIVE")]
        ARRIVE = 4,

        /// <summary>
        /// Enum ARRIVE_LEFT for value: ARRIVE_LEFT
        /// </summary>
        [EnumMember(Value = "ARRIVE_LEFT")]
        ARRIVE_LEFT = 5,

        /// <summary>
        /// Enum ARRIVE_RIGHT for value: ARRIVE_RIGHT
        /// </summary>
        [EnumMember(Value = "ARRIVE_RIGHT")]
        ARRIVE_RIGHT = 6,

        /// <summary>
        /// Enum CONTINUE for value: CONTINUE
        /// </summary>
        [EnumMember(Value = "CONTINUE")]
        CONTINUE = 7,

        /// <summary>
        /// Enum KEEP_STRAIGHT for value: KEEP_STRAIGHT
        /// </summary>
        [EnumMember(Value = "KEEP_STRAIGHT")]
        KEEP_STRAIGHT = 8,

        /// <summary>
        /// Enum KEEP_LEFT for value: KEEP_LEFT
        /// </summary>
        [EnumMember(Value = "KEEP_LEFT")]
        KEEP_LEFT = 9,

        /// <summary>
        /// Enum KEEP_RIGHT for value: KEEP_RIGHT
        /// </summary>
        [EnumMember(Value = "KEEP_RIGHT")]
        KEEP_RIGHT = 10,

        /// <summary>
        /// Enum TURN_HALF_LEFT for value: TURN_HALF_LEFT
        /// </summary>
        [EnumMember(Value = "TURN_HALF_LEFT")]
        TURN_HALF_LEFT = 11,

        /// <summary>
        /// Enum TURN_LEFT for value: TURN_LEFT
        /// </summary>
        [EnumMember(Value = "TURN_LEFT")]
        TURN_LEFT = 12,

        /// <summary>
        /// Enum TURN_SHARP_LEFT for value: TURN_SHARP_LEFT
        /// </summary>
        [EnumMember(Value = "TURN_SHARP_LEFT")]
        TURN_SHARP_LEFT = 13,

        /// <summary>
        /// Enum TURN_HALF_RIGHT for value: TURN_HALF_RIGHT
        /// </summary>
        [EnumMember(Value = "TURN_HALF_RIGHT")]
        TURN_HALF_RIGHT = 14,

        /// <summary>
        /// Enum TURN_RIGHT for value: TURN_RIGHT
        /// </summary>
        [EnumMember(Value = "TURN_RIGHT")]
        TURN_RIGHT = 15,

        /// <summary>
        /// Enum TURN_SHARP_RIGHT for value: TURN_SHARP_RIGHT
        /// </summary>
        [EnumMember(Value = "TURN_SHARP_RIGHT")]
        TURN_SHARP_RIGHT = 16,

        /// <summary>
        /// Enum MAKE_U_TURN for value: MAKE_U_TURN
        /// </summary>
        [EnumMember(Value = "MAKE_U_TURN")]
        MAKE_U_TURN = 17,

        /// <summary>
        /// Enum TAKE_ROUNDABOUT_LEFT for value: TAKE_ROUNDABOUT_LEFT
        /// </summary>
        [EnumMember(Value = "TAKE_ROUNDABOUT_LEFT")]
        TAKE_ROUNDABOUT_LEFT = 18,

        /// <summary>
        /// Enum TAKE_ROUNDABOUT_RIGHT for value: TAKE_ROUNDABOUT_RIGHT
        /// </summary>
        [EnumMember(Value = "TAKE_ROUNDABOUT_RIGHT")]
        TAKE_ROUNDABOUT_RIGHT = 19,

        /// <summary>
        /// Enum TAKE_COMBINED_TRANSPORT for value: TAKE_COMBINED_TRANSPORT
        /// </summary>
        [EnumMember(Value = "TAKE_COMBINED_TRANSPORT")]
        TAKE_COMBINED_TRANSPORT = 20,

        /// <summary>
        /// Enum ENTER for value: ENTER
        /// </summary>
        [EnumMember(Value = "ENTER")]
        ENTER = 21,

        /// <summary>
        /// Enum ENTER_LEFT for value: ENTER_LEFT
        /// </summary>
        [EnumMember(Value = "ENTER_LEFT")]
        ENTER_LEFT = 22,

        /// <summary>
        /// Enum ENTER_RIGHT for value: ENTER_RIGHT
        /// </summary>
        [EnumMember(Value = "ENTER_RIGHT")]
        ENTER_RIGHT = 23,

        /// <summary>
        /// Enum EXIT for value: EXIT
        /// </summary>
        [EnumMember(Value = "EXIT")]
        EXIT = 24,

        /// <summary>
        /// Enum EXIT_LEFT for value: EXIT_LEFT
        /// </summary>
        [EnumMember(Value = "EXIT_LEFT")]
        EXIT_LEFT = 25,

        /// <summary>
        /// Enum EXIT_RIGHT for value: EXIT_RIGHT
        /// </summary>
        [EnumMember(Value = "EXIT_RIGHT")]
        EXIT_RIGHT = 26,

        /// <summary>
        /// Enum CHANGE for value: CHANGE
        /// </summary>
        [EnumMember(Value = "CHANGE")]
        CHANGE = 27,

        /// <summary>
        /// Enum CHANGE_LEFT for value: CHANGE_LEFT
        /// </summary>
        [EnumMember(Value = "CHANGE_LEFT")]
        CHANGE_LEFT = 28,

        /// <summary>
        /// Enum CHANGE_RIGHT for value: CHANGE_RIGHT
        /// </summary>
        [EnumMember(Value = "CHANGE_RIGHT")]
        CHANGE_RIGHT = 29

    }

}
