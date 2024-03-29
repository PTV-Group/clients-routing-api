/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * The price of the section in the converted currency.
 * @export
 * @interface TollSectionCostConvertedPrice
 */
export interface TollSectionCostConvertedPrice {
    /**
     * The toll price in the specified currency.
     * @type {number}
     * @memberof TollSectionCostConvertedPrice
     */
    price: number;
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof TollSectionCostConvertedPrice
     */
    currency: string;
}

/**
 * Check if a given object implements the TollSectionCostConvertedPrice interface.
 */
export function instanceOfTollSectionCostConvertedPrice(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "price" in value;
    isInstance = isInstance && "currency" in value;

    return isInstance;
}

export function TollSectionCostConvertedPriceFromJSON(json: any): TollSectionCostConvertedPrice {
    return TollSectionCostConvertedPriceFromJSONTyped(json, false);
}

export function TollSectionCostConvertedPriceFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollSectionCostConvertedPrice {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'price': json['price'],
        'currency': json['currency'],
    };
}

export function TollSectionCostConvertedPriceToJSON(value?: TollSectionCostConvertedPrice | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'price': value.price,
        'currency': value.currency,
    };
}

