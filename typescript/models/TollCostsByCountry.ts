/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers\' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { TollPrice } from './TollPrice';
import {
    TollPriceFromJSON,
    TollPriceFromJSONTyped,
    TollPriceToJSON,
} from './TollPrice';

/**
 * 
 * @export
 * @interface TollCostsByCountry
 */
export interface TollCostsByCountry {
    /**
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof TollCostsByCountry
     */
    countryCode: string;
    /**
     * 
     * @type {TollPrice}
     * @memberof TollCostsByCountry
     */
    price: TollPrice;
    /**
     * 
     * @type {TollPrice}
     * @memberof TollCostsByCountry
     */
    convertedPrice?: TollPrice;
}

/**
 * Check if a given object implements the TollCostsByCountry interface.
 */
export function instanceOfTollCostsByCountry(value: object): value is TollCostsByCountry {
    if (!('countryCode' in value) || value['countryCode'] === undefined) return false;
    if (!('price' in value) || value['price'] === undefined) return false;
    return true;
}

export function TollCostsByCountryFromJSON(json: any): TollCostsByCountry {
    return TollCostsByCountryFromJSONTyped(json, false);
}

export function TollCostsByCountryFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollCostsByCountry {
    if (json == null) {
        return json;
    }
    return {
        
        'countryCode': json['countryCode'],
        'price': TollPriceFromJSON(json['price']),
        'convertedPrice': json['convertedPrice'] == null ? undefined : TollPriceFromJSON(json['convertedPrice']),
    };
}

export function TollCostsByCountryToJSON(value?: TollCostsByCountry | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'countryCode': value['countryCode'],
        'price': TollPriceToJSON(value['price']),
        'convertedPrice': TollPriceToJSON(value['convertedPrice']),
    };
}

