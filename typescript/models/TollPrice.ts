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
 * The toll price payable in this country.
 * @export
 * @interface TollPrice
 */
export interface TollPrice {
    /**
     * The toll price in the specified currency.
     * @type {number}
     * @memberof TollPrice
     */
    price: number;
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof TollPrice
     */
    currency: string;
}

/**
 * Check if a given object implements the TollPrice interface.
 */
export function instanceOfTollPrice(value: object): value is TollPrice {
    if (!('price' in value) || value['price'] === undefined) return false;
    if (!('currency' in value) || value['currency'] === undefined) return false;
    return true;
}

export function TollPriceFromJSON(json: any): TollPrice {
    return TollPriceFromJSONTyped(json, false);
}

export function TollPriceFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollPrice {
    if (json == null) {
        return json;
    }
    return {
        
        'price': json['price'],
        'currency': json['currency'],
    };
}

export function TollPriceToJSON(value?: TollPrice | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'price': value['price'],
        'currency': value['currency'],
    };
}

