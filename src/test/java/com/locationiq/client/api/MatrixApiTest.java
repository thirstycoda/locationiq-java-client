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

import com.locationiq.client.model.DirectionsMatrix;

import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import LocationIq.ApiException;

/**
 * API tests for MatrixApi
 */
@Ignore
public class MatrixApiTest {

    private final MatrixApi api = new MatrixApi();

    
    /**
     * Matrix Service
     *
     * Computes duration of the fastest route between all pairs of supplied coordinates. Returns the durations or distances or both between the coordinate pairs. Note that the distances are not the shortest distance between two coordinates, but rather the distances of the fastest routes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matrixTest() throws ApiException {
        String coordinates = null;
        String bearings = null;
        String radiuses = null;
        String generateHints = null;
        String approaches = null;
        String exclude = null;
        String annotations = null;
        Integer sources = null;
        Integer destinations = null;
        BigDecimal fallbackSpeed = null;
        String fallbackCoordinate = null;
        DirectionsMatrix response = api.matrix(coordinates, bearings, radiuses, generateHints, approaches, exclude, annotations, sources, destinations, fallbackSpeed, fallbackCoordinate);

        // TODO: test validations
    }
    
}
