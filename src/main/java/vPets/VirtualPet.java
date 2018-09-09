package vPets;

public abstract class VirtualPet {

	protected int hunger;
	protected int thirst;
	protected int boredom;
	protected int sickness;
	protected int ticksPassed;
	
	protected int foodValue = 15;
	protected int waterValue = 10;
	protected int playValue = 10;
	protected int vetValue = 20;
	
	protected int hungerIncreasePerTickMax = 10;
	protected int thirstIncreasePerTickMax = 10;
	protected int boredomIncreasePerTickMax = 10;
	protected int sicknessIncreasePerTickMax = 10;
			

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
	
	public int getTicksPassed() {
		return ticksPassed;
	}
	
	
	public VirtualPet() {
		this.hunger = 25;
		this.thirst = 25;
		this.boredom = 25;
		this.sickness = 25;
		this.ticksPassed = 0;
		
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

	public void tick() {
		hunger += (int) (Math.random() * hungerIncreasePerTickMax + 1);
		thirst += (int) (Math.random() * thirstIncreasePerTickMax + 1);
		boredom += (int) (Math.random() * boredomIncreasePerTickMax + 1);
		sickness += (int) (Math.random() * sicknessIncreasePerTickMax + 1);
		ticksPassed++;
	}




}
