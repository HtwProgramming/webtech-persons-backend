package de.htwberlin.webtech.persistence;

import javax.persistence.*;

@Entity(name = "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "is_vaccinated")
    private Boolean vaccinated;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public PersonEntity(String firstName, String lastName, Boolean vaccinated, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
        this.gender = gender;
    }

    protected PersonEntity() {}

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
