
public class Snake {
	
	int viciousness;
	boolean venomous;
	
	Snake(int viciousness, boolean venomous) {
		this.viciousness = viciousness;
		this.venomous = venomous;
	}
	
	public int getViciousness(){
		return viciousness;
	}
	
	public boolean getVenomous(){
		return venomous;
	}

}
