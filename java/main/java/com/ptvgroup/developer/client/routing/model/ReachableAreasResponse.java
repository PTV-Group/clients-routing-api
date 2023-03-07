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
import com.ptvgroup.developer.client.routing.model.CalculationStatus;
import com.ptvgroup.developer.client.routing.model.ErrorResponse;
import com.ptvgroup.developer.client.routing.model.ReachableAreas;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReachableAreasResponse
 */
@JsonPropertyOrder({
  ReachableAreasResponse.JSON_PROPERTY_STATUS,
  ReachableAreasResponse.JSON_PROPERTY_REACHABLE_AREAS,
  ReachableAreasResponse.JSON_PROPERTY_ERROR
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T09:48:51.311424Z[Etc/UTC]")
public class ReachableAreasResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private CalculationStatus status;

  public static final String JSON_PROPERTY_REACHABLE_AREAS = "reachableAreas";
  private ReachableAreas reachableAreas;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ErrorResponse error;

  public ReachableAreasResponse() { 
  }

  public ReachableAreasResponse status(CalculationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CalculationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(CalculationStatus status) {
    this.status = status;
  }


  public ReachableAreasResponse reachableAreas(ReachableAreas reachableAreas) {
    this.reachableAreas = reachableAreas;
    return this;
  }

   /**
   * Get reachableAreas
   * @return reachableAreas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REACHABLE_AREAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReachableAreas getReachableAreas() {
    return reachableAreas;
  }


  @JsonProperty(JSON_PROPERTY_REACHABLE_AREAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachableAreas(ReachableAreas reachableAreas) {
    this.reachableAreas = reachableAreas;
  }


  public ReachableAreasResponse error(ErrorResponse error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorResponse getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(ErrorResponse error) {
    this.error = error;
  }


  /**
   * Return true if this ReachableAreasResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableAreasResponse reachableAreasResponse = (ReachableAreasResponse) o;
    return Objects.equals(this.status, reachableAreasResponse.status) &&
        Objects.equals(this.reachableAreas, reachableAreasResponse.reachableAreas) &&
        Objects.equals(this.error, reachableAreasResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reachableAreas, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableAreasResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reachableAreas: ").append(toIndentedString(reachableAreas)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

