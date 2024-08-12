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


/**
 * 
 * @export
 */
export const ScheduleType = {
    BREAK: 'BREAK',
    DAILY_REST: 'DAILY_REST',
    WAITING: 'WAITING',
    SERVICE: 'SERVICE'
} as const;
export type ScheduleType = typeof ScheduleType[keyof typeof ScheduleType];


export function instanceOfScheduleType(value: any): boolean {
    for (const key in ScheduleType) {
        if (Object.prototype.hasOwnProperty.call(ScheduleType, key)) {
            if ((ScheduleType as Record<string, ScheduleType>)[key] === value) {
                return true;
            }
        }
    }
    return false;
}

export function ScheduleTypeFromJSON(json: any): ScheduleType {
    return ScheduleTypeFromJSONTyped(json, false);
}

export function ScheduleTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ScheduleType {
    return json as ScheduleType;
}

export function ScheduleTypeToJSON(value?: ScheduleType | null): any {
    return value as any;
}

