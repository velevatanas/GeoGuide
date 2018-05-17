package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class Europe extends Continent {
	public Europe() {
		setContinentName(ContinentName.Europe);
		setArea("10,18 million km2");
		setPopulation("741.4 million");
		setTimeZones(7);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Albania", "Andorra", "Armenia", "Azerbaijan",
				"Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic",
				"Denmark", "Estonia", "Finland", "France", "Georgia", "Germany", "Greece", "Hungary", "Iceland",
				"Ireland", "Italy", "Kazakstan", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg",
				"Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "Norway", "Poland", "Portugal",
				"Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland",
				"Turkey", "Ukraine", "United Kingdom", "Vatican City"));
		setCountries(list);
		setTouristInfo("Europe is a continent located entirely in the Northern Hemisphere\n"
				+ "and mostly in the Eastern Hemisphere. It is bordered by the Arctic Ocean\n"
				+ "to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to\n"
				+ "the south.\n");

	}
}
