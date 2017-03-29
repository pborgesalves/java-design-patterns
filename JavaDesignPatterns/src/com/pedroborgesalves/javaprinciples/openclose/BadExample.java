/*
 */
package com.pedroborgesalves.javaprinciples.openclose;

/**
 *
 * @author pedroborgesalves
 */
// Open-Close Principle - Bad example
class BadExample {

    public void drawShape(ShapeBad s) {
        if (s.m_type == 1) {
            drawRectangle((RectangleBad) s);
        } else if (s.m_type == 2) {
            drawCircle((CircleBad) s);
        }
    }

    public void drawCircle(CircleBad r) {
    }

    public void drawRectangle(RectangleBad r) {
    }
}

class ShapeBad {

    int m_type;
}

class RectangleBad extends ShapeBad {

    RectangleBad() {
        super.m_type = 1;
    }
}

class CircleBad extends ShapeBad {

    CircleBad() {
        super.m_type = 2;
    }
}
