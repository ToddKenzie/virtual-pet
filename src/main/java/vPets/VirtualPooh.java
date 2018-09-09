package vPets;

public class VirtualPooh extends VirtualPet {

	public VirtualPooh() {
		hunger = 35;
		thirst = 20;
		boredom = 10;
		sickness = 15;
	
		foodValue = 10;
		waterValue = 5;
		playValue = 10;
		vetValue = 15;
		
		hungerIncreasePerTickMax = 15;
		thirstIncreasePerTickMax = 5;
		boredomIncreasePerTickMax = 5;
		sicknessIncreasePerTickMax = 5;
	}
	
	public String displayPet() {
		String display = "  _( )_\n (     (o___\n  |      _ 7\n";
		display += "   \\    (\")\n   /     \\ \\ \n  |    \\ __/\n";
		display += "  |        |\n  (       /\n   \\     /\n";
		display += "    )   /(_\n    |  (___)\n     \\___)";
		return display;
	}
}
