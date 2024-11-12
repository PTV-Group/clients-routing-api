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

import { mapValues } from '../runtime';
/**
 * The weather used for the electricity consumption calculation.
 * 
 * @export
 * @interface WeatherResponse
 */
export interface WeatherResponse {
    /**
     * The average temperature at 2 meters above ground [°C]. Used to estimate the state of health of the 
     * battery and consumption due to air conditioning.
     * @type {number}
     * @memberof WeatherResponse
     */
    temperature?: number;
    /**
     * The average wind speed at 10 meters above ground [km/h].
     * @type {number}
     * @memberof WeatherResponse
     */
    windSpeed?: number;
    /**
     * The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees.
     * @type {number}
     * @memberof WeatherResponse
     */
    windDirection?: number;
}

/**
 * Check if a given object implements the WeatherResponse interface.
 */
export function instanceOfWeatherResponse(value: object): value is WeatherResponse {
    return true;
}

export function WeatherResponseFromJSON(json: any): WeatherResponse {
    return WeatherResponseFromJSONTyped(json, false);
}

export function WeatherResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): WeatherResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'temperature': json['temperature'] == null ? undefined : json['temperature'],
        'windSpeed': json['windSpeed'] == null ? undefined : json['windSpeed'],
        'windDirection': json['windDirection'] == null ? undefined : json['windDirection'],
    };
}

export function WeatherResponseToJSON(value?: WeatherResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'temperature': value['temperature'],
        'windSpeed': value['windSpeed'],
        'windDirection': value['windDirection'],
    };
}

