package IOFundalmental.two;

import java.io.Console;

public class Login {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userName = null;
			char[] passWord = null;

			userName = console.readLine("Enter your username: ");
			passWord = console.readPassword("Enter your password: ");

			if (userName.equals("scrat") && new String(passWord).equals("nuts")) {
				console.printf("login successful");
			} else
				console.printf("restart application and try again");
		}
	}
}
