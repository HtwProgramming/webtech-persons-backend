package de.htwberlin.webtech.web.api;

public class PersonManipulationRequest {

    private String firstName;
    private String lastName;
    private String gender;
    private boolean vaccinated;

    public PersonManipulationRequest(String firstName, String lastName, String gender, boolean vaccinated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.vaccinated = vaccinated;
    }

    public PersonManipulationRequest() {}

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

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
