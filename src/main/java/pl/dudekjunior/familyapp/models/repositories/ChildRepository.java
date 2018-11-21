package pl.dudekjunior.familyapp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;

import java.util.List;

@Repository
public interface ChildRepository extends CrudRepository<ChildEntity, Integer> {
    List<ChildEntity> findByFatherId(int fatherId);
}
