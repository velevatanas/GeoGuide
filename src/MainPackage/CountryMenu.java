package MainPackage;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CountryMenu extends Menu {
	private String words;

	public CountryMenu() {
		super();
		setItems("1 - Bulgaria", "2 - Italy", "3 - France", "4 - Greece", "5 - Netherlands", "6 - Switzerland",
				"7 - Spain", "9 - Back");
		words = "CHOOSE A COUNTRY YOU WANT INFORMATION FOR";
	}

	@Override
	protected void printMenu() {
		System.out.println(words);
		sleep();
		beep();
		drawLine();
	}

	protected void countryMode(Menu cm) {
		int choice = 0;
		int countryChoice = 0;
		while (choice != 9) {
			cm.printMenu();
			cm.printItems();
			choice = takeChoiceForCountryMenu();
			if (choice == 1) {
				Country bulgaria = new Country(ContinentName.Europe, "Bulgaria", Religion.Christianity, "110 994 km2",
						"7.12 million", 1, "Unitary parliamentary constitutional republic", "Sofia", 
						"Bulgaria officially the Republic of Bulgaria is a country in southeastern Europe.\n"
						+ "It is bordered by Romania to the north, Serbia and Macedonia to the west, Greece and\n"
						+ "Turkey to the south, and the Black Sea to the east.\n");
				concreteCountryMenuShow(bulgaria);
				drawLine();
				countryChoice = takeConcreteCountryChoice(bulgaria);
				countryInfo(bulgaria, countryChoice);
			} else if (choice == 2) {
				Country italy = new Country(ContinentName.Europe, "Italy", Religion.Christianity, "301 338 km2",
						"60.59 million", 1, "Unitary parliamentary constitutional republic", "Rome", 
						"Italy officially the Italian Republic is a unitary parliamentary republic in Europe.\n"
						+ "Located in the heart of the Mediterranean Sea, Italy shares open land borders with France,\n"
						+ "Switzerland, Austria, Slovenia, San Marino, and Vatican City.\n");
				concreteCountryMenuShow(italy);
				drawLine();
				countryChoice = takeConcreteCountryChoice(italy);
				countryInfo(italy, countryChoice);
			} else if (choice == 3) {
				Country france = new Country(ContinentName.Europe, "France", Religion.Christianity, "643 801 km2",
						"66.9 million", 1, "Unitary semi-presidential constitutional republic", "Paris", 
						"France is a country whose territory consists of metropolitan France in western Europe,\n"
						+ "as well as several overseas regions and territories. The metropolitan area of France\n"
						+ "extends from the Mediterranean Sea to the English Channel and the North Sea, and from\n"
						+ "the Rhine to the Atlantic Ocean. The overseas territories include French Guiana in South\n"
						+ "America and several islands in the Atlantic, Pacific and Indian oceans.\n");
				concreteCountryMenuShow(france);
				drawLine();
				countryChoice = takeConcreteCountryChoice(france);
				countryInfo(france, countryChoice);
			} else if (choice == 4) {
				Country greece = new Country(ContinentName.Europe, "Greece", Religion.Christianity, "131 957 km2",
						"10.768 million", 1, "Unitary parliamentary republic", "Athens", 
						"Greece is located at the crossroads of Europe, Asia, and Africa. Situated on\n"
						+ "the southern tip of the Balkan Peninsula, it shares land borders with Albania\n"
						+ "to the northwest, the Republic of Macedonia and Bulgaria to the north, and Turkey\n"
						+ "to the northeast. The Aegean Sea lies to the east of the mainland, the Ionian Sea\n"
						+ "to the west, the Cretan Sea and the Mediterranean Sea to the south. Greece has the\n"
						+ "longest coastline on the Mediterranean Basin and the 11th longest coastline in the\n"
						+ "world at 13,676 km in length, featuring a large number of islands, of\n"
						+ "which 227 are inhabited.\n");
				concreteCountryMenuShow(greece);
				drawLine();
				countryChoice = takeConcreteCountryChoice(greece);
				countryInfo(greece, countryChoice);
			} else if (choice == 5) {
				Country netherlands = new Country(ContinentName.Europe, "Netherlands", Religion.Christianity, "41 543 km2",
						"17.2 million", 1, "Unitary parliamentary constitutional monarchy", "Amsterdame", 
						"The Netherlands, also known informally as Holland, is a country in Western Europe.\n"
						+ "Together with three island territories in the Caribbean (Bonaire, Sint Eustatius and Saba),\n"
						+ "it forms a constituent country of the Kingdom of the Netherlands. The European portion of\n"
						+ "the Netherlands consists of twelve provinces and borders Germany to the east, Belgium to\n"
						+ "the south, and the North Sea to the northwest, sharing maritime borders in the North Sea with\n"
						+ "Belgium, the United Kingdom, and Germany.\n");
				concreteCountryMenuShow(netherlands);
				drawLine();
				countryChoice = takeConcreteCountryChoice(netherlands);
				countryInfo(netherlands, countryChoice);
			} else if (choice == 6) {
				Country switzerland = new Country(ContinentName.Europe, "Switzerland", Religion.Christianity, "41 285 km2",
						"8.4 million", 1, "Federal semi-direct democracy under multi-party parliamentary directorial republic", "Bern", 
						"Switzerland, officially the Swiss Confederation, is a federal republic in Europe. It consists\n"
						+ "of 26 cantons, and the city of Bern is the seat of the federal authorities. The country is\n"
						+ "situated in Western-Central Europe, and is bordered by Italy to the south, France to the west,\n"
						+ "Germany to the north, and Austria and Liechtenstein to the east. Switzerland is a landlocked\n"
						+ "country geographically divided between the Alps, the Swiss Plateau and the Jura Mountains\n");
				concreteCountryMenuShow(switzerland);
				drawLine();
				countryChoice = takeConcreteCountryChoice(switzerland);
				countryInfo(switzerland, countryChoice);
			} else if (choice == 7) {

			}
		}
	}

	protected int takeChoiceForCountryMenu() {

		int choice = 0;
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7
				&& choice != 9) {
			try {
				String input = getIn().readLine();
				if (isDigit(input)) {
					throw new GeoException();
				}
				choice = Integer.parseInt(input);
				if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6
						&& choice != 7 && choice != 9) {
					throw new GeoException();
				}
			} catch (GeoException e) {
				printItems();
			} catch (IOException e) {
				printItems();
			} catch (NumberFormatException e) {
				printItems();
			}
		}
		return choice;
	}

	protected int takeConcreteCountryChoice(Country c) {

		int choice = 0;
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7
				&& choice != 9) {
			try {
				String input = getIn().readLine();
				if (isDigit(input)) {
					throw new GeoException();
				}
				choice = Integer.parseInt(input);
				if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6
						&& choice != 7 && choice != 9) {
					throw new GeoException();
				}
			} catch (GeoException e) {
				concreteCountryMenuShow(c);
			} catch (IOException e) {
				concreteCountryMenuShow(c);
			} catch (NumberFormatException e) {
				concreteCountryMenuShow(c);
			}
		}
		return choice;
	}

	protected void concreteCountryMenuShow(Country c) {
		System.out.printf("What about %s ?\n", c.getName());
		drawLine();
		beep();
		System.out.printf("1 - Area of %s\n", c.getName());
		System.out.printf("2 - Population of %s\n", c.getName());
		System.out.printf("3 - Continent of %s\n", c.getName());
		System.out.printf("4 - Religion %s\n", c.getReligion());
		System.out.printf("5 - Political system of %s\n", c.getName());
		System.out.printf("6 - Capital of %s\n", c.getName());
		System.out.printf("7 - Short info for %s\n", c.getName());
		System.out.println("9 - Back");
		// int choice = takeConcreteContinentsChoice();
	}

	protected void countryInfo(Country c, int choice) {
		while (choice != 9) {
			if (choice == 1) {
				drawStars();
				System.out.printf("The area of %s is %s\n", c.getName(), c.getArea());
				drawStars();
			} else if (choice == 2) {
				drawStars();
				System.out.printf("The popultion of %s is %s\n", c.getName(), c.getPopulation());
				drawStars();
			} else if (choice == 3) {
				drawStars();
				System.out.printf("%s is occupied in %s\n", c.getName(), c.getContinentName());
				drawStars();
			} else if (choice == 4) {
				drawStars();
				System.out.printf("Official religion is %s\n", c.getReligion());
				drawStars();
			} else if (choice == 5) {
				drawStars();
				System.out.printf("The politica system of %s is %s\n", c.getName(), c.getPoliticalSystem());
				drawStars();
			} else if (choice == 6) {
				drawStars();
				System.out.printf("The capital of %s is %s\n", c.getName(), c.getCapital());
				drawStars();
			} else if (choice == 7) {
				drawStars();
				System.out.printf("%s\n", c.getTouristInfo());
				drawStars();
			}

			drawLine();
			beep();
			concreteCountryMenuShow(c);
			drawLine();
			choice = takeConcreteCountryChoice(c);
		}

	}

}
