package MainPackage;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Menu {
	private BufferedReader in;
	private String[] items;

	public Menu() {
		in = (new BufferedReader(new InputStreamReader(System.in)));
	}
	protected void setItems(String... items) {
		this.items = items;
	}

	protected abstract void printMenu();

	protected void drawLine() {
		Stream.generate(() -> '-').limit(100).forEach(x -> System.out.print(x));
		System.out.println();
	}

	protected void printItems() {
		Arrays.stream(items).forEach(x -> System.out.println(x));
		sleep();
		beep();
		drawLine();
	}

	public BufferedReader getIn() {
		return in;
	}
	protected void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	protected void beep() {
		Toolkit.getDefaultToolkit().beep();
	}

	protected boolean isDigit(String s) {
		if(s.equals("")) {
			return true;
		}
		return s.chars().anyMatch(x -> !Character.isDigit(x));
	}
}
