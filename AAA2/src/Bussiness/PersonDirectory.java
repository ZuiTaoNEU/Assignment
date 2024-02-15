package Bussiness;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author EHY
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDirectory {
    private List<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    // Method to add a person to the directory
    public void addPerson(Person person) {
        personList.add(person);
    }

    // Method to get the list of all persons
    public List<Person> getPersonList() {
        return personList;
    }

    // Method to search for person by name or street address
    public List<Person> searchPersons(String nameOrAddress) {
        return personList.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(nameOrAddress) ||
                             p.getLastName().equalsIgnoreCase(nameOrAddress) ||
                             p.getHomeAddress().getStreetAddress().equalsIgnoreCase(nameOrAddress) ||
                             p.getWorkAddress().getStreetAddress().equalsIgnoreCase(nameOrAddress))
                .collect(Collectors.toList());
    }

    // Method to delete a person from the directory
    public boolean deletePerson(Person person) {
        return personList.remove(person);
    }

    // Method to list persons with specific attributes
    public List<String[]> listPersons() {
        return personList.stream()
                .map(p -> new String[] { p.getFirstName(), p.getLastName(), 
                                         p.getHomeAddress().getCity(), p.getHomeAddress().getZipCode(),
                                         p.getWorkAddress().getCity(), p.getWorkAddress().getZipCode() })
                .collect(Collectors.toList());
    }
}
