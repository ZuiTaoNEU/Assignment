/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    private float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    private Seat seat;
    private boolean like; //true means like and false means not like
    private CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike(){
        return like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }

    public CourseOffer getCourseOffer(){
        return seat.getCourseOffer();
    }

    public Course getAssociatedCourse(){
        return getCourseOffer().getSubjectCourse();
    }
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }
    
    public void printSeatInfo(){
        System.out.println(getAssociatedCourse().getCourseNumber() + " " + getAssociatedCourse().getCourseName()+ " | " + getCreditHours() + " credits | " + "Grade: " + grade);
    }

    public CourseLoad getCourseload(){
        return courseload;
    }

    public Seat getSeat(){
        return seat;
    }

    public void setGrade(String grade) {
        if (grade.equals("A")) {
            this.grade = (float)4;
        } else if (grade.equals("A-")) {
            this.grade = (float)3.7;
        } else if (grade.equals("B+")) {
            this.grade = (float)3.3;
        } else if (grade.equals("B")) {
            this.grade = (float)3.0;
        } else {
            this.grade = (float)0;
        }
    }

    public String getGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrade'");
    }


}
