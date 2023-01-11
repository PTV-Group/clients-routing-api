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
import com.ptvgroup.developer.client.routing.model.TollRoadType;
import com.ptvgroup.developer.client.routing.model.TollSectionCost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TollSection
 */
@JsonPropertyOrder({
  TollSection.JSON_PROPERTY_COSTS,
  TollSection.JSON_PROPERTY_TOLL_ROAD_TYPE,
  TollSection.JSON_PROPERTY_TOLL_SYSTEM_INDEX,
  TollSection.JSON_PROPERTY_COUNTRY_CODE,
  TollSection.JSON_PROPERTY_DISPLAY_NAME,
  TollSection.JSON_PROPERTY_OFFICIAL_DISTANCE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T11:43:48.792943Z[Etc/UTC]")
public class TollSection {
  public static final String JSON_PROPERTY_COSTS = "costs";
  private List<TollSectionCost> costs = new ArrayList<>();

  public static final String JSON_PROPERTY_TOLL_ROAD_TYPE = "tollRoadType";
  private TollRoadType tollRoadType;

  public static final String JSON_PROPERTY_TOLL_SYSTEM_INDEX = "tollSystemIndex";
  private Integer tollSystemIndex;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_OFFICIAL_DISTANCE = "officialDistance";
  private Integer officialDistance;

  public TollSection() { 
  }

  public TollSection costs(List<TollSectionCost> costs) {
    this.costs = costs;
    return this;
  }

  public TollSection addCostsItem(TollSectionCost costsItem) {
    this.costs.add(costsItem);
    return this;
  }

   /**
   * The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price. The first item contains the price used to calculate the total toll costs for the route. Further items are alternative costs for the section with different payment methods or different subscriptions.
   * @return costs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price. The first item contains the price used to calculate the total toll costs for the route. Further items are alternative costs for the section with different payment methods or different subscriptions.")
  @JsonProperty(JSON_PROPERTY_COSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TollSectionCost> getCosts() {
    return costs;
  }


  @JsonProperty(JSON_PROPERTY_COSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCosts(List<TollSectionCost> costs) {
    this.costs = costs;
  }


  public TollSection tollRoadType(TollRoadType tollRoadType) {
    this.tollRoadType = tollRoadType;
    return this;
  }

   /**
   * Get tollRoadType
   * @return tollRoadType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOLL_ROAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TollRoadType getTollRoadType() {
    return tollRoadType;
  }


  @JsonProperty(JSON_PROPERTY_TOLL_ROAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTollRoadType(TollRoadType tollRoadType) {
    this.tollRoadType = tollRoadType;
  }


  public TollSection tollSystemIndex(Integer tollSystemIndex) {
    this.tollSystemIndex = tollSystemIndex;
    return this;
  }

   /**
   * The index in the list of toll systems this toll section belongs to.
   * minimum: 0
   * @return tollSystemIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index in the list of toll systems this toll section belongs to.")
  @JsonProperty(JSON_PROPERTY_TOLL_SYSTEM_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTollSystemIndex() {
    return tollSystemIndex;
  }


  @JsonProperty(JSON_PROPERTY_TOLL_SYSTEM_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTollSystemIndex(Integer tollSystemIndex) {
    this.tollSystemIndex = tollSystemIndex;
  }


  public TollSection countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public TollSection displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TollSection officialDistance(Integer officialDistance) {
    this.officialDistance = officialDistance;
    return this;
  }

   /**
   * The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance.
   * minimum: 0
   * @return officialDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "142", value = "The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance.")
  @JsonProperty(JSON_PROPERTY_OFFICIAL_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOfficialDistance() {
    return officialDistance;
  }


  @JsonProperty(JSON_PROPERTY_OFFICIAL_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfficialDistance(Integer officialDistance) {
    this.officialDistance = officialDistance;
  }


  /**
   * Return true if this TollSection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollSection tollSection = (TollSection) o;
    return Objects.equals(this.costs, tollSection.costs) &&
        Objects.equals(this.tollRoadType, tollSection.tollRoadType) &&
        Objects.equals(this.tollSystemIndex, tollSection.tollSystemIndex) &&
        Objects.equals(this.countryCode, tollSection.countryCode) &&
        Objects.equals(this.displayName, tollSection.displayName) &&
        Objects.equals(this.officialDistance, tollSection.officialDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, tollRoadType, tollSystemIndex, countryCode, displayName, officialDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollSection {\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    tollRoadType: ").append(toIndentedString(tollRoadType)).append("\n");
    sb.append("    tollSystemIndex: ").append(toIndentedString(tollSystemIndex)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    officialDistance: ").append(toIndentedString(officialDistance)).append("\n");
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

