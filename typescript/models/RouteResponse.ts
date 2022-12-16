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

import { exists, mapValues } from '../runtime';
import {
    AlternativeRoute,
    AlternativeRouteFromJSON,
    AlternativeRouteFromJSONTyped,
    AlternativeRouteToJSON,
} from './AlternativeRoute';
import {
    Emissions,
    EmissionsFromJSON,
    EmissionsFromJSONTyped,
    EmissionsToJSON,
} from './Emissions';
import {
    Event,
    EventFromJSON,
    EventFromJSONTyped,
    EventToJSON,
} from './Event';
import {
    Leg,
    LegFromJSON,
    LegFromJSONTyped,
    LegToJSON,
} from './Leg';
import {
    MonetaryCosts,
    MonetaryCostsFromJSON,
    MonetaryCostsFromJSONTyped,
    MonetaryCostsToJSON,
} from './MonetaryCosts';
import {
    ScheduleReport,
    ScheduleReportFromJSON,
    ScheduleReportFromJSONTyped,
    ScheduleReportToJSON,
} from './ScheduleReport';
import {
    Toll,
    TollFromJSON,
    TollFromJSONTyped,
    TollToJSON,
} from './Toll';
import {
    Warning,
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * 
 * @export
 * @interface RouteResponse
 */
export interface RouteResponse {
    /**
     * The distance of the route [m].
     * @type {number}
     * @memberof RouteResponse
     */
    distance: number;
    /**
     * The travel time for the route [s].
     * @type {number}
     * @memberof RouteResponse
     */
    travelTime: number;
    /**
     * The total delay due to live traffic on the route [s].
     * 
     * This value contains the sum of all traffic events on the route and will be non-zero only if **options[trafficMode]=REALISTIC**.
     * See [here](./Concepts/Traffic%20Modes.htm) for more information.
     * @type {number}
     * @memberof RouteResponse
     */
    trafficDelay?: number;
    /**
     * When there is no valid route for the given vehicle between two waypoints, but the resulting route can be calculated by ignoring a vehicle parameter, the route is marked as violated. When requesting _VIOLATION_EVENTS_ there is a corresponding violation event containing the position, time and the vehicle property in question.
     * @type {boolean}
     * @memberof RouteResponse
     */
    violated: boolean;
    /**
     * The ID of the calculated route.
     * @type {string}
     * @memberof RouteResponse
     */
    routeId?: string;
    /**
     * The legs of the route.
     * @type {Array<Leg>}
     * @memberof RouteResponse
     */
    legs?: Array<Leg>;
    /**
     * 
     * @type {Toll}
     * @memberof RouteResponse
     */
    toll?: Toll;
    /**
     * The polyline of the route in the format specified by **options[polylineFormat]**.
     * @type {string}
     * @memberof RouteResponse
     */
    polyline?: string;
    /**
     * Detailed information on maneuvers, border crossings and other events along the route in chronological order.
     * @type {Array<Event>}
     * @memberof RouteResponse
     */
    events?: Array<Event>;
    /**
     * 
     * @type {Emissions}
     * @memberof RouteResponse
     */
    emissions?: Emissions;
    /**
     * Detailed information on alternative routes. Requires _ALTERNATIVE_ROUTES_ to be requested. The array may be empty when no alternative routes are found.
     * @type {Array<AlternativeRoute>}
     * @memberof RouteResponse
     */
    alternativeRoutes?: Array<AlternativeRoute>;
    /**
     * 
     * @type {ScheduleReport}
     * @memberof RouteResponse
     */
    scheduleReport?: ScheduleReport;
    /**
     * A base64 encoded representation of the route that can be used for the [PTV Navigator](https://www.myptv.com/en/logistics-software/ptv-navigator). The base64 binary has to be decoded and saved as a text file with the extension .bcr.
     * Requires _GUIDED_NAVIGATION_ to be requested.
     * @type {string}
     * @memberof RouteResponse
     */
    guidedNavigation?: string;
    /**
     * 
     * @type {MonetaryCosts}
     * @memberof RouteResponse
     */
    monetaryCosts?: MonetaryCosts;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof RouteResponse
     */
    warnings?: Array<Warning>;
}

export function RouteResponseFromJSON(json: any): RouteResponse {
    return RouteResponseFromJSONTyped(json, false);
}

export function RouteResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'trafficDelay': !exists(json, 'trafficDelay') ? undefined : json['trafficDelay'],
        'violated': json['violated'],
        'routeId': !exists(json, 'routeId') ? undefined : json['routeId'],
        'legs': !exists(json, 'legs') ? undefined : ((json['legs'] as Array<any>).map(LegFromJSON)),
        'toll': !exists(json, 'toll') ? undefined : TollFromJSON(json['toll']),
        'polyline': !exists(json, 'polyline') ? undefined : json['polyline'],
        'events': !exists(json, 'events') ? undefined : ((json['events'] as Array<any>).map(EventFromJSON)),
        'emissions': !exists(json, 'emissions') ? undefined : EmissionsFromJSON(json['emissions']),
        'alternativeRoutes': !exists(json, 'alternativeRoutes') ? undefined : ((json['alternativeRoutes'] as Array<any>).map(AlternativeRouteFromJSON)),
        'scheduleReport': !exists(json, 'scheduleReport') ? undefined : ScheduleReportFromJSON(json['scheduleReport']),
        'guidedNavigation': !exists(json, 'guidedNavigation') ? undefined : json['guidedNavigation'],
        'monetaryCosts': !exists(json, 'monetaryCosts') ? undefined : MonetaryCostsFromJSON(json['monetaryCosts']),
        'warnings': !exists(json, 'warnings') ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function RouteResponseToJSON(value?: RouteResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'distance': value.distance,
        'travelTime': value.travelTime,
        'trafficDelay': value.trafficDelay,
        'violated': value.violated,
        'routeId': value.routeId,
        'legs': value.legs === undefined ? undefined : ((value.legs as Array<any>).map(LegToJSON)),
        'toll': TollToJSON(value.toll),
        'polyline': value.polyline,
        'events': value.events === undefined ? undefined : ((value.events as Array<any>).map(EventToJSON)),
        'emissions': EmissionsToJSON(value.emissions),
        'alternativeRoutes': value.alternativeRoutes === undefined ? undefined : ((value.alternativeRoutes as Array<any>).map(AlternativeRouteToJSON)),
        'scheduleReport': ScheduleReportToJSON(value.scheduleReport),
        'guidedNavigation': value.guidedNavigation,
        'monetaryCosts': MonetaryCostsToJSON(value.monetaryCosts),
        'warnings': value.warnings === undefined ? undefined : ((value.warnings as Array<any>).map(WarningToJSON)),
    };
}

