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
import type { OffRoadWaypoint } from './OffRoadWaypoint';
import {
    OffRoadWaypointFromJSON,
    OffRoadWaypointFromJSONTyped,
    OffRoadWaypointToJSON,
} from './OffRoadWaypoint';
import type { OnRoadWaypoint } from './OnRoadWaypoint';
import {
    OnRoadWaypointFromJSON,
    OnRoadWaypointFromJSONTyped,
    OnRoadWaypointToJSON,
} from './OnRoadWaypoint';
import type { ManipulateRouteWaypoint } from './ManipulateRouteWaypoint';
import {
    ManipulateRouteWaypointFromJSON,
    ManipulateRouteWaypointFromJSONTyped,
    ManipulateRouteWaypointToJSON,
} from './ManipulateRouteWaypoint';
import type { CombinedTransport } from './CombinedTransport';
import {
    CombinedTransportFromJSON,
    CombinedTransportFromJSONTyped,
    CombinedTransportToJSON,
} from './CombinedTransport';

/**
 * 
 * @export
 * @interface Waypoint
 */
export interface Waypoint {
    /**
     * An identifier to reference this waypoint in the response.
     * @type {string}
     * @memberof Waypoint
     */
    name?: string;
    /**
     * 
     * @type {OnRoadWaypoint}
     * @memberof Waypoint
     */
    onRoad?: OnRoadWaypoint;
    /**
     * 
     * @type {OffRoadWaypoint}
     * @memberof Waypoint
     */
    offRoad?: OffRoadWaypoint;
    /**
     * 
     * @type {ManipulateRouteWaypoint}
     * @memberof Waypoint
     */
    manipulate?: ManipulateRouteWaypoint;
    /**
     * 
     * @type {CombinedTransport}
     * @memberof Waypoint
     */
    combinedTransport?: CombinedTransport;
}

/**
 * Check if a given object implements the Waypoint interface.
 */
export function instanceOfWaypoint(value: object): value is Waypoint {
    return true;
}

export function WaypointFromJSON(json: any): Waypoint {
    return WaypointFromJSONTyped(json, false);
}

export function WaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): Waypoint {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'onRoad': json['onRoad'] == null ? undefined : OnRoadWaypointFromJSON(json['onRoad']),
        'offRoad': json['offRoad'] == null ? undefined : OffRoadWaypointFromJSON(json['offRoad']),
        'manipulate': json['manipulate'] == null ? undefined : ManipulateRouteWaypointFromJSON(json['manipulate']),
        'combinedTransport': json['combinedTransport'] == null ? undefined : CombinedTransportFromJSON(json['combinedTransport']),
    };
}

export function WaypointToJSON(value?: Waypoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'onRoad': OnRoadWaypointToJSON(value['onRoad']),
        'offRoad': OffRoadWaypointToJSON(value['offRoad']),
        'manipulate': ManipulateRouteWaypointToJSON(value['manipulate']),
        'combinedTransport': CombinedTransportToJSON(value['combinedTransport']),
    };
}

