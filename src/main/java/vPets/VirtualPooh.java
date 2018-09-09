package vPets;

public class VirtualPooh extends VirtualPet {

	public VirtualPooh() {
		hunger = 40;
		thirst = 20;
		boredom = 10;
		sickness = 15;
	
		foodValue = 7;
		waterValue = 5;
		playValue = 10;
		vetValue = 15;
		
		hungerIncreasePerTickMax = 15;
		thirstIncreasePerTickMax = 5;
		boredomIncreasePerTickMax = 5;
		sicknessIncreasePerTickMax = 5;
		
	}
}
