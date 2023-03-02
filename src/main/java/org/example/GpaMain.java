package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class GpaMain {
    public  void GpaMain() {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        try {
            l.info("enter your name :");
            String name = se.next();
            l.info("enter your grade level :");
            int gradelevel = se.nextInt();
            l.info("Type the gpa :");
            double gpa = se.nextDouble();
            Gpa student = new Gpa(name, gradelevel, gpa);
            l.info(student.getInfo());
            student.updateGPA(3.7);
            l.info(student.getInfo());
        } catch (Exception e) {
            l.info("Type the values correctly");
        }
    }

}
