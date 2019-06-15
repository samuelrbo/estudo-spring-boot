package br.com.samuelramon.estudospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.samuelramon.estudospringboot.entity.Vehicle;

@RepositoryRestResource(path = "vehicles", collectionResourceRel = "vehicles", itemResourceRel = "vehicles")
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
