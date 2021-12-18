package de.htwberlin.webtech.web.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PersonManipulationRequest {

    @Size(min = 3, message = "Please provide a first name with 3 characters or more.")
    private String firstName;
    
    @NotBlank(message = "The last name must not be empty.")
    private String lastName;
    
    @Pattern(
        regexp = "MALE|FEMALE|DIVERSE|UNKOWN",
        message = "Please provide 'MALE', 'FEMALE', 'DIVERSE' or 'UNKNOWN' for gender"
    )
    private String gender;
    
    private boolean vaccinated;

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
