/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers\' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CombinedTransportLocation } from './CombinedTransportLocation';
import {
    CombinedTransportLocationFromJSON,
    CombinedTransportLocationFromJSONTyped,
    CombinedTransportLocationToJSON,
} from './CombinedTransportLocation';

/**
 * Influences the route course, so that the route uses a ferry or railway connection between the given locations. Both locations will be matched to the nearest ports looking for a direct connection. If no connection can be found, this waypoint will be ignored, and the warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED_ will be returned. If more than one connection is found, the best one will be used, and the alternative connections will be returned in the response in a warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS_. This waypoint will not appear as a waypoint event in the response and may not be used as start or destination. We will refer to this type of waypoint as a _combined-transport waypoint_.
 * @export
 * @interface CombinedTransport
 */
export interface CombinedTransport {
    /**
     * 
     * @type {CombinedTransportLocation}
     * @memberof CombinedTransport
     */
    start: CombinedTransportLocation;
    /**
     * 
     * @type {CombinedTransportLocation}
     * @memberof CombinedTransport
     */
    destination: CombinedTransportLocation;
}

/**
 * Check if a given object implements the CombinedTransport interface.
 */
export function instanceOfCombinedTransport(value: object): value is CombinedTransport {
    if (!('start' in value) || value['start'] === undefined) return false;
    if (!('destination' in value) || value['destination'] === undefined) return false;
    return true;
}

export function CombinedTransportFromJSON(json: any): CombinedTransport {
    return CombinedTransportFromJSONTyped(json, false);
}

export function CombinedTransportFromJSONTyped(json: any, ignoreDiscriminator: boolean): CombinedTransport {
    if (json == null) {
        return json;
    }
    return {
        
        'start': CombinedTransportLocationFromJSON(json['start']),
        'destination': CombinedTransportLocationFromJSON(json['destination']),
    };
}

export function CombinedTransportToJSON(value?: CombinedTransport | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'start': CombinedTransportLocationToJSON(value['start']),
        'destination': CombinedTransportLocationToJSON(value['destination']),
    };
}

