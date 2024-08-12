/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.29
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { RoadAhead } from './RoadAhead';
import {
    RoadAheadFromJSON,
    RoadAheadFromJSONTyped,
    RoadAheadToJSON,
} from './RoadAhead';
import type { CombinedTransportType } from './CombinedTransportType';
import {
    CombinedTransportTypeFromJSON,
    CombinedTransportTypeFromJSONTyped,
    CombinedTransportTypeToJSON,
} from './CombinedTransportType';
import type { ManeuverType } from './ManeuverType';
import {
    ManeuverTypeFromJSON,
    ManeuverTypeFromJSONTyped,
    ManeuverTypeToJSON,
} from './ManeuverType';

/**
 * Issued when the driver has to perform a maneuver, e.g. to turn or to enter a roundabout. Requires _MANEUVER_EVENTS_ to be requested.
 * @export
 * @interface ManeuverEvent
 */
export interface ManeuverEvent {
    /**
     * 
     * @type {ManeuverType}
     * @memberof ManeuverEvent
     */
    type: ManeuverType;
    /**
     * The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise).
     * @type {number}
     * @memberof ManeuverEvent
     */
    relativeDirection?: number;
    /**
     * The absolute direction of the outgoing road (clockwise). North represents 0 degrees.
     * @type {number}
     * @memberof ManeuverEvent
     */
    absoluteDirection?: number;
    /**
     * A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language.
     * @type {string}
     * @memberof ManeuverEvent
     */
    description: string;
    /**
     * 
     * @type {RoadAhead}
     * @memberof ManeuverEvent
     */
    roadAhead?: RoadAhead;
    /**
     * The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available.
     * @type {string}
     * @memberof ManeuverEvent
     */
    directionSignText?: string;
    /**
     * The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number.
     * @type {string}
     * @memberof ManeuverEvent
     */
    exitNumber?: string;
    /**
     * The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name.
     * @type {string}
     * @memberof ManeuverEvent
     */
    exitName?: string;
    /**
     * The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\_ROUNDABOUT_.
     * @type {number}
     * @memberof ManeuverEvent
     */
    roundaboutExit?: number;
    /**
     * The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\_COMBINED\_TRANSPORT_.
     * @type {string}
     * @memberof ManeuverEvent
     */
    combinedTransportName?: string;
    /**
     * 
     * @type {CombinedTransportType}
     * @memberof ManeuverEvent
     */
    combinedTransportType?: CombinedTransportType;
    /**
     * The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\_U\_TURN_ and if the U-turn takes place at a crossing.
     * @type {string}
     * @memberof ManeuverEvent
     */
    crossingRoadName?: string;
}

/**
 * Check if a given object implements the ManeuverEvent interface.
 */
export function instanceOfManeuverEvent(value: object): value is ManeuverEvent {
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('description' in value) || value['description'] === undefined) return false;
    return true;
}

export function ManeuverEventFromJSON(json: any): ManeuverEvent {
    return ManeuverEventFromJSONTyped(json, false);
}

export function ManeuverEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): ManeuverEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'type': ManeuverTypeFromJSON(json['type']),
        'relativeDirection': json['relativeDirection'] == null ? undefined : json['relativeDirection'],
        'absoluteDirection': json['absoluteDirection'] == null ? undefined : json['absoluteDirection'],
        'description': json['description'],
        'roadAhead': json['roadAhead'] == null ? undefined : RoadAheadFromJSON(json['roadAhead']),
        'directionSignText': json['directionSignText'] == null ? undefined : json['directionSignText'],
        'exitNumber': json['exitNumber'] == null ? undefined : json['exitNumber'],
        'exitName': json['exitName'] == null ? undefined : json['exitName'],
        'roundaboutExit': json['roundaboutExit'] == null ? undefined : json['roundaboutExit'],
        'combinedTransportName': json['combinedTransportName'] == null ? undefined : json['combinedTransportName'],
        'combinedTransportType': json['combinedTransportType'] == null ? undefined : CombinedTransportTypeFromJSON(json['combinedTransportType']),
        'crossingRoadName': json['crossingRoadName'] == null ? undefined : json['crossingRoadName'],
    };
}

export function ManeuverEventToJSON(value?: ManeuverEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': ManeuverTypeToJSON(value['type']),
        'relativeDirection': value['relativeDirection'],
        'absoluteDirection': value['absoluteDirection'],
        'description': value['description'],
        'roadAhead': RoadAheadToJSON(value['roadAhead']),
        'directionSignText': value['directionSignText'],
        'exitNumber': value['exitNumber'],
        'exitName': value['exitName'],
        'roundaboutExit': value['roundaboutExit'],
        'combinedTransportName': value['combinedTransportName'],
        'combinedTransportType': CombinedTransportTypeToJSON(value['combinedTransportType']),
        'crossingRoadName': value['crossingRoadName'],
    };
}

