package de.htwberlin.webtech.service;

import de.htwberlin.webtech.persistence.Gender;
import de.htwberlin.webtech.persistence.PersonEntity;
import de.htwberlin.webtech.web.api.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonTransformer {

  public Person transformEntity(PersonEntity personEntity) {
    var gender = personEntity.getGender() != null ? personEntity.getGender().name() : Gender.UNKNOWN.name();
    var petId = personEntity.getPet() != null ? personEntity.getPet().getId() : null;
    return new Person(
            personEntity.getId(),
            personEntity.getFirstName(),
            personEntity.getLastName(),
            gender,
            personEntity.getVaccinated(),
            petId);
  }
}
