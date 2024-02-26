/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    private CourseCatalog coursecatalog;
    private ArrayList<CourseOffer> schedule;
    private String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    public CourseOffer newCourseOffer(String n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if(c==null) return null;
        CourseOffer co;
        co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }

    public void printCourseInfo() {
        for (CourseOffer co : schedule) {
            System.out.println("Course Offered: " + co.getSubjectCourse().getCourseName());
            System.out.println("Course Number: " + co.getSubjectCourse().getCourseNumber());
            System.out.println("Instructor: " + co.getFacultyProfile().getPerson().getName());
            System.out.println("Credit Hour: " + co.getSubjectCourse().getCredits());
            System.out.println("Number of Registered Students: " + co.getNumberOfRegistedStudents());
            System.out.println("Seats Remained: " + co.getNumberOfEmptySeat());
            System.out.println("-----------------------------------------------------"); // Separator
        }
    }

    public String getSemester() {
        return semester;
    }

    public void printRevenueByCourseOffering() {
        for (CourseOffer co : schedule) {
            System.out.println("Course Offering: " + co.getSubjectCourse().getCourseName());
            System.out.println("Revenue: " + co.getTotalCourseRevenues());
        }
    }
}
