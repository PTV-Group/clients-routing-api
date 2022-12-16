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
 * 
 * @export
 * @interface ExchangeRate
 */
export interface ExchangeRate {
    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted.
     * @type {string}
     * @memberof ExchangeRate
     */
    currency: string;
    /**
     * The exchange rate to convert a price from the base currency to this currency.
     * @type {number}
     * @memberof ExchangeRate
     */
    rate: number;
}

export function ExchangeRateFromJSON(json: any): ExchangeRate {
    return ExchangeRateFromJSONTyped(json, false);
}

export function ExchangeRateFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExchangeRate {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'currency': json['currency'],
        'rate': json['rate'],
    };
}

export function ExchangeRateToJSON(value?: ExchangeRate | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'currency': value.currency,
        'rate': value.rate,
    };
}

