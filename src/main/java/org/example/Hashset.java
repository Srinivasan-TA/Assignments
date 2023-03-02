package org.example;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {
    public  void Hashsetmain() {
        Logger l = Logger.getLogger("com.api.jar");
        HashSet<String> cites=new HashSet<String>();
        cites.add("Tanjore");
        cites.add("Palakad");
        cites.add("Madurai");
        cites.add("Chennai");
        l.log(Level.INFO,()->"An initial list of Cities in TN: "+cites);
        cites.remove("Chennai");
        l.log(Level.INFO,()->"After invoking remove method: "+cites);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Coimbatore");
        set1.add("Trichy");
        cites.addAll(set1);
        l.log(Level.INFO,()->"Updated Cites in TN: "+cites);
        cites.removeAll(set1);
        l.log(Level.INFO,()->"After invoking removeAll() method: "+cites);
        cites.removeIf(str->str.contains("Palakad"));
        l.log(Level.INFO,()->"After invoking "+cites);
        cites.clear();
        l.log(Level.INFO,()->"After invoking clear() method: "+cites);
    }

}

