
public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private int sickness;
	
	private final int foodValue = 15;
	private final int waterValue = 10;
	private final int playValue = 10;
	private final int vetValue = 20;

	public int getHungerLevel() {
		return hunger;
	}

	public int getThirstLevel() {
		return thirst;
	}
	
	public int getBoredom() {
		return boredom;
	}
	
	public int getSickness() {
		return sickness;
	}
	
	
	public VirtualPet() {
		this.hunger = 25;
		this.thirst = 25;
		this.boredom = 25;
		this.sickness = 25;
		
	}

	public void feed() {
		if (hunger < foodValue) {
			hunger = 0;
		} else {
			hunger -= foodValue;
		}
	}

	public void giveWater() {
		if (thirst < waterValue) {
			thirst = 0;
		} else {
			thirst -= waterValue;
		}
	}

	public void play() {
		if (boredom < playValue) {
			boredom = 0;
		} else {
			boredom -= playValue;
		}
	}

	public void takeToVirtualVet() {
		if (sickness < vetValue) {
			sickness = 0;
		} else {
			sickness -= vetValue;
		}
	}




}
