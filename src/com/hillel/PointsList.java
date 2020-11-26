package com.hillel;

import java.util.Arrays;

public class PointsList {
    private Point[] points = new Point[4];
    private int size = 0;

    public void add(Point p) {
        if (size == points.length) {
            points = Arrays.copyOf(points, (int) Math.ceil(size * 1.5));
        }
        points[size] = p;
        size++;
    }

    public Point get(int index) {
        checkIndex(index);
        return points[index];
    }

    public Point remove(int index) {
        checkIndex(index);
        Point p = points[index];
        Point[] temp = new Point[points.length - 1];
        for (int i = 0; i < size; i++) {
            temp[i] = points[i < index ? i : i + 1];
        }
        points = temp;
        size--;
        return p;
    }

    public void set(int index, Point p) {
        checkIndex(index);
        points[index] = p;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++) {
            string.append(points[i]).append(" ");
        }
        return "PointsList{ " + string + "}";
    }
}
