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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when the offset to UTC changes, mostly when traveling into a different time zone. Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.    Changing the UTC offset does not necessarily mean to change the time zone. Vice-versa changing the time zone does not necessarily mean to change the UTC offset. There are some special cases to consider.  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST   so that the neighboring time zone has the same UTC offset in summer.
 */
@ApiModel(description = "Issued when the offset to UTC changes, mostly when traveling into a different time zone. Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.    Changing the UTC offset does not necessarily mean to change the time zone. Vice-versa changing the time zone does not necessarily mean to change the UTC offset. There are some special cases to consider.  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST   so that the neighboring time zone has the same UTC offset in summer.")
@JsonPropertyOrder({
  UTCOffsetChangeEvent.JSON_PROPERTY_UTC_OFFSET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T09:48:51.311424Z[Etc/UTC]")
public class UTCOffsetChangeEvent {
  public static final String JSON_PROPERTY_UTC_OFFSET = "utcOffset";
  private Integer utcOffset;

  public UTCOffsetChangeEvent() { 
  }

  public UTCOffsetChangeEvent utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * The new UTC offset [min].
   * minimum: -720
   * maximum: 840
   * @return utcOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The new UTC offset [min].")
  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUtcOffset() {
    return utcOffset;
  }


  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }


  /**
   * Return true if this UTCOffsetChangeEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UTCOffsetChangeEvent utCOffsetChangeEvent = (UTCOffsetChangeEvent) o;
    return Objects.equals(this.utcOffset, utCOffsetChangeEvent.utcOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTCOffsetChangeEvent {\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
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

