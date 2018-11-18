package pl.dudekjunior.familyapp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildRepository extends CrudRepository<ChildEntity, Integer> {
    Optional<List<ChildEntity>> findByFatherId(int fatherId);
}
