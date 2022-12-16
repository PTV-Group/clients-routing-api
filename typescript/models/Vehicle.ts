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
    ElectricityType,
    ElectricityTypeFromJSON,
    ElectricityTypeFromJSONTyped,
    ElectricityTypeToJSON,
} from './ElectricityType';
import {
    EmissionStandard,
    EmissionStandardFromJSON,
    EmissionStandardFromJSONTyped,
    EmissionStandardToJSON,
} from './EmissionStandard';
import {
    EngineType,
    EngineTypeFromJSON,
    EngineTypeFromJSONTyped,
    EngineTypeToJSON,
} from './EngineType';
import {
    EtcSubscriptionTypes,
    EtcSubscriptionTypesFromJSON,
    EtcSubscriptionTypesFromJSONTyped,
    EtcSubscriptionTypesToJSON,
} from './EtcSubscriptionTypes';
import {
    FuelType,
    FuelTypeFromJSON,
    FuelTypeFromJSONTyped,
    FuelTypeToJSON,
} from './FuelType';
import {
    HazardousMaterials,
    HazardousMaterialsFromJSON,
    HazardousMaterialsFromJSONTyped,
    HazardousMaterialsToJSON,
} from './HazardousMaterials';
import {
    LowEmissionZoneTypes,
    LowEmissionZoneTypesFromJSON,
    LowEmissionZoneTypesFromJSONTyped,
    LowEmissionZoneTypesToJSON,
} from './LowEmissionZoneTypes';
import {
    ParticleReductionClass,
    ParticleReductionClassFromJSON,
    ParticleReductionClassFromJSONTyped,
    ParticleReductionClassToJSON,
} from './ParticleReductionClass';
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
 * 
 * @export
 * @interface Vehicle
 */
export interface Vehicle {
    /**
     * 
     * @type {EngineType}
     * @memberof Vehicle
     */
    engineType?: EngineType | null;
    /**
     * 
     * @type {FuelType}
     * @memberof Vehicle
     */
    fuelType?: FuelType | null;
    /**
     * 
     * @type {ElectricityType}
     * @memberof Vehicle
     */
    electricityType?: ElectricityType | null;
    /**
     * The average fuel consumption of the vehicle.
     * Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.
     * 
     * Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    averageFuelConsumption?: number | null;
    /**
     * The average power consumption of the vehicle [kWh/100km].
     * 
     * Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    averageElectricityConsumption?: number | null;
    /**
     * The ratio of biofuel to conventional fuel [%], i.e. 10 for E10 with 10% biofuel.
     * 
     * Supported for **engineType** _COMBUSTION_ or _HYBRID_ and only for the fuel types _GASOLINE_, _DIESEL_, _CNG_GASOLINE_ and _LNG_GASOLINE_.
     * Relevant for `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    bioFuelRatio?: number | null;
    /**
     * Electric energy usage ratio from the total amount of energy consumed by the vehicle.
     * 
     * Supported for **engineType** _HYBRID_. Relevant for `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    hybridRatio?: number | null;
    /**
     * Ratio of CNG or LPG usage from the total amount of fuel consumption.
     * 
     * Supported for **engineType** _COMBUSTION_ with **fuelType**  _CNG_GASOLINE_ or _LPG_GASOLINE_. Relevant for `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    dualFuelRatio?: number | null;
    /**
     * The cylinder capacity of the vehicle [cm&#x00B3;]. This value is present for compatibility reasons and does not influence
     * any of the results.
     * 
     * Supported for **engineType** _COMBUSTION_ or _HYBRID_.
     * @type {number}
     * @memberof Vehicle
     */
    cylinderCapacity?: number | null;
    /**
     * 
     * @type {EmissionStandard}
     * @memberof Vehicle
     */
    emissionStandard?: EmissionStandard | null;
    /**
     * Comma-separated list of the low-emission zone types of the vehicle.
     * For now, types are available only for Germany, so using more than one value is not meaningful.
     * 
     * Relevant for `routing`.
     * @type {Array<LowEmissionZoneTypes>}
     * @memberof Vehicle
     */
    lowEmissionZoneTypes?: Array<LowEmissionZoneTypes> | null;
    /**
     * 
     * @type {ParticleReductionClass}
     * @memberof Vehicle
     */
    particleReductionClass?: ParticleReductionClass | null;
    /**
     * The empty weight of the vehicle [kg].
     * 
     * Relevant for `routing`, `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    emptyWeight?: number | null;
    /**
     * The weight of the vehicle's load [kg].
     * 
     * Relevant for `routing`, `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    loadWeight?: number | null;
    /**
     * The total permitted weight of the vehicle and load [kg].
     * 
     * Relevant for `routing`, `toll`, `emissions`.
     * @type {number}
     * @memberof Vehicle
     */
    totalPermittedWeight?: number | null;
    /**
     * The maximum distributed weight that may be supported by an axle of the vehicle [kg].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    axleWeight?: number | null;
    /**
     * The total number of axles of the vehicle including the trailers.
     * 
     * Relevant for `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    numberOfAxles?: number | null;
    /**
     * The total number of tires of the vehicle including the trailers.
     * 
     * Relevant for `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    numberOfTires?: number | null;
    /**
     * The height of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    height?: number | null;
    /**
     * The height above the front axle [cm].
     * 
     * Relevant for `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    heightAboveFrontAxle?: number | null;
    /**
     * The length of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    length?: number | null;
    /**
     * The width of the vehicle [cm].
     * 
     * Relevant for `routing`, `toll`.
     * @type {number}
     * @memberof Vehicle
     */
    width?: number | null;
    /**
     * Comma-separated list of hazardous materials the vehicle has loaded. If NONE is specified along with
     * other hazardous materials it is ignored.
     * 
     * Relevant for `routing`.
     * @type {Array<HazardousMaterials>}
     * @memberof Vehicle
     */
    hazardousMaterials?: Array<HazardousMaterials> | null;
    /**
     * 
     * @type {TunnelRestrictionCode}
     * @memberof Vehicle
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
     *  * `SE_BK_1`
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
     * @memberof Vehicle
     */
    truckRoutes?: Array<TruckRoutes> | null;
    /**
     * Specifies if the vehicle usage is commercial.
     * 
     * Relevant for `toll`.
     * @type {boolean}
     * @memberof Vehicle
     */
    commercial?: boolean | null;
    /**
     * A comma separated list of ETC Subscriptions.
     * See [here](./Concepts/Electronic%20Toll%20Collection.htm) for more information on available subscriptions.
     * 
     * Relevant for `toll`.
     * @type {Array<EtcSubscriptionTypes>}
     * @memberof Vehicle
     */
    etcSubscriptions?: Array<EtcSubscriptionTypes> | null;
}

