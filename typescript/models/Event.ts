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
    BorderEvent,
    BorderEventFromJSON,
    BorderEventFromJSONTyped,
    BorderEventToJSON,
} from './BorderEvent';
import {
    CombinedTransportEvent,
    CombinedTransportEventFromJSON,
    CombinedTransportEventFromJSONTyped,
    CombinedTransportEventToJSON,
} from './CombinedTransportEvent';
import {
    ManeuverEvent,
    ManeuverEventFromJSON,
    ManeuverEventFromJSONTyped,
    ManeuverEventToJSON,
} from './ManeuverEvent';
import {
    ScheduleEvent,
    ScheduleEventFromJSON,
    ScheduleEventFromJSONTyped,
    ScheduleEventToJSON,
} from './ScheduleEvent';
import {
    TollEvent,
    TollEventFromJSON,
    TollEventFromJSONTyped,
    TollEventToJSON,
} from './TollEvent';
import {
    TrafficEvent,
    TrafficEventFromJSON,
    TrafficEventFromJSONTyped,
    TrafficEventToJSON,
} from './TrafficEvent';
import {
    UTCOffsetChangeEvent,
    UTCOffsetChangeEventFromJSON,
    UTCOffsetChangeEventFromJSONTyped,
    UTCOffsetChangeEventToJSON,
} from './UTCOffsetChangeEvent';
import {
    ViolationEvent,
    ViolationEventFromJSON,
    ViolationEventFromJSONTyped,
    ViolationEventToJSON,
} from './ViolationEvent';
import {
    WaypointEvent,
    WaypointEventFromJSON,
    WaypointEventFromJSONTyped,
    WaypointEventToJSON,
} from './WaypointEvent';

/**
 * 
 * @export
 * @interface Event
 */
export interface Event {
    /**
     * The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof Event
     */
    latitude: number;
    /**
     * The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof Event
     */
    longitude: number;
    /**
     * The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
     * @type {Date}
     * @memberof Event
     */
    startsAt?: Date;
    /**
     * The distance from the start to this event [m].
     * @type {number}
     * @memberof Event
     */
    distanceFromStart: number;
    /**
     * The travel time from the start to this event [s].
     * @type {number}
     * @memberof Event
     */
    travelTimeFromStart: number;
    /**
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof Event
     */
    countryCode: string;
    /**
     * The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
     * @type {number}
     * @memberof Event
     */
    utcOffset: number;
    /**
     * 
     * @type {TollEvent}
     * @memberof Event
     */
    toll?: TollEvent;
    /**
     * 
     * @type {ManeuverEvent}
     * @memberof Event
     */
    maneuver?: ManeuverEvent;
    /**
     * 
     * @type {BorderEvent}
     * @memberof Event
     */
    border?: BorderEvent;
    /**
     * 
     * @type {ViolationEvent}
     * @memberof Event
     */
    violation?: ViolationEvent;
    /**
     * 
     * @type {WaypointEvent}
     * @memberof Event
     */
    waypoint?: WaypointEvent;
    /**
     * 
     * @type {UTCOffsetChangeEvent}
     * @memberof Event
     */
    utcOffsetChange?: UTCOffsetChangeEvent;
    /**
     * 
     * @type {ScheduleEvent}
     * @memberof Event
     */
    schedule?: ScheduleEvent;
    /**
     * 
     * @type {CombinedTransportEvent}
     * @memberof Event
     */
    combinedTransport?: CombinedTransportEvent;
    /**
     * 
     * @type {TrafficEvent}
     * @memberof Event
     */
    traffic?: TrafficEvent;
}

export function EventFromJSON(json: any): Event {
    return EventFromJSONTyped(json, false);
}

export function EventFromJSONTyped(json: any, ignoreDiscriminator: boolean): Event {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'startsAt': !exists(json, 'startsAt') ? undefined : (new Date(json['startsAt'])),
        'distanceFromStart': json['distanceFromStart'],
        'travelTimeFromStart': json['travelTimeFromStart'],
        'countryCode': json['countryCode'],
        'utcOffset': json['utcOffset'],
        'toll': !exists(json, 'toll') ? undefined : TollEventFromJSON(json['toll']),
        'maneuver': !exists(json, 'maneuver') ? undefined : ManeuverEventFromJSON(json['maneuver']),
        'border': !exists(json, 'border') ? undefined : BorderEventFromJSON(json['border']),
        'violation': !exists(json, 'violation') ? undefined : ViolationEventFromJSON(json['violation']),
        'waypoint': !exists(json, 'waypoint') ? undefined : WaypointEventFromJSON(json['waypoint']),
        'utcOffsetChange': !exists(json, 'utcOffsetChange') ? undefined : UTCOffsetChangeEventFromJSON(json['utcOffsetChange']),
        'schedule': !exists(json, 'schedule') ? undefined : ScheduleEventFromJSON(json['schedule']),
        'combinedTransport': !exists(json, 'combinedTransport') ? undefined : CombinedTransportEventFromJSON(json['combinedTransport']),
        'traffic': !exists(json, 'traffic') ? undefined : TrafficEventFromJSON(json['traffic']),
    };
}

export function EventToJSON(value?: Event | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
        'startsAt': value.startsAt === undefined ? undefined : (value.startsAt.toISOString()),
        'distanceFromStart': value.distanceFromStart,
        'travelTimeFromStart': value.travelTimeFromStart,
        'countryCode': value.countryCode,
        'utcOffset': value.utcOffset,
        'toll': TollEventToJSON(value.toll),
        'maneuver': ManeuverEventToJSON(value.maneuver),
        'border': BorderEventToJSON(value.border),
        'violation': ViolationEventToJSON(value.violation),
        'waypoint': WaypointEventToJSON(value.waypoint),
        'utcOffsetChange': UTCOffsetChangeEventToJSON(value.utcOffsetChange),
        'schedule': ScheduleEventToJSON(value.schedule),
        'combinedTransport': CombinedTransportEventToJSON(value.combinedTransport),
        'traffic': TrafficEventToJSON(value.traffic),
    };
}

