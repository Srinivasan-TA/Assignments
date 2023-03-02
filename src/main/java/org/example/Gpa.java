package org.example;

class Gpa extends GpaMain {
    private String name;
    private int gradeLevel;
    private double gpa;

    public Gpa(String name, int gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public String getInfo() {
        return name + " is in grade " + gradeLevel + " and has a " + gpa + " GPA";
    }
}

