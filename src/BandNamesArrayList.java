import java.util.ArrayList;
import java.util.Random;

public class BandNamesArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("clandestine");
		adjectives.add("extraterrestrial");
		adjectives.add("obsequious");
		adjectives.add("childish");
		adjectives.add("pink");
		adjectives.add("fortuitous");
		adjectives.add("hypothermic");
		
		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("turtles");
		nouns.add("quadrilaterals");
		nouns.add("magnets");
		nouns.add("gambino");
		nouns.add("flamingos");
		nouns.add("potholes");
		nouns.add("carpets");
		
		System.out.println("Your band name is: " + adjectives.get(new Random().nextInt(adjectives.size() - 1)) + 
				" " + nouns.get(new Random().nextInt(nouns.size() - 1)));
	}

}
