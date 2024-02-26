/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.EmploymentHistory;

import CourseSchedule.CourseOffer;
import Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    private ArrayList<CourseOffer> relevantcourseoffers;
    private int weight;
    private String quality;
    private String job;
    private Employment nextemplyment;  //next job so they are in a sequence
    private EmployerProfile employer;

    public Employment(String j){
        
         relevantcourseoffers = new ArrayList();
        
    }

}
