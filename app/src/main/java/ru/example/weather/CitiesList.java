package ru.example.weather;

import java.util.ArrayList;

public class CitiesList {
    public static ArrayList<String> cities;

    static public ArrayList<String> getCities() {
        if (cities == null) {
            cities = new ArrayList<String>();
            cities.add("Moskow");
            cities.add("Saint-Petersburg");
            cities.add("Novosibirsk");
            cities.add("Ekaterinburg");
            cities.add("Vladivostok");
            cities.add("Sochi");
            cities.add("Krasnodar");
            cities.add("Bukhalovo");
            return cities;
        } else {
            return cities;
        }
    }
}
