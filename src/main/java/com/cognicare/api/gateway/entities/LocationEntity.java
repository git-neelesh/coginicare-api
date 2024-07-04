package com.cognicare.api.gateway.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "LOCATIONS")
public class LocationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String latitude;
  private String longitude;
  private String userId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public LocationEntity() {
  }

  public LocationEntity(String latitude, String longitude, String userId) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.userId = userId;
  }

}
