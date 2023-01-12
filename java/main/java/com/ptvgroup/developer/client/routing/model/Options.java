/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
import com.ptvgroup.developer.client.routing.model.AvoidFeature;
import com.ptvgroup.developer.client.routing.model.PolylineFormat;
import com.ptvgroup.developer.client.routing.model.RoutingMode;
import com.ptvgroup.developer.client.routing.model.TrafficMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Options
 */
@JsonPropertyOrder({
  Options.JSON_PROPERTY_START_TIME,
  Options.JSON_PROPERTY_ARRIVAL_TIME,
  Options.JSON_PROPERTY_TRAFFIC_MODE,
  Options.JSON_PROPERTY_LANGUAGE,
  Options.JSON_PROPERTY_POLYLINE_FORMAT,
  Options.JSON_PROPERTY_ALLOWED_COUNTRIES,
  Options.JSON_PROPERTY_PROHIBITED_COUNTRIES,
  Options.JSON_PROPERTY_CURRENCY,
  Options.JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE,
  Options.JSON_PROPERTY_AVOID,
  Options.JSON_PROPERTY_BLOCK_INTERSECTING_ROADS,
  Options.JSON_PROPERTY_ROUTING_MODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-12T07:57:01.625851Z[Etc/UTC]")
public class Options {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private JsonNullable<OffsetDateTime> startTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ARRIVAL_TIME = "arrivalTime";
  private JsonNullable<OffsetDateTime> arrivalTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TRAFFIC_MODE = "trafficMode";
  private TrafficMode trafficMode = TrafficMode.REALISTIC;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language = "en";

  public static final String JSON_PROPERTY_POLYLINE_FORMAT = "polylineFormat";
  private PolylineFormat polylineFormat = PolylineFormat.GEO_JSON;

  public static final String JSON_PROPERTY_ALLOWED_COUNTRIES = "allowedCountries";
  private JsonNullable<List<String>> allowedCountries = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PROHIBITED_COUNTRIES = "prohibitedCountries";
  private JsonNullable<List<String>> prohibitedCountries = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE = "preferTurnsOnPassengerSide";
  private Boolean preferTurnsOnPassengerSide = false;

  public static final String JSON_PROPERTY_AVOID = "avoid";
  private JsonNullable<List<AvoidFeature>> avoid = JsonNullable.<List<AvoidFeature>>undefined();

  public static final String JSON_PROPERTY_BLOCK_INTERSECTING_ROADS = "blockIntersectingRoads";
  private JsonNullable<String> blockIntersectingRoads = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROUTING_MODE = "routingMode";
  private RoutingMode routingMode = RoutingMode.FAST;

  public Options() { 
  }

  public Options startTime(OffsetDateTime startTime) {
    this.startTime = JsonNullable.<OffsetDateTime>of(startTime);
    return this;
  }

   /**
   * Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **arrivalTime**. If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. Responses will contain the offset to UTC specified in the request or that of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-04T06:00Z", value = "Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **arrivalTime**. If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. Responses will contain the offset to UTC specified in the request or that of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.")
  @JsonIgnore

  public OffsetDateTime getStartTime() {
        return startTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartTime_JsonNullable() {
    return startTime;
  }
  
  @JsonProperty(JSON_PROPERTY_START_TIME)
  public void setStartTime_JsonNullable(JsonNullable<OffsetDateTime> startTime) {
    this.startTime = startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = JsonNullable.<OffsetDateTime>of(startTime);
  }


  public Options arrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = JsonNullable.<OffsetDateTime>of(arrivalTime);
    return this;
  }

   /**
   * Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **startTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. Responses will contain the offset to UTC specified in the request or that of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.
   * @return arrivalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). This field is mutually exclusive with **startTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. Responses will contain the offset to UTC specified in the request or that of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./Concepts/Date%20and%20Time.htm) for more information on the relevance of date and time.")
  @JsonIgnore

  public OffsetDateTime getArrivalTime() {
        return arrivalTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getArrivalTime_JsonNullable() {
    return arrivalTime;
  }
  
  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  public void setArrivalTime_JsonNullable(JsonNullable<OffsetDateTime> arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public void setArrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = JsonNullable.<OffsetDateTime>of(arrivalTime);
  }


  public Options trafficMode(TrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

   /**
   * Get trafficMode
   * @return trafficMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrafficMode getTrafficMode() {
    return trafficMode;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficMode(TrafficMode trafficMode) {
    this.trafficMode = trafficMode;
  }


  public Options language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** &#x60;ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE&#x60; is returned if the language is not supported for maneuvers.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** `ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE` is returned if the language is not supported for maneuvers.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public Options polylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
    return this;
  }

   /**
   * Get polylineFormat
   * @return polylineFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PolylineFormat getPolylineFormat() {
    return polylineFormat;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
  }


  public Options allowedCountries(List<String> allowedCountries) {
    this.allowedCountries = JsonNullable.<List<String>>of(allowedCountries);
    return this;
  }

  public Options addAllowedCountriesItem(String allowedCountriesItem) {
    if (this.allowedCountries == null || !this.allowedCountries.isPresent()) {
      this.allowedCountries = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.allowedCountries.get().add(allowedCountriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return allowedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonIgnore

  public List<String> getAllowedCountries() {
        return allowedCountries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getAllowedCountries_JsonNullable() {
    return allowedCountries;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  public void setAllowedCountries_JsonNullable(JsonNullable<List<String>> allowedCountries) {
    this.allowedCountries = allowedCountries;
  }

  public void setAllowedCountries(List<String> allowedCountries) {
    this.allowedCountries = JsonNullable.<List<String>>of(allowedCountries);
  }


  public Options prohibitedCountries(List<String> prohibitedCountries) {
    this.prohibitedCountries = JsonNullable.<List<String>>of(prohibitedCountries);
    return this;
  }

  public Options addProhibitedCountriesItem(String prohibitedCountriesItem) {
    if (this.prohibitedCountries == null || !this.prohibitedCountries.isPresent()) {
      this.prohibitedCountries = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.prohibitedCountries.get().add(prohibitedCountriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return prohibitedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonIgnore

  public List<String> getProhibitedCountries() {
        return prohibitedCountries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getProhibitedCountries_JsonNullable() {
    return prohibitedCountries;
  }
  
  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  public void setProhibitedCountries_JsonNullable(JsonNullable<List<String>> prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
  }

  public void setProhibitedCountries(List<String> prohibitedCountries) {
    this.prohibitedCountries = JsonNullable.<List<String>>of(prohibitedCountries);
  }


  public Options currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]&#x3D;MONETARY**.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]=MONETARY**.")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  public Options preferTurnsOnPassengerSide(Boolean preferTurnsOnPassengerSide) {
    this.preferTurnsOnPassengerSide = preferTurnsOnPassengerSide;
    return this;
  }

   /**
   * Specifies that the route is constructed such that turns to the passenger side are preferred. 
   * @return preferTurnsOnPassengerSide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies that the route is constructed such that turns to the passenger side are preferred. ")
  @JsonProperty(JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreferTurnsOnPassengerSide() {
    return preferTurnsOnPassengerSide;
  }


  @JsonProperty(JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferTurnsOnPassengerSide(Boolean preferTurnsOnPassengerSide) {
    this.preferTurnsOnPassengerSide = preferTurnsOnPassengerSide;
  }


  public Options avoid(List<AvoidFeature> avoid) {
    this.avoid = JsonNullable.<List<AvoidFeature>>of(avoid);
    return this;
  }

  public Options addAvoidItem(AvoidFeature avoidItem) {
    if (this.avoid == null || !this.avoid.isPresent()) {
      this.avoid = JsonNullable.<List<AvoidFeature>>of(new ArrayList<>());
    }
    try {
      this.avoid.get().add(avoidItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise. * &#x60;TOLL&#x60; - Avoid roads with toll. * &#x60;FERRIES&#x60; - Avoid ferries. Ferries which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;BOAT&#x60;. * &#x60;RAIL_SHUTTLES&#x60; - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with &#x60;COMBINED_TRANSPORT_EVENTS&#x60; and will appear with the type &#x60;RAIL&#x60;.   Cannot be used with **options[routingMode]&#x3D;MONETARY**.
   * @return avoid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise. * `TOLL` - Avoid roads with toll. * `FERRIES` - Avoid ferries. Ferries which cannot be avoided can be requested with `COMBINED_TRANSPORT_EVENTS` and will appear with the type `BOAT`. * `RAIL_SHUTTLES` - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with `COMBINED_TRANSPORT_EVENTS` and will appear with the type `RAIL`.   Cannot be used with **options[routingMode]=MONETARY**.")
  @JsonIgnore

  public List<AvoidFeature> getAvoid() {
        return avoid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AvoidFeature>> getAvoid_JsonNullable() {
    return avoid;
  }
  
  @JsonProperty(JSON_PROPERTY_AVOID)
  public void setAvoid_JsonNullable(JsonNullable<List<AvoidFeature>> avoid) {
    this.avoid = avoid;
  }

  public void setAvoid(List<AvoidFeature> avoid) {
    this.avoid = JsonNullable.<List<AvoidFeature>>of(avoid);
  }


  public Options blockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = JsonNullable.<String>of(blockIntersectingRoads);
    return this;
  }

   /**
   * Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine. If they have to be used to connect two waypoints then the route will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
   * @return blockIntersectingRoads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49.8,9.9,49.9,10|33.1,-111.1,33.0,-111.2", value = "Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked by the routing engine. If they have to be used to connect two waypoints then the route will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested.   Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma.   Format: `<poly1_lat1>,<poly1_lon1>,...,<poly1_latN>,<poly1_lonN>|<poly2_lat1>,<poly2_lon1>,...,<poly2_latN>,<poly2_lonN>|...`   Notes: * Be aware of the URL length restrictions. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * contains invalid coordinates or   * intersects more than 5000 road segments. ")
  @JsonIgnore

  public String getBlockIntersectingRoads() {
        return blockIntersectingRoads.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBlockIntersectingRoads_JsonNullable() {
    return blockIntersectingRoads;
  }
  
  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  public void setBlockIntersectingRoads_JsonNullable(JsonNullable<String> blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
  }

  public void setBlockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = JsonNullable.<String>of(blockIntersectingRoads);
  }


  public Options routingMode(RoutingMode routingMode) {
    this.routingMode = routingMode;
    return this;
  }

   /**
   * Get routingMode
   * @return routingMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUTING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoutingMode getRoutingMode() {
    return routingMode;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingMode(RoutingMode routingMode) {
    this.routingMode = routingMode;
  }


  /**
   * Return true if this Options object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return equalsNullable(this.startTime, options.startTime) &&
        equalsNullable(this.arrivalTime, options.arrivalTime) &&
        Objects.equals(this.trafficMode, options.trafficMode) &&
        Objects.equals(this.language, options.language) &&
        Objects.equals(this.polylineFormat, options.polylineFormat) &&
        equalsNullable(this.allowedCountries, options.allowedCountries) &&
        equalsNullable(this.prohibitedCountries, options.prohibitedCountries) &&
        equalsNullable(this.currency, options.currency) &&
        Objects.equals(this.preferTurnsOnPassengerSide, options.preferTurnsOnPassengerSide) &&
        equalsNullable(this.avoid, options.avoid) &&
        equalsNullable(this.blockIntersectingRoads, options.blockIntersectingRoads) &&
        Objects.equals(this.routingMode, options.routingMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startTime), hashCodeNullable(arrivalTime), trafficMode, language, polylineFormat, hashCodeNullable(allowedCountries), hashCodeNullable(prohibitedCountries), hashCodeNullable(currency), preferTurnsOnPassengerSide, hashCodeNullable(avoid), hashCodeNullable(blockIntersectingRoads), routingMode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    trafficMode: ").append(toIndentedString(trafficMode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    polylineFormat: ").append(toIndentedString(polylineFormat)).append("\n");
    sb.append("    allowedCountries: ").append(toIndentedString(allowedCountries)).append("\n");
    sb.append("    prohibitedCountries: ").append(toIndentedString(prohibitedCountries)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    preferTurnsOnPassengerSide: ").append(toIndentedString(preferTurnsOnPassengerSide)).append("\n");
    sb.append("    avoid: ").append(toIndentedString(avoid)).append("\n");
    sb.append("    blockIntersectingRoads: ").append(toIndentedString(blockIntersectingRoads)).append("\n");
    sb.append("    routingMode: ").append(toIndentedString(routingMode)).append("\n");
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

