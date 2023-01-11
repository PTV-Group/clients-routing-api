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


/**
 * Defines the format for polylines in the response.  
 *  * `GEO_JSON` - Polylines are returned in the [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON).  
 *  * `GOOGLE_ENCODED_POLYLINE` - Polylines are returned in [Google's Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.  
 * @export
 */
export const PolylineFormat = {
    GEO_JSON: 'GEO_JSON',
    GOOGLE_ENCODED_POLYLINE: 'GOOGLE_ENCODED_POLYLINE'
} as const;
export type PolylineFormat = typeof PolylineFormat[keyof typeof PolylineFormat];


export function PolylineFormatFromJSON(json: any): PolylineFormat {
    return PolylineFormatFromJSONTyped(json, false);
}

export function PolylineFormatFromJSONTyped(json: any, ignoreDiscriminator: boolean): PolylineFormat {
    return json as PolylineFormat;
}

export function PolylineFormatToJSON(value?: PolylineFormat | null): any {
    return value as any;
}
