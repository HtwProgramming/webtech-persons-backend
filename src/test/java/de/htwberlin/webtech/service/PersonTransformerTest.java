package de.htwberlin.webtech.service;

import de.htwberlin.webtech.persistence.Gender;
import de.htwberlin.webtech.persistence.PersonEntity;
import de.htwberlin.webtech.persistence.PetEntity;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.doReturn;

class PersonTransformerTest implements WithAssertions {

    private final PersonTransformer underTest = new PersonTransformer();

    @Test
    @DisplayName("should transform PersonEntity to Person")
    void should_transform_person_entity_to_person() {
        // given
        var personEntity = Mockito.mock(PersonEntity.class);
        doReturn(111L).when(personEntity).getId();
        doReturn("John").when(personEntity).getFirstName();
        doReturn("Doe").when(personEntity).getLastName();
        doReturn(true).when(personEntity).getVaccinated();
        doReturn(Gender.MALE).when(personEntity).getGender();
        doReturn(List.of(new PetEntity())).when(personEntity).getPets();

        // when
        var result = underTest.transformEntity(personEntity);

        // then
        assertThat(result.getId()).isEqualTo(111);
        assertThat(result.getFirstName()).isEqualTo("John");
        assertThat(result.getLastName()).isEqualTo("Doe");
        assertThat(result.isVaccinated()).isEqualTo(true);
        assertThat(result.getGender()).isEqualTo("MALE");
        assertThat(result.getPets()).hasSize(1);
    }
}
