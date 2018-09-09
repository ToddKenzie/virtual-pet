package vPets;

public abstract class VirtualPet {

	protected int hunger;
	protected int thirst;
	protected int boredom;
	protected int sickness;
	protected int ticksPassed;
	
	protected int foodValue;
	protected int waterValue;
	protected int playValue;
	protected int vetValue;
	
	protected int hungerIncreasePerTickMax;
	protected int thirstIncreasePerTickMax;
	protected int boredomIncreasePerTickMax;
	protected int sicknessIncreasePerTickMax;
			

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

	public void tick(String previousAction) {
		addHunger(previousAction);
		addThirst(previousAction);
		addBoredom(previousAction);
		addSickness(previousAction);
		ticksPassed++;
	}

	private void addHunger(String previousAction) {
		if (!previousAction.equals("feed")) {
			hunger += (int) (Math.random() * hungerIncreasePerTickMax + 1);
		}
	}
	
	private void addThirst(String previousAction) {
		if(!previousAction.equals("giveWater")) {
			thirst += (int) (Math.random() * thirstIncreasePerTickMax + 1);
		}
	}
	
	private void addBoredom(String previousAction) {
		if (!previousAction.equals("play")) {
			boredom += (int) (Math.random() * boredomIncreasePerTickMax + 1);
		}
	}
	
	private void addSickness(String previousAction) {
		if (!previousAction.equals("takeToVirtualVet")) {
			sickness += (int) (Math.random() * sicknessIncreasePerTickMax + 1);
		}
	}
	
	




}
