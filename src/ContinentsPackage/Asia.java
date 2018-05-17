package ContinentsPackage;


import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class Asia extends Continent {
	//private static final int NUMBER = 1;

	public Asia() {
		setContinentName(ContinentName.Asia);
		setArea("44.58 million km2");
		setPopulation("4.462 billion");
		setTimeZones(11);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Afghanistan", "Armenia", "Azerbaijan", "Bahrain",
				"Bangladesh", "Bhutan", "Brunei", "Cambodia", "China", "Cyprus", "Georgia", "India", "Indonesia",
				"Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon",
				"Malasia", "Maldives", "Mongolia", "Mianmar", "Nepal", "North Korea", "Oman", "Pakistan", "Palestine",
				"Philippines", "Quatar", "Russia", "Saudi Arabia", "Singapore", "South Korea", "Sri Lanka", "Syria",
				"Taiwan", "Tajikistan", "Tailand", "Timur-Leste", "Turkey", "Turkmenistan", "United Arab Emirates",
				"Uzbekistan", "Vietnam", "Yemen"));
		setCountries(list);
		setTouristInfo("Asia is Earth's largest and most populous continent, located primarily\n"
				+ "in the Eastern and Northern Hemispheres. It shares the continental landmass\n"
				+ "of Eurasia with the continent of Europe and the continental landmass of Afro-Eurasia\n"
				+ "with both Europe and Africa. Asia covers about 30% of Earth's total land area and 8.7%\n"
				+ "of the Earth's total surface area.In general terms, Asia is bounded on the east by the\n"
				+ "Pacific Ocean, on the south by the Indian Ocean and on the north by the Arctic Ocean. The\n"
				+ "western boundary with Europe is a historical and cultural construct, as there is no clear\n"
				+ "physical and geographical separation between them. The most commonly accepted boundaries\n"
				+ "place Asia to the east of the Suez Canal, the Ural River, and the Ural Mountains, and\n"
				+ "south of the Caucasus Mountains and the Caspian and Black Seas.\n");

	}
}
