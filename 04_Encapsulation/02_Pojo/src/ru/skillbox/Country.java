package ru.skillbox;

public class Country {
    private String countryName;
    private long populationSize;
    private double area;
    private String capitalName;
    private boolean hasAccessToTheSea;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(long populationSize) {
        this.populationSize = populationSize;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isHasAccessToTheSea() {
        return hasAccessToTheSea;
    }

    public void setHasAccessToTheSea(boolean hasAccessToTheSea) {
        this.hasAccessToTheSea = hasAccessToTheSea;
    }
}
