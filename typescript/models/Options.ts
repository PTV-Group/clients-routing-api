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
import type { RoutingMode } from './RoutingMode';
import {
    RoutingModeFromJSON,
    RoutingModeFromJSONTyped,
    RoutingModeToJSON,
} from './RoutingMode';
import type { TrafficMode } from './TrafficMode';
import {
    TrafficModeFromJSON,
    TrafficModeFromJSONTyped,
    TrafficModeToJSON,
} from './TrafficMode';
import type { PolylineFormat } from './PolylineFormat';
import {
    PolylineFormatFromJSON,
    PolylineFormatFromJSONTyped,
    PolylineFormatToJSON,
} from './PolylineFormat';

/**
 * 
 * @export
 * @interface Options
 */
export interface Options {
    /**
     * Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_.
     * 
     * This field is mutually exclusive with **arrivalTime** and **tollTime**.
     * If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint.
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. 
     * The response will contain the offset to UTC specified in the request or that of the start waypoint.
     * For best results it should not be more than one month in the past nor more than six months in the future.  
     * See [here](./concepts/date-and-time) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof Options
     */
    startTime?: Date | null;
    /**
     * Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     * This field is mutually exclusive with **startTime** and **tollTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor
     * when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.
     * If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint.
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. 
     * The response will contain the offset to UTC specified in the request or that of the destination waypoint.
     * For best results it should not be more than one month in the past nor more than six months in the future.  
     * See [here](./concepts/date-and-time) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof Options
     */
    arrivalTime?: Date | null;
    /**
     * Defines the date and time at which to calculate toll prices formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     * This parameter only has an influence if toll related results are requested. It can only be used in combination with **trafficMode** _AVERAGE_ 
     * and it is mutually exclusive with both **startTime** and **arrivalTime**.
     * If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint.
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  
     * See [here](./concepts/date-and-time) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof Options
     */
    tollTime?: Date | null;
    /**
     * 
     * @type {TrafficMode}
     * @memberof Options
     */
    trafficMode?: TrafficMode;
    /**
     * The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_.
     * Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php)
     * code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).  
     * The **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ is returned if the language is not supported for maneuvers.
     * @type {string}
     * @memberof Options
     */
    language?: string;
    /**
     * 
     * @type {PolylineFormat}
     * @memberof Options
     */
    polylineFormat?: PolylineFormat;
    /**
     * Comma-separated list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed,
     * i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**.
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof Options
     */
    allowedCountries?: string | null;
    /**
     * Comma-separated list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed,
     * i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**.
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof Options
     */
    prohibitedCountries?: string | null;
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).  
     * If it is not specified, the currency is taken from the **profile**.  
     * It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for 
     * toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used 
     * when setting **options[routingMode]=MONETARY**.
     * @type {string}
     * @memberof Options
     */
    currency?: string | null;
    /**
     * Specifies that the route is constructed such that turns to the passenger side are preferred.
     * 
     * @type {boolean}
     * @memberof Options
     */
    preferTurnsOnPassengerSide?: boolean;
    /**
     * Comma-separated list of features which should be avoided on the route.
     * Avoided features could be included in a route if there is no possibility to reach the target otherwise.
     * * `TOLL` - Avoid roads with toll.
     * * `FERRIES` - Avoid ferries. Ferries which cannot be avoided can be requested with _COMBINED_TRANSPORT_EVENTS_ and will appear with the type _BOAT_.
     * * `RAIL_SHUTTLES` - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with _COMBINED_TRANSPORT_EVENTS_ and will appear with the type _RAIL_.
     * * `HIGHWAYS` - Avoid highways and motorways. Waypoints will not be matched to highways, they will be matched to the nearest road which is not a highway.
     * Cannot be used with **options[routingMode]=MONETARY**. 
     * See [here](./concepts/avoid) for more information. 
     * 
     * Available values are provided by type `AvoidFeature`.
     * @type {string}
     * @memberof Options
     */
    avoid?: string | null;
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
     * @memberof Options
     */
    blockIntersectingRoads?: string | null;
    /**
     * Comma-separated list of [custom road attribute scenarios](../data-api/concepts/custom-road-attributes) to be considered in the route calculation. 
     * Each scenario can be specified by its name or its ID. A shared scenario can only be specified by its ID.
     * 
     * The size limitations that apply to each scenario, also apply to the collection of scenarios, i.e. the limit 
     * on the number of roads in one scenario can not be circumvented by splitting it in multiple scenarios.
     * @type {string}
     * @memberof Options
     */
    customRoadAttributeScenarios?: string | null;
    /**
     * 
     * @type {RoutingMode}
     * @memberof Options
     */
    routingMode?: RoutingMode;
    /**
     * The maximum speed of the vehicle [km/h]. The speeds for calculating the driving times on all roads
     * will be limited to this value. 
     * See [here](./concepts/speeds) for more information.
     * @type {number}
     * @memberof Options
     */
    maximumSpeed?: number | null;
    /**
     * An additional factor to apply to the speed of the vehicle. This modified speed is used to modify the driving times after the
     * route has been calculated. That means in particular that the route itself will not be modified by applying a speed factor.
     * When lower than one, the driving time of the vehicle will increase, when greater than one, the driving time of the vehicle will decrease.
     * Note that the factor is only applied on the parts of the route where the vehicle is driving. Therefore, a speed factor of 1.1 does not
     * necessarily mean that the **travelTime** of the resulting route will be 10% faster. The speed is not capped by the maximum speed of the 
     * vehicle or of the road. 
     * See [here](./concepts/speeds) for more information.
     * @type {number}
     * @memberof Options
     */
    speedFactor?: number;
}



