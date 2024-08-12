/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.29
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { AccessType } from './AccessType';
import {
    AccessTypeFromJSON,
    AccessTypeFromJSONTyped,
    AccessTypeToJSON,
} from './AccessType';

/**
 * Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.
 * @export
 * @interface TollEvent
 */
export interface TollEvent {
    /**
     * The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events.
     * @type {number}
     * @memberof TollEvent
     */
    sectionIndex?: number;
    /**
     * The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ.
     * @type {string}
     * @memberof TollEvent
     */
    displayName?: string;
    /**
     * 
     * @type {AccessType}
     * @memberof TollEvent
     */
    accessType: AccessType;
    /**
     * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
     * @type {number}
     * @memberof TollEvent
     */
    relatedEventIndex?: number;
}

/**
 * Check if a given object implements the TollEvent interface.
 */
export function instanceOfTollEvent(value: object): value is TollEvent {
    if (!('accessType' in value) || value['accessType'] === undefined) return false;
    return true;
}

export function TollEventFromJSON(json: any): TollEvent {
    return TollEventFromJSONTyped(json, false);
}

export function TollEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'sectionIndex': json['sectionIndex'] == null ? undefined : json['sectionIndex'],
        'displayName': json['displayName'] == null ? undefined : json['displayName'],
        'accessType': AccessTypeFromJSON(json['accessType']),
        'relatedEventIndex': json['relatedEventIndex'] == null ? undefined : json['relatedEventIndex'],
    };
}

export function TollEventToJSON(value?: TollEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'sectionIndex': value['sectionIndex'],
        'displayName': value['displayName'],
        'accessType': AccessTypeToJSON(value['accessType']),
        'relatedEventIndex': value['relatedEventIndex'],
    };
}

