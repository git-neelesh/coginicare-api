package com.cognicare.api.gateway.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable {
  private String latitude;
  private String longitude;
  private String userId;

  public Location(String latitude, String longitude, String userId, Date createdDt) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.userId = userId;
    this.createdDt = createdDt;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Date getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(Date createdDt) {
    this.createdDt = createdDt;
  }

  private Date createdDt;
}
