package com.rightapps.testapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isWrong() {
        assertNotEquals(5, 2 + 2);
    }


    @Test
    public void checkSumOfIsWrong() {
        assertNotEquals(sumOf(), 25);
    }

    @Test
    public void checkSumOfIsRight() {
        assertEquals(sumOf(), 15);
    }


    ArrayList<Integer> data = new ArrayList<>(5);

    // [1, 2, 3, 4, 5]

    public int sumOf() {
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        int sum = 0;

        for (int d : data) {
            sum += d;
        }

        return sum;
    }

    class Shape {
        public Shape(String name) {
            this.name = name;
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Rectangle extends Shape {
        int width;
        int height;

        Rectangle(int w, int h) {
            super("Rectangle");
            width = w;
            height = h;
        }
    }

    class Circle extends Shape {
        float radius;

        public Circle() {
            super("Circle");
        }
    }

    class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
            this.setName("Square");
        }
    }

    @Test
    public void checkSquareIsSquare() {
        Square s = new Square(5);
        System.out.println("Shape name = " + s.getName());
        assertEquals(s.height, s.width);
    }

    @Test
    public void checkRectIsRect() {
        Rectangle r = new Rectangle(5, 4);
        System.out.println("Shape name = " + r.getName());
        assertNotEquals(r.height, r.width);
    }


}