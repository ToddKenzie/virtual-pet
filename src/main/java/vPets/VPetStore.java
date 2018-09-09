package vPets;

public class VPetStore {

	public VirtualPet purchasePet(String petToPurchase) {
		VirtualPet newPet = null;
		
		if(petToPurchase.equalsIgnoreCase("eeyore")) {
			newPet = new VirtualEeyore();
		} else if (petToPurchase.equalsIgnoreCase("pooh")) {
			newPet = new VirtualPooh();
		} else if (petToPurchase.equalsIgnoreCase("piglet")) {
			newPet = new VirtualPiglet();
		} else {
			newPet = new VirtualSimplePet();
		}
		
		return newPet;
	}

}
