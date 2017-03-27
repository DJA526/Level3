import java.util.Random;

public class Randomness {
	
	public static boolean randomBoolean(){
		return new Random().nextBoolean();
	}
	
	public static int randomNumber(){
		return new Random().nextInt(10) + 1;
	}

}
