/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Warning
 */
@JsonPropertyOrder({
  Warning.JSON_PROPERTY_DESCRIPTION,
  Warning.JSON_PROPERTY_WARNING_CODE,
  Warning.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T09:18:49.935887368Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Warning {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_WARNING_CODE = "warningCode";
  private String warningCode;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = new HashMap<>();

  public Warning() { 
  }

  public Warning description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human readable message that describes the warning.
   * @return description
   */
  @javax.annotation.Nonnull
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
   * A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.   * &#x60;parameter&#x60; - The ignored parameter.   * &#x60;value&#x60; - The value of the ignored parameter.   * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.   * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTING_PARAMETER_INCONSISTENCY&#x60; - A parameter was inconsistent with other vehicle parameters. Some results like emissions or toll may not be correct.   * &#x60;parameter&#x60; - The inconsistent parameter.   * &#x60;value&#x60; - The value of the inconsistent parameter.   * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be inconsistent.   * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be inconsistent. * &#x60;ROUTING_MISSING_VEHICLE_PARAMETER&#x60; - The requested vehicle contains a parameter which requires another parameter to be specified. Some results like emissions or toll may not be correct.   * &#x60;missingParameter&#x60; - The missing parameter.   * &#x60;relatedParameter&#x60; - The parameter which requires the missing parameter to be specified.   * &#x60;relatedValue&#x60; - The value which requires the missing parameter to be specified. * &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; - The requested language is not available for maneuvers, a different language is used instead.   * &#x60;requestedLanguage&#x60; - The language requested by the user.   * &#x60;usedLanguage&#x60; - The language of maneuvers in the response. * &#x60;ROUTING_UNSUPPORTED_EMISSION_PARAMETER&#x60; - The requested emission calculation method does not support the specified vehicle.   * &#x60;relatedParameter&#x60; - The parameter causing the emission calculation failure.   * &#x60;relatedValue&#x60; - The value of the related parameter. * &#x60;ROUTING_REGION_NOT_SUPPORTED_BY_EMISSION_STANDARD&#x60; - The requested emission calculation method does not support the region the profile was designed for.   * &#x60;region&#x60; - The requested region not supported by the requested emission calculation method.   * &#x60;supportedRegions&#x60; - The regions which are supported by the requested emission calculation method.   * &#x60;emissionStandard&#x60; - The requested emission calculation method. * &#x60;ROUTING_COUNTRY_IGNORED&#x60; - The country code given in **options[allowedCountries]** or **options[prohibitedCountries]** was ignored as it is not covered by the map.   * &#x60;ignoredCountryCode&#x60; - The ignored country code. * &#x60;ROUTING_SUBDIVISION_FALLBACK&#x60; - The country code given in **options[allowedCountries]** contains a country subdivision code that is not supported by the map, and that instead the enclosing country code was used. In such cases, routes are constrained to the country, rather than only the subdivision.   * &#x60;requestedSubdivisionCode&#x60; - The country subdivision code that was requested, but cannot be used.   * &#x60;fallbackCountryCode&#x60; - The enclosing country that is used as a fallback instead. * &#x60;ROUTING_LIVE_TRAFFIC_DATA_UNAVAILABLE&#x60; - Live traffic data are temporarily unavailable. * &#x60;ROUTING_ETC_SUBSCRIPTION_REQUIRED&#x60; - The route passes through toll areas but the configured vehicle does not contain the required electronic toll collection subscriptions.   * &#x60;requiredEtcSubscriptions&#x60; - The required electronic toll collection subscriptions. * &#x60;ROUTING_WAYPOINT_MATCH_DISTANCE&#x60; - The distance from the waypoint to the nearest accessible road is greater than 1000 meters. Closed areas, countries or roads can be the reason for this.   * &#x60;distance&#x60;- The air-line distance between waypoint and match point on the road.   * &#x60;parameter&#x60; - The waypoint parameter. * &#x60;ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED&#x60; - The combined-transport waypoint was ignored as no connection could be found.   * &#x60;parameter&#x60; - The waypoint parameter.   * &#x60;availableConnections&#x60; - The list of connections available for the start coordinates (array of strings). This will only be returned if connections for the start coordinates are found, but none match the destination coordinates. * &#x60;ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS&#x60; - The combined-transport waypoint was ambiguous.   * &#x60;parameter&#x60; - The waypoint parameter.   * &#x60;usedConnection&#x60; - The connection used for this route.   * &#x60;availableConnections&#x60; - The list of connections available for the combined-transport waypoint (array of strings). * &#x60;ROUTING_WAYPOINTS_DONT_MATCH_PROFILE_REGION&#x60; - The **waypoints** or the **routeId** do not match the region of the **profile** specified in the request.   * &#x60;waypointsRegion&#x60; - The region of the **waypoints** or **routeId**.   * &#x60;profileRegion&#x60; - The region of the profile. * &#x60;ROUTING_INACTIVE_ROADATTRIBUTE_SCENARIOS&#x60; - The scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** contain at least one which is not active.   * &#x60;scenarios&#x60; - The inactive scenarioIds (comma-separated list). * &#x60;ROUTING_ROADATTRIBUTES_MAYBE_IGNORED&#x60; - At least one of the scenarios given in **options[customRoadAttributeScenarios]** or the **routeId** could not be fully considered in the route calculation after a map update, i.e. some road attributes may have been ignored.   * &#x60;scenarios&#x60; - The scenarios that may be ignored (comma-separated list). * &#x60;ROUTING_PARAMETER_VALUE_DEPRECATED&#x60; - The parameter value is deprecated.   * &#x60;parameter&#x60; - The deprecated parameter.   * &#x60;value&#x60; - The deprecated value. * &#x60;ROUTING_UPDATED_ROUTE_ID&#x60; - The requested **routeId** has been updated to a new map. * &#x60;ROUTING_RANGE_CALCULATION_FALLBACK&#x60; - A predefined profile is used with range calculation. Only vehicles models are officially supported for range calculation (evReport, evStatusEvents, evChargeEvents). As a fallback, a similar vehicle model has been used for the range calculation. Please consider using a vehicle model for this feature. * &#x60;ROUTING_STATE_OF_CHARGE_BELOW_MINIMUM&#x60; - The state of charge of the electric vehicle fell below the minimum defined in **evOptions[minimumStateOfCharge]** at least once. The calculated route may not be feasible. * &#x60;ROUTING_WEATHER_SERVICE_UNAVAILABLE&#x60; - The weather service is temporarily unavailable. A fallback to default weather was used for the consumption calculation. Please specify the weather explicitly, if this is not sufficient. * &#x60;ROUTING_WEATHER_FORECAST_UNAVAILABLE&#x60; - The weather forecast for at least one waypoint is unavailable because the time is too far in the future. A fallback to default weather is used for the consumption calculation if weather is unavailable for all waypoints. Please specify the weather explicitly, if this is not sufficient.   * &#x60;maximumDaysInFuture&#x60; - The maximum number of days the past, for which weather forecast is available. * &#x60;ROUTING_ELEVATIONS_UNAVAILABLE&#x60; - Elevations are unavailable for regions beyond -60° and +60° latitude.   * &#x60;results&#x60; - No elevations were considered when calculating these **results** for such parts of the route. 
   * @return warningCode
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nullable
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `warningCode` to the URL query string
    if (getWarningCode() != null) {
      joiner.add(String.format("%swarningCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWarningCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      for (String _key : getDetails().keySet()) {
        joiner.add(String.format("%sdetails%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getDetails().get(_key), URLEncoder.encode(ApiClient.valueToString(getDetails().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