export function VehicleFromJSON(json: any): Vehicle {
    return VehicleFromJSONTyped(json, false);
}

export function VehicleFromJSONTyped(json: any, ignoreDiscriminator: boolean): Vehicle {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'engineType': !exists(json, 'engineType') ? undefined : EngineTypeFromJSON(json['engineType']),
        'fuelType': !exists(json, 'fuelType') ? undefined : FuelTypeFromJSON(json['fuelType']),
        'electricityType': !exists(json, 'electricityType') ? undefined : ElectricityTypeFromJSON(json['electricityType']),
        'averageFuelConsumption': !exists(json, 'averageFuelConsumption') ? undefined : json['averageFuelConsumption'],
        'averageElectricityConsumption': !exists(json, 'averageElectricityConsumption') ? undefined : json['averageElectricityConsumption'],
        'bioFuelRatio': !exists(json, 'bioFuelRatio') ? undefined : json['bioFuelRatio'],
        'hybridRatio': !exists(json, 'hybridRatio') ? undefined : json['hybridRatio'],
        'dualFuelRatio': !exists(json, 'dualFuelRatio') ? undefined : json['dualFuelRatio'],
        'cylinderCapacity': !exists(json, 'cylinderCapacity') ? undefined : json['cylinderCapacity'],
        'emissionStandard': !exists(json, 'emissionStandard') ? undefined : EmissionStandardFromJSON(json['emissionStandard']),
        'lowEmissionZoneTypes': !exists(json, 'lowEmissionZoneTypes') ? undefined : (json['lowEmissionZoneTypes'] === null ? null : (json['lowEmissionZoneTypes'] as Array<any>).map(LowEmissionZoneTypesFromJSON)),
        'particleReductionClass': !exists(json, 'particleReductionClass') ? undefined : ParticleReductionClassFromJSON(json['particleReductionClass']),
        'emptyWeight': !exists(json, 'emptyWeight') ? undefined : json['emptyWeight'],
        'loadWeight': !exists(json, 'loadWeight') ? undefined : json['loadWeight'],
        'totalPermittedWeight': !exists(json, 'totalPermittedWeight') ? undefined : json['totalPermittedWeight'],
        'axleWeight': !exists(json, 'axleWeight') ? undefined : json['axleWeight'],
        'numberOfAxles': !exists(json, 'numberOfAxles') ? undefined : json['numberOfAxles'],
        'numberOfTires': !exists(json, 'numberOfTires') ? undefined : json['numberOfTires'],
        'height': !exists(json, 'height') ? undefined : json['height'],
        'heightAboveFrontAxle': !exists(json, 'heightAboveFrontAxle') ? undefined : json['heightAboveFrontAxle'],
        'length': !exists(json, 'length') ? undefined : json['length'],
        'width': !exists(json, 'width') ? undefined : json['width'],
        'hazardousMaterials': !exists(json, 'hazardousMaterials') ? undefined : (json['hazardousMaterials'] === null ? null : (json['hazardousMaterials'] as Array<any>).map(HazardousMaterialsFromJSON)),
        'tunnelRestrictionCode': !exists(json, 'tunnelRestrictionCode') ? undefined : TunnelRestrictionCodeFromJSON(json['tunnelRestrictionCode']),
        'truckRoutes': !exists(json, 'truckRoutes') ? undefined : (json['truckRoutes'] === null ? null : (json['truckRoutes'] as Array<any>).map(TruckRoutesFromJSON)),
        'commercial': !exists(json, 'commercial') ? undefined : json['commercial'],
        'etcSubscriptions': !exists(json, 'etcSubscriptions') ? undefined : (json['etcSubscriptions'] === null ? null : (json['etcSubscriptions'] as Array<any>).map(EtcSubscriptionTypesFromJSON)),
    };
}

