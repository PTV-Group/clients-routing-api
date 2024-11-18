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


/**
 * 
 * @export
 */
export const AvoidFeature = {
    TOLL: 'TOLL',
    FERRIES: 'FERRIES',
    RAIL_SHUTTLES: 'RAIL_SHUTTLES',
    HIGHWAYS: 'HIGHWAYS'
} as const;
export type AvoidFeature = typeof AvoidFeature[keyof typeof AvoidFeature];


export function instanceOfAvoidFeature(value: any): boolean {
    for (const key in AvoidFeature) {
        if (Object.prototype.hasOwnProperty.call(AvoidFeature, key)) {
            if (AvoidFeature[key as keyof typeof AvoidFeature] === value) {
                return true;
            }
        }
    }
    return false;
}

export function AvoidFeatureFromJSON(json: any): AvoidFeature {
    return AvoidFeatureFromJSONTyped(json, false);
}

export function AvoidFeatureFromJSONTyped(json: any, ignoreDiscriminator: boolean): AvoidFeature {
    return json as AvoidFeature;
}

export function AvoidFeatureToJSON(value?: AvoidFeature | null): any {
    return value as any;
}

