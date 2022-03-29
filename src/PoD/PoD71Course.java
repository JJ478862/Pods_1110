package PoD;

/*
 * CSCI 1110
 * @author YourName
 *
 */
public class PoD71Course
{

    //attributes
    private int courseReferenceNumber;
    private int creditHours;
    private String courseName;
    private String instructor;



    // PLEASE START YOUR CODE HERE
    // *********************************************************

    public PoD71Course(int courseReferenceNumber, int creditHours, String courseName, String instructor) {
        this.courseReferenceNumber = courseReferenceNumber;
        this.creditHours = creditHours;
        this.courseName = courseName;
        this.instructor = instructor;
    }


    // *********************************************************
    // PLEASE END YOUR CODE HERE


    public String toString()
    {
        return "Course: "+courseName
                + "\nInstructor: " + instructor
                + "\nCRN: " + courseReferenceNumber
                + "\nCredit hours: " + creditHours;
    }


}