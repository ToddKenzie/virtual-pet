package virtualPetApp;

import java.util.Scanner;

import vPets.*;

public class VirtualPetApp {

	static VirtualPet virtualPet;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VPetStore vPetStore = new VPetStore();

		System.out.println("Welcome to the Virtual Pet Store!");
		System.out.println("We have a variety of pets for you");
		System.out.println("Enter \'Pooh\' for a PoohBear pet");
		System.out.println("Enter \'Eeyore\' for an EeyoreDonkey pet");
		System.out.println("Enter \'Piglet\' for a PigletPig pet");
		System.out.println("Any other value with give you a Simple pet:");

		String petChoice = input.nextLine();
		virtualPet = vPetStore.purchasePet(petChoice);

		System.out.println("Thanks for choosing your new pet.");
		System.out.println(virtualPet.displayPet());
		System.out.println("Please take care of them.  If you don't, they may decide to leave you.");

		boolean isStillPlaying = true;
		while (isStillPlaying) {

			System.out.println("Current Pet Stats:");
			System.out.println("Hunger: " + displayHungerLevel());
			System.out.println("Thirst: " + displayThirstLevel());
			System.out.println("Disposition: " + displayBoredomLevel());
			System.out.println("Health: " + displaySicknessLevel() + "\n");

			System.out.println("What would you like to do with your pet?");
			System.out.println("Press 1 to fed your pet.");
			System.out.println("Press 2 to give your pet water.");
			System.out.println("Press 3 to play with your pet.");
			System.out.println("Press 4 to bring your pet to the Virtual Vet.");
			System.out.println("Press 5 to look at your pet again.");
			System.out.println("Press I to ignore your pet.");
			System.out.println("Press Q to quit.");

			String menuChoice = input.nextLine();
			String previousAction = "";
			if (menuChoice.equals("1")) {
				System.out.println("You have fed your pet.");
				virtualPet.feed();
				previousAction = "feed";
			} else if (menuChoice.equals("2")) {
				System.out.println("You have given your pet water.");
				virtualPet.giveWater();
				previousAction = "giveWater";
			} else if (menuChoice.equals("3")) {
				System.out.println("You played with your pet.");
				virtualPet.play();
				previousAction = "play";
			} else if (menuChoice.equals("4")) {
				System.out.println("You took your pet to the vet.");
				virtualPet.takeToVirtualVet();
				previousAction = "takeToVirtualVet";
			} else if (menuChoice.equals("5")) {
				System.out.println(virtualPet.displayPet());
			} else if (menuChoice.equalsIgnoreCase("I")) {
				System.out.println("Why would you do that to your pet???");
				previousAction = "ignored";
			} else if (menuChoice.equalsIgnoreCase("Q")) {
				System.out.println("We're sorry to see you go");
				isStillPlaying = false;
			} else {
				System.out.println("That was an invalid command");
			}

			if (isAnyStatOver50()) {
				System.out.println("\nYou couldn't take care of your pet.  They decided to leave you.");
				previousAction = "";
				isStillPlaying = false;
			}

			if (!previousAction.equals("")) {
				System.out.println("Time passes");
				virtualPet.tick(previousAction);
			}

		}

		input.close();
		System.out.println("You had your pet for " + virtualPet.getTicksPassed() + " virtual days.");

	}

	public static boolean isAnyStatOver50() {
		return (virtualPet.getHunger() > 50 || virtualPet.getThirst() > 50 || virtualPet.getBoredom() > 50
				|| virtualPet.getSickness() > 50);

	}

	public static String displayHungerLevel() {
		int hunger = virtualPet.getHunger();
		if (hunger < 8) {
			return "Well Fed";
		} else if (hunger < 16) {
			return "Fed";
		} else if (hunger < 24) {
			return "Ok";
		} else if (hunger < 32) {
			return "Hungry";
		} else if (hunger < 40) {
			return "Starving";
		} else {
			return "Ravenous";
		}
	}

	public static String displayThirstLevel() {
		int thirst = virtualPet.getThirst();
		if (thirst < 8) {
			return "Quenched";
		} else if (thirst < 16) {
			return "Satisfied";
		} else if (thirst < 24) {
			return "Ok";
		} else if (thirst < 32) {
			return "Parched";
		} else if (thirst < 40) {
			return "Thirsty";
		} else {
			return "Dehydrated";
		}
	}

	public static String displayBoredomLevel() {
		int boredom = virtualPet.getBoredom();
		if (boredom < 8) {
			return "Entertained";
		} else if (boredom < 16) {
			return "Interested";
		} else if (boredom < 24) {
			return "Ok";
		} else if (boredom < 32) {
			return "Disinterested";
		} else if (boredom < 40) {
			return "Blas\u00E9";
		} else {
			return "Spiritless";
		}
	}

	public static String displaySicknessLevel() {
		int sickness = virtualPet.getSickness();
		if (sickness < 8) {
			return "Great Health";
		} else if (sickness < 16) {
			return "Healthy";
		} else if (sickness < 24) {
			return "Ok";
		} else if (sickness < 32) {
			return "Ailing";
		} else if (sickness < 40) {
			return "Afflicted";
		} else {
			return "Debilitated";
		}
	}

}
