package com.company;

import java.util.Comparator;

public class City {
    private int code;
    private String name;

    public City(int cod, String name) {
        this.code = cod;
        this.name = name;
    }

    public int getCod() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "cod=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public static Comparator <City> cityComparator = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o2.code-o1.code;
        }
    };
}
