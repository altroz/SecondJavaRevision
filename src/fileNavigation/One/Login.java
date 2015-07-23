package fileNavigation.One;

import java.io.Console;

public class Login {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userName = null;
			char[] password = null;
			userName = console.readLine("Enter your userName: ");
			password = console.readPassword("Enter your password");

			if (userName.equals("scrat") && new String(password).equals("nuts")) {
				console.printf("Login Successful");
			} else
				console.printf("Restart application and try again");

		}
	}
}
