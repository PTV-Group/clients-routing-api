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


import * as runtime from '../runtime';
import type {
  ErrorResponse,
  HorizonType,
  ReachableAreas,
  ReachableAreasId,
  ReachableAreasResponse,
  ReachableOptions,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    HorizonTypeFromJSON,
    HorizonTypeToJSON,
    ReachableAreasFromJSON,
    ReachableAreasToJSON,
    ReachableAreasIdFromJSON,
    ReachableAreasIdToJSON,
    ReachableAreasResponseFromJSON,
    ReachableAreasResponseToJSON,
    ReachableOptionsFromJSON,
    ReachableOptionsToJSON,
} from '../models/index';

export interface CalculateReachableAreasRequest {
    waypoint: string;
    horizons: Array<number>;
    profile?: string;
    horizonType?: HorizonType;
    options?: ReachableOptions;
}

export interface DeleteReachableAreasRequest {
    id: string;
}

export interface GetReachableAreasRequest {
    id: string;
}

export interface StartAndCreateReachableAreasRequest {
    horizons: Array<number>;
    waypoint?: string;
    routeId?: string;
    profile?: string;
    horizonType?: HorizonType;
    options?: ReachableOptions;
}

/**
 * 
 */
export class ReachableAreasApi extends runtime.BaseAPI {

    /**
     * Calculates the areas which can be reached from a waypoint, within given horizons (limited to 25 km or 20 minutes). Use the asynchronous POST and GET requests for larger horizons or calculation of areas from a route.
     */
    async calculateReachableAreasRaw(requestParameters: CalculateReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ReachableAreas>> {
        if (requestParameters['waypoint'] == null) {
            throw new runtime.RequiredError(
                'waypoint',
                'Required parameter "waypoint" was null or undefined when calling calculateReachableAreas().'
            );
        }

        if (requestParameters['horizons'] == null) {
            throw new runtime.RequiredError(
                'horizons',
                'Required parameter "horizons" was null or undefined when calling calculateReachableAreas().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['waypoint'] != null) {
            queryParameters['waypoint'] = requestParameters['waypoint'];
        }

        if (requestParameters['profile'] != null) {
            queryParameters['profile'] = requestParameters['profile'];
        }

        if (requestParameters['horizons'] != null) {
            queryParameters['horizons'] = requestParameters['horizons']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['horizonType'] != null) {
            queryParameters['horizonType'] = requestParameters['horizonType'];
        }

        if (requestParameters['options'] != null) {
            queryParameters['options'] = requestParameters['options'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-areas`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReachableAreasFromJSON(jsonValue));
    }

    /**
     * Calculates the areas which can be reached from a waypoint, within given horizons (limited to 25 km or 20 minutes). Use the asynchronous POST and GET requests for larger horizons or calculation of areas from a route.
     */
    async calculateReachableAreas(requestParameters: CalculateReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ReachableAreas> {
        const response = await this.calculateReachableAreasRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Cancels a reachable areas calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
     */
    async deleteReachableAreasRaw(requestParameters: DeleteReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling deleteReachableAreas().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-areas/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Cancels a reachable areas calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
     */
    async deleteReachableAreas(requestParameters: DeleteReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteReachableAreasRaw(requestParameters, initOverrides);
    }

    /**
     * Gets the results of a reachable areas calculation specified by its ID.
     */
    async getReachableAreasRaw(requestParameters: GetReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ReachableAreasResponse>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling getReachableAreas().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-areas/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReachableAreasResponseFromJSON(jsonValue));
    }

    /**
     * Gets the results of a reachable areas calculation specified by its ID.
     */
    async getReachableAreas(requestParameters: GetReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ReachableAreasResponse> {
        const response = await this.getReachableAreasRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Starts and creates the areas which can be reached from a waypoint or from a route, within given horizons. This type of request is recommended when the **horizons** parameter is more than 20 minutes or 25 km.
     */
    async startAndCreateReachableAreasRaw(requestParameters: StartAndCreateReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ReachableAreasId>> {
        if (requestParameters['horizons'] == null) {
            throw new runtime.RequiredError(
                'horizons',
                'Required parameter "horizons" was null or undefined when calling startAndCreateReachableAreas().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['waypoint'] != null) {
            queryParameters['waypoint'] = requestParameters['waypoint'];
        }

        if (requestParameters['routeId'] != null) {
            queryParameters['routeId'] = requestParameters['routeId'];
        }

        if (requestParameters['profile'] != null) {
            queryParameters['profile'] = requestParameters['profile'];
        }

        if (requestParameters['horizons'] != null) {
            queryParameters['horizons'] = requestParameters['horizons']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['horizonType'] != null) {
            queryParameters['horizonType'] = requestParameters['horizonType'];
        }

        if (requestParameters['options'] != null) {
            queryParameters['options'] = requestParameters['options'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-areas`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReachableAreasIdFromJSON(jsonValue));
    }

    /**
     * Starts and creates the areas which can be reached from a waypoint or from a route, within given horizons. This type of request is recommended when the **horizons** parameter is more than 20 minutes or 25 km.
     */
    async startAndCreateReachableAreas(requestParameters: StartAndCreateReachableAreasRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ReachableAreasId> {
        const response = await this.startAndCreateReachableAreasRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
