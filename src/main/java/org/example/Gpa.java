package org.example;

class Gpa extends GpaMain {
    private String name;
    private int gradeLevel;
    private double gradepointaverage;

    public Gpa(String name, int gradeLevel, double gradepointaverage) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gradepointaverage = gradepointaverage;
    }

    public void updateGPA(double newGPA) {
        gradepointaverage = newGPA;
    }

    public String getInfo() {
        return name + " is in grade " + gradeLevel + " and has a " + gradepointaverage + " GPA";
    }
}

