package de.htwberlin.webtech.web.api;

public class PersonManipulationRequest {

    private String firstName;
    private String lastName;
    private boolean vaccinated;

    public PersonManipulationRequest(String firstName, String lastName, boolean vaccinated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
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

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
