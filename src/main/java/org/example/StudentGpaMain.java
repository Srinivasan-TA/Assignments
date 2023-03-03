package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class StudentGpaMain {
        public  void studentgpamain() {
            Logger l = Logger.getLogger("com.api.jar");
            List<StudentGpa> students = new ArrayList<>();
            students.add(new StudentGpa("Sri", 22, 4.5));
            students.add(new StudentGpa("ruch", 21, 3.7));
            students.add(new StudentGpa("Bar", 21, 3.6));
            l.info("Original List:");
            for (StudentGpa student : students) {
                l.info("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGpa());
            }
            Collections.sort(students, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
            l.info("\nSorted List:");
            for (StudentGpa student : students) {
                l.info("Name: " + student.getName() + ", GPA: " + student.getGpa());
            }
        }
    }
