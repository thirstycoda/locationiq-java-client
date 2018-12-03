/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.api;

import LocationIq.ApiCallback;
import LocationIq.ApiClient;
import LocationIq.ApiException;
import LocationIq.ApiResponse;
import LocationIq.Configuration;
import LocationIq.Pair;
import LocationIq.ProgressRequestBody;
import LocationIq.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import com.locationiq.client.model.Error;
import com.locationiq.client.model.Location;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseApi {
    private ApiClient apiClient;

    public ReverseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReverseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for reverse
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reverseCall(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/reverse.php";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lat", lat));
        if (lon != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lon", lon));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (normalizecity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("normalizecity", normalizecity));
        if (addressdetails != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addressdetails", addressdetails));
        if (acceptLanguage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accept-language", acceptLanguage));
        if (namedetails != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("namedetails", namedetails));
        if (extratags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("extratags", extratags));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call reverseValidateBeforeCall(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling reverse(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling reverse(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling reverse(Async)");
        }
        
        // verify the required parameter 'normalizecity' is set
        if (normalizecity == null) {
            throw new ApiException("Missing the required parameter 'normalizecity' when calling reverse(Async)");
        }
        

        com.squareup.okhttp.Call call = reverseCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @return Location
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Location reverse(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags) throws ApiException {
        ApiResponse<Location> resp = reverseWithHttpInfo(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags);
        return resp.getData();
    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @return ApiResponse&lt;Location&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Location> reverseWithHttpInfo(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags) throws ApiException {
        com.squareup.okhttp.Call call = reverseValidateBeforeCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, null, null);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reverse Geocoding (asynchronously)
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reverseAsync(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, final ApiCallback<Location> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = reverseValidateBeforeCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}