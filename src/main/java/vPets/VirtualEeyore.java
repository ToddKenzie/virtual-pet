package vPets;

public class VirtualEeyore extends VirtualPet {
	
	public VirtualEeyore() {
		hunger = 15;
		thirst = 20;
		boredom = 40;
		sickness = 20;
	
		foodValue = 10;
		waterValue = 10;
		playValue = 7;
		vetValue = 15;
		
		hungerIncreasePerTickMax = 5;
		thirstIncreasePerTickMax = 5;
		boredomIncreasePerTickMax = 10;
		sicknessIncreasePerTickMax = 5;
	}
	
	public String displayPet() {
		String display = " ,~~--~~-.\r\n" + 
				"+      | |\\\r\n" + 
				"|| |~ |`,/-\\\r\n" + 
				"*\\_) \\_) `-'";
		return display;
	}
		
	
}
