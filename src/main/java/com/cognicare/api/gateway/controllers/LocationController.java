package com.cognicare.api.gateway.controllers;

import com.cognicare.api.gateway.models.Location;
import com.cognicare.api.gateway.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/locations")
public class LocationController {

  @Autowired
  LocationService locationService;

  @PostMapping
  public Location createLocation(@RequestBody Location location) {
    locationService.createLocation(location);
    return location;
  }

  @GetMapping
  public List<Location> getLocations() {
    return locationService.getLocations();
  }
}
