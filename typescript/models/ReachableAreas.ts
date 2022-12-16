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
    Warning,
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * The result of the reachable areas calculation.
 * @export
 * @interface ReachableAreas
 */
export interface ReachableAreas {
    /**
     * The list of polygons calculated for the specified horizons in GeoJson format. For each horizon there is a separate polygon at the same index.
     * @type {Array<string>}
     * @memberof ReachableAreas
     */
    polygons: Array<string>;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof ReachableAreas
     */
    warnings?: Array<Warning>;
}

export function ReachableAreasFromJSON(json: any): ReachableAreas {
    return ReachableAreasFromJSONTyped(json, false);
}

export function ReachableAreasFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableAreas {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'polygons': json['polygons'],
        'warnings': !exists(json, 'warnings') ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function ReachableAreasToJSON(value?: ReachableAreas | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'polygons': value.polygons,
        'warnings': value.warnings === undefined ? undefined : ((value.warnings as Array<any>).map(WarningToJSON)),
    };
}

