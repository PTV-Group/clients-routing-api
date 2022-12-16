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
 * 
 * @export
 */
export const Results = {
    ROUTE_ID: 'ROUTE_ID',
    LEGS: 'LEGS',
    LEGS_POLYLINE: 'LEGS_POLYLINE',
    TOLL_COSTS: 'TOLL_COSTS',
    TOLL_SECTIONS: 'TOLL_SECTIONS',
    TOLL_SYSTEMS: 'TOLL_SYSTEMS',
    TOLL_EVENTS: 'TOLL_EVENTS',
    POLYLINE: 'POLYLINE',
    MANEUVER_EVENTS: 'MANEUVER_EVENTS',
    BORDER_EVENTS: 'BORDER_EVENTS',
    VIOLATION_EVENTS: 'VIOLATION_EVENTS',
    VIOLATION_EVENTS_POLYLINE: 'VIOLATION_EVENTS_POLYLINE',
    WAYPOINT_EVENTS: 'WAYPOINT_EVENTS',
    UTC_OFFSET_CHANGE_EVENTS: 'UTC_OFFSET_CHANGE_EVENTS',
    COMBINED_TRANSPORT_EVENTS: 'COMBINED_TRANSPORT_EVENTS',
    TRAFFIC_EVENTS: 'TRAFFIC_EVENTS',
    SCHEDULE_EVENTS: 'SCHEDULE_EVENTS',
    EMISSIONS_EN16258_2012: 'EMISSIONS_EN16258_2012',
    EMISSIONS_EN16258_2012_HBEFA: 'EMISSIONS_EN16258_2012_HBEFA',
    EMISSIONS_ISO14083_2022: 'EMISSIONS_ISO14083_2022',
    EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION: 'EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION',
    EMISSIONS_FRENCH_CO2E_DECREE_2017_639: 'EMISSIONS_FRENCH_CO2E_DECREE_2017_639',
    ALTERNATIVE_ROUTES: 'ALTERNATIVE_ROUTES',
    SCHEDULE_REPORT: 'SCHEDULE_REPORT',
    GUIDED_NAVIGATION: 'GUIDED_NAVIGATION',
    MONETARY_COSTS: 'MONETARY_COSTS'
} as const;
export type Results = typeof Results[keyof typeof Results];


export function ResultsFromJSON(json: any): Results {
    return ResultsFromJSONTyped(json, false);
}

export function ResultsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Results {
    return json as Results;
}

export function ResultsToJSON(value?: Results | null): any {
    return value as any;
}

