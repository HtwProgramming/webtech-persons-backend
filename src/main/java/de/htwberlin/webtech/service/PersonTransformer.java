package de.htwberlin.webtech.service;

import de.htwberlin.webtech.persistence.Gender;
import de.htwberlin.webtech.persistence.PersonEntity;
import de.htwberlin.webtech.persistence.PetEntity;
import de.htwberlin.webtech.web.api.Person;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PersonTransformer {

  public Person transformEntity(PersonEntity personEntity) {
    var gender = personEntity.getGender() != null ? personEntity.getGender().name() : Gender.UNKNOWN.name();
    var petIds = personEntity.getPets().stream().map(PetEntity::getId).collect(Collectors.toList());
    return new Person(
            personEntity.getId(),
            personEntity.getFirstName(),
            personEntity.getLastName(),
            gender,
            personEntity.getVaccinated(),
            petIds);
  }
}
