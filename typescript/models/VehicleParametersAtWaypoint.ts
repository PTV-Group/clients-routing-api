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
import {
    HazardousMaterials,
    HazardousMaterialsFromJSON,
    HazardousMaterialsFromJSONTyped,
    HazardousMaterialsToJSON,
} from './HazardousMaterials';
import {
    TruckRoutes,
    TruckRoutesFromJSON,
    TruckRoutesFromJSONTyped,
    TruckRoutesToJSON,
} from './TruckRoutes';
import {
    TunnelRestrictionCode,
    TunnelRestrictionCodeFromJSON,
    TunnelRestrictionCodeFromJSONTyped,
    TunnelRestrictionCodeToJSON,
} from './TunnelRestrictionCode';

/**
 * The vehicle parameters that change at a waypoint. A vehicle parameter specified at a waypoint overrides the
 * setting from the **profile** and **vehicle**. It is valid until the end of the route unless it is changed again
 * at a subsequent waypoint.
 * @export
 * @interface VehicleParametersAtWaypoint
 */
export interface VehicleParametersAtWaypoint {
    /**
     * The average fuel consumption of the vehicle.
     * Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.
     * 
     * Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for `emissions`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    averageFuelConsumption?: number | null;
    /**
     * The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].
     * 
     * Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for `emissions`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    averageElectricityConsumption?: number | null;
    /**
     * The weight of the vehicle's load [kg].
     * 
     * Relevant for `routing`, `emissions`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    loadWeight?: number | null;
    /**
     * The maximum distributed weight that may be supported by an axle of the vehicle [kg].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    axleWeight?: number | null;
    /**
     * The height of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    height?: number | null;
    /**
     * The length of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    length?: number | null;
    /**
     * The width of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    width?: number | null;
    /**
     * Comma-separated list of hazardous materials the vehicle has loaded.
     * Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint
     * on. An empty list means that the hazardous materials don't change at the waypoint. If _NONE_ is specified
     * along with other hazardous materials it is ignored.
     * 
     * Relevant for `routing`.
     * @type {Array<HazardousMaterials>}
     * @memberof VehicleParametersAtWaypoint
     */
    hazardousMaterials?: Array<HazardousMaterials> | null;
    /**
     * 
     * @type {TunnelRestrictionCode}
     * @memberof VehicleParametersAtWaypoint
     */
    tunnelRestrictionCode?: TunnelRestrictionCode | null;
    /**
     * Comma-separated list of truck routes the vehicle has to follow.
     * This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.
     *  * `DE_LKWUEBERLSTVAUSNV`
     *  Preferred routes for long trucks in Germany, also known as Lang-LKW.
     *  * `NL_LZV`
     *  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).
     *  * `SE_BK_1`
     *  Public roads and bridges that support up to 64 t total permitted weight (Swedish Transport Administration).
     *  * `SE_BK_2`
     *  Public roads and bridges that support up to 51.4 t total permitted weight.
     *  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).
     *  * `SE_BK_3`
     *  Public roads and bridges that support up to 37.5 t total permitted weight.
     *  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).
     *  * `SE_BK_4`
     *  Public roads and bridges that support up to 74 t total permitted weight (draft summer 2018, Swedish Transport Administration).
     *  * `US_STAA`
     *  Routes that belong to the highway network as defined by the Surface Transportation Assistance Act in the US.
     *  * `US_TD`
     *  Part of a state-designated highway network for trucks in the US.
     *  * `AU_B_DOUBLE`
     *  B-Double routes as defined in Australia.
     *  * `AU_B_TRIPLE`
     *  B-Triple routes as defined in Australia.
     *  * `NONE`
     *  This value does not refer to a truck route. Use a list with only the _NONE_ value for the truck routes
     *  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes
     *  at a waypoint means that the truck routes don't change at the waypoint. If _NONE_ is specified along with other
     *  truck routes it is ignored.
     * 
     * Relevant for `routing`.
     * Cannot be used with **options[routingMode]=MONETARY**.
     * @type {Array<TruckRoutes>}
     * @memberof VehicleParametersAtWaypoint
     */
    truckRoutes?: Array<TruckRoutes> | null;
}

export function VehicleParametersAtWaypointFromJSON(json: any): VehicleParametersAtWaypoint {
    return VehicleParametersAtWaypointFromJSONTyped(json, false);
}

export function VehicleParametersAtWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): VehicleParametersAtWaypoint {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'averageFuelConsumption': !exists(json, 'averageFuelConsumption') ? undefined : json['averageFuelConsumption'],
        'averageElectricityConsumption': !exists(json, 'averageElectricityConsumption') ? undefined : json['averageElectricityConsumption'],
        'loadWeight': !exists(json, 'loadWeight') ? undefined : json['loadWeight'],
        'axleWeight': !exists(json, 'axleWeight') ? undefined : json['axleWeight'],
        'height': !exists(json, 'height') ? undefined : json['height'],
        'length': !exists(json, 'length') ? undefined : json['length'],
        'width': !exists(json, 'width') ? undefined : json['width'],
        'hazardousMaterials': !exists(json, 'hazardousMaterials') ? undefined : (json['hazardousMaterials'] === null ? null : (json['hazardousMaterials'] as Array<any>).map(HazardousMaterialsFromJSON)),
        'tunnelRestrictionCode': !exists(json, 'tunnelRestrictionCode') ? undefined : TunnelRestrictionCodeFromJSON(json['tunnelRestrictionCode']),
        'truckRoutes': !exists(json, 'truckRoutes') ? undefined : (json['truckRoutes'] === null ? null : (json['truckRoutes'] as Array<any>).map(TruckRoutesFromJSON)),
    };
}

export function VehicleParametersAtWaypointToJSON(value?: VehicleParametersAtWaypoint | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'averageFuelConsumption': value.averageFuelConsumption,
        'averageElectricityConsumption': value.averageElectricityConsumption,
        'loadWeight': value.loadWeight,
        'axleWeight': value.axleWeight,
        'height': value.height,
        'length': value.length,
        'width': value.width,
        'hazardousMaterials': value.hazardousMaterials === undefined ? undefined : (value.hazardousMaterials === null ? null : (value.hazardousMaterials as Array<any>).map(HazardousMaterialsToJSON)),
        'tunnelRestrictionCode': TunnelRestrictionCodeToJSON(value.tunnelRestrictionCode),
        'truckRoutes': value.truckRoutes === undefined ? undefined : (value.truckRoutes === null ? null : (value.truckRoutes as Array<any>).map(TruckRoutesToJSON)),
    };
}

