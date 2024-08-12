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
/**
 * Provides an overview of the costs of the route.  
 * Requires the result _MONETARY_COSTS_ to be requested.
 * @export
 * @interface MonetaryCosts
 */
export interface MonetaryCosts {
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof MonetaryCosts
     */
    currency: string;
    /**
     * The total monetary cost of the route.
     * @type {number}
     * @memberof MonetaryCosts
     */
    totalCost: number;
    /**
     * The distance cost based on the **monetaryCostOptions[costPerKilometer]** and the driving distance.
     * @type {number}
     * @memberof MonetaryCosts
     */
    distanceCost: number;
    /**
     * The working time cost based on **monetaryCostOptions[costPerWorkingHour]** and the driving time. Break, service and rest times are not considered.
     * @type {number}
     * @memberof MonetaryCosts
     */
    workingTimeCost: number;
    /**
     * The energy cost based on the vehicle's consumption and the corresponding cost parameters.
     * @type {number}
     * @memberof MonetaryCosts
     */
    energyCost: number;
    /**
     * The toll cost based on the route and the vehicle.  
     * Toll prices do not include VAT.
     * 
     * @type {number}
     * @memberof MonetaryCosts
     */
    tollCost: number;
}

/**
 * Check if a given object implements the MonetaryCosts interface.
 */
export function instanceOfMonetaryCosts(value: object): value is MonetaryCosts {
    if (!('currency' in value) || value['currency'] === undefined) return false;
    if (!('totalCost' in value) || value['totalCost'] === undefined) return false;
    if (!('distanceCost' in value) || value['distanceCost'] === undefined) return false;
    if (!('workingTimeCost' in value) || value['workingTimeCost'] === undefined) return false;
    if (!('energyCost' in value) || value['energyCost'] === undefined) return false;
    if (!('tollCost' in value) || value['tollCost'] === undefined) return false;
    return true;
}

export function MonetaryCostsFromJSON(json: any): MonetaryCosts {
    return MonetaryCostsFromJSONTyped(json, false);
}

export function MonetaryCostsFromJSONTyped(json: any, ignoreDiscriminator: boolean): MonetaryCosts {
    if (json == null) {
        return json;
    }
    return {
        
        'currency': json['currency'],
        'totalCost': json['totalCost'],
        'distanceCost': json['distanceCost'],
        'workingTimeCost': json['workingTimeCost'],
        'energyCost': json['energyCost'],
        'tollCost': json['tollCost'],
    };
}

export function MonetaryCostsToJSON(value?: MonetaryCosts | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'currency': value['currency'],
        'totalCost': value['totalCost'],
        'distanceCost': value['distanceCost'],
        'workingTimeCost': value['workingTimeCost'],
        'energyCost': value['energyCost'],
        'tollCost': value['tollCost'],
    };
}

