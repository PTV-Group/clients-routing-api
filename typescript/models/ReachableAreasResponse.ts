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
    CalculationStatus,
    CalculationStatusFromJSON,
    CalculationStatusFromJSONTyped,
    CalculationStatusToJSON,
} from './CalculationStatus';
import {
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseFromJSONTyped,
    ErrorResponseToJSON,
} from './ErrorResponse';
import {
    ReachableAreas,
    ReachableAreasFromJSON,
    ReachableAreasFromJSONTyped,
    ReachableAreasToJSON,
} from './ReachableAreas';

/**
 * 
 * @export
 * @interface ReachableAreasResponse
 */
export interface ReachableAreasResponse {
    /**
     * 
     * @type {CalculationStatus}
     * @memberof ReachableAreasResponse
     */
    status?: CalculationStatus;
    /**
     * 
     * @type {ReachableAreas}
     * @memberof ReachableAreasResponse
     */
    reachableAreas?: ReachableAreas;
    /**
     * 
     * @type {ErrorResponse}
     * @memberof ReachableAreasResponse
     */
    error?: ErrorResponse;
}

export function ReachableAreasResponseFromJSON(json: any): ReachableAreasResponse {
    return ReachableAreasResponseFromJSONTyped(json, false);
}

export function ReachableAreasResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableAreasResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': !exists(json, 'status') ? undefined : CalculationStatusFromJSON(json['status']),
        'reachableAreas': !exists(json, 'reachableAreas') ? undefined : ReachableAreasFromJSON(json['reachableAreas']),
        'error': !exists(json, 'error') ? undefined : ErrorResponseFromJSON(json['error']),
    };
}

export function ReachableAreasResponseToJSON(value?: ReachableAreasResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': CalculationStatusToJSON(value.status),
        'reachableAreas': ReachableAreasToJSON(value.reachableAreas),
        'error': ErrorResponseToJSON(value.error),
    };
}
