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
 * Specifies the driving direction, i.e. from start to destination or from destination to start..
 *  * `OUTBOUND` - Indicates an outbound routing from start to destination, i.e. the area which can be reached from the location within the given horizon. Use this value to calculate which can be covered e.g. by an emergency service such as a fire department.
 *  * `INBOUND` - Indicates an inbound routing from destination to start, i.e. from where the location can be reached within the given horizon. Use this value to calculate the catchment area, e.g. of a school or a hospital.
 * @export
 */
export const DrivingDirection = {
    OUTBOUND: 'OUTBOUND',
    INBOUND: 'INBOUND'
} as const;
export type DrivingDirection = typeof DrivingDirection[keyof typeof DrivingDirection];


export function instanceOfDrivingDirection(value: any): boolean {
    for (const key in DrivingDirection) {
        if (Object.prototype.hasOwnProperty.call(DrivingDirection, key)) {
            if ((DrivingDirection as Record<string, DrivingDirection>)[key] === value) {
                return true;
            }
        }
    }
    return false;
}

export function DrivingDirectionFromJSON(json: any): DrivingDirection {
    return DrivingDirectionFromJSONTyped(json, false);
}

export function DrivingDirectionFromJSONTyped(json: any, ignoreDiscriminator: boolean): DrivingDirection {
    return json as DrivingDirection;
}

export function DrivingDirectionToJSON(value?: DrivingDirection | null): any {
    return value as any;
}

