/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    private String number;
    private String name;
    private int credits;
    private int price = 1500; // per credit hour

    public Course(String numb, String n, int ch) {
        number = numb;
        name = n;
        credits = ch;

    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return name;
    }

    public static boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }  

}