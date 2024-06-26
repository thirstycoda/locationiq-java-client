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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Matchquality
 */

public class Matchquality {
  public static final String SERIALIZED_NAME_MATCHCODE = "matchcode";
  @SerializedName(SERIALIZED_NAME_MATCHCODE)
  private String matchcode;

  public static final String SERIALIZED_NAME_MATCHTYPE = "matchtype";
  @SerializedName(SERIALIZED_NAME_MATCHTYPE)
  private String matchtype;

  public static final String SERIALIZED_NAME_MATCHLEVEL = "matchlevel";
  @SerializedName(SERIALIZED_NAME_MATCHLEVEL)
  private String matchlevel;


  public Matchquality matchcode(String matchcode) {
    
    this.matchcode = matchcode;
    return this;
  }

   /**
   * Get matchcode
   * @return matchcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchcode() {
    return matchcode;
  }


  public void setMatchcode(String matchcode) {
    this.matchcode = matchcode;
  }


  public Matchquality matchtype(String matchtype) {
    
    this.matchtype = matchtype;
    return this;
  }

   /**
   * Get matchtype
   * @return matchtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchtype() {
    return matchtype;
  }


  public void setMatchtype(String matchtype) {
    this.matchtype = matchtype;
  }


  public Matchquality matchlevel(String matchlevel) {
    
    this.matchlevel = matchlevel;
    return this;
  }

   /**
   * Get matchlevel
   * @return matchlevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchlevel() {
    return matchlevel;
  }


  public void setMatchlevel(String matchlevel) {
    this.matchlevel = matchlevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Matchquality matchquality = (Matchquality) o;
    return Objects.equals(this.matchcode, matchquality.matchcode) &&
        Objects.equals(this.matchtype, matchquality.matchtype) &&
        Objects.equals(this.matchlevel, matchquality.matchlevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchcode, matchtype, matchlevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matchquality {\n");
    sb.append("    matchcode: ").append(toIndentedString(matchcode)).append("\n");
    sb.append("    matchtype: ").append(toIndentedString(matchtype)).append("\n");
    sb.append("    matchlevel: ").append(toIndentedString(matchlevel)).append("\n");
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

