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

import { mapValues } from '../runtime';
import type { HazardousMaterials } from './HazardousMaterials';
import {
    HazardousMaterialsFromJSON,
    HazardousMaterialsFromJSONTyped,
    HazardousMaterialsToJSON,
} from './HazardousMaterials';
import type { TunnelRestrictionCode } from './TunnelRestrictionCode';
import {
    TunnelRestrictionCodeFromJSON,
    TunnelRestrictionCodeFromJSONTyped,
    TunnelRestrictionCodeToJSON,
} from './TunnelRestrictionCode';
import type { TruckRoutes } from './TruckRoutes';
import {
    TruckRoutesFromJSON,
    TruckRoutesFromJSONTyped,
    TruckRoutesToJSON,
} from './TruckRoutes';

/**
 * The vehicle parameters that change at a waypoint. A vehicle parameter specified at a waypoint overrides the
 * setting from the **profile** and **vehicle**. It is valid until the end of the route unless it is changed again
 * at a subsequent waypoint.
 * 
 * @export
 * @interface VehicleParametersAtWaypoint
 */
export interface VehicleParametersAtWaypoint {
    /**
     * The average fuel consumption of the vehicle.
     * Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.
     * 
     * Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for `emissions`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    averageFuelConsumption?: number;
    /**
     * The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].
     * 
     * This field is not used, if a model of an electric vehicle is used. In this case the average electricity 
     * consumption from the model based consumption calculation is used for the emissions calculation.
     * 
     * Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for `emissions`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    averageElectricityConsumption?: number;
    /**
     * The weight of the vehicle's load [kg].
     * 
     * Relevant for `routing`, `emissions`, `range calculation`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    loadWeight?: number;
    /**
     * The maximum distributed weight that may be supported by an axle of the vehicle [kg].
     * 
     * Relevant for `routing`, `toll`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    axleWeight?: number;
    /**
     * The height of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    height?: number;
    /**
     * The length of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    length?: number;
    /**
     * The width of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * 
     * @type {number}
     * @memberof VehicleParametersAtWaypoint
     */
    width?: number;
    /**
     * The list of hazardous materials the vehicle has loaded.
     * Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint
     * on. An empty list means that the hazardous materials don't change at the waypoint. If _NONE_ is specified
     * along with other hazardous materials it is ignored.
     * 
     * Relevant for `routing`.
     * 
     * @type {Array<HazardousMaterials>}
     * @memberof VehicleParametersAtWaypoint
     */
    hazardousMaterials?: Array<HazardousMaterials>;
    /**
     * 
     * @type {TunnelRestrictionCode}
     * @memberof VehicleParametersAtWaypoint
     */
    tunnelRestrictionCode?: TunnelRestrictionCode | null;
    /**
     * The list of truck routes the vehicle has to follow.
     * This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.
     *  * `DE_LKWUEBERLSTVAUSNV`
     *  Preferred routes for long trucks in Germany, also known as Lang-LKW.
     *  * `NL_LZV`
     *  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).
     *  * `NZ_HPMV`
     *  The network for High Productivity Motor Vehicles (HPMV) carrying the maximum loads available under a permit (New Zealand Transport Agency).
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
     *  * `AU_B_DOUBLE_HML`
     *  Routes for B-Double vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).
     *  * `AU_B_TRIPLE`
     *  B-Triple routes as defined in Australia.
     *  * `AU_B_TRIPLE_HML`
     *  Routes for B-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).
     *  * `AU_AB_TRIPLE`
     *  Routes for AB-Triple vehicle combinations operating (Australian Transport Administration).
     *  * `AU_AB_TRIPLE_HML`
     *  Routes for AB-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).
     *  * `NONE`
     *  Use a list with only the _NONE_ value for the truck routes
     *  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes
     *  at a waypoint means that the truck routes don't change at the waypoint. If _NONE_ is specified along with other
     *  truck routes it is ignored.
     * 
     * Relevant for `routing`.
     * Cannot be used with **options[routingMode]=MONETARY**.
     * 
     * @type {Array<TruckRoutes>}
     * @memberof VehicleParametersAtWaypoint
     */
    truckRoutes?: Array<TruckRoutes>;
}

/**
 * Check if a given object implements the VehicleParametersAtWaypoint interface.
 */
export function instanceOfVehicleParametersAtWaypoint(value: object): value is VehicleParametersAtWaypoint {
    return true;
}

export function VehicleParametersAtWaypointFromJSON(json: any): VehicleParametersAtWaypoint {
    return VehicleParametersAtWaypointFromJSONTyped(json, false);
}

export function VehicleParametersAtWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): VehicleParametersAtWaypoint {
    if (json == null) {
        return json;
    }
    return {
        
        'averageFuelConsumption': json['averageFuelConsumption'] == null ? undefined : json['averageFuelConsumption'],
        'averageElectricityConsumption': json['averageElectricityConsumption'] == null ? undefined : json['averageElectricityConsumption'],
        'loadWeight': json['loadWeight'] == null ? undefined : json['loadWeight'],
        'axleWeight': json['axleWeight'] == null ? undefined : json['axleWeight'],
        'height': json['height'] == null ? undefined : json['height'],
        'length': json['length'] == null ? undefined : json['length'],
        'width': json['width'] == null ? undefined : json['width'],
        'hazardousMaterials': json['hazardousMaterials'] == null ? undefined : ((json['hazardousMaterials'] as Array<any>).map(HazardousMaterialsFromJSON)),
        'tunnelRestrictionCode': json['tunnelRestrictionCode'] == null ? undefined : TunnelRestrictionCodeFromJSON(json['tunnelRestrictionCode']),
        'truckRoutes': json['truckRoutes'] == null ? undefined : ((json['truckRoutes'] as Array<any>).map(TruckRoutesFromJSON)),
    };
}

export function VehicleParametersAtWaypointToJSON(value?: VehicleParametersAtWaypoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'averageFuelConsumption': value['averageFuelConsumption'],
        'averageElectricityConsumption': value['averageElectricityConsumption'],
        'loadWeight': value['loadWeight'],
        'axleWeight': value['axleWeight'],
        'height': value['height'],
        'length': value['length'],
        'width': value['width'],
        'hazardousMaterials': value['hazardousMaterials'] == null ? undefined : ((value['hazardousMaterials'] as Array<any>).map(HazardousMaterialsToJSON)),
        'tunnelRestrictionCode': TunnelRestrictionCodeToJSON(value['tunnelRestrictionCode']),
        'truckRoutes': value['truckRoutes'] == null ? undefined : ((value['truckRoutes'] as Array<any>).map(TruckRoutesToJSON)),
    };
}

