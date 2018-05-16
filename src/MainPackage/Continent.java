package MainPackage;

import java.util.ArrayList;

public abstract class Continent {
	private static ContinentName continentName;
	private static String area;
	private static String population;
	private static ArrayList<String> countries;
	private static int timeZones;
	private static String touristInfo;

	protected static ContinentName getContinentName() {
		return continentName;
	}

	protected void setContinentName(ContinentName continentName) {
		this.continentName = continentName;
	}

	protected static String getArea() {
		return area;
	}

	protected void setArea(String area) {
		this.area = area;
	}

	protected static String getPopulation() {
		return population;
	}

	protected void setPopulation(String population) {
		this.population = population;
	}

	protected static ArrayList<String> getCountries() {
		return countries;
	}

	protected void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	protected static int getTimeZones() {
		return timeZones;
	}

	protected void setTimeZones(int timeZones) {
		this.timeZones = timeZones;
	}

	protected static String getTouristInfo() {
		return touristInfo;
	}

	protected void setTouristInfo(String touristInfo) {
		this.touristInfo = touristInfo;
	}
	
	
	
}
