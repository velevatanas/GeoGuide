package MainPackage;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CountryMenu extends Menu {
	private String words;

	public CountryMenu() {
		super();
		setItems("1 - Bulgaria", "2 - France", "3 - Italy", "4 - Greece", "5 - Netherlands", "6 - Switzerland",
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
						"7.12 million", 1, "Unitary parliamentary constitutional republic", "Sofia", "Some info here!");
				concreteCountryMenuShow(bulgaria);
				drawLine();
				countryChoice = takeConcreteCountryChoice(bulgaria);
				countryInfo(bulgaria, countryChoice);
			} else if (choice == 2) {

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {

			} else if (choice == 6) {

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
