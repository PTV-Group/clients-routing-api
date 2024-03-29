/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Warning
 */
@JsonPropertyOrder({
  Warning.JSON_PROPERTY_DESCRIPTION,
  Warning.JSON_PROPERTY_WARNING_CODE,
  Warning.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class Warning {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_WARNING_CODE = "warningCode";
  private String warningCode;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;

  public Warning() { 
  }

  public Warning description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the warning.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable message that describes the warning.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Warning warningCode(String warningCode) {
    this.warningCode = warningCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.   * &#x60;parameter&#x60; - The ignored parameter.   * &#x60;value&#x60; - The value of the ignored parameter.   * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.   * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTING_PARAMETER_INCONSISTENCY&#x60; - A parameter was inconsistent with other vehicle parameters. Some results like emissions or toll may not be correct.   * &#x60;parameter&#x60; - The inconsistent parameter.   * &#x60;value&#x60; - The value of the inconsistent parameter.   * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be inconsistent.   * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be inconsistent. * &#x60;ROUTING_MISSING_VEHICLE_PARAMETER&#x60; - The requested vehicle contains a parameter which requires another parameter to be specified. Some results like emissions or toll may not be correct.   * &#x60;missingParameter&#x60; - The missing parameter.   * &#x60;relatedParameter&#x60; - The parameter which requires the missing parameter to be specified.   * &#x60;relatedValue&#x60; - The value which requires the missing parameter to be specified. * &#x60;ROUTING_DRIVERS_WORKING_HOURS_WITH_BOAT_OR_RAIL&#x60; - The route contains a boat (ferry) or rail (train or rail shuttle) connection which can lead to incorrect results when **workingHoursPreset** is specified. Breaks may not be scheduled in an optimal way. * &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; - The requested language is not available for maneuvers, a different language is used instead.   * &#x60;requestedLanguage&#x60; - The language requested by the user.   * &#x60;usedLanguage&#x60; - The language of maneuvers in the response. * &#x60;ROUTING_UNSUPPORTED_EMISSION_PARAMETER&#x60; - The requested emission standard does not support the specified vehicle.   * &#x60;relatedParameter&#x60; - The parameter causing the emission calculation failure.   * &#x60;relatedValue&#x60; - The value of the related parameter. * &#x60;ROUTING_REGION_NOT_SUPPORTED_BY_EMISSION_STANDARD&#x60; - The requested emission standard does not support the region the profile was designed for.   * &#x60;region&#x60; - The requested region not supported by the requested emission standard.   * &#x60;supportedRegions&#x60; - The regions which are supported by the requested emission standard.   * &#x60;emissionStandard&#x60; - The requested emission standard. * &#x60;ROUTING_COUNTRY_IGNORED&#x60; - The country code given in **options[allowedCountries]** or **options[prohibitedCountries]** was ignored as it is not covered by the map.   * &#x60;ignoredCountryCode&#x60; - The ignored country code. * &#x60;ROUTING_SUBDIVISION_FALLBACK&#x60; - The country code given in **options[allowedCountries]** contains a country subdivision code that is not supported by the map, and that instead the enclosing country code was used. In such cases, routes are constrained to the country, rather than only the subdivision.   * &#x60;requestedSubdivisionCode&#x60; - The country subdivision code that was requested, but cannot be used.   * &#x60;fallbackCountryCode&#x60; - The enclosing country that is used as a fallback instead. * &#x60;ROUTING_LIVE_TRAFFIC_DATA_UNAVAILABLE&#x60; - Live traffic data are temporarily unavailable. * &#x60;ROUTING_ETC_SUBSCRIPTION_REQUIRED&#x60; - The route passes through toll areas but the configured vehicle does not contain the required electronic toll collection subscriptions.   * &#x60;requiredEtcSubscriptions&#x60; - The required electronic toll collection subscriptions. * &#x60;ROUTING_WAYPOINT_MATCH_DISTANCE&#x60; - The distance from the waypoint to the nearest accessible road is greater than 1000 meters. Closed areas, countries or roads can be the reason for this.   * &#x60;distance&#x60;- The air-line distance between waypoint and match point on the road.   * &#x60;parameter&#x60; - The waypoint parameter. * &#x60;ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED&#x60; - The combined-transport waypoint was ignored as no connection could be found.   * &#x60;parameter&#x60; - The waypoint parameter.   * &#x60;availableConnections&#x60; - The list of connections available for the start coordinates (array of strings). This will only be returned if connections for the start coordinates are found, but none match the destination coordinates. * &#x60;ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS&#x60; - The combined-transport waypoint was ambiguous.   * &#x60;parameter&#x60; - The waypoint parameter.   * &#x60;usedConnection&#x60; - The connection used for this route.   * &#x60;availableConnections&#x60; - The list of connections available for the combined-transport waypoint (array of strings). * &#x60;ROUTING_WAYPOINTS_DONT_MATCH_PROFILE_REGION&#x60; - The **waypoints** or the **routeId** do not match the region of the **profile** specified in the request.   * &#x60;waypointsRegion&#x60; - The region of the **waypoints** or **routeId**.   * &#x60;profileRegion&#x60; - The region of the profile. * &#x60;ROUTING_INACTIVE_ROADATTRIBUTE_SCENARIOS&#x60; - The scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** contain at least one which is not active.   * &#x60;scenarios&#x60; - The inactive scenarioIds (comma-separated list). * &#x60;ROUTING_ROADATTRIBUTES_MAYBE_IGNORED&#x60; - At least one of the scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** could not be fully considered in the route calculation after a map update, i.e. some road attributes may have been ignored. * &#x60;ROUTING_PARAMETER_VALUE_DEPRECATED&#x60; - The parameter value is deprecated.   * &#x60;parameter&#x60; - The deprecated parameter.   * &#x60;value&#x60; - The deprecated value. * &#x60;ROUTING_UPDATED_ROUTE_ID&#x60; - The requested **routeId** has been updated to a new map. * &#x60;ROUTING_RANGE_CALCULATION_FALLBACK&#x60; - A predefined profile is used with range calculation. Only vehicles models are officially supported for range calculation (evReport, evStatusEvents, evChargeEvents). As a fallback, a similar vehicle model has been used for the range calculation. Please consider using a vehicle model for this feature. 
   * @return warningCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * `GENERAL_PARAMETER_IGNORED` - A parameter was ignored.   * `parameter` - The ignored parameter.   * `value` - The value of the ignored parameter.   * `relatedParameter` - The parameter which caused the parameter in question to be ignored.   * `relatedValue` - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * `ROUTING_PARAMETER_INCONSISTENCY` - A parameter was inconsistent with other vehicle parameters. Some results like emissions or toll may not be correct.   * `parameter` - The inconsistent parameter.   * `value` - The value of the inconsistent parameter.   * `relatedParameter` - The parameter which caused the parameter in question to be inconsistent.   * `relatedValue` - The value which caused the parameter in question to be inconsistent. * `ROUTING_MISSING_VEHICLE_PARAMETER` - The requested vehicle contains a parameter which requires another parameter to be specified. Some results like emissions or toll may not be correct.   * `missingParameter` - The missing parameter.   * `relatedParameter` - The parameter which requires the missing parameter to be specified.   * `relatedValue` - The value which requires the missing parameter to be specified. * `ROUTING_DRIVERS_WORKING_HOURS_WITH_BOAT_OR_RAIL` - The route contains a boat (ferry) or rail (train or rail shuttle) connection which can lead to incorrect results when **workingHoursPreset** is specified. Breaks may not be scheduled in an optimal way. * `ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE` - The requested language is not available for maneuvers, a different language is used instead.   * `requestedLanguage` - The language requested by the user.   * `usedLanguage` - The language of maneuvers in the response. * `ROUTING_UNSUPPORTED_EMISSION_PARAMETER` - The requested emission standard does not support the specified vehicle.   * `relatedParameter` - The parameter causing the emission calculation failure.   * `relatedValue` - The value of the related parameter. * `ROUTING_REGION_NOT_SUPPORTED_BY_EMISSION_STANDARD` - The requested emission standard does not support the region the profile was designed for.   * `region` - The requested region not supported by the requested emission standard.   * `supportedRegions` - The regions which are supported by the requested emission standard.   * `emissionStandard` - The requested emission standard. * `ROUTING_COUNTRY_IGNORED` - The country code given in **options[allowedCountries]** or **options[prohibitedCountries]** was ignored as it is not covered by the map.   * `ignoredCountryCode` - The ignored country code. * `ROUTING_SUBDIVISION_FALLBACK` - The country code given in **options[allowedCountries]** contains a country subdivision code that is not supported by the map, and that instead the enclosing country code was used. In such cases, routes are constrained to the country, rather than only the subdivision.   * `requestedSubdivisionCode` - The country subdivision code that was requested, but cannot be used.   * `fallbackCountryCode` - The enclosing country that is used as a fallback instead. * `ROUTING_LIVE_TRAFFIC_DATA_UNAVAILABLE` - Live traffic data are temporarily unavailable. * `ROUTING_ETC_SUBSCRIPTION_REQUIRED` - The route passes through toll areas but the configured vehicle does not contain the required electronic toll collection subscriptions.   * `requiredEtcSubscriptions` - The required electronic toll collection subscriptions. * `ROUTING_WAYPOINT_MATCH_DISTANCE` - The distance from the waypoint to the nearest accessible road is greater than 1000 meters. Closed areas, countries or roads can be the reason for this.   * `distance`- The air-line distance between waypoint and match point on the road.   * `parameter` - The waypoint parameter. * `ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED` - The combined-transport waypoint was ignored as no connection could be found.   * `parameter` - The waypoint parameter.   * `availableConnections` - The list of connections available for the start coordinates (array of strings). This will only be returned if connections for the start coordinates are found, but none match the destination coordinates. * `ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS` - The combined-transport waypoint was ambiguous.   * `parameter` - The waypoint parameter.   * `usedConnection` - The connection used for this route.   * `availableConnections` - The list of connections available for the combined-transport waypoint (array of strings). * `ROUTING_WAYPOINTS_DONT_MATCH_PROFILE_REGION` - The **waypoints** or the **routeId** do not match the region of the **profile** specified in the request.   * `waypointsRegion` - The region of the **waypoints** or **routeId**.   * `profileRegion` - The region of the profile. * `ROUTING_INACTIVE_ROADATTRIBUTE_SCENARIOS` - The scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** contain at least one which is not active.   * `scenarios` - The inactive scenarioIds (comma-separated list). * `ROUTING_ROADATTRIBUTES_MAYBE_IGNORED` - At least one of the scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** could not be fully considered in the route calculation after a map update, i.e. some road attributes may have been ignored. * `ROUTING_PARAMETER_VALUE_DEPRECATED` - The parameter value is deprecated.   * `parameter` - The deprecated parameter.   * `value` - The deprecated value. * `ROUTING_UPDATED_ROUTE_ID` - The requested **routeId** has been updated to a new map. * `ROUTING_RANGE_CALCULATION_FALLBACK` - A predefined profile is used with range calculation. Only vehicles models are officially supported for range calculation (evReport, evStatusEvents, evChargeEvents). As a fallback, a similar vehicle model has been used for the range calculation. Please consider using a vehicle model for this feature. ")
  @JsonProperty(JSON_PROPERTY_WARNING_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWarningCode() {
    return warningCode;
  }


  @JsonProperty(JSON_PROPERTY_WARNING_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }


  public Warning details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public Warning putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this class of warnings.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this class of warnings.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this Warning object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.description, warning.description) &&
        Objects.equals(this.warningCode, warning.warningCode) &&
        Objects.equals(this.details, warning.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, warningCode, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

