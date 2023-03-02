package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Basicpointmain {
    public void Basicpoint() {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        try {
            String s="enter the x co-ordinate:";
            l.info(s);
            int x = se.nextInt();
            String r="enter the y co-ordinate:";
            l.info(r);
            int y = se.nextInt();
            Point p1 = new Point(x,y);
            Point p2 = p1.clone();
            String a =String.valueOf(p1.equalling(p2));
            l.info(a);
            p2.display();
        }
        catch(Exception e){
            l.info("error");
        }
    }
}