export function VehicleToJSON(value?: Vehicle | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'engineType': EngineTypeToJSON(value.engineType),
        'fuelType': FuelTypeToJSON(value.fuelType),
        'electricityType': ElectricityTypeToJSON(value.electricityType),
        'averageFuelConsumption': value.averageFuelConsumption,
        'averageElectricityConsumption': value.averageElectricityConsumption,
        'bioFuelRatio': value.bioFuelRatio,
        'hybridRatio': value.hybridRatio,
        'dualFuelRatio': value.dualFuelRatio,
        'cylinderCapacity': value.cylinderCapacity,
        'emissionStandard': EmissionStandardToJSON(value.emissionStandard),
        'lowEmissionZoneTypes': value.lowEmissionZoneTypes === undefined ? undefined : (value.lowEmissionZoneTypes === null ? null : (value.lowEmissionZoneTypes as Array<any>).map(LowEmissionZoneTypesToJSON)),
        'particleReductionClass': ParticleReductionClassToJSON(value.particleReductionClass),
        'emptyWeight': value.emptyWeight,
        'loadWeight': value.loadWeight,
        'totalPermittedWeight': value.totalPermittedWeight,
        'axleWeight': value.axleWeight,
        'numberOfAxles': value.numberOfAxles,
        'numberOfTires': value.numberOfTires,
        'height': value.height,
        'heightAboveFrontAxle': value.heightAboveFrontAxle,
        'length': value.length,
        'width': value.width,
        'hazardousMaterials': value.hazardousMaterials === undefined ? undefined : (value.hazardousMaterials === null ? null : (value.hazardousMaterials as Array<any>).map(HazardousMaterialsToJSON)),
        'tunnelRestrictionCode': TunnelRestrictionCodeToJSON(value.tunnelRestrictionCode),
        'truckRoutes': value.truckRoutes === undefined ? undefined : (value.truckRoutes === null ? null : (value.truckRoutes as Array<any>).map(TruckRoutesToJSON)),
        'commercial': value.commercial,
        'etcSubscriptions': value.etcSubscriptions === undefined ? undefined : (value.etcSubscriptions === null ? null : (value.etcSubscriptions as Array<any>).map(EtcSubscriptionTypesToJSON)),
    };
}

