package vPets;

public class VirtualSimplePet extends VirtualPet{

	
	public VirtualSimplePet() {
		hunger = 25;
		thirst = 25;
		boredom = 25;
		sickness = 25;
		
		foodValue = 15;
		waterValue = 10;
		playValue = 10;
		vetValue = 20;
		
		hungerIncreasePerTickMax = 5;
		thirstIncreasePerTickMax = 5;
		boredomIncreasePerTickMax = 5;
		sicknessIncreasePerTickMax = 5;
		
	}
}
