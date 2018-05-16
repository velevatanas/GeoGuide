package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ContinentsPackage.Asia;

public class Application {

	public Application() {

	}

	protected void start() {
		MainMenu mm = new MainMenu();
		ContinentsMenu cm = new ContinentsMenu();
		mm.printMenu();
		mm.printItems();
		int choice = mm.takeChoiceForMainMenu();
		while (choice != 9) {
			if (choice == 1) {
				//cm.printMenu();
				//cm.printItems();
				cm.continentsMode(cm);
				
			} else if (choice == 2) {
				break;
			}
			mm.printItems();
			choice = mm.takeChoiceForMainMenu();
		}
		System.out.println("Bye Bye!");
	}

}
