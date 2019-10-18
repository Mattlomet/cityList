package com.company.cityList.models;

public class City {

    private String name;

    private String state;

    private Integer population;

    private Boolean capital;

    public City(String name, String state, Integer population, Boolean capital) {
        this.name = name;
        this.state = state;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Boolean getCapital() {
        return capital;
    }

    public void setCapital(Boolean capital) {
        this.capital = capital;
    }
}
