package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class AustraliaAndOceania extends Continent {
	public AustraliaAndOceania() {
		setContinentName(ContinentName.Australia_And_Oceania);
		setArea("8,6 million km2");
		setPopulation("35 million");
		setTimeZones(3);
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", "Nauru", "New Zealand",
						"Palau", "Papua and New Guinea", "Samoa", "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu"));
		setCountries(list);
		setTouristInfo("Oceania is a geographic region comprising Melanesia, Micronesia,\n"
				+ "Polynesia and Australasia. Spanning the eastern and western hemispheres,\n"
				+ "Situated in the southeast of the Asia Pacific\n"
				+ "region, Oceania is the smallest continental grouping in land area and the second\n"
				+ "smallest in population after Antarctica.\n");

	}
}
