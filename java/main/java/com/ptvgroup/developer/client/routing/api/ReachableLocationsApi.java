/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ptvgroup.developer.client.routing.api;

import com.ptvgroup.developer.client.routing.ApiClient;
import com.ptvgroup.developer.client.routing.ApiException;
import com.ptvgroup.developer.client.routing.ApiResponse;
import com.ptvgroup.developer.client.routing.Pair;

import com.ptvgroup.developer.client.routing.model.ErrorResponse;
import com.ptvgroup.developer.client.routing.model.HorizonType;
import com.ptvgroup.developer.client.routing.model.Locations;
import com.ptvgroup.developer.client.routing.model.ReachableLocationsId;
import com.ptvgroup.developer.client.routing.model.ReachableLocationsResponse;
import com.ptvgroup.developer.client.routing.model.ReachableOptions;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T09:57:52.401871Z[Etc/UTC]")
public class ReachableLocationsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ReachableLocationsApi() {
    this(new ApiClient());
  }

  public ReachableLocationsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Cancels a reachable locations calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of the calculated reachable locations. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReachableLocations(UUID id) throws ApiException {
    deleteReachableLocationsWithHttpInfo(id);
  }

  /**
   * 
   * Cancels a reachable locations calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of the calculated reachable locations. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteReachableLocationsWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteReachableLocationsRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteReachableLocations", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteReachableLocationsRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteReachableLocations");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/reachable-locations/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Gets the results of a reachable locations calculation specified by its ID.
   * @param id The ID of the calculated reachable locations. (required)
   * @return ReachableLocationsResponse
   * @throws ApiException if fails to make API call
   */
  public ReachableLocationsResponse getReachableLocations(UUID id) throws ApiException {
    ApiResponse<ReachableLocationsResponse> localVarResponse = getReachableLocationsWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * 
   * Gets the results of a reachable locations calculation specified by its ID.
   * @param id The ID of the calculated reachable locations. (required)
   * @return ApiResponse&lt;ReachableLocationsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReachableLocationsResponse> getReachableLocationsWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getReachableLocationsRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getReachableLocations", localVarResponse);
        }
        return new ApiResponse<ReachableLocationsResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ReachableLocationsResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getReachableLocationsRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getReachableLocations");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/reachable-locations/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Starts the calculation of the sets of reachable and unreachable locations from the given ones and creates them as the result.
   * @param horizon The distance [m] or travel time [s] of the horizons, depending of the **horizonType** (limited to 100 km or 1 hours). (required)
   * @param locations  (required)
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (optional)
   * @param routeId Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/waypoints). (optional)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ReachableLocationsId
   * @throws ApiException if fails to make API call
   */
  public ReachableLocationsId startAndCreateReachableLocations(Integer horizon, Locations locations, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    ApiResponse<ReachableLocationsId> localVarResponse = startAndCreateReachableLocationsWithHttpInfo(horizon, locations, waypoint, routeId, profile, horizonType, options);
    return localVarResponse.getData();
  }

  /**
   * 
   * Starts the calculation of the sets of reachable and unreachable locations from the given ones and creates them as the result.
   * @param horizon The distance [m] or travel time [s] of the horizons, depending of the **horizonType** (limited to 100 km or 1 hours). (required)
   * @param locations  (required)
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (optional)
   * @param routeId Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/waypoints). (optional)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ApiResponse&lt;ReachableLocationsId&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReachableLocationsId> startAndCreateReachableLocationsWithHttpInfo(Integer horizon, Locations locations, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = startAndCreateReachableLocationsRequestBuilder(horizon, locations, waypoint, routeId, profile, horizonType, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("startAndCreateReachableLocations", localVarResponse);
        }
        return new ApiResponse<ReachableLocationsId>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ReachableLocationsId>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder startAndCreateReachableLocationsRequestBuilder(Integer horizon, Locations locations, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    // verify the required parameter 'horizon' is set
    if (horizon == null) {
      throw new ApiException(400, "Missing the required parameter 'horizon' when calling startAndCreateReachableLocations");
    }
    // verify the required parameter 'locations' is set
    if (locations == null) {
      throw new ApiException(400, "Missing the required parameter 'locations' when calling startAndCreateReachableLocations");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/reachable-locations";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "waypoint";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("waypoint", waypoint));
    localVarQueryParameterBaseName = "routeId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("routeId", routeId));
    localVarQueryParameterBaseName = "profile";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    localVarQueryParameterBaseName = "horizon";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("horizon", horizon));
    localVarQueryParameterBaseName = "horizonType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("horizonType", horizonType));
    localVarQueryParameterBaseName = "options";
    if (options != null) {
      String queryString = options.toUrlQueryString("options");
      if (!queryString.isBlank()) {
        localVarQueryStringJoiner.add(queryString);
      }
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(locations);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
