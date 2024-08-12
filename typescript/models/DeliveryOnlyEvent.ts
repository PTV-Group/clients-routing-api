/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.30
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
 * Issued when the route passes roads which are prohibited except for delivery vehicles such as factory premises or pedestrian zones.  Cars and vans are no delivery vehicles and will not produce such events, instead there can be violation events of type _DELIVERY_ONLY_. Requires _DELIVERY_ONLY_EVENTS_ to be requested.
 * @export
 * @interface DeliveryOnlyEvent
 */
export interface DeliveryOnlyEvent {
    /**
     * 
     * @type {AccessType}
     * @memberof DeliveryOnlyEvent
     */
    accessType: AccessType;
    /**
     * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
     * @type {number}
     * @memberof DeliveryOnlyEvent
     */
    relatedEventIndex?: number;
    /**
     * The polyline of the delivery-only event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _DELIVERY_ONLY_EVENTS_POLYLINE_ to be requested.
     * @type {string}
     * @memberof DeliveryOnlyEvent
     */
    polyline?: string;
}

/**
 * Check if a given object implements the DeliveryOnlyEvent interface.
 */
export function instanceOfDeliveryOnlyEvent(value: object): value is DeliveryOnlyEvent {
    if (!('accessType' in value) || value['accessType'] === undefined) return false;
    return true;
}

export function DeliveryOnlyEventFromJSON(json: any): DeliveryOnlyEvent {
    return DeliveryOnlyEventFromJSONTyped(json, false);
}

export function DeliveryOnlyEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeliveryOnlyEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'accessType': AccessTypeFromJSON(json['accessType']),
        'relatedEventIndex': json['relatedEventIndex'] == null ? undefined : json['relatedEventIndex'],
        'polyline': json['polyline'] == null ? undefined : json['polyline'],
    };
}

export function DeliveryOnlyEventToJSON(value?: DeliveryOnlyEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'accessType': AccessTypeToJSON(value['accessType']),
        'relatedEventIndex': value['relatedEventIndex'],
        'polyline': value['polyline'],
    };
}

