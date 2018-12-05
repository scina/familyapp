package pl.dudekjunior.familyapp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dudekjunior.familyapp.models.Gender;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ChildRepository extends CrudRepository<ChildEntity, Integer> {
    List<ChildEntity> findByFatherId(int fatherId);
    List<ChildEntity> findByName(String name);
    List<ChildEntity> findBySurname(String surname);
    List<ChildEntity> findByPesel(String pesel);
    List<ChildEntity> findByBornDate(LocalDate bornDate);
    List<ChildEntity> findByGender(Gender gender);
}
