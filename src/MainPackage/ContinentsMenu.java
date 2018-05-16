package MainPackage;

import java.io.IOException;

import ContinentsPackage.Africa;
import ContinentsPackage.Antarctica;
import ContinentsPackage.Asia;
import ContinentsPackage.AustraliaAndOceania;
import ContinentsPackage.Europe;
import ContinentsPackage.NorthAmerca;
import ContinentsPackage.SouthAmerica;

public class ContinentsMenu extends Menu {
	private String words;

	public ContinentsMenu() {
		super();
		setItems("1 - Asia", "2 - Africa", "3 - Europe", "4 - Antarctica", "5 - North Amerca", "6 - South America",
				"7 - Australia and Oceania", "9 - Back");
		words = "CHOOSE A CONTINENT YOU WANT INFORMATION FOR";
	}

	@Override
	protected void printMenu() {

		System.out.println(words);
		sleep();
		beep();
		drawLine();

	}

	protected int takeChoiceForContinentsMenu() {

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

	protected void continentsMode(Menu cm) {
		int choice = 0;
		int continentChoice = 0;
		// && continentChoice != 9
		while (choice != 9) {
			cm.printMenu();
			cm.printItems();
			choice = takeChoiceForContinentsMenu();
			if (choice == 1) {
				Asia asia = new Asia();
				concreteContinentMenuShow(asia);
				continentChoice = takeConcreteContinentsChoice(asia);
				continentInfo(asia, continentChoice);
			}
			else if(choice == 2) {
				Africa africa = new Africa();
				concreteContinentMenuShow(africa);
				continentChoice = takeConcreteContinentsChoice(africa);
				continentInfo(africa, continentChoice);
			}
			else if(choice == 3) {
				Europe europe = new Europe();
				concreteContinentMenuShow(europe);
				continentChoice = takeConcreteContinentsChoice(europe);
				continentInfo(europe, continentChoice);
			}
			else if(choice == 4) {
				Antarctica antarctica = new Antarctica();
				concreteContinentMenuShow(antarctica);
				continentChoice = takeConcreteContinentsChoice(antarctica);
				continentInfo(antarctica, continentChoice);
			}
			else if(choice == 5) {
				NorthAmerca northAmerca = new NorthAmerca();
				concreteContinentMenuShow(northAmerca);
				continentChoice = takeConcreteContinentsChoice(northAmerca);
				continentInfo(northAmerca, continentChoice);
			}
			else if(choice == 6) {
				SouthAmerica southAmerica = new SouthAmerica();
				concreteContinentMenuShow(southAmerica);
				continentChoice = takeConcreteContinentsChoice(southAmerica);
				continentInfo(southAmerica, continentChoice);
			}
			else if(choice == 7) {
				AustraliaAndOceania australiAandOceania = new AustraliaAndOceania();
				concreteContinentMenuShow(australiAandOceania);
				continentChoice = takeConcreteContinentsChoice(australiAandOceania);
				continentInfo(australiAandOceania, continentChoice);
			}
		}
	}

	protected void concreteContinentMenuShow(Continent continent) {
		System.out.printf("What about %s ?\n", continent.getContinentName());
		drawLine();
		beep();
		System.out.printf("1 - Area of %s\n", continent.getContinentName());
		System.out.printf("2 - Population of %s\n", continent.getContinentName());
		System.out.printf("3 - Number of time zones of %s\n", continent.getContinentName());
		System.out.printf("4 - Geographical info for %s\n", continent.getContinentName());
		System.out.printf("5 - List of all countries in %s\n", continent.getContinentName());
		System.out.println("9 - Back to previous menu");
		// int choice = takeConcreteContinentsChoice();
	}

	protected int takeConcreteContinentsChoice(Continent continent) {

		int choice = 0;
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 9) {
			try {
				String input = getIn().readLine();
				if (isDigit(input)) {
					throw new GeoException();
				}
				choice = Integer.parseInt(input);
				if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5
						&& choice != 9) {
					throw new GeoException();
				}
			} catch (GeoException e) {
				concreteContinentMenuShow(continent);
			} catch (IOException e) {
				concreteContinentMenuShow(continent);
			} catch (NumberFormatException e) {
				concreteContinentMenuShow(continent);
			}
		}
		return choice;
	}

	protected void continentInfo(Continent continent, int choice) {
		while (choice != 9) {
			if (choice == 1) {
				System.out.printf("The area of %s is %s\n", continent.getContinentName(), continent.getArea());
			} else if (choice == 2) {
				System.out.printf("The popultion of %s is %s\n", continent.getContinentName(),
						continent.getPopulation());
			} else if (choice == 3) {
				System.out.printf("%s has %d different timezones\n", continent.getContinentName(),
						continent.getTimeZones());
			} else if (choice == 4) {
				System.out.printf("%s \n", continent.getTouristInfo());
			} else if (choice == 5) {
				continent.getCountries().stream().forEach(x -> System.out.println(x));
			}
			drawLine();
			beep();
			concreteContinentMenuShow(continent);
			choice = takeConcreteContinentsChoice(continent);
		}

	}
}
