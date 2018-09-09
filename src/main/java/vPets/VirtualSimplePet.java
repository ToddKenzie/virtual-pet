package vPets;

public class VirtualSimplePet extends VirtualPet{

	private int petToDisplay;
	
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
		
		petToDisplay = (int) (Math.random() * 3 + 1);
	}
	
	public String displayPet() {
		String display;
		if (petToDisplay == 1) {
		display = "            .     .\r\n" + 
				"           (>\\---/<)\r\n" + 
				"           ,'     `.\r\n" + 
				"          /  q   p  \\\r\n" + 
				"         (  >(_Y_)<  )\r\n" + 
				"          >-' `-' `-<-.\r\n" + 
				"         /  _.== ==.,- \\\r\n" + 
				"        /,    )`  '(    )\r\n" + 
				"       ; `._.'      `--<\r\n" + 
				"      :     \\        |  )\r\n" + 
				"      \\      )       ;_/  \r\n" + 
				"       `._ _/_  ___.'-\\\\\\\r\n" + 
				"          `--\\\\\\\r\n";
		} else if (petToDisplay == 2) {		
		display = " _          _\r\n" + 
				" \\`.__..--'' `.\r\n" + 
				" ( _          ,\\\r\n" + 
				"( <_< < <   `','`.\r\n" + 
				" \\ (_< < <    \\   `.\r\n" + 
				"  `. `----'   (  q _p\r\n" + 
				"    `-._  _.-' `-(_''\\\r\n" + 
				"     (_'))--,      `._\\\r\n" + 
				"        `-._<";
		} else {
			display = "     _>-.    ____    .-<_\r\n" + 
					"      >-.\\.-'____`-./ ,<\r\n" + 
					"        .','\"\\__/\"`.`<_,-,\r\n" + 
					"      _/ / \\_/  \\_/ \\!  (D\\\r\n" + 
					"       \\ \\_/ \\__/ \\_/!_ (D/\r\n" + 
					"        `.`../__\\,.'.< `-`\r\n" + 
					"     _>-'/`-.____.-'\\ `<_\r\n" + 
					"      >-'            `-<\r\n"; 
		}
		return display;
	}
}
