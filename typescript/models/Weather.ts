/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * The weather at a waypoint. It is relevant to the electricity consumption calculation of electric vehicles. The 
 * weather is valid until the end of the route unless it is changed again at a subsequent waypoint. If no weather 
 * is configured at the first waypoint, a temperature of 23°C and no wind is assumed for minimal impact on the 
 * consumption calculation. The parameter windDirection must not be null if windSpeed is set to anything but 0.
 * @export
 * @interface Weather
 */
export interface Weather {
    /**
     * The average temperature at a waypoint at 2 meters above ground[°C]. Used to estimate the state of health of the 
     * battery and consumption due to air conditioning.
     * @type {number}
     * @memberof Weather
     */
    temperature?: number | null;
    /**
     * The average wind speed at a waypoint at 10 meters above ground [km/h].
     * @type {number}
     * @memberof Weather
     */
    windSpeed?: number | null;
    /**
     * The wind direction (clockwise) at 10 meters above ground. North represents 0 degrees.
     * @type {number}
     * @memberof Weather
     */
    windDirection?: number;
}

/**
 * Check if a given object implements the Weather interface.
 */
export function instanceOfWeather(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function WeatherFromJSON(json: any): Weather {
    return WeatherFromJSONTyped(json, false);
}

export function WeatherFromJSONTyped(json: any, ignoreDiscriminator: boolean): Weather {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'temperature': !exists(json, 'temperature') ? undefined : json['temperature'],
        'windSpeed': !exists(json, 'windSpeed') ? undefined : json['windSpeed'],
        'windDirection': !exists(json, 'windDirection') ? undefined : json['windDirection'],
    };
}

export function WeatherToJSON(value?: Weather | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'temperature': value.temperature,
        'windSpeed': value.windSpeed,
        'windDirection': value.windDirection,
    };
}
