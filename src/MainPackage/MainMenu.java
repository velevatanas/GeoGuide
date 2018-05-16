package MainPackage;

import java.awt.Toolkit;
import java.io.IOException;

public class MainMenu extends Menu {
	private String startingWords;

	public MainMenu() {
		super();
		setItems("1 - Continents", "2 - Countries", "9 - Exit");
		startingWords = "LET ME SHOW YOU SOME OF THE WORLD!\n"
				+ "CHOOSE FROM THE MENU WHETHER YOU WANT INFO FOR A SPECIFIC COUNTRY OR FOR A WHOLE CONTINENT";
	}

	@Override
	protected void printMenu() {
		System.out.println(startingWords);
		sleep();
		beep();
		drawLine();
	}

	protected int takeChoiceForMainMenu() {
		int choice = 0;
		while (choice != 1 && choice != 2 && choice != 9) {
			try {
				String input = getIn().readLine();
				if (isDigit(input)) {
					throw new GeoException();
				}
				choice = Integer.parseInt(input);
				if ((choice != 1 && choice != 2 && choice != 9)) {
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

	

	

}
