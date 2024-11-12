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


/**
 * Indicates if a route section is entered or exited. Not present for violation events of type _SCHEDULE_.
 *  * `ENTER` - Entering a section.  
 *  * `EXIT` - Exiting a section.  
 *  * `PASS` - Passing an intersection, a gate or a specific location. Can only occur with violation events of type _RESTRICTED_ACCESS_ and _PROHIBITED_BY_INTERSECTING_POLYLINE_.
 * @export
 */
export const AccessType = {
    ENTER: 'ENTER',
    EXIT: 'EXIT',
    PASS: 'PASS'
} as const;
export type AccessType = typeof AccessType[keyof typeof AccessType];


export function instanceOfAccessType(value: any): boolean {
    for (const key in AccessType) {
        if (Object.prototype.hasOwnProperty.call(AccessType, key)) {
            if (AccessType[key as keyof typeof AccessType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function AccessTypeFromJSON(json: any): AccessType {
    return AccessTypeFromJSONTyped(json, false);
}

export function AccessTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): AccessType {
    return json as AccessType;
}

export function AccessTypeToJSON(value?: AccessType | null): any {
    return value as any;
}

