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
import type { Location } from './Location';
import {
    LocationFromJSON,
    LocationFromJSONTyped,
    LocationToJSON,
} from './Location';

/**
 * 
 * @export
 * @interface Locations
 */
export interface Locations {
    /**
     * 
     * @type {Array<Location>}
     * @memberof Locations
     */
    locations: Array<Location>;
}

/**
 * Check if a given object implements the Locations interface.
 */
export function instanceOfLocations(value: object): value is Locations {
    if (!('locations' in value) || value['locations'] === undefined) return false;
    return true;
}

export function LocationsFromJSON(json: any): Locations {
    return LocationsFromJSONTyped(json, false);
}

export function LocationsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Locations {
    if (json == null) {
        return json;
    }
    return {
        
        'locations': ((json['locations'] as Array<any>).map(LocationFromJSON)),
    };
}

export function LocationsToJSON(value?: Locations | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'locations': ((value['locations'] as Array<any>).map(LocationToJSON)),
    };
}

