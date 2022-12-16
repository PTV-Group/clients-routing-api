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
    AccessType,
    AccessTypeFromJSON,
    AccessTypeFromJSONTyped,
    AccessTypeToJSON,
} from './AccessType';
import {
    CombinedTransportType,
    CombinedTransportTypeFromJSON,
    CombinedTransportTypeFromJSONTyped,
    CombinedTransportTypeToJSON,
} from './CombinedTransportType';

/**
 * Issued when a combined transport is entered or exited. Requires _COMBINED_TRANSPORT_EVENTS_ to be requested.
 * @export
 * @interface CombinedTransportEvent
 */
export interface CombinedTransportEvent {
    /**
     * The name of the combined transport.
     * @type {string}
     * @memberof CombinedTransportEvent
     */
    name: string;
    /**
     * 
     * @type {CombinedTransportType}
     * @memberof CombinedTransportEvent
     */
    type: CombinedTransportType;
    /**
     * 
     * @type {AccessType}
     * @memberof CombinedTransportEvent
     */
    accessType: AccessType;
    /**
     * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
     * @type {number}
     * @memberof CombinedTransportEvent
     */
    relatedEventIndex?: number;
}

export function CombinedTransportEventFromJSON(json: any): CombinedTransportEvent {
    return CombinedTransportEventFromJSONTyped(json, false);
}

export function CombinedTransportEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): CombinedTransportEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': json['name'],
        'type': CombinedTransportTypeFromJSON(json['type']),
        'accessType': AccessTypeFromJSON(json['accessType']),
        'relatedEventIndex': !exists(json, 'relatedEventIndex') ? undefined : json['relatedEventIndex'],
    };
}

export function CombinedTransportEventToJSON(value?: CombinedTransportEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'type': CombinedTransportTypeToJSON(value.type),
        'accessType': AccessTypeToJSON(value.accessType),
        'relatedEventIndex': value.relatedEventIndex,
    };
}

