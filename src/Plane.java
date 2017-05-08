import java.util.ArrayList;

public class Plane {
	
	static int numberOfPassengers = 100;
	static ArrayList<Snake> snakes = new ArrayList<Snake>();
	
	public static void main(String[] args) {
		
		int totalVenom = 0;
		
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(Randomness.randomNumber(), Randomness.randomBoolean()));
		}
		
		for (Snake s : snakes) {
			if (s.getVenomous() == true) {
				totalVenom = totalVenom + s.getViciousness();
			}
		}
		
		int chanceOfDeath = (totalVenom * 10)/numberOfPassengers;
		System.out.println("Your chance of death is " + chanceOfDeath + "%");
	}

}


//Copyright © 2017 by Delara Aryan