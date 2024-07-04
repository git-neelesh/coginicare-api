package com.cognicare.api.gateway.repositories;

import com.cognicare.api.gateway.entities.LocationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends CrudRepository<LocationEntity, Long> {
  List<LocationEntity> findAll();
}
