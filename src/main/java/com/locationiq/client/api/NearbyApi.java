/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.api;

import com.google.gson.reflect.TypeToken;
import com.locationiq.client.model.NearbyLocation;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LocationIq.ApiCallback;
import LocationIq.ApiClient;
import LocationIq.ApiException;
import LocationIq.ApiResponse;
import LocationIq.Configuration;
import LocationIq.Pair;

public class NearbyApi {
    private ApiClient localVarApiClient;

    public NearbyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NearbyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for reverse
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param tag You can use a tag to restrict your results on the Nearby API. We support two types of tags, a single-word format for common use-cases and key-value pairs for advanced use-cases
     * @param radius Radius (in meters) from the given latitude and longitude to search for results in. Accepted value: 1 to 30000. Defaults to 100
     * @param limit Limit the number of returned results. Accepted value: 1 to 50. Defaults to 10
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nearbyCall(
            BigDecimal lat,
            BigDecimal lon,
            String tag,
            Integer radius,
            Integer limit,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/nearby.php";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
        }

        if (radius != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("radius", radius));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call nearbyValidateBeforeCall(BigDecimal lat,
                                                   BigDecimal lon,
                                                   String tag,
                                                   Integer radius,
                                                   Integer limit,
                                                   final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling nearby(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling nearby(Async)");
        }
        
        // verify the parameter 'radius'
        if (radius != null && (radius < 1 || radius > 30000)) {
            throw new ApiException("Radius must be between 1 and 30,000");
        }

        if (limit != null && (limit < 1 || limit > 50)) {
            throw new ApiException("Limit must be between 1 and 50");
        }

        okhttp3.Call localVarCall = nearbyCall(lat, lon, tag, radius, limit, _callback);
        return localVarCall;

    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param tag You can use a tag to restrict your results on the Nearby API. We support two types of tags, a single-word format for common use-cases and key-value pairs for advanced use-cases
     * @param radius Radius (in meters) from the given latitude and longitude to search for results in. Accepted value: 1 to 30000. Defaults to 100
     * @param limit Limit the number of returned results. Accepted value: 1 to 50. Defaults to 10
     * @return List&lt;NearbyLocation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<NearbyLocation> nearby(BigDecimal lat,
                                 BigDecimal lon,
                                 String tag,
                                 Integer radius,
                                 Integer limit) throws ApiException {
        ApiResponse<List<NearbyLocation>> localVarResp = nearbyWithHttpInfo(lat, lon, tag, radius, limit);
        return localVarResp.getData();
    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param tag You can use a tag to restrict your results on the Nearby API. We support two types of tags, a single-word format for common use-cases and key-value pairs for advanced use-cases
     * @param radius Radius (in meters) from the given latitude and longitude to search for results in. Accepted value: 1 to 30000. Defaults to 100
     * @param limit Limit the number of returned results. Accepted value: 1 to 50. Defaults to 10
     * @return ApiResponse&lt;List&lt;NearbyLocation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<NearbyLocation>> nearbyWithHttpInfo(BigDecimal lat,
                                                          BigDecimal lon,
                                                          String tag,
                                                          Integer radius,
                                                          Integer limit) throws ApiException {
        okhttp3.Call localVarCall = nearbyValidateBeforeCall(lat, lon, tag, radius, limit, null);
        Type localVarReturnType = new TypeToken<List<NearbyLocation>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Reverse Geocoding (asynchronously)
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param tag You can use a tag to restrict your results on the Nearby API. We support two types of tags, a single-word format for common use-cases and key-value pairs for advanced use-cases
     * @param radius Radius (in meters) from the given latitude and longitude to search for results in. Accepted value: 1 to 30000. Defaults to 100
     * @param limit Limit the number of returned results. Accepted value: 1 to 50. Defaults to 10
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nearbyAsync(BigDecimal lat,
                                     BigDecimal lon,
                                     String tag,
                                     Integer radius,
                                     Integer limit,
                                     final ApiCallback<List<NearbyLocation>> _callback) throws ApiException {

        okhttp3.Call localVarCall = nearbyValidateBeforeCall(lat, lon, tag, radius, limit, _callback);
        Type localVarReturnType = new TypeToken<List<NearbyLocation>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
