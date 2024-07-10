package com.romero.infraccionservice.repository;
import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.romero.infraccionservice.entity.*;

@Repository
public interface InfraccionRepository extends MongoRepository<Infraccion, ObjectId>{
	
	List<Infraccion> findByFechaContaining(LocalDateTime fecha, Pageable page);
	 List<Infraccion> findByDni(String dni);

}
