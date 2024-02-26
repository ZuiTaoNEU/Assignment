/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Department.Department;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Transcript;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// ------------------------------------ Part 1 ------------------------------------
        Department department = new Department("Information Systems"); // Create a new department.
        College collegeOfEngineering = new College("College Of Engineering"); // Create a new College instance.
        collegeOfEngineering.addDepartment(department); // Add the existing department to the departments attribute of the college.

        PersonDirectory pd = department.getPersonDirectory();
        StudentDirectory sd = department.getStudentDirectory();
        FacultyDirectory fd = department.getFacultydirectory();

        // Create ten students.
        Person studentYou = pd.newPerson("1001", "You Li");
        Person studentJiaen = pd.newPerson("1002", "Jiaen Xu");
        Person studentZhiyu = pd.newPerson("1003", "Zhiyu Ma");
        Person studentEmily = pd.newPerson("1004", "Emily Johnson");
        Person studentAlexander = pd.newPerson("1005", "Alexander Smith");
        Person studentSophia = pd.newPerson("1006", "Sophia Anderson");
        Person studentLiam = pd.newPerson("1007", "Liam Wilson");
        Person studentOlivia = pd.newPerson("1008", "Olivia Martinez");
        Person studentJackson = pd.newPerson("1009", "Jackson Brown");
        Person studentEmma = pd.newPerson("1010", "Emma Davis");

        // Create a student profile for each student.
        StudentProfile you = sd.newStudentProfile(studentYou);
        StudentProfile jiaen = sd.newStudentProfile(studentJiaen);
        StudentProfile zhiyu = sd.newStudentProfile(studentZhiyu);
        StudentProfile emily = sd.newStudentProfile(studentEmily);
        StudentProfile alexander = sd.newStudentProfile(studentAlexander);
        StudentProfile sophia = sd.newStudentProfile(studentSophia);
        StudentProfile liam = sd.newStudentProfile(studentLiam);
        StudentProfile olivia = sd.newStudentProfile(studentOlivia);
        StudentProfile jackson = sd.newStudentProfile(studentJackson);
        StudentProfile emma = sd.newStudentProfile(studentEmma);


        // Create five faculties.
        Person profKai = pd.newPerson("0001", "Khaled Bugrara");
        Person profHandan = pd.newPerson("0002", "Handan Liu");
        Person profVishal = pd.newPerson("0003", "Vishal Chawla");
        Person profRobin = pd.newPerson("0004", "Robin Hillyard");
        Person profYusuf = pd.newPerson("0005", "Yusuf Ozbek");

        // Create a faculty profile for each faculty.
        FacultyProfile kai = fd.newFacultyProfile(profKai);
        FacultyProfile handan = fd.newFacultyProfile(profHandan);
        FacultyProfile vishal = fd.newFacultyProfile(profVishal);
        FacultyProfile robin = fd.newFacultyProfile(profRobin);
        FacultyProfile yusuf = fd.newFacultyProfile(profYusuf);


        // Create a new courseCatalog instance.
        CourseCatalog courseCatalog = department.getCourseCatalog();

        // Create five Course instances using the newCourse method.
        Course info5001 = courseCatalog.newCourse("info5001", "Application Design & Modeling", 4);
        Course info5002 = courseCatalog.newCourse("info5002", "Introduction to Python for Information Systems", 4);
        Course info6150 = courseCatalog.newCourse("info6150", "Web Design and User Experience Engineering", 4);
        Course info6205 = courseCatalog.newCourse("info6205", "Program Structure and Algorithms", 4);
        Course info6250 = courseCatalog.newCourse("info6250", "Web Development Tools and Methods", 4);

