package de.htwberlin.webtech.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "pets")
public class PetEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "gender")
  @Enumerated(value = EnumType.STRING)
  private Gender gender;

  @OneToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "owner_id", referencedColumnName = "id")
  private PersonEntity owner;

  public PetEntity() {
  }

  public PetEntity(String name, Gender gender, PersonEntity owner) {
    this.name = name;
    this.gender = gender;
    this.owner = owner;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public PersonEntity getOwner() {
    return owner;
  }

  public void setOwner(PersonEntity owner) {
    this.owner = owner;
  }
}
