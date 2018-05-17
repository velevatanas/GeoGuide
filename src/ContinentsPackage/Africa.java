package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class Africa extends Continent {
	public Africa() {
		setContinentName(ContinentName.Africa);
		setArea("30,37 million km2");
		setPopulation("1.216000000 billion");
		setTimeZones(6);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Algeria", "Angola", "Benin", "Botswana",
				"Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central Africa", "Chad", "Comoros",
				"Democratic Republic of Congo", "Republic of Congo", "Cote d'Ivoire", "Djibouti", "Egypt",
				"Equatorial Guinea", "Eritrea", "Eswanti(Swaziland)", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea",
				"Guinea-Bissau", "Kenya", "Lesoto", "Liberia", "Libya", "Madagascar", "Malawai", "Mali", "Mauritania",
				"Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Principe",
				"Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Tanzania", "Togo",
				"Tunisia", "Uganda", "Zambia", "Zimbabwe"));
		setCountries(list);
		setTouristInfo("Africa is the world's second largest and second most-populous continent\n"
				+ "(the first being Asia in both categories). It covers 6% of Earth's total surface\n"
				+ "area and 20% of its total land area. It accounts for about 16% of the world's human\n"
				+ "population. The continent is surrounded by the Mediterranean Sea to the north,\n"
				+ "the Isthmus of Suez and the Red Sea to the northeast, the Indian Ocean to the\n"
				+ "southeast and the Atlantic Ocean to the west. The continent includes Madagascar and\n"
				+ "various archipelagos. It contains 54 fully recognised sovereign states (countries),\n"
				+ "nine territories and two de facto independent states with limited or no recognition.\n"
				+ "The majority of the continent and its countries are in the Northern Hemisphere, with\n"
				+ "a substantial portion and number of countries in the Southern Hemisphere.\n");

	}
}
