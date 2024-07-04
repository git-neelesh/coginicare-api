package com.cognicare.api.gateway.controllers;

import com.cognicare.api.gateway.models.Location;
import com.cognicare.api.gateway.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@CrossOrigin
@RestController
@RequestMapping("/locations")
public class LocationController {

  Logger logger = Logger.getLogger("LocationController.class");

  @Autowired
  LocationService locationService;

  @PostMapping
  public Location createLocation(@RequestBody Location location) {
    logger.info("Create location called.");
    locationService.createLocation(location);
    return location;
  }

  @GetMapping
  public List<Location> getLocations() {
    logger.info("Fetching locations called.");
    return locationService.getLocations();
  }
}
