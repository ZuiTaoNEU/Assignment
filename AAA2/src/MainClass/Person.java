
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EHY
 */
public class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String licenseNumber;
    private Address workAddress;
    private Address homeAddress;

    // Constructor to initialize the person object
    public Person(String firstName, String lastName, String ssn, String licenseNumber, Address workAddress, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.licenseNumber = licenseNumber;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
    }

    // Getters and setters for each field
    // ...

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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    
    // Method to update person details
    public void updateDetails(String firstName, String lastName, String ssn, String licenseNumber, Address workAddress, Address homeAddress) {
        // Update attributes
    }

    // Method to search for a person
    public static Person searchPerson(String firstName, String lastName, String streetAddress, List<Person> personList) {
        // Search logic
        return null; // Or found Person object
    }
}

