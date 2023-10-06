/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    // ToDo 1: Make this class a child of Person
    // ToDo 1: Make this class a child of Human

    // ToDo 2: Fix the resulting errors

    // ToDo 3: Add a field for GPA and create setter and getter

    // ToDo 4: Add comments to your code

    private double gpa;
    private int credits;

    /**
     * default constructor
     */
    public Student() {
        super("", (short) 0);
        this.credits = 0;
    }

    /**
     * paramerterized constructor
     */
    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, int credits) {
        super(name, age);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (credits < 0) {
            throw new IllegalArgumentException("Credits cannot be negative.");
        }
        this.credits = credits;
        this.gpa = 0.0;
    }

    /**
     * override of getAddress method
     */
    @Override
    public String getAddress() {
        return address;  // Access the address using the getter method
    }

    /**
     * override of setAddress method
     */
    @Override
    public void setAddress(String address) {
        this.address = address;  // Use the setter method to set the address
    }

    /**
     * get method for gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * set method for gpa
     */

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * get method for credits
     */

    public double getCredits() {
        return credits;
    }

    /**
     * override of toString method
     */

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Address: " + this.getAddress();
    }
}