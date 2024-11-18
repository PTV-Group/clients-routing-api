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
/**
 * A time interval specified by two points in time - the beginning and the end of the interval.
 * @export
 * @interface TimeInterval
 */
export interface TimeInterval {
    /**
     * The beginning of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.
     * @type {Date}
     * @memberof TimeInterval
     */
    start: Date;
    /**
     * The end of the time interval formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.
     * @type {Date}
     * @memberof TimeInterval
     */
    end: Date;
}

/**
 * Check if a given object implements the TimeInterval interface.
 */
export function instanceOfTimeInterval(value: object): value is TimeInterval {
    if (!('start' in value) || value['start'] === undefined) return false;
    if (!('end' in value) || value['end'] === undefined) return false;
    return true;
}

export function TimeIntervalFromJSON(json: any): TimeInterval {
    return TimeIntervalFromJSONTyped(json, false);
}

export function TimeIntervalFromJSONTyped(json: any, ignoreDiscriminator: boolean): TimeInterval {
    if (json == null) {
        return json;
    }
    return {
        
        'start': (new Date(json['start'])),
        'end': (new Date(json['end'])),
    };
}

export function TimeIntervalToJSON(value?: TimeInterval | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'start': ((value['start']).toISOString()),
        'end': ((value['end']).toISOString()),
    };
}

