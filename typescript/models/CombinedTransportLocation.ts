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
/**
 * Represents the start or destination location of a combined transport, e.g. the port.
 * @export
 * @interface CombinedTransportLocation
 */
export interface CombinedTransportLocation {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof CombinedTransportLocation
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof CombinedTransportLocation
     */
    longitude: number;
}

export function CombinedTransportLocationFromJSON(json: any): CombinedTransportLocation {
    return CombinedTransportLocationFromJSONTyped(json, false);
}

export function CombinedTransportLocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): CombinedTransportLocation {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
    };
}

export function CombinedTransportLocationToJSON(value?: CombinedTransportLocation | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
    };
}

