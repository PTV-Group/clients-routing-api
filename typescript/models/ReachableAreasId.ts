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
/**
 * 
 * @export
 * @interface ReachableAreasId
 */
export interface ReachableAreasId {
    /**
     * The ID of the calculated reachable areas.
     * @type {string}
     * @memberof ReachableAreasId
     */
    id: string;
}

/**
 * Check if a given object implements the ReachableAreasId interface.
 */
export function instanceOfReachableAreasId(value: object): value is ReachableAreasId {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function ReachableAreasIdFromJSON(json: any): ReachableAreasId {
    return ReachableAreasIdFromJSONTyped(json, false);
}

export function ReachableAreasIdFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableAreasId {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function ReachableAreasIdToJSON(value?: ReachableAreasId | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

