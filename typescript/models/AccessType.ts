/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Indicates if a route section is entered or exited. Not present if the violation type is _SCHEDULE_.
 *  * `ENTER` - Entering a section.  
 *  * `EXIT` - Exiting a section.  
 *  * `PASS` - When the section is very small, it is passed.
 * @export
 */
export const AccessType = {
    ENTER: 'ENTER',
    EXIT: 'EXIT',
    PASS: 'PASS'
} as const;
export type AccessType = typeof AccessType[keyof typeof AccessType];


export function AccessTypeFromJSON(json: any): AccessType {
    return AccessTypeFromJSONTyped(json, false);
}

export function AccessTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): AccessType {
    return json as AccessType;
}

export function AccessTypeToJSON(value?: AccessType | null): any {
    return value as any;
}

