/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers\' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Waypoint } from './Waypoint';
import {
    WaypointFromJSON,
    WaypointFromJSONTyped,
    WaypointToJSON,
} from './Waypoint';
import type { DriverBody } from './DriverBody';
import {
    DriverBodyFromJSON,
    DriverBodyFromJSONTyped,
    DriverBodyToJSON,
} from './DriverBody';

/**
 * 
 * @export
 * @interface RouteRequest
 */
export interface RouteRequest {
    /**
     * The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription.
     * The first waypoint is the start and the last is the destination of the route.
     * Additional intermediate waypoints are possible.
     * 
     * Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.
     * @type {Array<Waypoint>}
     * @memberof RouteRequest
     */
    waypoints?: Array<Waypoint>;
    /**
     * Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered.
     * See [here](./concepts/waypoints) for more information.
     * @type {string}
     * @memberof RouteRequest
     */
    routeId?: string;
    /**
     * 
     * @type {DriverBody}
     * @memberof RouteRequest
     */
    driver?: DriverBody;
}

/**
 * Check if a given object implements the RouteRequest interface.
 */
export function instanceOfRouteRequest(value: object): value is RouteRequest {
    return true;
}

export function RouteRequestFromJSON(json: any): RouteRequest {
    return RouteRequestFromJSONTyped(json, false);
}

export function RouteRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'waypoints': json['waypoints'] == null ? undefined : ((json['waypoints'] as Array<any>).map(WaypointFromJSON)),
        'routeId': json['routeId'] == null ? undefined : json['routeId'],
        'driver': json['driver'] == null ? undefined : DriverBodyFromJSON(json['driver']),
    };
}

export function RouteRequestToJSON(value?: RouteRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'waypoints': value['waypoints'] == null ? undefined : ((value['waypoints'] as Array<any>).map(WaypointToJSON)),
        'routeId': value['routeId'],
        'driver': DriverBodyToJSON(value['driver']),
    };
}

