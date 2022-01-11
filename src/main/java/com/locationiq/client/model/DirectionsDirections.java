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


package com.locationiq.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * DirectionsDirections
 */

public class DirectionsDirections {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_WAYPOINTS = "waypoints";
  @SerializedName(SERIALIZED_NAME_WAYPOINTS)
  private List<Object> waypoints = null;

  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<DirectionsDirectionsRoutes> routes = null;


  public DirectionsDirections code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public DirectionsDirections waypoints(List<Object> waypoints) {
    
    this.waypoints = waypoints;
    return this;
  }

  public DirectionsDirections addWaypointsItem(Object waypointsItem) {
    if (this.waypoints == null) {
      this.waypoints = new ArrayList<Object>();
    }
    this.waypoints.add(waypointsItem);
    return this;
  }

   /**
   * Get waypoints
   * @return waypoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getWaypoints() {
    return waypoints;
  }


  public void setWaypoints(List<Object> waypoints) {
    this.waypoints = waypoints;
  }


  public DirectionsDirections routes(List<DirectionsDirectionsRoutes> routes) {
    
    this.routes = routes;
    return this;
  }

  public DirectionsDirections addRoutesItem(DirectionsDirectionsRoutes routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<DirectionsDirectionsRoutes>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DirectionsDirectionsRoutes> getRoutes() {
    return routes;
  }


  public void setRoutes(List<DirectionsDirectionsRoutes> routes) {
    this.routes = routes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectionsDirections directionsDirections = (DirectionsDirections) o;
    return Objects.equals(this.code, directionsDirections.code) &&
        Objects.equals(this.waypoints, directionsDirections.waypoints) &&
        Objects.equals(this.routes, directionsDirections.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, waypoints, routes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectionsDirections {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