// ------------------------------------ Part 2 ------------------------------------

        //Create a course schedule for Fall 2023 semester.
        CourseSchedule csFall2023 = department.newCourseSchedule("Fall2023");

        // Create one course offering for each course for the semester.
        CourseOffer info5001offerFall2023 = csFall2023.newCourseOffer("info5001");
        CourseOffer info5002offerFall2023 = csFall2023.newCourseOffer("info5002");
        CourseOffer info6150offerFall2023 = csFall2023.newCourseOffer("info6150");
        CourseOffer info6205offerFall2023 = csFall2023.newCourseOffer("info6205");
        CourseOffer info6250offerFall2023 = csFall2023.newCourseOffer("info6250");

        //Create 25 seats for the course offering.
        for (CourseOffer offer : csFall2023.getSchedule()) {
            offer.generateSeats(25);
        }

        // Register each student for the course.

        Transcript youTranscript = you.getTranscript();
        CourseLoad youFall2023 = youTranscript.newCourseLoad("Fall2023");
        SeatAssignment youRegisteredForInfo5001inFall2023 = info5001offerFall2023.assignEmptySeat(youFall2023);
        SeatAssignment youRegisteredForInfo5002inFall2023 = info5002offerFall2023.assignEmptySeat(youFall2023);

        Transcript jiaenTranscript = jiaen.getTranscript();
        CourseLoad jiaenFall2023 = jiaenTranscript.newCourseLoad("Fall2023");
        SeatAssignment jiaenRegisteredForInfo5001inFall2023 = info5001offerFall2023.assignEmptySeat(jiaenFall2023);
        SeatAssignment jiaenRegisteredForInfo5002inFall2023 = info5002offerFall2023.assignEmptySeat(jiaenFall2023);

        Transcript zhiyuTranscript = zhiyu.getTranscript();
        CourseLoad zhiyuFall2023 = zhiyuTranscript.newCourseLoad("Fall2023");
        SeatAssignment zhiyuRegisteredForInfo6150inFall2023 = info6150offerFall2023.assignEmptySeat(zhiyuFall2023);
        SeatAssignment zhiyuRegisteredForInfo6250inFall2023 = info6250offerFall2023.assignEmptySeat(zhiyuFall2023);

        Transcript emilyTranscript = emily.getTranscript();
        CourseLoad emilyFall2023 = emilyTranscript.newCourseLoad("Fall2023");
        SeatAssignment emilyRegisteredForInfo6205inFall2023 = info6205offerFall2023.assignEmptySeat(emilyFall2023);
        SeatAssignment emilyRegisteredForInfo6250inFall2023 = info6250offerFall2023.assignEmptySeat(emilyFall2023);

        Transcript alexanderTranscript = alexander.getTranscript();
        CourseLoad alexanderFall2023 = alexanderTranscript.newCourseLoad("Fall2023");
        SeatAssignment alexanderRegisteredForInfo5001inFall2023 = info5001offerFall2023.assignEmptySeat(alexanderFall2023);
        SeatAssignment alexanderRegisteredForInfo5002inFall2023 = info5002offerFall2023.assignEmptySeat(alexanderFall2023);

        Transcript sophiaTranscript = sophia.getTranscript();
        CourseLoad sophiaFall2023 = sophiaTranscript.newCourseLoad("Fall2023");
        SeatAssignment sophiaRegisteredForInfo6150inFall2023 = info6150offerFall2023.assignEmptySeat(sophiaFall2023);
        SeatAssignment sophiaRegisteredForInfo6205inFall2023 = info6205offerFall2023.assignEmptySeat(sophiaFall2023);

        Transcript liamTranscript = liam.getTranscript();
        CourseLoad liamFall2023 = liamTranscript.newCourseLoad("Fall2023");
        SeatAssignment liamRegisteredForInfo6150inFall2023 = info6150offerFall2023.assignEmptySeat(liamFall2023);
        SeatAssignment liamRegisteredForInfo6205inFall2023 = info6205offerFall2023.assignEmptySeat(liamFall2023);

        Transcript oliviaTranscript = olivia.getTranscript();
        CourseLoad oliviaFall2023 = oliviaTranscript.newCourseLoad("Fall2023");
        SeatAssignment oliviaRegisteredForInfo6205inFall2023 = info6205offerFall2023.assignEmptySeat(oliviaFall2023);
        SeatAssignment oliviaRegisteredForInfo6250inFall2023 = info6250offerFall2023.assignEmptySeat(oliviaFall2023);

        Transcript jacksonTranscript = jackson.getTranscript();
        CourseLoad jacksonFall2023 = jacksonTranscript.newCourseLoad("Fall2023");
        SeatAssignment jacksonRegisteredForInfo5001inFall2023 = info5001offerFall2023.assignEmptySeat(jacksonFall2023);
        SeatAssignment jacksonRegisteredForInfo5002inFall2023 = info5002offerFall2023.assignEmptySeat(jacksonFall2023);

        Transcript emmaTranscript = emma.getTranscript();
        CourseLoad emmaFall2023 = emmaTranscript.newCourseLoad("Fall2023");
        SeatAssignment emmaRegisteredForInfo5001inFall2023 = info5001offerFall2023.assignEmptySeat(emmaFall2023);
        SeatAssignment emmaRegisteredForInfo5002inFall2023 = info5002offerFall2023.assignEmptySeat(emmaFall2023);

        // Assign one faculty for each course.
        info5001offerFall2023.AssignAsTeacher(kai);
        info5002offerFall2023.AssignAsTeacher(handan);
        info6150offerFall2023.AssignAsTeacher(vishal);
        info6205offerFall2023.AssignAsTeacher(robin);
        info6250offerFall2023.AssignAsTeacher(yusuf);


        // Assign grades to students.
        youRegisteredForInfo5001inFall2023.setGrade("A");
        youRegisteredForInfo5002inFall2023.setGrade("A");

        jiaenRegisteredForInfo5001inFall2023.setGrade("A");
        jiaenRegisteredForInfo5002inFall2023.setGrade("A");

        zhiyuRegisteredForInfo6150inFall2023.setGrade("A");
        zhiyuRegisteredForInfo6250inFall2023.setGrade("A");

        emilyRegisteredForInfo6205inFall2023.setGrade("A-");
        emilyRegisteredForInfo6250inFall2023.setGrade("B+");

        alexanderRegisteredForInfo5001inFall2023.setGrade("A");
        alexanderRegisteredForInfo5002inFall2023.setGrade("B+");

        sophiaRegisteredForInfo6150inFall2023.setGrade("A");
        sophiaRegisteredForInfo6205inFall2023.setGrade("A-");

        liamRegisteredForInfo6150inFall2023.setGrade("B+");
        liamRegisteredForInfo6205inFall2023.setGrade("B");

        oliviaRegisteredForInfo6205inFall2023.setGrade("B+");
        oliviaRegisteredForInfo6250inFall2023.setGrade("A");

        jacksonRegisteredForInfo5001inFall2023.setGrade("A");
        jacksonRegisteredForInfo5002inFall2023.setGrade("A-");

        emmaRegisteredForInfo5001inFall2023.setGrade("A-");
        emmaRegisteredForInfo5002inFall2023.setGrade("A");

