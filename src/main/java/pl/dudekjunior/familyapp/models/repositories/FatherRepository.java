package pl.dudekjunior.familyapp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

public interface FatherRepository extends CrudRepository<FatherEntity, Integer> {
}
