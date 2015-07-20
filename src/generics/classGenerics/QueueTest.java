package generics.classGenerics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> loginSequence = new LinkedList<String>();
		loginSequence.add("Alexandar Leos");
		loginSequence.add("Nazmul Haqe");
		loginSequence.add("Harrison George");
		loginSequence.add("Calinder");
		System.out.println("The login sequence is: " + loginSequence);
		while (!loginSequence.isEmpty())
			System.out.println("Removing " + loginSequence.remove());
	}

}
