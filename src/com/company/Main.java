package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        City city = new City(1, "Osh");
        City city1 = new City(2, "Bishkek");
        City city2 = new City(3, "Naryn");
        City city3 = new City(4, "Djalal_Abad");
        City city4 = new City(5, "Batken");
        City city5 = new City(6, "Yssyk_Kol");
        City city6 = new City(7, "Toktogul");
        City city7 = new City(8, "Talas");

        TreeSet<City> s = new TreeSet<>(City.cityComparator);
        s.add(city);
        s.add(city1);
        s.add(city2);
        s.add(city3);
        s.add(city4);
        s.add(city5);
        s.add(city6);
        s.add(city7);

        for (City q : s) {
            if (q.getCod() % 2 == 1) {
                System.out.println(q);
            }
            System.out.println(q);
        }
    }
}

