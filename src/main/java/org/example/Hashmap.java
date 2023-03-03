package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {

    public  void hashmapmain() {
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(100, "Abisha");
        students.put(101, "Srini");
        students.put(102, "Ruchi");
        l.info("After invoking put() method ");
        l.log(Level.INFO,()->"Names of students are "+students);
        String length ="Total no of students are "+ students.size();
        l.info(length);
        students.remove(101, "Srini");
        l.info("After invoking putIfAbsent() method ");
        l.log(Level.INFO,()->"Names of students added are "+students);

    }
}