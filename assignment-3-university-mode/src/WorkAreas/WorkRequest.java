/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkAreas;

import Persona.Person;

/**
 *
 * @author kal bugrara
 */
public class WorkRequest {
    private String task;
    private Person performer;
    private Person originator;
    
    public WorkRequest(Person org, Person per, String t){
        performer = per;
        originator = org;
        task = t;
    }
    
}
