package com.cognicare.api.gateway.services;

import com.cognicare.api.gateway.entities.LocationEntity;
import com.cognicare.api.gateway.models.Location;
import com.cognicare.api.gateway.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

  @Autowired
  private LocationRepository locationRepository;

  public Location createLocation(Location location) {
    LocationEntity locationEntity = new LocationEntity(location.getLatitude(), location.getLongitude(), location.getUserId());
    locationRepository.save(locationEntity);
    return location;
  }

  public List<Location> getLocations() {
    return locationRepository.findAll()
            .stream()
            .map(e ->
                    new Location(
                            e.getLatitude(),
                            e.getLongitude(),
                            e.getUserId(),
                            null
                    )
            ).collect(Collectors.toList());
  }
}
