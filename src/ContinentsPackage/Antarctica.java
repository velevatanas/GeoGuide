package ContinentsPackage;

import java.util.ArrayList;
import java.util.Arrays;

import MainPackage.Continent;
import MainPackage.ContinentName;

public class Antarctica extends Continent {
	public Antarctica() {
		setContinentName(ContinentName.Antarctica);
		setArea("14 mln km2");
		setPopulation("1000");
		setTimeZones(24);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("No countries in Antarctica"));
		setCountries(list);
		setTouristInfo("Antarctica is Earth's southernmost continent. It contains\n"
				+ "the geographic South Pole and is situated in the Antarctic region of\n"
				+ "the Southern Hemisphere, almost entirely south of the Antarctic Circle,\n"
				+ "and is surrounded by the Southern Ocean. It is the fifth-largest continent.\n"
				+ "For comparison, Antarctica is nearly twice the size of Australia. About 98%\n"
				+ "of Antarctica is covered by ice that averages 1.9 km in thickness, which\n"
				+ "extends to all but the northernmost reaches of the Antarctic Peninsula.\n");
	}
}
