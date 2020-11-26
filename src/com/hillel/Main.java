package com.hillel;

public class Main {

    public static void main(String[] args) {

        PointsList pointsList = new PointsList();

        for (int i = 0; i < 10; i++) {
            pointsList.add(new Point(2 + i, 5.5 - i));
        }
        System.out.println("Список точек... " + pointsList);
        System.out.println("Число элементов в списке... " + pointsList.size());
        System.out.println("Последний элемент в списке... " + pointsList.get(pointsList.size() - 1));
        System.out.println("Удалим 3-й элемент " + pointsList.remove(3)
                + "...\n    и получим список... " + pointsList);
        System.out.println("Число элементов в списке... " + pointsList.size());
        System.out.println("Заменим 2-й элемент " + pointsList.get(2) + " на новый...");
        pointsList.set(2, new Point(26, 11));
        System.out.println("    и получим список... " + pointsList);
    }
}
