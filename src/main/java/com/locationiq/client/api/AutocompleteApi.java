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
import com.locationiq.client.model.AutocompleteLocation;

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

public class AutocompleteApi {
    private ApiClient localVarApiClient;

    public AutocompleteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AutocompleteApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for autocomplete
     * @param q Address to geocode (required)
     * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. (required)
     * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
     * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
     * @param bounded Restrict the results to only items contained with the viewbox (optional)
     * @param countrycodes Limit search to a list of countries. (optional)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param tag Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place (optional)
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
    public okhttp3.Call autocompleteCall(String q, Integer normalizecity, Integer limit, String viewbox, Integer bounded, String countrycodes, String acceptLanguage, String tag, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/autocomplete.php";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (viewbox != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("viewbox", viewbox));
        }

        if (bounded != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bounded", bounded));
        }

        if (countrycodes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countrycodes", countrycodes));
        }

        if (normalizecity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("normalizecity", normalizecity));
        }

        if (acceptLanguage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accept-language", acceptLanguage));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
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
    private okhttp3.Call autocompleteValidateBeforeCall(String q, Integer normalizecity, Integer limit, String viewbox, Integer bounded, String countrycodes, String acceptLanguage, String tag, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling autocomplete(Async)");
        }
        
        // verify the required parameter 'normalizecity' is set
        if (normalizecity == null) {
            throw new ApiException("Missing the required parameter 'normalizecity' when calling autocomplete(Async)");
        }
        

        okhttp3.Call localVarCall = autocompleteCall(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag, _callback);
        return localVarCall;

    }

    /**
     * 
     * The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.
     * @param q Address to geocode (required)
     * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. (required)
     * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
     * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
     * @param bounded Restrict the results to only items contained with the viewbox (optional)
     * @param countrycodes Limit search to a list of countries. (optional)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param tag Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place (optional)
     * @return List&lt;AutocompleteLocation&gt;
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
    public List<AutocompleteLocation> autocomplete(String q, Integer normalizecity, Integer limit, String viewbox, Integer bounded, String countrycodes, String acceptLanguage, String tag) throws ApiException {
        ApiResponse<List<AutocompleteLocation>> localVarResp = autocompleteWithHttpInfo(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag);
        return localVarResp.getData();
    }

    /**
     * 
     * The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.
     * @param q Address to geocode (required)
     * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. (required)
     * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
     * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
     * @param bounded Restrict the results to only items contained with the viewbox (optional)
     * @param countrycodes Limit search to a list of countries. (optional)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param tag Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place (optional)
     * @return ApiResponse&lt;List&lt;AutocompleteLocation&gt;&gt;
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
    public ApiResponse<List<AutocompleteLocation>> autocompleteWithHttpInfo(String q, Integer normalizecity, Integer limit, String viewbox, Integer bounded, String countrycodes, String acceptLanguage, String tag) throws ApiException {
        okhttp3.Call localVarCall = autocompleteValidateBeforeCall(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag, null);
        Type localVarReturnType = new TypeToken<List<AutocompleteLocation>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.
     * @param q Address to geocode (required)
     * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. (required)
     * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
     * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
     * @param bounded Restrict the results to only items contained with the viewbox (optional)
     * @param countrycodes Limit search to a list of countries. (optional)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param tag Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place (optional)
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
    public okhttp3.Call autocompleteAsync(String q, Integer normalizecity, Integer limit, String viewbox, Integer bounded, String countrycodes, String acceptLanguage, String tag, final ApiCallback<List<AutocompleteLocation>> _callback) throws ApiException {

        okhttp3.Call localVarCall = autocompleteValidateBeforeCall(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag, _callback);
        Type localVarReturnType = new TypeToken<List<AutocompleteLocation>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