// ------------------------------------ Part 3 ------------------------------------

        // Print the Course schedule showing all courses taught this semester.
        System.out.println("Course schedule for " + department.getName() + " Program During the " + csFall2023.getSemester() + " semester:");
        System.out.println();
        csFall2023.printCourseInfo();

        // Print Department revenue for Fall 2023.
        System.out.println("Revenue of " + department.getName() + " Department for " + csFall2023.getSemester() + " semester:");
        System.out.println();
        csFall2023.printRevenueByCourseOffering();
        System.out.println();
        System.out.println("Total revenue: " + department.calculateRevenuesBySemester("Fall2023"));


    

    
        System.out.println("Student Name: " + you.getPerson().getName() + ", ID: " + you.getPerson().getPersonId());
        youTranscript.print();
        
        System.out.println("Student Name: " + jiaen.getPerson().getName() + ", ID: " + jiaen.getPerson().getPersonId());
        jiaenTranscript.print();
        
        System.out.println("Student Name: " + zhiyu.getPerson().getName() + ", ID: " + zhiyu.getPerson().getPersonId());
        zhiyuTranscript.print();
        
        System.out.println("Student Name: " + emily.getPerson().getName() + ", ID: " + emily.getPerson().getPersonId());
        emilyTranscript.print();

        System.out.println("Student Name: " + alexander.getPerson().getName() + ", ID: " + alexander.getPerson().getPersonId());
        alexanderTranscript.print();

        System.out.println("Student Name: " + sophia.getPerson().getName() + ", ID: " + sophia.getPerson().getPersonId());
        sophiaTranscript.print();

        System.out.println("Student Name: " + liam.getPerson().getName() + ", ID: " + liam.getPerson().getPersonId());
        liamTranscript.print();

        System.out.println("Student Name: " + olivia.getPerson().getName() + ", ID: " + olivia.getPerson().getPersonId());
        oliviaTranscript.print();

        System.out.println("Student Name: " + jackson.getPerson().getName() + ", ID: " + jackson.getPerson().getPersonId());
        jacksonTranscript.print();

        System.out.println("Student Name: " + emma.getPerson().getName() + ", ID: " + emma.getPerson().getPersonId());
        emmaTranscript.print();
        
        
        


        }     

}
