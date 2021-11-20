package de.htwberlin.webtech.web.api;

public class PetManipulationRequest {

  private String name;
  private String gender;
  private Long ownerId;

  public PetManipulationRequest(String name, String gender, Long ownerId) {
    this.name = name;
    this.gender = gender;
    this.ownerId = ownerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }
}
