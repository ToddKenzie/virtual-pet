package virtualPetApp;

import java.util.Scanner;

import vPets.*;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VPetStore vPetStore = new VPetStore();

		System.out.println("Welcome to the Virtual Pet Store!");
		System.out.println("We have a variety of pets for you");
		System.out.println("Enter \'Pooh\' for a PoohBear pet");
		System.out.println("Enter \'Eeyore\' for an EeyoreDonkey pet");
		System.out.println("Enter \'Piglet\' for a PigletPig pet");
		System.out.println("Or just \'simple\' for a Simple pet:");

		String petChoice = input.nextLine();
		// TO-DO: need to verify Pet Choice is valid here
		VirtualPet virtualPet = vPetStore.purchasePet(petChoice);

		System.out.println("Thanks for choosing your new pet.");
		System.out.println(virtualPet.displayPet());
		System.out.println("Pets are happier when they have low stats. They are unhappy with high stats.");
		System.out.println("If their stats get too high, they may leave you, or worse!\n");

		while (true) {

			System.out.println("Current Pet Stats:");
			System.out.println("Hunger: " + virtualPet.getHungerLevel());
			System.out.println("Thirst: " + virtualPet.getThirstLevel());
			System.out.println("Boredom: " + virtualPet.getBoredom());
			System.out.println("Sickness: " + virtualPet.getSickness() + "\n");

			System.out.println("What would you like to do with your pet?");
			System.out.println("Press 1 to fed your pet.");
			System.out.println("Press 2 to give your pet water.");
			System.out.println("Press 3 to play with your pet.");
			System.out.println("Press 4 to bring your pet to the Virtual Vet.");
			System.out.println("Press 5 to quit.");

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
				System.out.println("We're sorry to see you go");
				System.out.println("You had your pet for " + virtualPet.getTicksPassed() + " virtual days.");
				input.close();
				System.exit(0);
			} else {
				System.out.println("That was an invalid command");
			}

			System.out.println("Time passes");
			virtualPet.tick(previousAction);
			if (virtualPet.getTicksPassed() % 3 == 0) {
				System.out.println(virtualPet.displayPet());
			}
		}

	}

}
