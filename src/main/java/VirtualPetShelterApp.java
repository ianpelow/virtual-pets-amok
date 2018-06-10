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
		VirtualPet pet1 = new VirtualPet("Shadow", "well-behaved and intelligent Golden Retriever", 60, 40, 50, 0);
		VirtualPet pet2 = new VirtualPet("Chance", "young and energetic American Bulldog", 50, 50, 40, 0);
		VirtualPet pet3 = new VirtualPet("Sassy", "sassy Himalayan", 40, 60, 60, 0);

		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);

		System.out.println();
		System.out.println("Welcome to Donny's Virtual Pet Shelter!");
		System.out.println("\nThis is the status of our pets: ");

		while (continueWithApp = true) {
			virtualPetShelter.displayStatus();
			System.out.println("What would you like to do?");
			System.out.println(
					"1 = feed / 2 = give water / 3 = play with a pet / 4 = adopt / 5 = surrender / 6 = Leave shelter");
			System.out.println();

			String menuChoice = input.nextLine();
			if (menuChoice.equals("1")) {
				virtualPetShelter.feedPets();
				System.out.println("All of the pets in the shelter have been fed!");
				virtualPetShelter.allPetTick();
				System.out.println();

			} else if (menuChoice.equals("2")) {
				virtualPetShelter.waterAllPets();
				System.out.println("All of the pets in the shelter have been given some water!");
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
				System.out.println(
						"We have room for another pet in our shelter. Let me just ask you a few things about the pet you are surrendering to us...");
				System.out.println("Male or female?");
				String newPetMaleOrFemale = input.nextLine();
				System.out.println("Their name?");
				String newPetName = input.nextLine();
				System.out.println("Color?");
				String colorOfNewPet = input.nextLine();
				System.out.println("And give me a short description of their personality.");
				String newPetPersonality = input.nextLine();
				virtualPetShelter.addNewPet(newPetName);
				virtualPetShelter.allPetTick();
				System.out.println("We will find " + newPetName + " an amazing new home!");
				
			} else if (menuChoice.equals("6")) {
				virtualPetShelter.oilAllPets();
				System.out.println("All of the robotic pets in the shelter have been oiled!");
				System.out.println();
				
			} else if (menuChoice.equals("7")) {
				virtualPetShelter.waterAllPets();
// WALK METHOD				System.out.println("You walked all of the dogs! Thank you!");
				System.out.println();
				
			} else if (menuChoice.equals("8")) {
				System.out.println("Which dog's cage would you like to clean?");
				String petName = input.nextLine();
				virtualPetShelter.cleanADogCage(petName);
				System.out.println("You cleaned " + petName + "'s cage! Thank you!");
				virtualPetShelter.allPetTick();
				System.out.println();				
				
			} else if (menuChoice.equals("10")) {
				System.out.println("Okay, bye!");
				System.exit(0);

			}

			virtualPetShelter.allPetTick();
		}

	}
}
