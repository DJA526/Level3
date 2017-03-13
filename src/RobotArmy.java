import java.util.Random;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human human = new Human("Delara");

		//2. create a new Robot army of good and evil robots.
		Robot[] array = new Robot[50];
		for (int i = 0; i < array.length; i++) {
			int a = new Random().nextInt(10);
			if (a % 2 == 0) {
				array[i] = new Robot("robot", true);
			} else {
				array[i] = new Robot("robot", false);
			}
		}
		
		//3. command your robot army to destroy a human
		for (int j = 0; j < array.length; j++) {
			array[j].destroy(human);
		}
	
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}

