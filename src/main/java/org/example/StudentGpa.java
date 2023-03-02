package org.example;

class StudentGpa {
    private String name;
    private int age;
    private double gpa;

    StudentGpa(String name, int age, double gpa) {
        setAge(age);
        setGpa(gpa);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

