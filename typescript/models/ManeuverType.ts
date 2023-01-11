/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Describes the type of maneuver to execute.   
 *  * `START` - Departure at an on-road waypoint.   
 *  * `START_LEFT` - Departure at an off-road waypoint to begin the route heading left.   
 *  * `START_RIGHT` - Departure at an off-road waypoint to begin the route heading right.   
 *  * `ARRIVE` - Arrival at an on-road waypoint.   
 *  * `ARRIVE_LEFT` - Arrival at an off-road waypoint if the waypoint is on the left.   
 *  * `ARRIVE_RIGHT` - Arrival at an off-road waypoint if the waypoint is on the right.   
 *  * `CONTINUE` - Follow the current road, usually when the road type changes although the road goes straight.   
 *  * `KEEP_STRAIGHT` - Stay on the straight lane, usually in fork-shaped intersections with more than two spikes.   
 *  * `KEEP_LEFT` - Keep left or to take the left lane, usually in Y-shaped intersections.   
 *  * `KEEP_RIGHT` - Keep right or to take the right lane, usually  in Y-shaped intersections.   
 *  * `TURN_HALF_LEFT` - Turn half left at a crossing where at least one additional trailing road exists,
 *  usually at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `TURN_LEFT` - Turn left at a crossing where at least one additional trailing road exists, usually
 *  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `TURN_SHARP_LEFT` - Turn sharp left at a crossing where at least one additional trailing road exists, usually 
 *  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `TURN_HALF_RIGHT` - Turn half right at a crossing where at least one additional trailing road exists, usually 
 *  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `TURN_RIGHT` - Turn right at a crossing where at least one additional trailing road exists, usually
 *  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `TURN_SHARP_RIGHT` - Turn sharp right at a crossing where at least one additional trailing road exists, usually 
 *  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.   
 *  * `MAKE_U_TURN` - Make a U-turn, either at the same road or at structurally separated roads. The **relativeDirection** 
 *  indicates whether to turn left or right.   
 *  * `TAKE_ROUNDABOUT_LEFT` - Enter a roundabout to the left and leave it at the given **roundaboutExit**. 
 *  Only drivable roads of the roundabout are counted.   
 *  * `TAKE_ROUNDABOUT_RIGHT` - Enter a roundabout to the right and leave it at the given **roundaboutExit**. 
 *  Only drivable roads of the roundabout are counted.   
 *  * `TAKE_COMBINED_TRANSPORT` - Take boat (ferry) or rail (train or rail shuttle) connection.
 *  * `ENTER` - Enter a highway/freeway/major road straight.   
 *  * `ENTER_LEFT` - Enter a highway/freeway/major road to the left.   
 *  * `ENTER_RIGHT` - Enter a highway/freeway/major road to the right.   
 *  * `EXIT` - Leave a highway/freeway/major road straight.   
 *  * `EXIT_LEFT` - Leave a highway/freeway/major road to the left.   
 *  * `EXIT_RIGHT` - Leave a highway/freeway/major road to the right.   
 *  * `CHANGE` - Change straight to another highway/freeway at an interchange.   
 *  * `CHANGE_LEFT` - Change to the left to another highway/freeway at an interchange.   
 *  * `CHANGE_RIGHT` - Change to the right to another highway/freeway at an interchange.
 * @export
 */
export const ManeuverType = {
    START: 'START',
    START_LEFT: 'START_LEFT',
    START_RIGHT: 'START_RIGHT',
    ARRIVE: 'ARRIVE',
    ARRIVE_LEFT: 'ARRIVE_LEFT',
    ARRIVE_RIGHT: 'ARRIVE_RIGHT',
    CONTINUE: 'CONTINUE',
    KEEP_STRAIGHT: 'KEEP_STRAIGHT',
    KEEP_LEFT: 'KEEP_LEFT',
    KEEP_RIGHT: 'KEEP_RIGHT',
    TURN_HALF_LEFT: 'TURN_HALF_LEFT',
    TURN_LEFT: 'TURN_LEFT',
    TURN_SHARP_LEFT: 'TURN_SHARP_LEFT',
    TURN_HALF_RIGHT: 'TURN_HALF_RIGHT',
    TURN_RIGHT: 'TURN_RIGHT',
    TURN_SHARP_RIGHT: 'TURN_SHARP_RIGHT',
    MAKE_U_TURN: 'MAKE_U_TURN',
    TAKE_ROUNDABOUT_LEFT: 'TAKE_ROUNDABOUT_LEFT',
    TAKE_ROUNDABOUT_RIGHT: 'TAKE_ROUNDABOUT_RIGHT',
    TAKE_COMBINED_TRANSPORT: 'TAKE_COMBINED_TRANSPORT',
    ENTER: 'ENTER',
    ENTER_LEFT: 'ENTER_LEFT',
    ENTER_RIGHT: 'ENTER_RIGHT',
    EXIT: 'EXIT',
    EXIT_LEFT: 'EXIT_LEFT',
    EXIT_RIGHT: 'EXIT_RIGHT',
    CHANGE: 'CHANGE',
    CHANGE_LEFT: 'CHANGE_LEFT',
    CHANGE_RIGHT: 'CHANGE_RIGHT'
} as const;
export type ManeuverType = typeof ManeuverType[keyof typeof ManeuverType];


export function ManeuverTypeFromJSON(json: any): ManeuverType {
    return ManeuverTypeFromJSONTyped(json, false);
}

export function ManeuverTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ManeuverType {
    return json as ManeuverType;
}

export function ManeuverTypeToJSON(value?: ManeuverType | null): any {
    return value as any;
}
