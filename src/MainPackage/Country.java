package MainPackage;


public class Country {
	private ContinentName continentName;
	private String name;
	private Religion religion;
	private String area;
	private String population;
	private int timezones;
	private String politicalSystem;
	private String capital;
	private String touristInfo;
	
	public Country(ContinentName cn, String name, Religion rel, String area, String pop,
			int timeones, String politicalSystem, String capital, String info) {
		setContinentName(cn);
		setName(name);
		setReligion(rel);
		setArea(area);
		setPopulation(pop);
		setTimezones(timeones);
		setPoliticalSystem(politicalSystem);
		setCapital(capital);
		setTouristInfo(info);
	}
	
	protected ContinentName getContinentName() {
		return continentName;
	}
	protected void setContinentName(ContinentName continentName) {
		this.continentName = continentName;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected Religion getReligion() {
		return religion;
	}
	protected void setReligion(Religion religion) {
		this.religion = religion;
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
	protected int getTimezones() {
		return timezones;
	}
	protected void setTimezones(int timezones) {
		this.timezones = timezones;
	}
	protected String getPoliticalSystem() {
		return politicalSystem;
	}
	protected void setPoliticalSystem(String politicalSystem) {
		this.politicalSystem = politicalSystem;
	}
	protected String getCapital() {
		return capital;
	}
	protected void setCapital(String capital) {
		this.capital = capital;
	}
	protected String getTouristInfo() {
		return touristInfo;
	}
	protected void setTouristInfo(String touristInfo) {
		this.touristInfo = touristInfo;
	}

}
