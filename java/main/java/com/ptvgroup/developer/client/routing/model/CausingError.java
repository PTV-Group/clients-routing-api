/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
 * CausingError
 */
@JsonPropertyOrder({
  CausingError.JSON_PROPERTY_DESCRIPTION,
  CausingError.JSON_PROPERTY_ERROR_CODE,
  CausingError.JSON_PROPERTY_PARAMETER,
  CausingError.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T09:48:51.311424Z[Etc/UTC]")
public class CausingError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;

  public CausingError() { 
  }

  public CausingError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable message that describes the error.")
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


  public CausingError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;ROUTING_INVALID_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is set to an invalid value.   * &#x60;attribute&#x60; - The invalid waypoint attribute. * &#x60;ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is unknown.   * &#x60;attribute&#x60; - The invalid waypoint key. * &#x60;ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is duplicated.   * &#x60;attribute&#x60; - The duplicated waypoint key. * &#x60;ROUTING_WAYPOINT_ATTRIBUTE_CONFLICT&#x60; - Two waypoint attributes are in conflict with each other.   * &#x60;attribute&#x60; - The first conflicting attribute.   * &#x60;conflictingAttribute&#x60; - The second conflicting attribute. * &#x60;ROUTING_INVALID_MANIPULATION_WAYPOINT_ORDER&#x60; - The manipulation waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_COMBINED_TRANSPORT_WAYPOINT_ORDER&#x60; - The combinedTransport waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_WAYPOINT_LIST_FOR_ALTERNATIVE_ROUTES&#x60; - Alternative routes are supported only for two on-road or off-road waypoints. * &#x60;ROUTING_INVALID_WAYPOINT&#x60; - A waypoint contains multiple types or none of them, but exactly one must be specified. * &#x60;ROUTING_MUST_HAVE_WAYPOINTS_OR_ROUTE_ID&#x60; - The request must have either at least two waypoints or a routeId. * &#x60;ROUTING_EMISSIONS_MUTUALLY_EXCLUSIVE&#x60; - All emissions EN16258_2012 results and ISO14083_2022 results are mutually exclusive.   * &#x60;attribute&#x60; - The first conflicting emissions standard.   * &#x60;conflictingAttributes&#x60; - The list of other conflicting emissions standards. * &#x60;ROUTING_START_AND_ARRIVAL_TIME_MUTUALLY_EXCLUSIVE&#x60; - startTime and arrivalTime are mutually exclusive. - _The **parameter** remains empty._ * &#x60;ROUTING_ESTIMATED_DISTANCE_TOO_LONG&#x60; - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._   * &#x60;distance&#x60; - The estimated distance (integer).   * &#x60;limit&#x60; - The maximum allowable distance (integer). * &#x60;ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message. * &#x60;ROUTING_NO_VALID_COUNTRY_ALLOWED&#x60; - The list of allowed countries does not contain any of the available countries so that the effective list of countries allowed for routing is empty.   * &#x60;allowedCountries&#x60; - The list of allowed countries. * &#x60;ROUTING_ALL_VALID_COUNTRIES_PROHIBITED&#x60; - The list of prohibited countries contains all available countries so that the effective list of countries allowed for routing is empty.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_CONFLICT&#x60; - The lists of allowed and prohibited countries contain the same countries so that the effective list of countries allowed for routing is empty. - _The **parameter** remains empty._   * &#x60;allowedCountries&#x60; - The list of allowed countries.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_MAXIMUM_HORIZON_VALUE_VIOLATED&#x60; - The maximum value of horizon is violated.   * &#x60;limit&#x60; - The maximum allowable horizon (integer). * &#x60;ROUTING_MUST_HAVE_ONE_WAYPOINT_OR_ROUTE_ID&#x60; - The request must have either a waypoint or a routeId. * &#x60;ROUTING_HORIZONS_EQUAL_OR_NOT_ASCENDING&#x60; - The horizons have equal values or are not ascending.   * &#x60;value&#x60; - The invalid horizon. * &#x60;ROUTING_ROUTE_TOO_LONG_FOR_REACHABILITY&#x60; - The route is too long to be used with reachable areas or locations.   * &#x60;length&#x60; - The actual route length (integer).   * &#x60;limit&#x60; - The maximum allowable route length (integer). * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_IN_CONFLICT_WITH_ROUTE_ID&#x60; - The lists of allowed and prohibited countries are in conflict with the routeId which passes an effectively prohibited country.   * &#x60;value&#x60; - The value in conflict. * &#x60;ROUTING_ROUTE_ID_NOT_FOUND&#x60; - The routeId cannot be found.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_ROUTE_ID_CANNOT_BE_USED&#x60; - The routeId cannot be used for this operation as it was created by a service other than routing and lacks a routing context.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The profile name. * &#x60;ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;currency&#x60; - The unsupported currency. * &#x60;ROUTING_PARAMETER_ONLY_SUPPORTED_BY_POST&#x60; - A requested parameter is only supported for the appropriate POST operation.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_OPENING_INTERVALS_REQUIRE_TIME&#x60; - When using opening intervals with a waypoint and with **options[trafficMode]&#x3D;AVERAGE** either a start or an arrival time has to be specified. * &#x60;ROUTING_ARRIVAL_TIME_WITH_SCHEDULE&#x60; - **options[arrivalTime]** cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_INVALID_NUMBER_OF_COORDINATES&#x60; - The polyline cannot be parsed because the number of coordinates is not even.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found. * &#x60;ROUTING_INVALID_COORDINATE&#x60; - The provided coordinate is not in the valid range or cannot be parsed.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found.   * &#x60;coordinateIndex&#x60; - The index denoting the erroneous coordinate within the polyline. * &#x60;ROUTING_FEATURE_NOT_SUPPORTED_WITH_MONETARY_COSTS&#x60; - The requested feature is not supported when **options[routingMode] is _MONETARY_**.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_MUST_HAVE_MONETARY_COST_VALUE&#x60; - Both values monetaryCostOptions[costPerKilometer] and monetaryCostOptions[workingCostPerHour] are zero. Use a value greater zero for at least one of this monetaryCostOptions parameters.  **Error codes for** &#x60;ROUTING_ERROR&#x60;  * &#x60;ROUTING_WAYPOINT_CANNOT_BE_MATCHED&#x60; - The waypoint cannot be matched to the nearest possible road. * &#x60;ROUTING_ROUTE_NOT_FOUND&#x60; - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._ * &#x60;ROUTING_UTC_OFFSET_CANNOT_BE_DETERMINED&#x60; - The UTC offset of the start waypoint cannot be determined. * &#x60;ROUTING_BLOCK_INTERSECTING_ROADS_TOO_MANY_SEGMENTS&#x60; - The maximum number of road segments intersecting one polyline must not exceed 5000.  **Error codes for** &#x60;ROUTING_RESTRICTION_EXCEEDED&#x60;  * &#x60;ROUTING_TOO_MANY_WAYPOINTS&#x60; - The request contains too many waypoints.   * &#x60;limit&#x60;- The maximum allowed number of waypoints for a single request (integer).  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60;  * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** `GENERAL_VALIDATION_ERROR`  * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.   * `value` - The invalid value. * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown. * `GENERAL_MISSING_PARAMETER` - A required parameter is missing. * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length is violated.   * `minimumLength` - The minimum length (integer). * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length is violated.   * `maximumLength` - The maximum length (integer). * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value restriction is violated.   * `minimumValue` - The minimum value (integer or double). * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value restriction is violated.   * `maximumValue` - The maximum value (integer or double). * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated. * `GENERAL_INVALID_LIST` - A list has an invalid format such as duplicate commas.   * `value` - The invalid list. * `GENERAL_INVALID_INTERVAL` - A time interval is invalid, i.e. start is greater than end. * `ROUTING_INVALID_WAYPOINT_ATTRIBUTE` - A waypoint attribute is set to an invalid value.   * `attribute` - The invalid waypoint attribute. * `ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE` - A waypoint attribute is unknown.   * `attribute` - The invalid waypoint key. * `ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE` - A waypoint attribute is duplicated.   * `attribute` - The duplicated waypoint key. * `ROUTING_WAYPOINT_ATTRIBUTE_CONFLICT` - Two waypoint attributes are in conflict with each other.   * `attribute` - The first conflicting attribute.   * `conflictingAttribute` - The second conflicting attribute. * `ROUTING_INVALID_MANIPULATION_WAYPOINT_ORDER` - The manipulation waypoint is not valid for start or destination. * `ROUTING_INVALID_COMBINED_TRANSPORT_WAYPOINT_ORDER` - The combinedTransport waypoint is not valid for start or destination. * `ROUTING_INVALID_WAYPOINT_LIST_FOR_ALTERNATIVE_ROUTES` - Alternative routes are supported only for two on-road or off-road waypoints. * `ROUTING_INVALID_WAYPOINT` - A waypoint contains multiple types or none of them, but exactly one must be specified. * `ROUTING_MUST_HAVE_WAYPOINTS_OR_ROUTE_ID` - The request must have either at least two waypoints or a routeId. * `ROUTING_EMISSIONS_MUTUALLY_EXCLUSIVE` - All emissions EN16258_2012 results and ISO14083_2022 results are mutually exclusive.   * `attribute` - The first conflicting emissions standard.   * `conflictingAttributes` - The list of other conflicting emissions standards. * `ROUTING_START_AND_ARRIVAL_TIME_MUTUALLY_EXCLUSIVE` - startTime and arrivalTime are mutually exclusive. - _The **parameter** remains empty._ * `ROUTING_ESTIMATED_DISTANCE_TOO_LONG` - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._   * `distance` - The estimated distance (integer).   * `limit` - The maximum allowable distance (integer). * `ROUTING_PARAMETER_CONFLICT` - Two parameters are in conflict with each other.   * `conflictingParameter` - The conflicting parameter.   * `message` - The error message. * `ROUTING_NO_VALID_COUNTRY_ALLOWED` - The list of allowed countries does not contain any of the available countries so that the effective list of countries allowed for routing is empty.   * `allowedCountries` - The list of allowed countries. * `ROUTING_ALL_VALID_COUNTRIES_PROHIBITED` - The list of prohibited countries contains all available countries so that the effective list of countries allowed for routing is empty.   * `prohibitedCountries` - The list of prohibited countries. * `ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_CONFLICT` - The lists of allowed and prohibited countries contain the same countries so that the effective list of countries allowed for routing is empty. - _The **parameter** remains empty._   * `allowedCountries` - The list of allowed countries.   * `prohibitedCountries` - The list of prohibited countries. * `ROUTING_MAXIMUM_HORIZON_VALUE_VIOLATED` - The maximum value of horizon is violated.   * `limit` - The maximum allowable horizon (integer). * `ROUTING_MUST_HAVE_ONE_WAYPOINT_OR_ROUTE_ID` - The request must have either a waypoint or a routeId. * `ROUTING_HORIZONS_EQUAL_OR_NOT_ASCENDING` - The horizons have equal values or are not ascending.   * `value` - The invalid horizon. * `ROUTING_ROUTE_TOO_LONG_FOR_REACHABILITY` - The route is too long to be used with reachable areas or locations.   * `length` - The actual route length (integer).   * `limit` - The maximum allowable route length (integer). * `ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_IN_CONFLICT_WITH_ROUTE_ID` - The lists of allowed and prohibited countries are in conflict with the routeId which passes an effectively prohibited country.   * `value` - The value in conflict. * `ROUTING_ROUTE_ID_NOT_FOUND` - The routeId cannot be found.   * `value` - The routeId. * `ROUTING_ROUTE_ID_CANNOT_BE_USED` - The routeId cannot be used for this operation as it was created by a service other than routing and lacks a routing context.   * `value` - The routeId. * `ROUTING_PROFILE_NOT_FOUND` - The requested profile could not be found.   * `value` - The profile name. * `ROUTING_UNSUPPORTED_CURRENCY` - The specified currency is not supported.   * `currency` - The unsupported currency. * `ROUTING_PARAMETER_ONLY_SUPPORTED_BY_POST` - A requested parameter is only supported for the appropriate POST operation.   * `value` - The invalid parameter value. * `ROUTING_OPENING_INTERVALS_REQUIRE_TIME` - When using opening intervals with a waypoint and with **options[trafficMode]=AVERAGE** either a start or an arrival time has to be specified. * `ROUTING_ARRIVAL_TIME_WITH_SCHEDULE` - **options[arrivalTime]** cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.   * `value` - The invalid parameter value. * `ROUTING_INVALID_NUMBER_OF_COORDINATES` - The polyline cannot be parsed because the number of coordinates is not even.   * `value` - The invalid parameter value.   * `polylineIndex` - The index denoting the polyline in which the error was found. * `ROUTING_INVALID_COORDINATE` - The provided coordinate is not in the valid range or cannot be parsed.   * `value` - The invalid parameter value.   * `polylineIndex` - The index denoting the polyline in which the error was found.   * `coordinateIndex` - The index denoting the erroneous coordinate within the polyline. * `ROUTING_FEATURE_NOT_SUPPORTED_WITH_MONETARY_COSTS` - The requested feature is not supported when **options[routingMode] is _MONETARY_**.   * `value` - The invalid parameter value. * `ROUTING_MUST_HAVE_MONETARY_COST_VALUE` - Both values monetaryCostOptions[costPerKilometer] and monetaryCostOptions[workingCostPerHour] are zero. Use a value greater zero for at least one of this monetaryCostOptions parameters.  **Error codes for** `ROUTING_ERROR`  * `ROUTING_WAYPOINT_CANNOT_BE_MATCHED` - The waypoint cannot be matched to the nearest possible road. * `ROUTING_ROUTE_NOT_FOUND` - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._ * `ROUTING_UTC_OFFSET_CANNOT_BE_DETERMINED` - The UTC offset of the start waypoint cannot be determined. * `ROUTING_BLOCK_INTERSECTING_ROADS_TOO_MANY_SEGMENTS` - The maximum number of road segments intersecting one polyline must not exceed 5000.  **Error codes for** `ROUTING_RESTRICTION_EXCEEDED`  * `ROUTING_TOO_MANY_WAYPOINTS` - The request contains too many waypoints.   * `limit`- The maximum allowed number of waypoints for a single request (integer).  **Error codes for** `GENERAL_RESOURCE_NOT_FOUND`  * `GENERAL_INVALID_ID` - The ID does not exist.   * `value` - The invalid ID.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CausingError parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the affected query or path parameter or a JSONPath to the affected property of the request.")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public CausingError details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public CausingError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this error class.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this error class.")
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
   * Return true if this CausingError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausingError causingError = (CausingError) o;
    return Objects.equals(this.description, causingError.description) &&
        Objects.equals(this.errorCode, causingError.errorCode) &&
        Objects.equals(this.parameter, causingError.parameter) &&
        Objects.equals(this.details, causingError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, parameter, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausingError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

