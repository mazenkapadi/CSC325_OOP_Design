package com.mycompany.csc325_oop_designreview_lab;

/**
 * Represents a senior student.
 * Inherits from Student class and adds a field for credits.
 */
public class Senior extends Student {

    /**
     * Default constructor for Senior.
     * Initializes with default values.
     */
    public Senior() {
        super("", (short) 0, 0);
    }

    /**
     * Parameterized constructor for Senior.
     *
     * @param name    The name of the senior student.
     * @param age     The age of the senior student.
     * @param credits The number of credits earned by the senior student.
     */
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            System.out.println("Seniors must have 85 credits");
        }
    }

    /**
     * Get a string representation of the Senior.
     *
     * @return A string containing information about the Senior.
     */
    @Override
    public String toString() {
        return "Senior: " + super.toString() + ", GPA: " + getGpa() + ", Credits: " + this.getCredits();
    }
}
