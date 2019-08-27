import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
	//Set up initial variables 
	private static ArrayList<String> mywords;
	private static ArrayList<Integer> freq;
	private static LinkedList<Double> decimal = new LinkedList<>();
	//constructor
	public Linked() {
		mywords = new ArrayList<String> ();
		freq = new ArrayList<Integer>();
		decimal = new LinkedList<>();
		mywords.add("dog");
		mywords.add("cat");
		decimal.add(10.10);
	}
	
	public static void findUnique() {
		for (int i = 0; i < mywords.size(); i++) {
			System.out.println(mywords.get(i));
}
	}
	public static void Tester () {
		findUnique();
		System.out.println("My unique words" + mywords.size());
		for (int k = 0; k < mywords.size(); k++) {
			System.out.println(freq.get(k) + "\t" + mywords.get(k) + decimal.getFirst());
		}
}
	
	

	public static void main(String[] args) {
	mywords = new ArrayList<String>();
	freq = new ArrayList<Integer>();
	decimal = new LinkedList<Double>();
	
	decimal.add(20.2);
	decimal.add(50.5);
	mywords.add("dog");
	mywords.add("cat");
	freq.add(1);
	freq.add(2);
	decimal.removeLast();
	
	findUnique();
	Tester();
	
Iterator<Double> decimal_itorator = decimal.iterator();
	
	while (decimal_itorator.hasNext()) {
		double decimal_next = decimal_itorator.next();
		System.out.println(decimal);
	}
	}

}
