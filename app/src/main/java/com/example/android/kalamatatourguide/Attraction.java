package com.example.android.kalamatatourguide;

import android.location.Location;

/**
 * Created by user on 29/4/2018.
 */

public class Attraction {

    private int nameResourceID;
    private int descriptionResourceID;
    private int imageResourceID;
    private Location location;
    private double latitude;
    private double longitude;


    public Attraction(int nameResourceID, int descriptionResourceID, int imageResourceID) {
        this.nameResourceID = nameResourceID;
        this.descriptionResourceID = descriptionResourceID;
        this.imageResourceID = imageResourceID;
        this.location = null;
    }

    public Attraction(int nameResourceID, int descriptionResourceID, int imageResourceID, Location location, double latitude, double longitude) {
        this.nameResourceID = nameResourceID;
        this.descriptionResourceID = descriptionResourceID;
        this.imageResourceID = imageResourceID;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public int getNameResourceID() {
        return nameResourceID;
    }

    public int getDescriptionResourceID() {
        return descriptionResourceID;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasLocation() {
        return location != null;
    }

    public Location getLocation() {
        return location;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
