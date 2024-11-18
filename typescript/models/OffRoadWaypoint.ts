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
import type { EvParametersAtWaypoint } from './EvParametersAtWaypoint';
import {
    EvParametersAtWaypointFromJSON,
    EvParametersAtWaypointFromJSONTyped,
    EvParametersAtWaypointToJSON,
} from './EvParametersAtWaypoint';
import type { RoadAccess } from './RoadAccess';
import {
    RoadAccessFromJSON,
    RoadAccessFromJSONTyped,
    RoadAccessToJSON,
} from './RoadAccess';
import type { TimeInterval } from './TimeInterval';
import {
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import type { VehicleParametersAtWaypoint } from './VehicleParametersAtWaypoint';
import {
    VehicleParametersAtWaypointFromJSON,
    VehicleParametersAtWaypointFromJSONTyped,
    VehicleParametersAtWaypointToJSON,
} from './VehicleParametersAtWaypoint';

/**
 * An _off-road waypoint_ will be part of the route.
 * The air-line connection between given and matched coordinates is included in the route polyline, distance and duration.
 * Use this waypoint type to recalculate a route planned by the Route Optimization API.
 * @export
 * @interface OffRoadWaypoint
 */
export interface OffRoadWaypoint {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    longitude: number;
    /**
     * 
     * @type {RoadAccess}
     * @memberof OffRoadWaypoint
     */
    roadAcess?: RoadAccess;
    /**
     * Specifies that this waypoint will be reached at the side of street on which it is located.
     * This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.
     * @type {boolean}
     * @memberof OffRoadWaypoint
     */
    matchSideOfStreet?: boolean;
    /**
     * The service time [s] that is required at this waypoint, e.g. for pickup or delivery.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    serviceTime?: number;
    /**
     * If true, the service time can be used for a break or rest. Will be ignored, if **serviceTime** is 0 or if no **driver** is specified.
     * @type {boolean}
     * @memberof OffRoadWaypoint
     */
    useServiceTimeForRecreation?: boolean;
    /**
     * The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval.
     * Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals.
     * If the vehicle does not arrive at a waypoint within an opening interval, a waiting time will be scheduled. 
     * When using a multi-day **workingHoursPreset** this waiting time will usually be used for daily rests instead, in order
     * to continue the route with a rested driver.
     * @type {Array<TimeInterval>}
     * @memberof OffRoadWaypoint
     */
    openingIntervals?: Array<TimeInterval>;
    /**
     * 
     * @type {VehicleParametersAtWaypoint}
     * @memberof OffRoadWaypoint
     */
    vehicleParameters?: VehicleParametersAtWaypoint;
    /**
     * 
     * @type {EvParametersAtWaypoint}
     * @memberof OffRoadWaypoint
     */
    evParameters?: EvParametersAtWaypoint;
}

/**
 * Check if a given object implements the OffRoadWaypoint interface.
 */
export function instanceOfOffRoadWaypoint(value: object): value is OffRoadWaypoint {
    if (!('latitude' in value) || value['latitude'] === undefined) return false;
    if (!('longitude' in value) || value['longitude'] === undefined) return false;
    return true;
}

export function OffRoadWaypointFromJSON(json: any): OffRoadWaypoint {
    return OffRoadWaypointFromJSONTyped(json, false);
}

export function OffRoadWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): OffRoadWaypoint {
    if (json == null) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'roadAcess': json['roadAcess'] == null ? undefined : RoadAccessFromJSON(json['roadAcess']),
        'matchSideOfStreet': json['matchSideOfStreet'] == null ? undefined : json['matchSideOfStreet'],
        'serviceTime': json['serviceTime'] == null ? undefined : json['serviceTime'],
        'useServiceTimeForRecreation': json['useServiceTimeForRecreation'] == null ? undefined : json['useServiceTimeForRecreation'],
        'openingIntervals': json['openingIntervals'] == null ? undefined : ((json['openingIntervals'] as Array<any>).map(TimeIntervalFromJSON)),
        'vehicleParameters': json['vehicleParameters'] == null ? undefined : VehicleParametersAtWaypointFromJSON(json['vehicleParameters']),
        'evParameters': json['evParameters'] == null ? undefined : EvParametersAtWaypointFromJSON(json['evParameters']),
    };
}

export function OffRoadWaypointToJSON(value?: OffRoadWaypoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'latitude': value['latitude'],
        'longitude': value['longitude'],
        'roadAcess': RoadAccessToJSON(value['roadAcess']),
        'matchSideOfStreet': value['matchSideOfStreet'],
        'serviceTime': value['serviceTime'],
        'useServiceTimeForRecreation': value['useServiceTimeForRecreation'],
        'openingIntervals': value['openingIntervals'] == null ? undefined : ((value['openingIntervals'] as Array<any>).map(TimeIntervalToJSON)),
        'vehicleParameters': VehicleParametersAtWaypointToJSON(value['vehicleParameters']),
        'evParameters': EvParametersAtWaypointToJSON(value['evParameters']),
    };
}

