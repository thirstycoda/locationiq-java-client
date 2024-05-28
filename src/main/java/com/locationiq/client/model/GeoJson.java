package com.locationiq.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeoJson {
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
    @SerializedName(SERIALIZED_NAME_COORDINATES)
    private List<List<List<Double>>> coordinates;
}
