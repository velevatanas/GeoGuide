package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class SouthAmerica extends Continent {

	public SouthAmerica() {
		setContinentName(ContinentName.South_America);
		setArea("17,84 mln km2");
		setPopulation("422.5 mln");
		setTimeZones(5);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Argentina", "Bolivia", "Brazil", "Chile",
				"Colomba", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"));
		setCountries(list);
		setTouristInfo("South America is a continent located in the Western Hemisphere,\n"
				+ "mostly in the Southern Hemisphere, with a relatively small portion in\n"
				+ "the Northern Hemisphere. It may also be considered a subcontinent of\n"
				+ "the Americas, which is how it is viewed in the Spanish and\n"
				+ "Portuguese-speaking regions of the Americas. The reference to South America\n"
				+ "instead of other regions (like Latin America or the Southern Cone) has\n"
				+ "increased in the last decades due to changing geopolitical dynamics\n"
				+ "(in particular, the rise of Brazil)\n");
	}

}
