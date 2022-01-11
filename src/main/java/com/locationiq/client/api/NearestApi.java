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
import com.locationiq.client.model.DirectionsNearest;

import java.lang.reflect.Type;
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

public class NearestApi {
    private ApiClient localVarApiClient;

    public NearestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NearestApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for nearest
     * @param coordinates String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 (required)
     * @param generateHints Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String (optional)
     * @param exclude Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. (optional)
     * @param bearings Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 (optional)
     * @param radiuses Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) (optional)
     * @param approaches Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) (optional)
     * @param number Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] (optional)
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
    public okhttp3.Call nearestCall(String coordinates, String generateHints, String exclude, String bearings, String radiuses, String approaches, Integer number, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/nearest/driving/{coordinates}"
            .replaceAll("\\{" + "coordinates" + "\\}", localVarApiClient.escapeString(coordinates.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (generateHints != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("generate_hints", generateHints));
        }

        if (exclude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exclude", exclude));
        }

        if (bearings != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bearings", bearings));
        }

        if (radiuses != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("radiuses", radiuses));
        }

        if (approaches != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("approaches", approaches));
        }

        if (number != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("number", number));
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
    private okhttp3.Call nearestValidateBeforeCall(String coordinates, String generateHints, String exclude, String bearings, String radiuses, String approaches, Integer number, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'coordinates' is set
        if (coordinates == null) {
            throw new ApiException("Missing the required parameter 'coordinates' when calling nearest(Async)");
        }
        

        okhttp3.Call localVarCall = nearestCall(coordinates, generateHints, exclude, bearings, radiuses, approaches, number, _callback);
        return localVarCall;

    }

    /**
     * Nearest Service
     * Snaps a coordinate to the street network and returns the nearest n matches. Where coordinates only supports a single {longitude},{latitude} entry.
     * @param coordinates String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 (required)
     * @param generateHints Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String (optional)
     * @param exclude Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. (optional)
     * @param bearings Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 (optional)
     * @param radiuses Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) (optional)
     * @param approaches Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) (optional)
     * @param number Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] (optional)
     * @return DirectionsNearest
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
    public DirectionsNearest nearest(String coordinates, String generateHints, String exclude, String bearings, String radiuses, String approaches, Integer number) throws ApiException {
        ApiResponse<DirectionsNearest> localVarResp = nearestWithHttpInfo(coordinates, generateHints, exclude, bearings, radiuses, approaches, number);
        return localVarResp.getData();
    }

    /**
     * Nearest Service
     * Snaps a coordinate to the street network and returns the nearest n matches. Where coordinates only supports a single {longitude},{latitude} entry.
     * @param coordinates String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 (required)
     * @param generateHints Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String (optional)
     * @param exclude Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. (optional)
     * @param bearings Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 (optional)
     * @param radiuses Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) (optional)
     * @param approaches Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) (optional)
     * @param number Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] (optional)
     * @return ApiResponse&lt;DirectionsNearest&gt;
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
    public ApiResponse<DirectionsNearest> nearestWithHttpInfo(String coordinates, String generateHints, String exclude, String bearings, String radiuses, String approaches, Integer number) throws ApiException {
        okhttp3.Call localVarCall = nearestValidateBeforeCall(coordinates, generateHints, exclude, bearings, radiuses, approaches, number, null);
        Type localVarReturnType = new TypeToken<DirectionsNearest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Nearest Service (asynchronously)
     * Snaps a coordinate to the street network and returns the nearest n matches. Where coordinates only supports a single {longitude},{latitude} entry.
     * @param coordinates String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 (required)
     * @param generateHints Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String (optional)
     * @param exclude Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. (optional)
     * @param bearings Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 (optional)
     * @param radiuses Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) (optional)
     * @param approaches Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) (optional)
     * @param number Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] (optional)
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
    public okhttp3.Call nearestAsync(String coordinates, String generateHints, String exclude, String bearings, String radiuses, String approaches, Integer number, final ApiCallback<DirectionsNearest> _callback) throws ApiException {

        okhttp3.Call localVarCall = nearestValidateBeforeCall(coordinates, generateHints, exclude, bearings, radiuses, approaches, number, _callback);
        Type localVarReturnType = new TypeToken<DirectionsNearest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
