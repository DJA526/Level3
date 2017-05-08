import java.util.ArrayList;
import java.util.Random;

public class FoodArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("pizza");
		foods.add("pasta");
		foods.add("chicken");
		foods.add("steak");
		foods.add("soup");
		foods.add("tacos");
		foods.add("sushi");
		System.out.println("You're eating " + foods.get(new Random().nextInt(foods.size())) + " for dinner.");
	}
}


//Copyright © 2017 by Delara Aryan