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
import type { ReachableTrafficMode } from './ReachableTrafficMode';
import {
    ReachableTrafficModeFromJSON,
    ReachableTrafficModeFromJSONTyped,
    ReachableTrafficModeToJSON,
} from './ReachableTrafficMode';
import type { DrivingDirection } from './DrivingDirection';
import {
    DrivingDirectionFromJSON,
    DrivingDirectionFromJSONTyped,
    DrivingDirectionToJSON,
} from './DrivingDirection';

/**
 * 
 * @export
 * @interface ReachableOptions
 */
export interface ReachableOptions {
    /**
     * 
     * @type {DrivingDirection}
     * @memberof ReachableOptions
     */
    drivingDirection?: DrivingDirection;
    /**
     * Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * If none of them is specified the current time will be used.
     * 
     * If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint.
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.
     * The response will contain the offset to UTC specified in the request or that of the waypoint.
     * For best results it should not be more than one month in the past nor more than six months in the future.
     * See [here](./concepts/date-and-time) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof ReachableOptions
     */
    referenceTime?: Date;
    /**
     * 
     * @type {ReachableTrafficMode}
     * @memberof ReachableOptions
     */
    trafficMode?: ReachableTrafficMode;
    /**
     * Comma-separated list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed,
     * i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**.
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof ReachableOptions
     */
    allowedCountries?: string;
    /**
     * Comma-separated list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed,
     * i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**.
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof ReachableOptions
     */
    prohibitedCountries?: string;
    /**
     * Pipe-separated list of polylines.  
     * Roads and combined transports that intersect the given polylines will be considered as blocked.
     * Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.
     * Format: `<poly1_lat1>,<poly1_lon1>,...,<poly1_latN>,<poly1_lonN>|<poly2_lat1>,<poly2_lon1>,...,<poly2_latN>,<poly2_lonN>|...`  
     * Notes:
     * * Be aware of the URL length restrictions.
     * * If there is no other route connecting two waypoints the will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.
     * * Requests will be rejected if at least one provided polyline
     *   * does not consist of an even number of coordinates,
     *   * consists of less than two points,
     *   * contains invalid coordinates or
     *   * intersects more than 5000 road segments.
     * 
     * @type {string}
     * @memberof ReachableOptions
     */
    blockIntersectingRoads?: string;
}



/**
 * Check if a given object implements the ReachableOptions interface.
 */
export function instanceOfReachableOptions(value: object): value is ReachableOptions {
    return true;
}

export function ReachableOptionsFromJSON(json: any): ReachableOptions {
    return ReachableOptionsFromJSONTyped(json, false);
}

export function ReachableOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'drivingDirection': json['drivingDirection'] == null ? undefined : DrivingDirectionFromJSON(json['drivingDirection']),
        'referenceTime': json['referenceTime'] == null ? undefined : (new Date(json['referenceTime'])),
        'trafficMode': json['trafficMode'] == null ? undefined : ReachableTrafficModeFromJSON(json['trafficMode']),
        'allowedCountries': json['allowedCountries'] == null ? undefined : json['allowedCountries'],
        'prohibitedCountries': json['prohibitedCountries'] == null ? undefined : json['prohibitedCountries'],
        'blockIntersectingRoads': json['blockIntersectingRoads'] == null ? undefined : json['blockIntersectingRoads'],
    };
}

export function ReachableOptionsToJSON(value?: ReachableOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'drivingDirection': DrivingDirectionToJSON(value['drivingDirection']),
        'referenceTime': value['referenceTime'] == null ? undefined : ((value['referenceTime']).toISOString()),
        'trafficMode': ReachableTrafficModeToJSON(value['trafficMode']),
        'allowedCountries': value['allowedCountries'],
        'prohibitedCountries': value['prohibitedCountries'],
        'blockIntersectingRoads': value['blockIntersectingRoads'],
    };
}

