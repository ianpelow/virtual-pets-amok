import static org.hamcrest.Matchers.equalToIgnoringCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean continueWithApp = true;

		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		VirtualPet Shadow = new OrganicDog("Shadow", "ORGANIC MALE | Well-behaved and intelligent Golden Retriever", 65, 40, 85, 90, 80);
		VirtualPet Chance = new OrganicDog("Chance", "ORGANIC MALE | Young and energetic American Bulldog", 50, 60, 90, 55, 40);
		VirtualPet Sassy = new OrganicCat("Sassy", "ORGANIC FEMALE | Eccentrically opinionated Himalayan", 40, 60, 50, 95);
		VirtualPet Terminator = new RoboticDog("Terminator", "ROBOTIC MALE | One-person guard dog | German Shepherd", 20, 75, 50);
		VirtualPet KittyCatBot = new RoboticCat("KittyCatBot", "ROBOTIC FEMALE | cunning and independent | Siamese", 25, 85, 85);
		VirtualPet CuddlyKitty = new RoboticCat("CuddlyKitty", "ROBOTIC FEMALE | somehow provides extraordinary cuddles though composed of solid steel. Just come find out | Ragdoll", 95, 30, 85);

		virtualPetShelter.addPet(Shadow);
		virtualPetShelter.addPet(Chance);
		virtualPetShelter.addPet(Sassy);
		virtualPetShelter.addPet(Terminator);
		virtualPetShelter.addPet(KittyCatBot);
		virtualPetShelter.addPet(CuddlyKitty);

		System.out.println("Welcome to the Virtual Pet Shelter!");
		System.out.println();
		System.out.println("This is the current status of our pets: ");
		System.out.println();

		while (continueWithApp = true) {
			virtualPetShelter.displayStatus();
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("__________________________________________________________________\n| 1 = Feed       |    2 = Give water    |   3 = Play with a pet   |\n| 4 = Adopt      |    5 = Surrender     |         6 = Oil         |\n| 7 = Walk dogs  | 8 = Clean a dog cage | 9 = Clean the litterbox |\n| 10 = Clean all cages                  |      11 = Exit          |\n|________________|______________________|_________________________|");
			System.out.println();

			String menuChoice = input.nextLine();
			if (menuChoice.equals("1")) {
				virtualPetShelter.feedPets();
				System.out.println("All of the organic pets in the shelter have been fed!");
				virtualPetShelter.allPetTick();
				System.out.println();

			} else if (menuChoice.equals("2")) {
				virtualPetShelter.waterAllPets();
				System.out.println("All of the organic pets in the shelter have been given some water!");
				System.out.println();

			} else if (menuChoice.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				String petName = input.nextLine();
				virtualPetShelter.playWithAPet(petName);
				System.out.println("You played with " + petName + "!");
				virtualPetShelter.allPetTick();
				System.out.println();

			} else if (menuChoice.equals("4")) {
				System.out.println("Great! Which pet would you like to adopt?");
				String petName = input.nextLine();
				virtualPetShelter.adoptPet(petName);
				virtualPetShelter.allPetTick();
				System.out.println("I'm sure " + petName + " has found an amazing new family!");

			} else if (menuChoice.equals("5")) {
				System.out.println("We have room for another pet in our shelter. Let me just ask you a few things about the pet you are surrendering to us...");
				System.out.println("Organic or robotic?");
				String newPetOrganicOrRobtoic = input.nextLine();
				System.out.println("Dog or cat?");
				String newPetDogOrCat = input.nextLine();
				System.out.println("Their name?");
				String newPetName = input.nextLine();
				System.out.println("And give me a short description of their personality.");
				String newPetPersonality = input.nextLine();
				System.out.println("We will find " + newPetName + " an amazing new home!");
				virtualPetShelter.addNewPet(newPetName);
				virtualPetShelter.allPetTick();

			} else if (menuChoice.equals("6")) {
				virtualPetShelter.oilAllPets();
				System.out.println("All of the robotic pets in the shelter have been oiled!");
				System.out.println();

			} else if (menuChoice.equals("7")) {
				virtualPetShelter.walkDogs();
				System.out.println("You walked all of the dogs! Thank you!");
				System.out.println();

			} else if (menuChoice.equals("8")) {
				System.out.println("Which dog's cage would you like to clean?");
				String petName = input.nextLine();
				virtualPetShelter.cleanADogCage(petName);
				System.out.println("You cleaned " + petName + "'s cage! Thank you!");
				virtualPetShelter.allPetTick();
				System.out.println();

			} else if (menuChoice.equals("9")) {
				virtualPetShelter.cleanLitterBox();
				System.out.println("You cleaned the messy shelter litterbox! Thank you!");
				System.out.println();

			} else if (menuChoice.equals("10")) {
				virtualPetShelter.cleanAllDogCages();
				System.out.println("You cleaned all of the organic dog cages! Thank you!");
				System.out.println();

			} else if (menuChoice.equals("11")) {
				System.out.println("Okay, bye!");
				System.exit(0);
			}

			virtualPetShelter.allPetTick();
		}

	}
}
