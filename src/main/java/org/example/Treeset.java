package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treeset {
    public  void Treesetmain() {
        Logger l = Logger.getLogger("com.api.jar");
        TreeSet<String> states=new TreeSet<String>();
        states.add("TN");
        states.add("Punjab");
        states.add("MP");
        states.add("KL");
        l.log(Level.INFO,()->"An initial list of states in India: "+states);
        states.remove("Chennai");
        l.log(Level.INFO,()->"After invoking remove method: "+states);
        TreeSet<String> set1=new TreeSet<String>();
        set1.add("Chatisgar");
        set1.add("Telangana");
        states.addAll(set1);
        l.log(Level.INFO,()->"Updated states in TN: "+states);
        states.removeAll(set1);
        l.log(Level.INFO,()->"After invoking removeAll() method: "+states);
        states.removeIf(str->str.contains("Palakad"));
        l.log(Level.INFO,()->"After invoking "+states);
        states.clear();
        l.log(Level.INFO,()->"After invoking clear() method: "+states);
    }

}