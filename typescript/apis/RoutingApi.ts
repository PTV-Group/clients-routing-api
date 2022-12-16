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


import * as runtime from '../runtime';
import {
    Driver,
    DriverFromJSON,
    DriverToJSON,
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    MonetaryCostOptions,
    MonetaryCostOptionsFromJSON,
    MonetaryCostOptionsToJSON,
    Options,
    OptionsFromJSON,
    OptionsToJSON,
    Results,
    ResultsFromJSON,
    ResultsToJSON,
    RouteRequest,
    RouteRequestFromJSON,
    RouteRequestToJSON,
    RouteResponse,
    RouteResponseFromJSON,
    RouteResponseToJSON,
    Vehicle,
    VehicleFromJSON,
    VehicleToJSON,
} from '../models';

export interface CalculateRouteRequest {
    waypoints?: Array<string>;
    routeId?: string;
    profile?: string;
    vehicle?: Vehicle;
    options?: Options;
    monetaryCostOptions?: MonetaryCostOptions;
    results?: Array<Results>;
}

export interface CalculateRoutePostRequest {
    routeRequest: RouteRequest;
    profile?: string;
    vehicle?: Vehicle;
    driver?: Driver;
    options?: Options;
    monetaryCostOptions?: MonetaryCostOptions;
    results?: Array<Results>;
}

export interface GetRouteByRouteIdRequest {
    routeId: string;
}

/**
 * 
 */
export class RoutingApi extends runtime.BaseAPI {

    /**
     * Calculates a route by specifying a list of waypoints.
     */
    async calculateRouteRaw(requestParameters: CalculateRouteRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<RouteResponse>> {
        const queryParameters: any = {};

        if (requestParameters.waypoints) {
            queryParameters['waypoints'] = requestParameters.waypoints;
        }

        if (requestParameters.routeId !== undefined) {
            queryParameters['routeId'] = requestParameters.routeId;
        }

        if (requestParameters.profile !== undefined) {
            queryParameters['profile'] = requestParameters.profile;
        }

        if (requestParameters.vehicle !== undefined) {
            queryParameters['vehicle'] = requestParameters.vehicle;
        }

        if (requestParameters.options !== undefined) {
            queryParameters['options'] = requestParameters.options;
        }

        if (requestParameters.monetaryCostOptions !== undefined) {
            queryParameters['monetaryCostOptions'] = requestParameters.monetaryCostOptions;
        }

        if (requestParameters.results) {
            queryParameters['results'] = requestParameters.results.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/routes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RouteResponseFromJSON(jsonValue));
    }

    /**
     * Calculates a route by specifying a list of waypoints.
     */
    async calculateRoute(requestParameters: CalculateRouteRequest = {}, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<RouteResponse> {
        const response = await this.calculateRouteRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Calculates a route by specifying a list of waypoints taking into account opening intervals and working hours.
     */
    async calculateRoutePostRaw(requestParameters: CalculateRoutePostRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<RouteResponse>> {
        if (requestParameters.routeRequest === null || requestParameters.routeRequest === undefined) {
            throw new runtime.RequiredError('routeRequest','Required parameter requestParameters.routeRequest was null or undefined when calling calculateRoutePost.');
        }

        const queryParameters: any = {};

        if (requestParameters.profile !== undefined) {
            queryParameters['profile'] = requestParameters.profile;
        }

        if (requestParameters.vehicle !== undefined) {
            queryParameters['vehicle'] = requestParameters.vehicle;
        }

        if (requestParameters.driver !== undefined) {
            queryParameters['driver'] = requestParameters.driver;
        }

        if (requestParameters.options !== undefined) {
            queryParameters['options'] = requestParameters.options;
        }

        if (requestParameters.monetaryCostOptions !== undefined) {
            queryParameters['monetaryCostOptions'] = requestParameters.monetaryCostOptions;
        }

        if (requestParameters.results) {
            queryParameters['results'] = requestParameters.results.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/routes`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: RouteRequestToJSON(requestParameters.routeRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RouteResponseFromJSON(jsonValue));
    }

    /**
     * Calculates a route by specifying a list of waypoints taking into account opening intervals and working hours.
     */
    async calculateRoutePost(requestParameters: CalculateRoutePostRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<RouteResponse> {
        const response = await this.calculateRoutePostRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns a route for a previously calculated or alternative route ID.
     */
    async getRouteByRouteIdRaw(requestParameters: GetRouteByRouteIdRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<RouteResponse>> {
        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getRouteByRouteId.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/routes/{routeId}`.replace(`{${"routeId"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RouteResponseFromJSON(jsonValue));
    }

    /**
     * Returns a route for a previously calculated or alternative route ID.
     */
    async getRouteByRouteId(requestParameters: GetRouteByRouteIdRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<RouteResponse> {
        const response = await this.getRouteByRouteIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
