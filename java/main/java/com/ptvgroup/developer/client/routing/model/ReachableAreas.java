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
import com.ptvgroup.developer.client.routing.model.Warning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The result of the reachable areas calculation.
 */
@JsonPropertyOrder({
  ReachableAreas.JSON_PROPERTY_POLYGONS,
  ReachableAreas.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T09:18:49.935887368Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReachableAreas {
  public static final String JSON_PROPERTY_POLYGONS = "polygons";
  private List<String> polygons = new ArrayList<>();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = new ArrayList<>();

  public ReachableAreas() { 
  }

  public ReachableAreas polygons(List<String> polygons) {
    this.polygons = polygons;
    return this;
  }

  public ReachableAreas addPolygonsItem(String polygonsItem) {
    if (this.polygons == null) {
      this.polygons = new ArrayList<>();
    }
    this.polygons.add(polygonsItem);
    return this;
  }

  /**
   * The list of polygons calculated for the specified horizons in GeoJson format. For each horizon there is a separate polygon at the same index.
   * @return polygons
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POLYGONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPolygons() {
    return polygons;
  }


  @JsonProperty(JSON_PROPERTY_POLYGONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPolygons(List<String> polygons) {
    this.polygons = polygons;
  }


  public ReachableAreas warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ReachableAreas addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Warning> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this ReachableAreas object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableAreas reachableAreas = (ReachableAreas) o;
    return Objects.equals(this.polygons, reachableAreas.polygons) &&
        Objects.equals(this.warnings, reachableAreas.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polygons, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableAreas {\n");
    sb.append("    polygons: ").append(toIndentedString(polygons)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

    // add `polygons` to the URL query string
    if (getPolygons() != null) {
      for (int i = 0; i < getPolygons().size(); i++) {
        joiner.add(String.format("%spolygons%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getPolygons().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        if (getWarnings().get(i) != null) {
          joiner.add(getWarnings().get(i).toUrlQueryString(String.format("%swarnings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

