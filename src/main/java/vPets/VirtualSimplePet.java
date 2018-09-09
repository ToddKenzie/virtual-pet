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
		
		hungerIncreasePerTickMax = 6;
		thirstIncreasePerTickMax = 6;
		boredomIncreasePerTickMax = 6;
		sicknessIncreasePerTickMax = 7;
	}
	
	public String displayPet() {
		String display = "  .^._.^.\r\n" + 
				"  | . . |\r\n" + 
				" (  ---  )\r\n" + 
				" .'     '.\r\n" + 
				" |/     \\|\r\n" + 
				"  \\ /-\\ /\r\n" + 
				"   V   V";
		return display;
	}
}
