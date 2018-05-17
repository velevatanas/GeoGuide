package MainPackage;

import java.util.ArrayList;

public abstract class Continent {
	private ContinentName continentName;
	private String area;
	private String population;
	private ArrayList<String> countries;
	private int timeZones;
	private String touristInfo;

	protected ContinentName getContinentName() {
		return continentName;
	}

	protected void setContinentName(ContinentName continentName) {
		this.continentName = continentName;
	}

	protected String getArea() {
		return area;
	}

	protected void setArea(String area) {
		this.area = area;
	}

	protected String getPopulation() {
		return population;
	}

	protected void setPopulation(String population) {
		this.population = population;
	}

	protected ArrayList<String> getCountries() {
		return countries;
	}

	protected void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	protected int getTimeZones() {
		return timeZones;
	}

	protected void setTimeZones(int timeZones) {
		this.timeZones = timeZones;
	}

	protected String getTouristInfo() {
		return touristInfo;
	}

	protected void setTouristInfo(String touristInfo) {
		this.touristInfo = touristInfo;
	}
	
	
	
}
