package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class NorthAmerca extends Continent {
	public NorthAmerca() {
		setContinentName(ContinentName.North_America);
		setArea("24,71 million km2");
		setPopulation("579 million");
		setTimeZones(9);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Antigua and Barbuda", "Bahamas", "Barbados",
				"Belize", "Canad", "Costa Rica", "Cuba", "Dominica", "Dominican Republic", "El Salvador", "Grenada",
				"Guatemala", "Haiti", "Honduras", "Jamaica", "Mexico", "Nicaragua", "Panam", "Saint Kitts and Nevis",
				"Saint Licia", "Saint Vincent and the Grenadines", "Trinidad and Tobago", "United States of America"));
		setCountries(list);
		setTouristInfo("North America is a continent entirely within the Northern Hemisphere\n"
				+ "and almost all within the Western Hemisphere. It is also considered by\n"
				+ "some to be a northern subcontinent of the Americas.It is bordered\n"
				+ "to the north by the Arctic Ocean, to the east by the Atlantic Ocean,\n"
				+ "to the west and south by the Pacific Ocean, and to the southeast by\n"
				+ "South America and the Caribbean Sea.\n");

	}
}
