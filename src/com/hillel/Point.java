package com.hillel;

import java.util.Arrays;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistanceTo(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2.0) + Math.pow((y - point.y), 2.0));
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new double[]{x, y});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != Point.class) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }
}
