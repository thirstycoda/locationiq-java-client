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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * DirectionsMatrix
 */

public class DirectionsMatrix {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISTANCES = "distances";
  @SerializedName(SERIALIZED_NAME_DISTANCES)
  private List<List<BigDecimal>> distances = null;

  public static final String SERIALIZED_NAME_DURATIONS = "durations";
  @SerializedName(SERIALIZED_NAME_DURATIONS)
  private List<List<BigDecimal>> durations = null;

  public static final String SERIALIZED_NAME_FALLBACK_SPEED_CELLS = "fallback_speed_cells";
  @SerializedName(SERIALIZED_NAME_FALLBACK_SPEED_CELLS)
  private List<BigDecimal> fallbackSpeedCells = null;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<DirectionsMatrixSources> sources = null;

  public static final String SERIALIZED_NAME_DESTINATIONS = "destinations";
  @SerializedName(SERIALIZED_NAME_DESTINATIONS)
  private List<DirectionsMatrixSources> destinations = null;


  public DirectionsMatrix code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public DirectionsMatrix distances(List<List<BigDecimal>> distances) {
    
    this.distances = distances;
    return this;
  }

  public DirectionsMatrix addDistancesItem(List<BigDecimal> distancesItem) {
    if (this.distances == null) {
      this.distances = new ArrayList<>();
    }
    this.distances.add(distancesItem);
    return this;
  }

   /**
   * Get distances
   * @return distances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public List<List<BigDecimal>> getDistances() {
    return distances;
  }


  public void setDistances(List<List<BigDecimal>> distances) {
    this.distances = distances;
  }


  public DirectionsMatrix durations(List<List<BigDecimal>> durations) {

    this.durations = durations;
    return this;
  }

  public DirectionsMatrix addDurationsItem(List<BigDecimal> durationsItem) {
    if (this.durations == null) {
      this.durations = new ArrayList<>();
    }
    this.durations.add(durationsItem);
    return this;
  }

  /**
   * Get distances
   * @return distances
   **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public List<List<BigDecimal>> getDurations() {
    return durations;
  }


  public void setDurations(List<List<BigDecimal>> durations) {
    this.durations = durations;
  }


  public DirectionsMatrix fallbackSpeedCells(List<BigDecimal> fallbackSpeedCells) {
    
    this.fallbackSpeedCells = fallbackSpeedCells;
    return this;
  }

  public DirectionsMatrix addFallbackSpeedCellsItem(BigDecimal fallbackSpeedCellsItem) {
    if (this.fallbackSpeedCells == null) {
      this.fallbackSpeedCells = new ArrayList<>();
    }
    this.fallbackSpeedCells.add(fallbackSpeedCellsItem);
    return this;
  }

   /**
   * Get fallbackSpeedCells
   * @return fallbackSpeedCells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public List<BigDecimal> getFallbackSpeedCells() {
    return fallbackSpeedCells;
  }


  public void setFallbackSpeedCells(List<BigDecimal> fallbackSpeedCells) {
    this.fallbackSpeedCells = fallbackSpeedCells;
  }


  public DirectionsMatrix sources(List<DirectionsMatrixSources> sources) {
    
    this.sources = sources;
    return this;
  }

  public DirectionsMatrix addSourcesItem(DirectionsMatrixSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public List<DirectionsMatrixSources> getSources() {
    return sources;
  }


  public void setSources(List<DirectionsMatrixSources> sources) {
    this.sources = sources;
  }


  public DirectionsMatrix destinations(List<DirectionsMatrixSources> destinations) {
    
    this.destinations = destinations;
    return this;
  }

  public DirectionsMatrix addDestinationsItem(DirectionsMatrixSources destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

   /**
   * Get destinations
   * @return destinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty()

  public List<DirectionsMatrixSources> getDestinations() {
    return destinations;
  }


  public void setDestinations(List<DirectionsMatrixSources> destinations) {
    this.destinations = destinations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectionsMatrix directionsMatrix = (DirectionsMatrix) o;
    return Objects.equals(this.code, directionsMatrix.code) &&
        Objects.equals(this.distances, directionsMatrix.distances) &&
        Objects.equals(this.durations, directionsMatrix.durations) &&
        Objects.equals(this.fallbackSpeedCells, directionsMatrix.fallbackSpeedCells) &&
        Objects.equals(this.sources, directionsMatrix.sources) &&
        Objects.equals(this.destinations, directionsMatrix.destinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, distances, durations, fallbackSpeedCells, sources, destinations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectionsMatrix {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    distances: ").append(toIndentedString(distances)).append("\n");
    sb.append("    durations: ").append(toIndentedString(durations)).append("\n");
    sb.append("    fallbackSpeedCells: ").append(toIndentedString(fallbackSpeedCells)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
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

