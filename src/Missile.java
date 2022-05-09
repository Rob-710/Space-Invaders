package src;

public class Missile{
	private final int attackPoints = 1;
	private boolean Available;
	private int x = 0;
	private int y = 0;
	

public Missile(int x_value, int y_value) {
    setMissileAvailable(true);
    this.x = x_value;
    this.y = y_value; 
}

public void setMissileAvailable(boolean Available) {
    this.Available = Available;
}

public boolean isAvailable() {
    return Available;
}

}
