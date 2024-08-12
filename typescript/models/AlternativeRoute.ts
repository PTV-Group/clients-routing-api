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
/**
 * 
 * @export
 * @interface AlternativeRoute
 */
export interface AlternativeRoute {
    /**
     * The distance of the alternative route [m].
     * @type {number}
     * @memberof AlternativeRoute
     */
    distance: number;
    /**
     * The travel time for the alternative route [s].
     * @type {number}
     * @memberof AlternativeRoute
     */
    travelTime: number;
    /**
     * The total delay due to live traffic on this alternative route [s].
     * 
     * This value contains the sum of all traffic events on this alternative route and  will be non-zero only if **options[trafficMode]=REALISTIC**.
     * See [here](./concepts/traffic-modes) for more information.
     * @type {number}
     * @memberof AlternativeRoute
     */
    trafficDelay?: number;
    /**
     * If the alternative route cannot be calculated for the given vehicle the resulting alternative route is marked as violated.
     * @type {boolean}
     * @memberof AlternativeRoute
     */
    violated: boolean;
    /**
     * The polyline of the alternative route in the format specified by **options[polylineFormat]**.
     * @type {string}
     * @memberof AlternativeRoute
     */
    polyline?: string;
    /**
     * The ID of the alternative route.
     * @type {string}
     * @memberof AlternativeRoute
     */
    routeId?: string;
}

/**
 * Check if a given object implements the AlternativeRoute interface.
 */
export function instanceOfAlternativeRoute(value: object): value is AlternativeRoute {
    if (!('distance' in value) || value['distance'] === undefined) return false;
    if (!('travelTime' in value) || value['travelTime'] === undefined) return false;
    if (!('violated' in value) || value['violated'] === undefined) return false;
    return true;
}

export function AlternativeRouteFromJSON(json: any): AlternativeRoute {
    return AlternativeRouteFromJSONTyped(json, false);
}

export function AlternativeRouteFromJSONTyped(json: any, ignoreDiscriminator: boolean): AlternativeRoute {
    if (json == null) {
        return json;
    }
    return {
        
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'trafficDelay': json['trafficDelay'] == null ? undefined : json['trafficDelay'],
        'violated': json['violated'],
        'polyline': json['polyline'] == null ? undefined : json['polyline'],
        'routeId': json['routeId'] == null ? undefined : json['routeId'],
    };
}

export function AlternativeRouteToJSON(value?: AlternativeRoute | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'distance': value['distance'],
        'travelTime': value['travelTime'],
        'trafficDelay': value['trafficDelay'],
        'violated': value['violated'],
        'polyline': value['polyline'],
        'routeId': value['routeId'],
    };
}

