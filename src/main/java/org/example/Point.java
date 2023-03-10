package org.example;

import java.util.logging.Logger;

class Point implements Cloneable {
    Logger l = Logger.getLogger("com.api.jar");
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        String s = "value of x " + x;
        l.info(s);
        String r = "value of y " + y;
        l.info(r);
    }

    public boolean equalling(Object obj) {
        if (obj instanceof Point) {
            return x == y;
        } else {
            return false;
        }
    }

    public Point clone() throws CloneNotSupportedException {
        super.clone();
        return new Point(x, y);
    }
}
