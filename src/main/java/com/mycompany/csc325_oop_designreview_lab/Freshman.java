package com.mycompany.csc325_oop_designreview_lab;

/**
 * Represents a freshman student.
 * Inherits from Student class and adds a field for credits.
 */
public class Freshman extends Student {

    /**
     * Default constructor for Freshman.
     * Initializes with default values.
     */
    public Freshman() {
        super("", (short) 0, 0);
    }

    /**
     * Parameterized constructor for Freshman.
     *
     * @param name    The name of the freshman.
     * @param age     The age of the freshman.
     * @param credits The number of credits earned by the freshman.
     */
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    /**
     * Get a string representation of the Freshman.
     *
     * @return A string containing information about the Freshman.
     */
    @Override
    public String toString() {
        return "Freshman: " + super.toString() + ", GPA: " + getGpa() + ", Credits: " + this.getCredits();
    }
}
