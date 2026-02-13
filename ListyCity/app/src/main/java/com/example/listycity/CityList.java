package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps a list of cities.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city city object to add to list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This tells you if a city is in the list
     * @param city city to check if in the list
     * @return boolean True if city is in the list, False otherwise
     */
    public Boolean hasCity(City city) {
        return this.cities.contains(city);
    }

    /**
     * Delete city from list if it exists (else throw exception)
     * @param city city to remove from list
     */
    public void delete(City city) {
        if(this.cities.contains(city)) {
            this.cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts the number of cities in the list
     * @return int number of cities in the list
     */
    public int countCities() {
        return this.cities.size();
    }
}
