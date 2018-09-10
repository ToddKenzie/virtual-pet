package vPets;

public class VirtualPiglet extends VirtualPet {

	protected VirtualPiglet() {
		hunger = 20;
		thirst = 20;
		boredom = 20;
		sickness = 20;
	
		foodValue = 10;
		waterValue = 10;
		playValue = 10;
		vetValue = 10;
		
		hungerIncreasePerTickMax = 5;
		thirstIncreasePerTickMax = 5;
		boredomIncreasePerTickMax = 5;
		sicknessIncreasePerTickMax = 10;
	}
	
	public String displayPet() {
		String display = "        _\r\n" + 
				"      _<_/_\r\n" + 
				"   __/    _>\r\n" + 
				"  '\\  '  |\r\n" + 
				"    \\___/\r\n" + 
				"    /+++\\\r\n" + 
				" o=|..|..|\r\n" + 
				"   | o/..|\r\n" + 
				"0==|+++++|\r\n" + 
				" 0======/";
		return display;
	}
	
}
