//package fileNavigation.One;
//
//import java.io.Console;
//import java.io.IOException;
//
//
//public class TestJavaConsole {
//	public static void main(String[] args) throws IOException {
//		Console c = System.console();
//		char[] pw;
//		pw = c.readPassword();
//		for (char ch : pw)
//			c.format("%c", ch);
//		c.format("\n");
//
//		MyUtilClass mu = new MyUtilClass();
//		while (true) {
//			String name = c.readLine("%s", "input? : ");
//			c.format("Output: %s \n", mu.doSomething(name));
//		}
//	}
//
//	}