/**
 * Check if a given object implements the Options interface.
 */
export function instanceOfOptions(value: object): value is Options {
    return true;
}

export function OptionsFromJSON(json: any): Options {
    return OptionsFromJSONTyped(json, false);
}

export function OptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Options {
    if (json == null) {
        return json;
    }
    return {
        
        'startTime': json['startTime'] == null ? undefined : (new Date(json['startTime'])),
        'arrivalTime': json['arrivalTime'] == null ? undefined : (new Date(json['arrivalTime'])),
        'tollTime': json['tollTime'] == null ? undefined : (new Date(json['tollTime'])),
        'trafficMode': json['trafficMode'] == null ? undefined : TrafficModeFromJSON(json['trafficMode']),
        'language': json['language'] == null ? undefined : json['language'],
        'polylineFormat': json['polylineFormat'] == null ? undefined : PolylineFormatFromJSON(json['polylineFormat']),
        'allowedCountries': json['allowedCountries'] == null ? undefined : json['allowedCountries'],
        'prohibitedCountries': json['prohibitedCountries'] == null ? undefined : json['prohibitedCountries'],
        'currency': json['currency'] == null ? undefined : json['currency'],
        'preferTurnsOnPassengerSide': json['preferTurnsOnPassengerSide'] == null ? undefined : json['preferTurnsOnPassengerSide'],
        'avoid': json['avoid'] == null ? undefined : json['avoid'],
        'blockIntersectingRoads': json['blockIntersectingRoads'] == null ? undefined : json['blockIntersectingRoads'],
        'customRoadAttributeScenarios': json['customRoadAttributeScenarios'] == null ? undefined : json['customRoadAttributeScenarios'],
        'routingMode': json['routingMode'] == null ? undefined : RoutingModeFromJSON(json['routingMode']),
        'maximumSpeed': json['maximumSpeed'] == null ? undefined : json['maximumSpeed'],
        'speedFactor': json['speedFactor'] == null ? undefined : json['speedFactor'],
    };
}

export function OptionsToJSON(value?: Options | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'startTime': value['startTime'] == null ? undefined : ((value['startTime'] as any).toISOString()),
        'arrivalTime': value['arrivalTime'] == null ? undefined : ((value['arrivalTime'] as any).toISOString()),
        'tollTime': value['tollTime'] == null ? undefined : ((value['tollTime'] as any).toISOString()),
        'trafficMode': TrafficModeToJSON(value['trafficMode']),
        'language': value['language'],
        'polylineFormat': PolylineFormatToJSON(value['polylineFormat']),
        'allowedCountries': value['allowedCountries'],
        'prohibitedCountries': value['prohibitedCountries'],
        'currency': value['currency'],
        'preferTurnsOnPassengerSide': value['preferTurnsOnPassengerSide'],
        'avoid': value['avoid'],
        'blockIntersectingRoads': value['blockIntersectingRoads'],
        'customRoadAttributeScenarios': value['customRoadAttributeScenarios'],
        'routingMode': RoutingModeToJSON(value['routingMode']),
        'maximumSpeed': value['maximumSpeed'],
        'speedFactor': value['speedFactor'],
    };
}

