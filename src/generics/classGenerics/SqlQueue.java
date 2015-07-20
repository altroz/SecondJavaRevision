package generics.classGenerics;

import java.util.ArrayDeque;
import java.util.Deque;

public class SqlQueue {
	private Deque<String> sqlQ = new ArrayDeque<>();

	void addInQueue(String customer) {
		sqlQ.addLast(customer);
	}

	void removeFront() {
		sqlQ.removeFirst();
	}

	void removeBack() {
		sqlQ.removeLast();
	}

	void printQueue() {
		System.out.println("Special queue contains: " + sqlQ);
	}
}
